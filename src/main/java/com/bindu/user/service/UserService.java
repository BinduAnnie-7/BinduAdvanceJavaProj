package com.bindu.user.service;

import com.bindu.user.entity.User;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    List<User> getUserData();

    Optional<User> updateUserData(Long id, User user);

    Optional<?> deleteByUsrId(Long id);

    Optional<User> findByID(Long id);
}
