package com.kenny.springframework.event;

import org.springframework.context.ApplicationEvent;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-10:47
 * @Description:
 * @return:
 */
public class MessageEvent extends ApplicationEvent {
  public MessageEvent(Object source) {
    super(source);
  }
}
