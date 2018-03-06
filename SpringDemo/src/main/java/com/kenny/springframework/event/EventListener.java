package com.kenny.springframework.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-13:51
 * @Description:
 * @return:
 */
@Component
public class EventListener implements ApplicationListener<MessageEvent> {

  @Override
  public void onApplicationEvent(MessageEvent event) {
    String msg = event.getMsg();
    System.out.println(" I have receive the message: "+msg+ " of event");
  }

}
