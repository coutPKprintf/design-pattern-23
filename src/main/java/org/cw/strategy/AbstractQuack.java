package org.cw.strategy;

/**
 * Created by chenwen on 16/6/5.
 */
public abstract class AbstractQuack implements IQuack {
    protected String name;

    public AbstractQuack(String name){
        this.name = name;
    }
}
