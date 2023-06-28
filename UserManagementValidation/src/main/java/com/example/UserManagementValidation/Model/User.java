package com.example.UserManagementValidation.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @NotNull
    private Integer userId ;

    @NotBlank(message = "Name must not be blank.")
    private String userName ;

    @Past
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate userDOB ;

    @NotBlank(message = "Email id is mandatory")
    @Email(message = "Email id is invalid")
    private String userEmail ;

    @Pattern(regexp = "^\\d{2}\\d{10}$" , message = "Phone number must be of 12 digit first two digits country code and rest number")
    private String phoneNumber ;



    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date ;

    @NotNull
    private LocalTime time ;


}
