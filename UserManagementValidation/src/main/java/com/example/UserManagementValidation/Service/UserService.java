package com.example.UserManagementValidation.Service;

import com.example.UserManagementValidation.Model.User;
import com.example.UserManagementValidation.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

        @Autowired
        UserRepo userRepo;

        public  String updateEmail(Integer id, String emailId) {
            List<User> originalList = getAllUsers();
            for(User u : originalList)
            {
                if(id.equals(u.getUserId()))
                {
                    //originalList.remove(u);
                    u.setUserEmail(emailId);
                    //originalList.add(u);

                    return "updated";
                }
            }

            return "id not found";
        }

        public List<User> getAllUsers() {
            return userRepo.getUsers();
        }

        public User getUser(Integer id) {
            List<User> originalList = getAllUsers();
            for(User u : originalList)
            {
                if(id.equals(u.getUserId()))
                {
                    return u ;
                }
            }
            return null ;
        }

        public String createUser(User user) {
            List<User> originalList = getAllUsers();
            originalList.add(user);
            return "New user added";
        }

        public String removeUser(Integer id) {
            List<User> originalList = getAllUsers();
            for(User u : originalList)
            {
                if(id.equals(u.getUserId()))
                {
                    originalList.remove(u);
                    return "removed";
                }
            }
            return "Id not found";
        }


    public String updateUser(Integer id, User user) {
            List<User> originalList = getAllUsers();
        for (int i = 0; i < originalList.size(); i++) {
            User value = originalList.get(i);
            if (value.getUserId() == id) {
                originalList.set(i, user);
                return "Information updated Successfully" ;
            }

            }
        return "User Not found";
    }
}



