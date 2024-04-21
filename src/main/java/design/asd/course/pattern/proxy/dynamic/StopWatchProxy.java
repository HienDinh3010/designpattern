package design.asd.course.pattern.proxy.dynamic;

import design.asd.course.pattern.proxy.multipleproxies.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Use Reflection: A technique to examine or modify the behavior of methods, classes,
 * interfaces at runtime
 */
public class StopWatchProxy implements InvocationHandler {

    private Object target;

    public StopWatchProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        //invoke the method on the target
        Object result = method.invoke(target, args);
        stopWatch.stop();
        System.out.println("The method " + method.getName() + " took " + stopWatch.getElapsedTime() + " milliseconds");
        return result;
    }


}
