package top.lrshuai.design.structure.filter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    // 1 -- 男，0 -- 女
    private int gender;

    private boolean isMarry;
}
