/*
package com.securityproject.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@EnableWebSecurity
@Configuration
public class SpringConfigaration {
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withUsername("Vishnu")
                .password(passwordEncoder().encode("V123"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("ramsir")
                .password(passwordEncoder().encode("king"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests

                                .requestMatchers("/admin/**").hasRole("ADMIN")
                                .requestMatchers("/user/**").hasAnyRole("USER","ADMIN")
                                .requestMatchers("/").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .sessionManagement(session ->
                        session.maximumSessions(1)
                                .maxSessionsPreventsLogin(false)
                                .expiredUrl("/login?expired"));

        return http.build();
    }
}
*/
