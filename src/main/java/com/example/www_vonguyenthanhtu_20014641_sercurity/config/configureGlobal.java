package com.example.www_vonguyenthanhtu_20014641_sercurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class configureGlobal {
//    @Autowired
//    public void globalConfig(AuthenticationManagerBuilder auth, PasswordEncoder
//            encoder, DataSource dataSource) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .withDefaultSchema()
//                .withUser(User.withUsername("admin")
//                        .password(encoder.encode("admin"))
//                        .roles("ADMIN", "USER"))
//                .withUser(User.withUsername("user")
//                        .password(encoder.encode("user"))
//                        .roles("USER"))
//        ;
//    }

}