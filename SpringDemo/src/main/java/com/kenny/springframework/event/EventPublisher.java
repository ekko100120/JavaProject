package com.kenny.springframework.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-13:55
 * @Description:
 * @return:
 */
@Component
public class EventPublisher {
  @Autowired
  ApplicationContext applicationContext;

  public void publish(String msg){
    applicationContext.publishEvent(new MessageEvent(this,msg));
  }


}
