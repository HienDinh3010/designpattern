package design.asd.course.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements InvocationHandler {

    private Object target;

    private Map<String, Object> cache = new HashMap<>();

    public CachingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String key = "" + args[0];
        Object cachedObject = cache.get(key);
        // invoke method on target
        if (cachedObject != null) {
            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        } else {
            return cachedObject;
        }
    }
}
