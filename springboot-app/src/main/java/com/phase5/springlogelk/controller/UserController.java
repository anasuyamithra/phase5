package com.phase5.springlogelk.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.phase5.springlogelk.SpringLogElkApplication;
import com.phase5.springlogelk.model.User;
import com.phase5.springlogelk.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    
    Logger logger = LoggerFactory.getLogger(SpringLogElkApplication.class);

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        logger.info("Users Found.");
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        logger.info("User Found.");
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        logger.info("Users Created.");
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            logger.info("User Created.");
            return userRepository.save(existingUser);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        logger.info("User Deleted.");
        userRepository.deleteById(id);
    }
}
