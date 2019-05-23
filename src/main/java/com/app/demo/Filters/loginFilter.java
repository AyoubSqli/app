package com.app.demo.Filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class loginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest req = (HttpServletRequest) servletRequest;
            if("/login".equals(((HttpServletRequest) servletRequest).getRequestURI()) || req.getSession().getAttribute("userName") != null || isStaticResources(req))
                    filterChain.doFilter(servletRequest, servletResponse);
            else
                req.getRequestDispatcher("/login").forward(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
    public boolean isStaticResources(HttpServletRequest req)
    {
      if(req.getRequestURI().startsWith("/css/") || req.getRequestURI().startsWith("/js/") || req.getRequestURI().startsWith("/images/") )
        return true ;
      return false ;
    }
}
