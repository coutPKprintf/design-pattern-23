package org.cw.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenwen on 16/6/5.
 * 会飞类
 */
public class CanFly extends AbstractFly {
    private Logger logger = LoggerFactory.getLogger(CanFly.class);

    public CanFly(String name){
        super(name);
    }

    public void fly() {
        logger.info(String.format("I am a %s , I can fly",name));
    }
}
