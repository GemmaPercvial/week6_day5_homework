import java.util.ArrayList;

    public class Hotel {
        private ArrayList<Bedrooms> bedrooms;
        private ArrayList<ConferenceRooms> conferenceRooms;
        private ArrayList<DiningRooms> diningRooms;

        public Hotel(){
            this.bedrooms = new ArrayList<>();
            this.conferenceRooms = new ArrayList<>();
            this.diningRooms = new ArrayList<>();
        }

        public ArrayList<Bedrooms> getBedrooms() {
            return bedrooms;
        }

        public ArrayList<ConferenceRooms> getConferenceRooms() {
            return conferenceRooms;
        }

        public ArrayList<DiningRooms> getDiningRooms() {
            return diningRooms;
    }
