package com.kealliang.february.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.kealliang.february.pbs.PersonPb;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author lsr
 * @ClassName ProtobufTest
 * @Date 2018-09-28
 * @Desc Protobuf的测试
 * @Vertion 1.0
 */
public class ProtobufTest {

    @Test
    public void testConvert(){
        PersonPb.hobby.Builder builder = PersonPb.hobby.newBuilder();
        PersonPb.hobby hobby = builder.setName("游泳")
                .setAge(6)
                .build();

        System.out.println("========================= 序列化开始 =========================");
        byte[] bytes = hobby.toByteArray();
        System.out.println(Arrays.toString(bytes));
        System.out.println("byte数据大小为：" + bytes.length);

        System.out.println("========================= 反序列化开始 =========================");
        PersonPb.hobby hobby1 = null;
        try {
            hobby1 = PersonPb.hobby.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        System.out.println(hobby1.toString());

        System.out.println("========================= 转换json开始 =========================");
        String json = null;
        try {
            json = JsonFormat.printer().print(hobby1);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        System.out.println("json数据大小为：" + json.getBytes().length);
    }

    @Test
    public void testConvert2(){
        PersonPb.people.Builder builder = PersonPb.people.newBuilder();
        PersonPb.people people = builder.setName("老张")
                .setAge(22)
                .setHobbies(PersonPb.hobby.newBuilder().setName("爬山").setAge(3))
                .build();

        System.out.println("========================= 序列化开始 =========================");
        byte[] bytes = people.toByteArray();
        System.out.println(Arrays.toString(bytes));
        System.out.println("byte数据大小为：" + bytes.length);

        System.out.println("========================= 反序列化开始 =========================");
        PersonPb.hobby hobby1 = null;
        PersonPb.people people1 = null;
        try {
            hobby1 = PersonPb.hobby.parseFrom(bytes);
            people1 = PersonPb.people.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        System.out.println(hobby1.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(people1.toString());

        System.out.println("========================= 转换json开始 =========================");
        String jsonh = null;
        String jsonp = null;
        try {
            jsonh = JsonFormat.printer().print(hobby1);
            jsonp = JsonFormat.printer().print(people1);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        System.out.println(jsonh);
        System.out.println("jsonh数据大小为：" + jsonh.getBytes().length);
        System.out.println("---------------------------------------------------------------");
        System.out.println(jsonp);
        System.out.println("jsonp数据大小为：" + jsonp.getBytes().length);
    }
}
