package bte;

import java.time.LocalDateTime;

public class SomeInterfaceImpl {

    private Result result;

    public SomeInterfaceImpl(Result result) {
        this.result = result;
    }

    public void myMethod() {
        System.out.println("My Result = " + result.time);

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
