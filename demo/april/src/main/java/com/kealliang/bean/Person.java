package com.kealliang.bean;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author lsr
 * @ClassName Person
 * @Date 2019-05-03
 * @Desc 实验lombok
 * @Vertion 1.0
 */
@Data
@Builder
@ToString
public class Person {

    private String name;
    private int age;
    private Personality personality;

}
