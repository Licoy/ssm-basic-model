package cn.licoy.core.service;

import cn.licoy.core.entity.User;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2017/10/10
 */
public interface UserService {

    List<User> list();

    User findByName(String name);

}
