package org.song.stu02.service;

import org.song.stu02.entity.User;
import org.song.stu02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public String addUser(User user) {
        userMapper.insertUser(user);
        return "add user success";
    }
    public String  delUser(int userId) {
        userMapper.deleteUser(userId);
        return "del user success";
    }
    public String updateUser(User user) {
        userMapper.updateUser(user);
        return "update user success";
    }
    public User detail(int userId) {
        return userMapper.findUserById(userId);
    }
    public List<User> findAllUser() {
        return userMapper.findAllUsers();
    }
}