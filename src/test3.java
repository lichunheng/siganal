public class test3 {
    // 常用方式
    private static final test3 INSTANCE = new test3();

    private test3() {
    }

    private static test3 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
