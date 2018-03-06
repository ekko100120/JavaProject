package com.kenny.conditional;

import com.kenny.springframework.conditional.ConditionConfig;
import com.kenny.springframework.conditional.ListService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context =
                                     new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        Assert.assertEquals("ls",listService.showListCmd());
        System.out.println(context.getEnvironment().getProperty("os.name")+"\n " +
                                    "  系统列表命令为: "+listService.showListCmd());
    }
}
