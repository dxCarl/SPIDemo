package com.xiao.deng;

import com.xiao.deng.api.IOperation;
import com.xiao.deng.impl.PlusOperationImpl;
import com.xiao.deng.spi.DivisionOperationImpl;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author xiao
 * @date 2020/03/19
 */
public class Main {
    public static void main(String[] args) {
        IOperation plus = new PlusOperationImpl();

        IOperation division = new DivisionOperationImpl();
        System.out.println(plus.operation(5, 3));

        System.out.println(division.operation(9, 3));

        ServiceLoader<IOperation> operations = ServiceLoader.load(IOperation.class);
        Iterator<IOperation> operationIterator = operations.iterator();
        System.out.println("classPath:"+System.getProperty("java.class.path"));
        while (operationIterator.hasNext()) {
            IOperation operation = operationIterator.next();
            System.out.println(operation.operation(6, 3));
        }
    }
}
