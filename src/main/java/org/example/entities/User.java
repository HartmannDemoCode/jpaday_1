package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * Purpose:
 *
 * @author: Thomas Hartmann
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
}
