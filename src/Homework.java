public class Homework {

    public static void main(String[] args) {

        byte ageHuman1 = 3;
        byte ageHuman2 = 10;
        byte ageHuman3 = 19;
        byte ageHuman4 = 26;

        if (ageHuman1 >= 2 && ageHuman1 <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman1 + ", то ему нужно ходить в детский сад.");
        }
        if (ageHuman2 >= 7 && ageHuman2 <= 18) {
            System.out.println("Если возраст человека равен " + ageHuman2 + ", то ему нужно ходить в школу.");
        }
        if (ageHuman3 > 18 && ageHuman3 < 24) {
            System.out.println("Если возраст человека равен " + ageHuman3 + ", то ему нужно ходить в в университет.");
        }
        if (ageHuman4 > 24) {
            System.out.println("Если возраст человека равен " + ageHuman4 + ", то ему нужно ходить на работу.");
        }


    }

}
