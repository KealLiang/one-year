package com.kealliang.february.dto;

import java.util.List;

/**
 * @author lsr
 * @ClassName People
 * @Date 2018-09-27
 * @Desc
 * @Vertion 1.0
 */
public class People {
    private String name;
    private int age;
    private List<Hobby> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }

    public static final class PeopleBuilder {
        private People people;

        private PeopleBuilder() {
            people = new People();
        }

        public static PeopleBuilder aPeople() {
            return new PeopleBuilder();
        }

        public PeopleBuilder withName(String name) {
            people.setName(name);
            return this;
        }

        public PeopleBuilder withAge(int age) {
            people.setAge(age);
            return this;
        }

        public PeopleBuilder withHobbies(List<Hobby> hobbies) {
            people.setHobbies(hobbies);
            return this;
        }

        public People build() {
            return people;
        }
    }
}
