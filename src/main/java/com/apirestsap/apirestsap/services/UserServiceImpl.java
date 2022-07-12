package com.apirestsap.apirestsap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirestsap.apirestsap.dao.UserDao;
import com.apirestsap.apirestsap.entitys.UsersModel;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    @Override
    public List<UsersModel> findAll() {
        List<UsersModel> listUsers= userDao.findAll();
        return listUsers;
    }

    @Override
    public UsersModel findById(int id) {
        UsersModel user = userDao.findById(id);
        return user;
    }

    @Override
    public void save(UsersModel user) {
        userDao.save(user);
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteById(id);
    }


}
