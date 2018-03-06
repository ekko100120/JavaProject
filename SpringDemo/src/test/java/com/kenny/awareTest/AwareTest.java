package com.kenny.awareTest;

import com.kenny.springframework.aware.AwareConfig;
import com.kenny.springframework.aware.AwareService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-16:19
 * @Description:
 * @return:
 */
public class AwareTest {

  @Test
  public void test(){
    AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AwareConfig.class);
    AwareService awareService = context.getBean(AwareService.class);
    awareService.outputResult();
    context.close();
  }
}
