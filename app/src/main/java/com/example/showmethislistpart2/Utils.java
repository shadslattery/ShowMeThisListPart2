package com.example.showmethislistpart2;

import java.util.ArrayList;
import java.util.List;

public class Utils {

   public static List<People> getList() {
        List<People> people = new ArrayList<>();
        people.add(new People("Shad", "Slattery","shadslattery@gmail.com","7275105681"));
        people.add(new People("Michael", "Jordan", "mj23@bulls.com", "2123452321"));
        people.add(new People("Jennifer", "Nelson", "jNelson321.com", "7824569585"));
        people.add(new People("Ben", "Laney", "laneyBen395.com", "4195427112"));
        people.add(new People("Jessica", "Bonner", "bonner69.com", "8108957482"));
        people.add(new People("John", "Goose", "goosejohn.com", "8528139781"));
        people.add(new People("Eli", "Geroge", "eg851.com", "2157359237"));
        people.add(new People("Steven", "Jobs", "stevejobs.com", "9527528953"));
        people.add(new People("Dick", "Gordan", "GardanD.com", "85286498574"));
        people.add(new People("Mark", "Pierman", "mpiermans.com", "4195427549"));
        people.add(new People("Billy", "Jordan", "bjordan.com", "8135697125"));

        return people;
    }
}
