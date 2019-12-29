public enum test2 {
    // effective get fun:不仅解决线程安全问题，还防止了反序列化
    INSTANCE;

    public void m() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(test2.INSTANCE.hashCode());
            }).start();
        }
    }
}
