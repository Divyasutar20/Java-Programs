package test;


class Test {
    final int x = 10;

    void show() {
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}
