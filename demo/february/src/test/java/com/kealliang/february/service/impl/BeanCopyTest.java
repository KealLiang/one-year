package com.kealliang.february.service.impl;

import com.kealliang.february.dto.Hobby;
import com.kealliang.february.dto.Human;
import com.kealliang.february.dto.People;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsr
 * @ClassName BeanCopyTest
 * @Date 2018-09-27
 * @Desc 深浅拷贝测试
 * @Vertion 1.0
 */
public class BeanCopyTest {

    @Test
    public void testCopyProperties(){
        People p1 = getPeople1();
        Human h1 = new Human();
        BeanUtils.copyProperties(p1, h1);

        System.out.println(h1);
    }

    @Test
    public void testCopyProperties2(){
        People p1 = getPeople1();
        People p2 = getPeople2();
        List<People> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);

        Human h1 = new Human();
        Human h2 = new Human();
        List<Human> hs = new ArrayList<>();
        hs.add(h1);
        hs.add(h2);
        BeanUtils.copyProperties(ps, hs);

        for (Human h : hs) {
            System.out.println(h);
        }
    }

    @Test
    public void testBeanCopier(){
//        BeanCopier.copy();
    }


    private People getPeople2() {
        Hobby h1 = Hobby.HobbyBuilder.aHobby().withName("蹦极").withPeriod(2).build();
        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(h1);
        return People.PeopleBuilder.aPeople().withName("老王").withAge(35).withHobbies(hobbies).build();
    }

    private People getPeople1() {
        Hobby h1 = Hobby.HobbyBuilder.aHobby().withName("游泳").withPeriod(3).build();
        Hobby h2 = Hobby.HobbyBuilder.aHobby().withName("大炮").withPeriod(1).build();
        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(h1);
        hobbies.add(h2);
        People p1 = People.PeopleBuilder.aPeople().withName("老张").withAge(18).withHobbies(hobbies).build();

        return p1;
    }

}
