package com.training.lawyer.service;
import com.training.lawyer.model.User;

import java.util.List;
public interface UserService {
    public List<User> getAll();
    public User addUser (User user);
    public User updateUser (User user);
    public String deleteUser (Long id);
}
