package org.song.stu02.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.song.stu02.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();
    User findUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
