import org.apache.commons.lang.StringUtils;

public class JavaTest2 {

    public static String java2() {
        return JavaTest1.java1() + "java2" + StringUtils.EMPTY;
    }

    public static void main(String[] args) {
        System.out.println(java2());
    }

}
