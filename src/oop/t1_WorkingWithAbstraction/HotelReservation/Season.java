package oop.t1_WorkingWithAbstraction.HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRINT(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;
    Season (int multiplier){
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
    public static Season parse(String str){
        return Season.valueOf(str.toUpperCase());
    }
}
