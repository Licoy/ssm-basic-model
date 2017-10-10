package cn.licoy.core.service.impl;

import cn.licoy.core.dao.UserDao;
import cn.licoy.core.entity.User;
import cn.licoy.core.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author licoy.cn
 * @version 2017/10/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> list() {
        return userDao.selectList(null);
    }

    public User findByName(String name){
        return userDao.selectOne(User.builder().name(name).build());
    }
}
