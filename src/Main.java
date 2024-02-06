import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("case 1: " + shouldWakeUp(true, 1));
        // System.out.println("case 2: " + shouldWakeUp(true, 2));
        // System.out.println("case 3: " + shouldWakeUp(true, 8));
        // System.out.println("case 4: " + shouldWakeUp(true, -1));


        // System.out.println("case teen 1: " + hasTeen(9, 99, 19));
        // System.out.println("case teen 2: " + hasTeen(23, 15, 42));
        // System.out.println("case teen 3: " + hasTeen(22, 23, 34));

       //System.out.println("case teen 3: " + hasTeen2(9, 99, 19));
       // System.out.println("case teen 3: " + hasTeen2(23, 15, 42));
       // System.out.println("case teen 3: " + hasTeen2(22, 23, 34));

       /* System.out.println("case cat 1: " + isCatPlaying(true, 23));
        System.out.println("case cat 2: " + isCatPlaying(false, 35));
        System.out.println("case cat 3: " + isCatPlaying(false, 36));*/

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        System.out.println("Enter height of rectangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the rectangle
        double rectangleArea = area(height, width);
        System.out.println("Area of rectangle: " + rectangleArea);
*/

        System.out.println("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double circleArea = area(radius);
        System.out.println("Area of circle: " + circleArea);

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) return false;
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean hasTeen2(int... ages) {
        if (ages.length != 3) {
            return false;
        }
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer){
            return  temperature>25 && temperature<=45;
        }
        return  temperature>25 && temperature<=35;
    }
    public static double area(double heigth, double width) {
if(heigth<0 && width<0){
return -1;
}
return width * heigth;
    }
    public static double area(double radius) {
        if (radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
