package co.edu.poli.Users.service;


import co.edu.poli.Users.DTO.UserDto;
import co.edu.poli.Users.domain.User;
import co.edu.poli.Users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User adicionarUser(UserDto user)
    {
        return userRepository.save(buildUser(user));
    }

    public List<UserDto> obteneruser()
    {
        List<User>  obteneruser= userRepository.findAll();
        List<UserDto> array= new ArrayList<>();




        for (int i=0; i<obteneruser.size();i++){

            array.add(buildUserDto(obteneruser.get(i)));

        }

        return array;

    }

    public void eliminaruser(Long id)
    {
         userRepository.deleteById(id);
    }

    public User buildUser (UserDto userdto){

        return User.builder()
                .id(userdto.getId())
                .name(userdto.getName())
                .lastname(userdto.getLastname()).build();

    }

    public UserDto buildUserDto (User user){

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .lastname(user.getLastname()).build();


    }

}
