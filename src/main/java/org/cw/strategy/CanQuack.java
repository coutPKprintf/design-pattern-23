package org.cw.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenwen on 16/6/5.
 * 会叫类
 */
public class CanQuack extends AbstractQuack{
    private Logger  logger = LoggerFactory.getLogger(CanQuack.class);

    public CanQuack(String name){
        super(name);
    }

    public void quack() {
        logger.info(String.format("I am a %s , I can quack",name));
    }
}
