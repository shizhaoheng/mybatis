package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据Id删除用户
     * @param userId
     */
    void deleteUser(Integer userId);

    /**
     * 根据Id查询用户
     * @param userId
     */
    User findById(Integer userId);

    /**
     * 根据用户名模糊查询
     * @param username
     * @return
     */
    List<User> findByUserName(String username);
}
