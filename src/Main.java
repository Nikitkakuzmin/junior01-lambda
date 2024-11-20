public class Main {
    public static void main(String[] args) {

        Runnable r1 = () -> {System.out.println("Lam");};

        r1.run();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anon");
            }
        };

        r2.run();
    }
}
