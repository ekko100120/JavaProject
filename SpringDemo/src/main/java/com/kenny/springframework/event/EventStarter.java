package com.kenny.springframework.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-14:10
 * @Description:
 * @return:
 */
public class EventStarter {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
                          new AnnotationConfigApplicationContext(EventConfig.class);
    EventPublisher publisher = context.getBean(EventPublisher.class);
    publisher.publish("hello kenny");
    context.close();
  }
}
