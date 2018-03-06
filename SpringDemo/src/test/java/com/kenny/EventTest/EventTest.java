package com.kenny.EventTest;

import com.kenny.springframework.event.EventConfig;
import com.kenny.springframework.event.EventPublisher;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-14:27
 * @Description:
 * @return:
 */
public class EventTest {

  @Test
  public void eventTest(){
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(EventConfig.class);
    EventPublisher publisher = null;
    try {
      publisher = context.getBean(EventPublisher.class);
    } catch (BeansException e) {
      e.printStackTrace();
    }
    Assert.assertNotNull(publisher);
    publisher.publish("hello kenny");
    context.close();
  }
}
