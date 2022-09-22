package com.example.petClinicJSF.filter;


import com.example.petClinicJSF.model.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*") // bütün urller buradan geçecektir
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse)  servletResponse;
        String url = req.getRequestURI();
        User u = (User) req.getSession().getAttribute("valid_user");
        if (u == null){
            if (url.contains("secret") || url.contains("logout")){
                res.sendRedirect(req.getContextPath()+ "/login.xhmtl");
            }else {
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }else{
            if (url.contains("register") || url.contains("login")){
                res.sendRedirect(req.getContextPath()+ "/secret/secret.xhmtl");
            } else if (url.contains("logout")) {
                req.getSession().invalidate();
                res.sendRedirect(req.getContextPath()+ "/index.xhmtl");
            }else{
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }

    }

    @Override
    public void destroy() {

    }
}
