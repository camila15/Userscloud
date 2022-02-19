package co.edu.poli.Users.controller;

import co.edu.poli.Users.DTO.UserDto;
import co.edu.poli.Users.domain.User;
import co.edu.poli.Users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="user")


public class Usercontroller {

    @Autowired
    private UserService  userService;

    @PostMapping
    public User adicionarUser(@RequestBody UserDto user) {

        return userService.adicionarUser(user);
    }

    @GetMapping
    public List<UserDto> obteneruser() {

        return userService.obteneruser();

    }

    @DeleteMapping("/{id}")
    public void eliminaruser(@PathVariable("id") Long id) {

        userService.eliminaruser(id);
    }

}
