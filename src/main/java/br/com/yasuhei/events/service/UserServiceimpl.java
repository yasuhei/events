package br.com.yasuhei.events.service;

import br.com.yasuhei.events.model.User;
import br.com.yasuhei.events.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements IUserService{

    public UserServiceimpl(UserRepo repo) {
        this.repo = repo;
    }

   private UserRepo repo;

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User getUserByEmail(String email) {
        return repo.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
