package com.hei.vaikastoreapi.service;

import com.hei.vaikastoreapi.model.User;
import com.hei.vaikastoreapi.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User getByIdUser(String id) {
        return userRepository.getReferenceById(id);
    }


    @Transactional
    public User save(User toSave) {
        return userRepository.save(toSave);

    }

}
