package test.dao;

/**
 * Created by yturan on 10/08/15.
 */
import java.util.List;

import test.model.entity.AddressEntity;
import test.model.entity.EmailEntity;
import test.model.entity.TelefonEntity;
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
    public UserEntity getUser(Integer userID) {
        return (UserEntity) getSession().createQuery(
                "from user where email = :userID and active= '1' ")
                .setParameter("userID", userID)
                .uniqueResult();
    }
    public EmailEntity getEmail(Integer userID){
        return (EmailEntity) getSession().createQuery(
                "from email where userId= :userID")
                .setParameter("userID", userID)
                .uniqueResult();
    }
    public AddressEntity getAddres(Integer userID){
        return (AddressEntity) getSession().createQuery(
                "from address where userId= :userID")
                .setParameter("userID",userID)
                .uniqueResult();
    }
    public TelefonEntity getTelefon(Integer userID){
        return (TelefonEntity) getSession().createQuery(
                "from Telefon where userId= :userID")
                .setParameter("userID", userID)
                .uniqueResult();
    }

} // class UserDao
