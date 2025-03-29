package org.example.springbooty.domain;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Transactional
public class UserService {
    Logger logger = Logger.getLogger(UserService.class.getName());


}
