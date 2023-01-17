public class Homework {

    public static void main(String[] args) {

        byte wagonCapacity = 102;
        byte seatPlace = 60;
        byte standingPlace = (byte) (wagonCapacity - seatPlace);
        short numberOfPersons = 60;
        short a = 0;
        short b = 0;

        if (numberOfPersons < wagonCapacity) {

            b = (short) (wagonCapacity - numberOfPersons);

            if ((wagonCapacity - b) <= standingPlace) {
                a = 0;
            } else {
                a = (short) (b - standingPlace);
                b = standingPlace;
            }

        }

        if (numberOfPersons > wagonCapacity) {
            System.out.println("Столько людей в вагон не влезет");
        } else if (numberOfPersons == wagonCapacity) {
            System.out.println("Вагон уже полностью забит");
        } else if (numberOfPersons < wagonCapacity) {
            System.out.println("В вагоне есть " + a + " сидячих мест и " + b + " стоячих мест");
        }

    }

}
