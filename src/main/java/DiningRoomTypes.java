public enum DiningRoomTypes {
    BREAKFAST("Breakfast restaurant"),
    LUNCH("Lunch restaurant"),
    DINNER("Dinner restaurant");

    private String diningRoom;

    DiningRoomTypes(String diningRoom){
        this.diningRoom = diningRoom;
    }

    public String getDiningRoom(){
        return diningRoom;
    }
}
