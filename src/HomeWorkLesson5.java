public class HomeWorkLesson5 {
    public static void main(String[] args) {
        Circle[] circles = generateCircles(30);
        Circle minLength = getCircleWithMinLength(circles);
        System.out.println(minLength.getLength() + " " + minLength.radius);
    }

    public static Circle[] generateCircles(int count) {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            result[i] = new Circle(getRandom(2, 600));
        }
        return result;
    }

    public static Circle getCircleWithMinLength(Circle[] circles) {
        Circle result = circles[0];
        for (Circle circle : circles) {
            if (circle.getLength() < result.getLength())
                result = circle;
        }

        return result;
    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }
}
