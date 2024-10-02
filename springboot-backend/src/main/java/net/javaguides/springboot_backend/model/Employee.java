package net.javaguides.springboot_backend.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id ;

     @Column(name = "first_name")
     private String firstname;

     @Column(name = "last_name")
     private String lastname;

     @Column(name = "email_id")
     private String emailID;

}
