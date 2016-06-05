package org.cw.strategy;

/**
 * Created by chenwen on 16/6/5.
 */
public abstract class AbstractFly implements IFly {
    protected String name;

    public AbstractFly(String name){
        this.name = name;
    }
}
