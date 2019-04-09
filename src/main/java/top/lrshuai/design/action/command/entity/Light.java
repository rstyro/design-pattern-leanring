package top.lrshuai.design.action.command.entity;

/**
 *  接受者对象Receiver：
 */
public class Light {

    /**
     * 开灯方法
     */
    public void lightOn() {
        System.out.println("灯打开了！！");
    }

    /**
     * 关灯方法
     */
    public void lightOff() {
        System.out.println("灯关上了！！");
    }

}
