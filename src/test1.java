public class test1 {
    private test1() {
    }

    // 静态内部类的方式
    private static class method {
        private final static test1 INSTANCE = new test1();
    }

    public static test1 getInstance() {
        return method.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(test1.getInstance().hashCode());
            }).start();
        }
    }
}
