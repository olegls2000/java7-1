package bte;

import java.time.LocalDateTime;

import static bte.util.Print.print;

public class SomeInterfaceImpl {
        public Result result;

    public SomeInterfaceImpl(Result result) {
        this.result = result;
    }

    public void myMethod() {
        print("My result: " + result);

    }


    public static class Result {

        private int score;
        private LocalDateTime time;

        public Result(int score, LocalDateTime time){
            this.score = score;
            this.time = time;
        }
    }


}
