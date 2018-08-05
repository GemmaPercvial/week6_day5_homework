public enum ConferenceRoomTypes {
    LARGE("Large Conference room", 500.00),
    MEDIUM("Medium Conference room", 400.00),
    SMALL("Small Conference room", 300.00);

    private String conferenceRoomType;
    private double dayRate;

    ConferenceRoomTypes(String conferenceRoomType, double dayRate) {
        this.conferenceRoomType = conferenceRoomType;
        this.dayRate = dayRate;
    }

    public String getConferenceRoomType(){
        return conferenceRoomType;
    }

    public double getDayRate(){
        return dayRate;
    }
}
