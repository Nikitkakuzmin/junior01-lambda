public class Main3 {
    public static void main(String[] args) {

        Supplier s1 = () -> {
            int x = 1;
            return x;
        };

        System.out.println("Lam " + s1.get());


        Supplier s2 = new Supplier() {
            @Override
            public int get() {
                return 1;
            }
        };

        System.out.println("Anon " + s2.get());

    }
}
