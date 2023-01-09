package ru_synergy.innernested;

public class Parcel {
    private String recepient;
    private int mass;

    class Destination {
        private String street;
        private int homeNumber;
        private int roomNumber;
        public void doSmt() {
            System.out.println(mass);
        }
    }
}

