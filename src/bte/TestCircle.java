package bte;

public class TestCircle {
    public static void main(String[] args) {
        CircleTwo[] circles = getCircles(30);
        CircleTwo minAreaCircle = getCircleWithMinRadius(circles);
        System.out.println(minAreaCircle.getLenght() + minAreaCircle.radius);

    }

    public static CircleTwo getCircleWithMinRadius(CircleTwo[] circles) {
        CircleTwo result = circles[0];
        for (CircleTwo circleTwo : circles) {
            if (circleTwo.getLenght() < result.radius) {
                result = circleTwo;
            }
        }
        return result;
    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }

    public static CircleTwo[] getCircles(int count) {
        CircleTwo[] result = new CircleTwo[count];
        for (int i = 0; i < count; i++) {
            result[i] = new CircleTwo(getRandom(2, 600));
        }
        return result;
    }
}
