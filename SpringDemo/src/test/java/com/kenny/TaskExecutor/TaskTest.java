package com.kenny.TaskExecutor;

import com.kenny.springframework.TaskExecutor.AsyncTaskService;
import com.kenny.springframework.TaskExecutor.TaskExecutorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service =context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 20; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
        context.close();
    }

}
