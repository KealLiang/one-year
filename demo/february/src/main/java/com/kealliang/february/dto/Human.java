package com.kealliang.february.dto;

import java.util.List;

/**
 * @author lsr
 * @ClassName Human
 * @Date 2018-09-27
 * @Desc
 * @Vertion 1.0
 */
public class Human {
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
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }


    public static final class HumanBuilder {
        private Human human;

        private HumanBuilder() {
            human = new Human();
        }

        public static HumanBuilder aHuman() {
            return new HumanBuilder();
        }

        public HumanBuilder withName(String name) {
            human.setName(name);
            return this;
        }

        public HumanBuilder withAge(int age) {
            human.setAge(age);
            return this;
        }

        public HumanBuilder withHobbies(List<Hobby> hobbies) {
            human.setHobbies(hobbies);
            return this;
        }

        public Human build() {
            return human;
        }
    }
}
