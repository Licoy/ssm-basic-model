package cn.licoy.core.dao;

import cn.licoy.core.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2017/10/10
 */
@Repository
public interface UserDao {

    //查询出所有的用户
    List<User> list();

}
