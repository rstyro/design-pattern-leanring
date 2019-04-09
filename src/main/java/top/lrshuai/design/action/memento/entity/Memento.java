package top.lrshuai.design.action.memento.entity;

import lombok.Data;

/**
 * 备忘录的类，可以回退的类
 *
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
