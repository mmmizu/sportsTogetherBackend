package com.example.sportstogetherbackend.interceptor;

import com.example.sportstogetherbackend.mapper.UserMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class AuthorizeInterceptor implements HandlerInterceptor {
    @Resource
    UserMapper mapper;
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////        SecurityContext context = SecurityContextHolder.getContext();
////        Authentication authentication = context.getAuthentication();
////        User user = (User) authentication.getPrincipal();
////        String username = user.getUsername();
////        com.example.sportstogetherbackend.entity.User u = mapper.findUserByUsernameOrEmail(username);
////        request.getSession().setAttribute("user", u);
////        return true;
//    }
}
