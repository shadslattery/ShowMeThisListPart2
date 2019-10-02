package com.example.showmethislistpart2;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<SMTLPerson> getList() {
        List<SMTLPerson> People = new ArrayList<>();
        People.add(new SMTLPerson("Michael", "Jordan", "mj23@bulls.com", "2123452321"));
        People.add(new SMTLPerson("Jennifer", "Nelson", "jNelson321.com", "7824569585"));
        People.add(new SMTLPerson("Ben", "Laney", "laneyBen395.com", "4195427112"));
        People.add(new SMTLPerson("Jessica", "Bonner", "bonner69.com", "8108957482"));
        People.add(new SMTLPerson("John", "Goose", "goosejohn.com", "8528139781"));
        People.add(new SMTLPerson("Eli", "Geroge", "eg851.com", "2157359237"));
        People.add(new SMTLPerson("Steven", "Jobs", "stevejobs.com", "9527528953"));
        People.add(new SMTLPerson("Dick", "Gordan", "GardanD.com", "85286498574"));
        People.add(new SMTLPerson("Mark", "Pierman", "mpiermans.com", "4195427549"));
        People.add(new SMTLPerson("Billy", "Jordan", "bjordan.com", "8135697125"));

        return people;
}
