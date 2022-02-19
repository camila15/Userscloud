package co.edu.poli.Users.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Tablauser")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull(message = "El campo nombre no puede estar vacio")
    @NotEmpty
    private String name;

    @NotNull(message = "El campo apellido no puede estar vacio")
    @NotEmpty
    private String lastname;

}
