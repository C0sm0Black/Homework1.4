public class Homework {

    public static void main(String[] args) {

        byte ageChild = 13;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождении взрослого.");
        }

    }

}
