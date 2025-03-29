package org.example.springbooty.infrastructure.persistence;

import org.example.springbooty.domain.entity.AppUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<AppUser, Integer> {

    List<AppUser> findByname(String username);

    @Query("SELECT u FROM AppUser u WHERE u.name = :username")
    List<AppUser> findAllByByname(String username);

}
