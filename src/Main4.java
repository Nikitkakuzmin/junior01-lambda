import java.util.concurrent.FutureTask;

public class Main4 {
    public static void main(String[] args) {

        Callable c1 = () -> {
            return 1;
        };
        FutureTask<String> future = new FutureTask<>(c1);
        new Thread(future).start();
        System.out.println(future.get());


    }
}
