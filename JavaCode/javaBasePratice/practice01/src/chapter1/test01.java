package chapter1;

public class test01 {
    public static void main(String[] args) {
        switch (7) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("工作日");
                System.out.println("第二行");
            }
            case 7, 6 -> {
                System.out.println("周末");
                System.out.println("第二行");
            }
        }
    }
}
