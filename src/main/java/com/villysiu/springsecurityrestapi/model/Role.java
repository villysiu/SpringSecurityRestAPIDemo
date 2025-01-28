package com.villysiu.springsecurityrestapi.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

}
