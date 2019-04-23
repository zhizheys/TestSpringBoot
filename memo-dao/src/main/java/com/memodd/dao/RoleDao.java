package com.memodd.dao;

import java.util.List;

public interface RoleDao {
    List<String> listRoleNames(Integer userId);
}
