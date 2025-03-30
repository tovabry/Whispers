package org.example.springbooty.infrastructure.persistence;

import org.example.springbooty.domain.entity.AppUser;
import org.springframework.data.repository.ListCrudRepository;

public interface AppUserRepository extends ListCrudRepository<AppUser, Integer> {
}
