package org.example.springbooty.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Comments {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "text", nullable = false)
    String text;
    @Column(name = "date", nullable = false)
    LocalDate date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    AppUser userId;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
