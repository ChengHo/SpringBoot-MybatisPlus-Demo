package com.springboot.controller;

import com.springboot.domain.Bill;
import com.springboot.domain.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> readUserInfo() {
        List<User> list = new ArrayList();
        list.addAll(userService.list(null));
        return list;
    }

    @RequestMapping(value = "/selectBill", method = RequestMethod.GET)
    public List<Bill> selectBill() {
        return userService.selectBill();
    }

    @RequestMapping(value = "/userSelectByName", method = RequestMethod.GET)
    public List<User> userSelectByName() {
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", "hecd");
        return userService.listByMap(map);
    }
}
