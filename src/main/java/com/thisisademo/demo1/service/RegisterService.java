package com.thisisademo.demo1.service;

import com.thisisademo.demo1.dao.RegisterDao;
import com.thisisademo.demo1.entity.db.User;
import com.thisisademo.demo1.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public boolean register(User user) throws IOException {
        // encrypt password before saving
        user.setPassword(Util.encryptPassword(user.getUserId(), user.getPassword()));
        return registerDao.register(user);
    }
}

// modularity and decoupling, this class is only calling dao but cannot be omitted