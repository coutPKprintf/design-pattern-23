package org.cw.strategy;

/**
 * Created by chenwen on 16/6/5.
 * 超级鸭,会飞也会叫
 */
public class SuperDuck extends Duck{
    public SuperDuck(){
        super();
        this.iFly = new CanFly("Super Duck");
        this.iQuack = new CanQuack("Super Duck");
    }
}
