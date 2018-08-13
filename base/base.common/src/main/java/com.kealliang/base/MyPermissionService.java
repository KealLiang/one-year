package com.kealliang.base;

import com.meicloud.sahara.security.PermissionService;
import com.meicloud.sahara.security.Profile;
import org.apache.shiro.authz.Permission;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author lsr
 * @Date 2018-08-02
 * @Desc 用户登陆
 */
@Component
public class MyPermissionService implements PermissionService {

    @Override
    public Collection<Permission> findPermision(String s) {
        return null;
    }

    @Override
    public String[] findUser(String s) {
        return new String[0];
    }

    @Override
    public Profile findProfile(String s) {
        return null;
    }
}
