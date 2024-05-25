package design.asd.course.pattern.proxy.librarydynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler {

    private Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue = method.invoke(target, args);
        System.out.println("Calling method " + method.getName() + " with argument(s):");
        for (int a = 0; a < args.length; a++) {
            if (args[a] != null) {
                System.out.println("---- Param " + a + " = " + args[a].toString());
            }
        }
        return returnValue;
    }
}
