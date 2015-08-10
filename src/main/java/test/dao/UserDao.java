package test.dao;

/**
 * Created by yturan on 10/08/15.
 */
import java.util.List;
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

} // class UserDao
