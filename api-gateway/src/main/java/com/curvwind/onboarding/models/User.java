package com.curvwind.onboarding.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name="\"Users\"",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "userName"),
        @UniqueConstraint(columnNames = "email")
})
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name="my_seq",sequenceName="MY_SEQ", allocationSize=1)
    @GeneratedValue(generator="my_seq")
    private Integer id;

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phone;
    private String password;
    private LocalDate dob;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}