package com.dao;

import com.bean.User;

/**
 * 数据访问层
 */
public class UserDao {
    /**
     * 查询数据库
     *
     * @param name 传入用户名
     * @param password 传入密码
     * @return 如正确，返回User对象；如错误返回null
     */
    public User getUser(String name, String password){
        //user，模拟从数据库得到值
        User user = new User("zhangsan","123");
        if (user.getName().equals(name)&&user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
