package hocviencntt.services;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by nguyenle on 9/20/16.
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {


    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("AAA");
    }
}
