package com.project.onlinesystem.controller;

import com.project.onlinesystem.model.User;
import com.project.onlinesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New User is added";
    }

    @GetMapping("/getAll")
    public List<User> list(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id){
        try{
            User user=userService.get(id);
            return new ResponseEntity<User>(user,HttpStatus.OK);
        }

        catch( NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody User user,@PathVariable Integer id){
        try{
            userService.get(id);
            userService.saveUser(user);
            return new ResponseEntity<User>(user,HttpStatus.OK);
        }

        catch( NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        userService.delete(id);
        return "Deleted User with id "+id;
    }

    @GetMapping("/login/{email}")
    public ResponseEntity<User> getEmail(@PathVariable String email){
        try{
            User user=userService.getEmail(email);
            return new ResponseEntity<User>(user,HttpStatus.OK);
        }

        catch(NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

}
