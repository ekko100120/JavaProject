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

  private  static final long serialVersionUID = 1L;
  private  String msg;

  public MessageEvent(Object source, String msg) {
    super(source);
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
