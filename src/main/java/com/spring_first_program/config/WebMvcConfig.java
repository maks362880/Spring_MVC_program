package com.spring_first_program.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.spring_first_program. ")
public class WebMvcConfig {
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       // viewResolver.setPrefix("/WEB-INF/views/");//начальный путь для чтения шаблонов станицы (префикс) используется в @Controller
      //  viewResolver.setSuffix(".jsp");//расширение файла шаблона jsp (суффикс) используется в @Controller
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }
}