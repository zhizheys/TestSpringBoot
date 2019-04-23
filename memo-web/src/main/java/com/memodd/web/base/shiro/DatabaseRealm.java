package com.memodd.web.base.shiro;

import java.util.List;
import java.util.Set;

import com.memodd.entity.User;
import com.memodd.service.PermissionService;
import com.memodd.service.RoleService;
import com.memodd.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.codec.CodecException;
import org.apache.shiro.crypto.UnknownAlgorithmException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class DatabaseRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //能进入到这里，表示账号已经通过验证了
        //User user = (User) principalCollection.getPrimaryPrincipal();

        Integer userId = (Integer) principalCollection.getPrimaryPrincipal();
        //通过service获取角色和权限
        List<String> permissions = permissionService.listPermissions(userId);
        List<String> roles = roleService.listRoleNames(userId);

        //授权对象
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //把通过service获取到的角色和权限放进去
       // s.setStringPermissions(permissions);
       // s.setRoles(roles);

        for(String item :permissions){
            simpleAuthorizationInfo.addStringPermission(item);
        }

       for(String item: roles){
           simpleAuthorizationInfo.addRole(item);
       }

        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取账号密码

       // UsernamePasswordToken t = (UsernamePasswordToken) token;
       Integer userId = Integer.parseInt(token.getPrincipal().toString());
        //获取数据库中的密码
        User user = userService.getUserById(userId);
        if (user == null){
            throw new UnknownAccountException();
        }

        //String passwordInDB = user.getPassword();
        String passwordInDB="test";
        String salt = user.getSalt();
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getSalt());

        //认证信息里存放账号密码, getName() 是当前Realm的继承方法,通常返回当前类名 :databaseRealm
        //盐也放进去
        //这样通过applicationContext-shiro.xml里配置的 HashedCredentialsMatcher 进行自动校验
        SimpleAuthenticationInfo auth = new SimpleAuthenticationInfo(userId, passwordInDB, credentialsSalt, this.getName());
        return auth;
    }

}
