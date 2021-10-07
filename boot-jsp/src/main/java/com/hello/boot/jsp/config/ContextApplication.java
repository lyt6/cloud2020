package com.hello.boot.jsp.config;

import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

public class ContextApplication implements ServletContextAware {
    @Override
    public void setServletContext(ServletContext context) {
        context.setAttribute("ctx", context.getContextPath());
    }
}
