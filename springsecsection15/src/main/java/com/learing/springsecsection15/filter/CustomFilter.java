package com.learing.springsecsection15.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // initialization code here
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // filtering logic here
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // cleanup code here
    }
}