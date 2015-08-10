package test.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by yturan on 10/08/15.
 */
import test.model.entity.UserEntity;
import test.model.type.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import test.dao.UserDao;


@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserDao _userDao;

    @RequestMapping(value="/save", method = RequestMethod.GET)
    @ResponseBody
    public String create(UserType user){
        try {
            UserEntity sve=new UserEntity(user);
            _userDao.save(sve);
        }catch (Exception e){
            return e.getMessage();
        }
        return null;
    }

}
