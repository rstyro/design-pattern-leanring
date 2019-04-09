package top.lrshuai.design.action.memento.entity;

import lombok.Data;

@Data
public class Originator {
    private String state;

    // 存档
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
