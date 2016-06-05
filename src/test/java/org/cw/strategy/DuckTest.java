package org.cw.strategy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by chenwen on 16/6/5.
 */
public class DuckTest {
    private Logger logger = LoggerFactory.getLogger(DuckTest.class);

    @Test
    public void testPerformFly() throws Exception {
        /**
         * 普通鸭,会叫不会飞
         */
        Duck normalDuck = new NormalDuck();
        normalDuck.performFly();

        /**
         * 橡皮鸭,不会飞也不会叫
         */
        Duck rubberFly = new RubberDuck();
        rubberFly.performFly();

        /**
         * 超级鸭会飞也会叫
         */
        Duck superDuck = new SuperDuck();
        superDuck.performFly();
    }

    @Test
    public void testPerformQuack() throws Exception {
        /**
         * 普通鸭,会叫不会飞
         */
        Duck normalDuck = new NormalDuck();
        normalDuck.performQuack();

        /**
         * 橡皮鸭,不会飞也不会叫
         */
        Duck rubberFly = new RubberDuck();
        rubberFly.performQuack();

        /**
         * 超级鸭会飞也会叫
         */
        Duck superDuck = new SuperDuck();
        superDuck.performQuack();
    }
}