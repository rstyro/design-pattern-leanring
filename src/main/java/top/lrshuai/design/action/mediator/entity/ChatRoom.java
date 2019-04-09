package top.lrshuai.design.action.mediator.entity;

import java.util.Date;

/**
 * 中介，聊天室
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()  + " [" + user.getName() +"] : " + message);
    }
}
