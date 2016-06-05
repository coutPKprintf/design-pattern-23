package org.cw.strategy;

/**
 * Created by chenwen on 16/6/5.
 * 橡皮鸭不会飞也不会叫
 */
public class RubberDuck extends Duck {
    RubberDuck() {
        super();
        this.iFly = new CannotFly("Rubber Duck");
        this.iQuack = new CannotQuack("Rubber Duck");
    }
}
