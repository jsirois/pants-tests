package org.lulu.mod1;

import org.apache.commons.lang.StringUtils;
import org.lulu.mod1.sub.JavaTest1Sub;

public class JavaTest1 {

    public static String java1() {
        return StringUtils.join(new String[]{JavaTest1Sub.java1(), StringUtils.EMPTY});
    }

}
