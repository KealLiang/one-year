package com.kealliang.controller;

import com.kealliang.bean.Person;
import com.kealliang.bean.Personality;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author lsr
 * @ClassName PersonController
 * @Date 2019-05-03
 * @Desc
 * @Vertion 1.0
 */
@RestController
@RequestMapping("person")
public class PersonController {

    private static final Random random = new Random();

    @GetMapping("{name}/talk")
    public String talk(@PathVariable String name) {
        Person person = Person.builder()
                .name(name)
                .age(random.nextInt(100))
                .personality(Personality.getPersonality(random.nextInt(2)))
                .build();
        return person.toString();
    }
}
