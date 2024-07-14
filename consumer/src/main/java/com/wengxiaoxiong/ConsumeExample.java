package com.wengxiaoxiong;

import com.wengxiaoxiong.model.User;
import com.wengxiaoxiong.service.UserService;

public class ConsumeExample {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy() ;
        User user = new User();
        user.setName("test");
        System.out.println(userService.getUser(user).getName());
        
    }
}
