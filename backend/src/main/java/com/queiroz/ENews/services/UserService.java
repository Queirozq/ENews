package com.queiroz.ENews.services;

import com.queiroz.ENews.entities.User;
import com.queiroz.ENews.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = repository.findByEmail(s);
        if(user == null){
            logger.error("Usuário não encontrado = " + s);
            throw new UsernameNotFoundException("Email não encontrado");
        }
        logger.info("Usuário encontrado = " + s);
        return user;
    }
}
