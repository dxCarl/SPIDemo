package com.xiao.deng.spi;

import com.xiao.deng.api.IOperation;

/**
 * @author xiao
 * @date 2020/03/19
 */
public class DivisionOperationImpl implements IOperation {
    @Override
    public int operation(int numberA, int numberB) {
        return numberA / numberB;
    }
}
