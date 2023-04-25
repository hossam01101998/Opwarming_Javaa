package be;

import java.util.ArrayList;

public class SnackBeheer {
    private static ArrayList<Snack> snackArrayList = new ArrayList<>();
    public SnackBeheer(){

    }
    public static ArrayList<Snack> getSnackArrayList(){
        return snackArrayList;
    }
    public static void addSnack(Snack newSnack){
        snackArrayList.add(newSnack);
    }
    public static void removeSnack(Snack newSnack){
        snackArrayList.remove(newSnack);

    }
}
