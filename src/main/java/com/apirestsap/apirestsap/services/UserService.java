package com.apirestsap.apirestsap.services;

import java.util.List;

import com.apirestsap.apirestsap.entitys.UsersModel;

public interface UserService {
    
    public List<UsersModel> findAll();

    public UsersModel findById(int id);

    public void save(UsersModel user);

    public void deleteById(int id);
}
