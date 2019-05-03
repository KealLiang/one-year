package com.kealliang.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author lsr
 * @ClassName FileUtils
 * @Date 2019-03-15
 * @Desc 文件读写工具
 * @Vertion 1.0
 */
public class FileUtils {
    /**
     * 写到文件中
     * @author lsr
     * @description write2File
     * @Date 16:18 2019/3/6
     * @Param [obj]
     * @return void
     */
    public static void write2File(Object obj, String pathName){
        File file = getFile(pathName);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            if (obj instanceof Collection) {
                Collection c = (Collection) obj;
                writeCollection(writer, c);
            } else {
                writer.write(obj.toString());
            }
            // 带缓冲的io关闭前需要flush一次，防止最后缓冲池中未满的数据丢失
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          /*
            finally与return的执行顺序问题，两个要点
                1、理解 操作数栈 与 局部变量区
                    1-1、操作数栈  用于保存正在执行的表达式中的操作数 return时返回的永远是操作数栈顶层的值
                    1-2、局部变量区  用于保存方法中使用的变量，包括方法参数、方法内部变量、对象成员变量、类成员变量（静态变量）；后两者会复制到局部变量区，因此多线程环境需要声明为volatile
                2、finally改变了什么
                    2-1、先将原本要return的值（例如aa）从操作数栈顶复制到局部变量区（aa_copy）
                    2-2、再执行finally中的代码块
                    2-3、最后将aa_copy又复制回操作数栈顶，return返回
            */
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeCollection(BufferedWriter writer, Collection c) throws IOException {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String next = it.next().toString();
            // 过滤掉框架生成的EntityResultMap
            if (next.startsWith("com.")) {
                continue;
            }
            writer.write(next);
            writer.newLine();
        }
    }

    private static File getFile(String pathname) {
        File file = new File(pathname);
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
