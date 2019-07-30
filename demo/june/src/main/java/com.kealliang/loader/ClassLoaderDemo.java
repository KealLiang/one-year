package com.kealliang.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author lsr
 * @ClassName ClassLoaderDemo
 * @Date 2019-07-30
 * @Desc ClassLoader演示
 * @Vertion 1.0
 */
public class ClassLoaderDemo {

    private static final Logger LOG = LoggerFactory.getLogger(ClassLoaderDemo.class);

    // 钻石依赖
    public static void main(String[] args) throws Exception {
        // 注意：c1和c2下的Ocd只是为了演示代码，这个示例必须使用同名（全类名）的java文件手动编译字节码来加载

        String dir1 = "file:///E:/Learning/classes/v1/";
        String dir2 = "file:///E:/Learning/classes/v2/";
        URLClassLoader v1Loader = new URLClassLoader(new URL[] {new URL(dir1)});
        URLClassLoader v2Loader = new URLClassLoader(new URL[] {new URL(dir2)});

        Class<?> ocd1Class = v1Loader.loadClass("Ocd");
        Class<?> ocd2Class = v2Loader.loadClass("Ocd");

        LOG.info("class1's parent loader is [{}], and his loader is [{}]", v1Loader.getParent(), ocd1Class.getClassLoader().toString());
        LOG.info("class2's parent loader is [{}], and his loader is [{}]", v2Loader.getParent(), ocd2Class.getClassLoader().toString());

        Object ocd1 = ocd1Class.getConstructor().newInstance();
        Object ocd2 = ocd2Class.getConstructor().newInstance();

        ocd1Class.getMethod("say").invoke(ocd1);
        ocd2Class.getMethod("say").invoke(ocd2);

        System.out.println(ocd1.equals(ocd2));
    }

}
