public class Main2 {
    public static void main(String[] args) {

        Consumer c1 = x -> {System.out.println("Lam " + x );};

        c1.accept(1);

        Consumer c2 = new Consumer() {
            @Override
            public void accept(int x) {
                System.out.println("Anon " + x);
            }
        };

        c2.accept(1);

    }
}
