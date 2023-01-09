package ru_synergy.inner;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public void createNewPerson(String name) {
        String nameFIO = name;

        class GenericName {
            List<String> names = new ArrayList<>();
            public GenericName() {
                for (String str : nameFIO.split(" ")) names.add(str);
            }
            public String getFirstName() {
                return names.get(0);
            }
            public String getLastName() {
                return names.get(names.size() - 1);
            }
        }

        GenericName genericName = new GenericName();
        System.out.println("Person: " + genericName.getFirstName().charAt(0) + ". " + genericName.getLastName());
    }
}
