package com.apirestsap.apirestsap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apirestsap.apirestsap.dao.UserDao;
import com.apirestsap.apirestsap.entitys.UsersModel;

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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(UsersModel user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub
        
    }


}
