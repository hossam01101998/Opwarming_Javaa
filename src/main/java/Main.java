public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");

        Snack boulet= new Snack(123,"Boelet",2.5);
        Snack frikandel= new Snack(124,"Frikandel",1.7);

        SnackBeheer.addSnack(boulet);
        SnackBeheer.addSnack(frikandel);

        System.out.println(SnackBeheer.getSnackArrayList().toString());

    }
}
