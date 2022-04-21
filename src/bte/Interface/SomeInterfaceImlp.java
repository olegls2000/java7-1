package bte.Interface;

import java.time.LocalDateTime;

public class SomeInterfaceImlp {

    private Result result;

    public SomeInterfaceImlp(Result result) {
        this.result = result;
    }

    public void myMethod() {
        System.out.println("My result = " + result.time);
    }

    public void myMethodX() {
        System.out.println("1");
    }

    public static class Result{
        private int score;
        private LocalDateTime time;

        public Result(int i, Object o) {
        }
    }


}
