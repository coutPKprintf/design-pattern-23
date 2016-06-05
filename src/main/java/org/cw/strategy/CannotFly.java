package org.cw.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenwen on 16/6/5.
 * 不会飞的行为类
 */
public class CannotFly extends AbstractFly {
    private Logger logger = LoggerFactory.getLogger(CannotFly.class);

    public CannotFly(String name){
        super(name);
    }

    public void fly() {
        logger.info(String.format("I am a %s , I can not fly",name));
    }
}
