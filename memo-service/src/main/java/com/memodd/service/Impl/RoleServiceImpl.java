package com.memodd.service.Impl;

import com.memodd.dao.RoleDao;
import com.memodd.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<String> listRoleNames(Integer userId){
        return  roleDao.listRoleNames(userId);
    }
}
