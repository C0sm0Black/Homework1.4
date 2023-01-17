public class Homework {

    public static void main(String[] args) {

        int one = 10;
        int two = 5;
        int three = 3;

        if (one >= two){
            if (one > three){
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else if (two > three) {
            System.out.println(two);

        } else {
            System.out.println(three);
        }

    }

}
