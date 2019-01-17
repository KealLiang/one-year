package com.kealliang.february.dto;

/**
 * @author lsr
 * @ClassName Hobby
 * @Date 2018-09-27
 * @Desc
 * @Vertion 1.0
 */
public class Hobby {
    private String name;
    private int period;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", period=" + period +
                '}';
    }

    public static final class HobbyBuilder {
        private Hobby hobby;

        private HobbyBuilder() {
            hobby = new Hobby();
        }

        public static HobbyBuilder aHobby() {
            return new HobbyBuilder();
        }

        public HobbyBuilder withName(String name) {
            hobby.setName(name);
            return this;
        }

        public HobbyBuilder withPeriod(int period) {
            hobby.setPeriod(period);
            return this;
        }

        public Hobby build() {
            return hobby;
        }
    }
}
