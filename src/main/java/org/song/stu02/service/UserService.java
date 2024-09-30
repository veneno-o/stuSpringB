package org.song.stu02.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserDetail(int userId) {
        return "user detail： " + userId;
    }
}
