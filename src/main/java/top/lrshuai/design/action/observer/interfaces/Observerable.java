package top.lrshuai.design.action.observer.interfaces;

/**
 * 被观察者接口
 */
public interface Observerable {
    //订阅
    public void registerObserver(Observer o);
    // 取消订阅
    public void removeObserver(Observer o);
    //通知
    public void notifyObserver();
}
