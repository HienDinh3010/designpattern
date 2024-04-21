package design.asd.course.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler {

    private Object target;

    private Logger logger = new Logger();

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // invoke the method on target
        Object result = method.invoke(target, args);
        logger.log("Calling method: " + method.getName() + " with args: ");
        for (Object arg : args) {
            logger.log("Param: " + arg.toString());
        }
        return result;
    }
}
