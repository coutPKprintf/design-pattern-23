package org.cw.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenwen on 16/6/5.
 * 不会叫的行为类
 */
public class CannotQuack extends AbstractQuack {
    private Logger logger = LoggerFactory.getLogger(CannotQuack.class);

    public CannotQuack(String name){
        super(name);
    }

    public void quack() {
        logger.info(String.format("I am a %s , I can not quack",name));
    }
}
