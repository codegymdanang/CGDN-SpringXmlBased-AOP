package hocviencntt.services;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by nguyenle on 9/20/16.
 */
public class HijackAfterMethod implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("Do something after method is called");
    }
}
