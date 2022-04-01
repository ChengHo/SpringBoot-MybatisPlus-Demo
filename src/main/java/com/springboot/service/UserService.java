package com.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.domain.Bill;
import com.springboot.domain.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<Bill> selectBill();
}
