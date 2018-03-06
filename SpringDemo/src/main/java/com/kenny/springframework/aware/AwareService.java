package com.kenny.springframework.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-15:57
 * @Description:
 * @return:
 */
public class AwareService implements BeanNameAware,ResourceLoaderAware {
  @Override
  public void setBeanName(String s) {

  }

  @Override
  public void setResourceLoader(ResourceLoader resourceLoader) {

  }
}
