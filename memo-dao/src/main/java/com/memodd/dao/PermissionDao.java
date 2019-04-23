package com.memodd.dao;

import java.util.List;

public interface PermissionDao {
    List<String> listPermissionsByUserId(Integer userId);
    List<String> listNeedPermission();
}
