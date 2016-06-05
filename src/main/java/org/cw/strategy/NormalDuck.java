package org.cw.strategy;

/**
 * Created by chenwen on 16/6/5.
 * 普通鸭,会叫不会飞
 */
public class NormalDuck extends Duck{
    public NormalDuck(){
        super();
        this.iFly = new CannotFly("Normal Duck");
        this.iQuack = new CanQuack("Normal Duck");
    }
}
