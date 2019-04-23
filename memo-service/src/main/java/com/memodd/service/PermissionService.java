package com.memodd.service;

import java.util.List;

public interface PermissionService {
    List<String> listPermissions(Integer userId);
}
