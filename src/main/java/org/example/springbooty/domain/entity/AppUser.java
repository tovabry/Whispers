package org.example.springbooty.domain.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name ="name", nullable = false)
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}