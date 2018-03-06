package com.kenny.springframework.event;

import org.springframework.context.ApplicationEvent;

/**
 * @param :
 * @author: kenny [411316753@qq.com]++++++++
 * @Date: 2018/3/6-10:47
 * @Description:
 * @return:
 */
public class MessageEvent extends ApplicationEvent {
  public MessageEvent(Object source) {
    super(source);
  }
}
