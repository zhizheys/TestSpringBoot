package com.memodd.service.Impl;

import com.memodd.dao.PermissionDao;
import com.memodd.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl  implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<String> listPermissions(Integer userId){
        return permissionDao.listPermissionsByUserId(userId);
    }

}
