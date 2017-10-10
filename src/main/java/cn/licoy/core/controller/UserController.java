package cn.licoy.core.controller;

import cn.licoy.core.entity.User;
import cn.licoy.core.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author licoy.cn
 * @version 2017/10/10
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> list() {
       return service.list();
    }

}
