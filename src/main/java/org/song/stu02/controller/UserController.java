package org.song.stu02.controller;

import jakarta.annotation.Resource;
import org.song.stu02.entity.User;
import org.song.stu02.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("{id}")
    public String del(@PathVariable("id") int id) {
        return userService.delUser(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("/detail/{id}")
    public User detail(@PathVariable("id") int id) {
        return userService.detail(id);
    }
    @GetMapping("/list")
    public List<User> list() {
        return userService.findAllUser();
    }
}
