package org.example.springbooty.domain;

import jakarta.transaction.Transactional;
import org.example.springbooty.domain.entity.AppUser;
import org.example.springbooty.infrastructure.persistence.AppUserRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class AppUserService {
    Logger log = Logger.getLogger(AppUserService.class.getName());

    AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Cacheable("allUsers")
    public List<AppUser> getAllUsers() {
        List<AppUser> users = appUserRepository.findAll();
        log.info("Fetched users: " + users);
        return users;
    }

    @CacheEvict(value = "allUsers", allEntries = true)
    public AppUser addAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }


}
