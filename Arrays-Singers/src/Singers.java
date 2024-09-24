import java.util.ArrayList;

public class Singers {

    private ArrayList <String> singer_list = new ArrayList<String>();

    public void print_singers () {

        System.out.println("\t" + singer_list.size() + " Singers in singer list : ");

        System.out.println(" ");

        for (int i = 0; i < singer_list.size(); i++) {
            System.out.println((i+1) + ". singer : " + singer_list.get(i));
        }

    }

    public void add_singer (String name) {

        singer_list.add(name);
        System.out.println("Singer list has been updated...");
    }

    public void update_singer (String new_name, int index) {

        singer_list.set(index, new_name);
        System.out.println("Singer list has been updated...");
    }

    public void remove_singer (int index) {

        String name = singer_list.get(index);
        singer_list.remove(index);
        System.out.println(name + " named singer has been removed from singer list..");

    }



    public void search_singer (String s_name) {

        int index = singer_list.indexOf(s_name);

        if (index >= 0) {
            System.out.println("The singer found.");
            System.out.println("\nThe singer named '" + s_name + "' is " + (index + 1) + ". on the list.");

        } else {
            System.out.println("There is no singer with this name.");
        }

    }
}