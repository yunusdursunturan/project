package test.dao;

/**
 * Created by yturan on 10/08/15.
 */
import java.util.List;

import test.model.entity.EmailEntity;
import test.model.entity.UserEntity;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {

    @Autowired
    private SessionFactory _sessionFactory;

    private Session getSession() {
        return _sessionFactory.getCurrentSession();
    }

    public void save(UserEntity user) {
        getSession().save(user);
        return;
    }

    public void delete(UserEntity user) {
        getSession().delete(user);
        return;
    }


    public void update(UserEntity user) {
        getSession().update(user);
        return;
    }
    public UserEntity getByEmail(String email) {
        return (UserEntity) getSession().createQuery(
                "from user where email = :email")
                .setParameter("email", email)
                .uniqueResult();
    }
    public EmailEntity getEmail(Integer userID){
        return (EmailEntity) getSession().createQuery(
                "from email where userId= :userID")
                .setParameter("userId",userID)
                .uniqueResult();
    }

} // class UserDao
