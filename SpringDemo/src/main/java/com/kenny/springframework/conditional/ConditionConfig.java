package com.kenny.springframework.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kenny.springframework.conditional")
//@Conditional(MacOSCondition.class)
public class ConditionConfig {

    @Bean
    @Conditional(WindowCondition.class)
    public ListService windowsListService(){
        return  new WindowsListService();
    }

    @Bean
    @Conditional(MacOSCondition.class)
    public ListService MacOSListService(){
        return new LinuxListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxListService(){
        return new LinuxListService();
    }
}
