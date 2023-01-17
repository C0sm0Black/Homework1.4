public class Homework {

    public static void main(String[] args) {

        byte outsideTemperature1 = 4;
        byte outsideTemperature2 = 8;

        if (outsideTemperature1 < 5) {
            System.out.println("На улице " + outsideTemperature1 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature1 + " градусов, можно идти без шапки");
        }

        if (outsideTemperature2 < 5) {
            System.out.println("На улице " + outsideTemperature2 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature2 + " градусов, можно идти без шапки");
        }

    }

}
