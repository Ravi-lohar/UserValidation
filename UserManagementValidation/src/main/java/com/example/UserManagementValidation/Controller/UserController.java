package com.example.UserManagementValidation.Controller;

import com.example.UserManagementValidation.Model.User;
import com.example.UserManagementValidation.Service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;


    //read
    @GetMapping("users")
   public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("user/{id}")
   public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @PostMapping("user")
   public String addUser(@Valid @RequestBody User user)
    {
        return userService.createUser(user);
    }

    //delete :
    @DeleteMapping("user/{id}")
   public String removeUser(@PathVariable @Max(10000) Integer id)
    {
        return userService.removeUser(id);
    }



    @PutMapping ("user/{id}")
    public String updateEmail(@Valid @PathVariable Integer id, @RequestBody User user)
    {
        return userService.updateUser(id,user);
    }


}