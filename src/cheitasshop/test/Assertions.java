package cheitasshop.test;

public class Assertions {

    public static void isEquals(Object left, Object right) {
        try {
            if (left == null || left.getClass() != right.getClass()) {
                throw new RuntimeException("fail");
            }
            if (!left.equals(right)){
                throw new RuntimeException("fail");
            }
            System.out.println("Green they are the same :)");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(left.toString() + " is not equal to " + right.toString());
        }
    }

    public static void isEquals(boolean left, boolean right) {
        try {
            if (left != right) {
                throw new RuntimeException("fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(left + " is not equals to " + right);
        }
    }
}
