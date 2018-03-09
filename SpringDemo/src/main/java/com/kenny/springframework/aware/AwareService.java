package com.kenny.springframework.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.cache.Cache;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/3/6-15:57
 * @Description:
 * @return:
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

  private String beanName;
  private ResourceLoader loader;

  @Override
  public void setBeanName(String s) {
      this.beanName =s;
  }

  @Override
  public void setResourceLoader(ResourceLoader resourceLoader) {
      this.loader = resourceLoader;


  }

  public  void outputResult(){
    System.out.println("Bean的名称为: "+ beanName);
    Resource resource = loader.getResource("classpath:test.ini");
    try {
      System.err.println("resource 加载的文件内容是:"+ IOUtils.toString(resource.getInputStream()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
