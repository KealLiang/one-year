package com.kealliang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lsr
 * @ClassName DynamicProxy
 * @Date 2019-02-18
 * @Desc 动态代理测试
 * @Vertion 1.0
 */
public class DynamicProxy implements InvocationHandler {

    public static void main(String[] args) {
        /* 设置此系统属性,让JVM生成的Proxy类写入文件.保存路径为：com/sun/proxy(如果不存在请手工创建) */
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.out.println(Proxy.getProxyClass(User.class.getClassLoader(), User.class));
        User bind = (User) new DynamicProxy().bind(new UserImpl());
        System.out.println(bind);
        bind.sayWelcome("KealLiang");
    }


    /***************************************/
    public Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }

    /***************************************/
    public interface User {
        void sayWelcome(String name);
    }

    public static class UserImpl implements User {
        @Override
        public void sayWelcome(String name) {
            System.out.println("welcome, dear " + name);
        }
    }
}
