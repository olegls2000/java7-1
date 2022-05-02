package bte;

import java.time.LocalDateTime;

public class SomeInterfaceImpl implements SomeInterface {
    private Result result;

    @Override
    public void myMethod() {
        System.out.println(1);
    }

    @Override
    public void myMethodX() {
        System.out.println(1);
    }

    public  static class Result {
        private final int score;
        private final LocalDateTime time;

        public Result(int score, LocalDateTime time) {
            this.score = score;
            this.time = time;
        }
    }
}
