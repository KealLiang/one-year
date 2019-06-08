package com.kealliang.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lsr
 * @ClassName BatchFileOps
 * @Date 2019-06-08
 * @Desc 批量文件操作
 * @Vertion 1.0
 */
public class BatchFileOps {

    public static void main(String[] args) {
        batchCopyAndRename();
    }

    /** 
     * B站缓存批量复制出来并重命名
     * @author lsr
     * @description batchCopyAndRename
     * @Date 11:29 2019/6/8
     */
    public static void batchCopyAndRename() {
        String sourceDir = "E:\\BaiduNetdiskDownload\\【极客时间】玩转spring全家桶";
        String targetDir = "E:\\BaiduNetdiskDownload\\玩转spring全家桶";
        String suffix = ".blv";
        File dir = new File(sourceDir);
        for (File file : dir.listFiles()) {
            String fileName;
            File[] files = file.listFiles();

            // 获取文件名
            File file1 = files[1];
            String json = readStr(file1);
            HashMap map = JSON.parseObject(json, HashMap.class);
            Map page_data = (Map) map.get("page_data");
            fileName = (String) page_data.get("part");
            System.out.println(fileName);

            // 获取视频
            File file2 = files[2];
            File file20 = file2.listFiles()[0];

            // 复制
            try {
                String newFileName = targetDir + "\\" + fileName + suffix;

                FileUtils.copyFile(file20, new File(newFileName));

//                copyFile(file20, newFileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    public static String readStr(File file) {
        FileInputStream stream;
        String s = "";
        try {
            stream = new FileInputStream(file);
            byte[] bytes = new byte[stream.available()];
            stream.read(bytes);
            stream.close();
            s = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    // 这段代码有问题，复制出来的视频播放不了，没找到原因
    private static void copyFile(File file20, String newFileName) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file20));
        byte[] bytes = new byte[bis.available()];
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFileName));
        bos.write(bytes);
        bos.flush();

        bis.close();
        bos.close();
    }
}
