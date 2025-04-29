package com.chj.gr.config;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationConverter;
import org.springframework.stereotype.Component;

import com.chj.gr.dto.UserDto;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Converter used to obtain the credentials of each request made.
 * If no credentials are found in the request, null is returned as Authentication object in the SecurityContext.
 */
@Component
public class UserAuthenticationConverter implements AuthenticationConverter {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public Authentication convert(HttpServletRequest request) {
        UserDto userDto = null;
        try {
            userDto = MAPPER.readValue(request.getInputStream(), UserDto.class);
        } catch (IOException e) {
            return null;
        }
        return UsernamePasswordAuthenticationToken.unauthenticated(userDto.getLogin(), userDto.getPassword());
    }
}
