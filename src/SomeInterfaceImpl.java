import java.time.LocalDateTime;

public class SomeInterfaceImpl implements SomeInterface {

    private Result result;

    public SomeInterfaceImpl(Result result) {
        this.result = result;
    }

    public SomeInterfaceImpl() {

    }

    @Override
    public void myMethod() {
        System.out.println("1");
    }

    @Override
    public void myMethodX() {
        System.out.println("1");
    }

    public static class Result {
        private int score;
        private LocalDateTime time;

        public Result(int score, LocalDateTime time) {
            this.score = score;
            this.time = time;
        }
    }
}
