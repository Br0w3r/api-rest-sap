package com.apirestsap.apirestsap.dao;

import java.util.List;
import org.hibernate.Session;
import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import com.apirestsap.apirestsap.entitys.UsersModel;

public class UserDaoImpl implements UserDao {
    
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UsersModel> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<UsersModel> query = currentSession.createQuery("from OUSR", UsersModel.class);
        List<UsersModel> users = query.getResultList();
        return users;
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
