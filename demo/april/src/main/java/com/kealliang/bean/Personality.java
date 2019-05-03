package com.kealliang.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author lsr
 * @ClassName Personality
 * @Date 2019-05-03
 * @Desc 个性
 * @Vertion 1.0
 */
@Getter
@AllArgsConstructor
@ToString
public enum Personality {
    OUTSIDE("外向", "喜欢说话，自来熟"),
    INSIDE("内向", "不喜欢说话，害羞"),
    ;

    private String name;
    private String desc;

    public static Personality getPersonality(int index) {
        Personality[] values = values();
        if (index >= values.length) {
            return null;
        }
        return values[index];
    }
}
