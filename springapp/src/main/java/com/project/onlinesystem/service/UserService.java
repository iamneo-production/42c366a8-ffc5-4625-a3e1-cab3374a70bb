package com.project.onlinesystem.service;

import com.project.onlinesystem.model.User;
import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User get(Integer id);
    public void delete(Integer id);
    public User getEmail(String email);
}
