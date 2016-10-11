package com.groupon.jtier.cli;

import java.lang.reflect.*;
import com.groupon.jtier.core.Util;

public class Main {

    public static void main(final String[] args) throws Exception {
        System.out.println(new Util().sayHello());

        String internalClassName = "com.groupon.jtier.core.internal.InternalUtility";
        Class<?> internalClass = Class.forName(internalClassName); // convert string classname to class
        Object ins = internalClass.newInstance(); // invoke empty constructor

        // with single parameter, return void
        Method setNameMethod = ins.getClass().getMethod("sayHello");
        System.out.println(setNameMethod.invoke(ins, null) + "internal BOOOM!"); // pass arg
    }
}
