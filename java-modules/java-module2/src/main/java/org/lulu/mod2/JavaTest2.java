package org.lulu.mod2;

import org.apache.commons.lang.StringUtils;
import org.lulu.mod1.JavaTest1;

public class JavaTest2 {

    public static String java2() {
        return JavaTest1.java1() + "java2" + StringUtils.EMPTY;
    }

    public static void main(String[] args) {
        System.out.println(java2());
    }

}
