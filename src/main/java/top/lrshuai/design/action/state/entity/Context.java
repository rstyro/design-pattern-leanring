package top.lrshuai.design.action.state.entity;

import lombok.Data;
import lombok.ToString;
import top.lrshuai.design.action.state.interfaces.State;
import top.lrshuai.design.action.state.interfaces.impl.*;

@Data
public class Context {
    private State state;

    public Context() {
        this.state = new NormalState();
        getSate();
    }



    public void angry(){
        state = new AngryState();
        getSate();
    }

    public void happy(){
        state = new HappyState();
        getSate();
    }

    public void joy(){
        state = new JoyState();
        getSate();
    }

    public void sorrow(){
        state = new SorrowState();
        getSate();
    }

    public void getSate(){
        state.doAction();
    }


}
