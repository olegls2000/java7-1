public class CircleAR {
    public static void main(String[] args){
      Circle[] circles = getCircle(100);
      Circle maxAreaCircle = getCircleWithMaxRadius(circles);
        System.out.println("Circle with the biggest area: "
        + maxAreaCircle.getArea() + " with radius: "
        + maxAreaCircle.radius);
    }

    public static Circle getCircleWithMaxRadius(Circle[] circles){
        Circle result = circles[0];
        for (Circle circle : circles){
            if (circle.getArea() > result.getArea()){
                result = circle;
            }
        }
        return result;
    }

    public static Circle[] getCircle(int count){
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++){
            result[i] = new Circle(getRandom(40, 100));
        }
        return result;
    }

    public static int getRandom(int a, int b){
        return (int) (Math.random() * (b - a)) + a;
    }

}
