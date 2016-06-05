package org.cw.strategy;

/**
 * Created by chenwen on 16/6/5.
 * 鸭子类
 */
public class Duck {
    /**
     * 飞行行为
     */
    protected IFly iFly;

    /**
     * 叫行为
     */
    protected IQuack iQuack;

    Duck(){
    }

    /**
     * 模拟飞行
     */
    void performFly(){
        iFly.fly();
    }

    /**
     * 模拟叫
     */
    void performQuack(){
        iQuack.quack();
    }
}
