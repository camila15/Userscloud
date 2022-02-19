package co.edu.poli.Users.DTO;


import lombok.Builder;
import lombok.Data;


@Data
@Builder(toBuilder = true)

public class UserDto {

    private Long id;
    private String name;
    private String lastname;
}
