package org.song.stu02.controller;

import jakarta.annotation.Resource;
import org.song.stu02.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/detail")
    public String detail(@RequestParam("id") int id) {
        return userService.getUserDetail(id);
    }
}
