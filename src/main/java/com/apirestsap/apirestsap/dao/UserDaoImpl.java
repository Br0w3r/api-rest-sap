package com.apirestsap.apirestsap.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apirestsap.apirestsap.entitys.UsersModel;

@Repository
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
        Session curreSession = entityManager.unwrap(Session.class);
        UsersModel usersModel = curreSession.get(UsersModel.class, id);
        return usersModel;
    }

    @Override
    public void save(UsersModel user) {
        Session curreSession = entityManager.unwrap(Session.class);
        curreSession.saveOrUpdate(user);
    }

    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<UsersModel> theQuery = currentSession.createQuery("delete from OUSR where USERID=:id");
        theQuery.setParameter("USERID", id);
        theQuery.executeUpdate();
    }

}
