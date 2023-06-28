package com.example.UserManagementValidation.Configuration;
import com.example.UserManagementValidation.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(0,"Rahul", LocalDate.of(1998,04,23) , "rahul456@gmail.com" , "918962745618" , LocalDate.of(2023,06,21), LocalTime.of(05,05 ,23));
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}