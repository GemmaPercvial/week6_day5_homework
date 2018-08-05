public class Bedrooms extends Rooms {

        private BedroomTypes roomType;
        private double nightlyRate;


        public Bedrooms(BedroomTypes roomType, double nightlyRate, int capacity) {
            super(capacity);
            this.roomType = roomType;
            this.nightlyRate = nightlyRate;
        }

        public BedroomTypes getBedroomType() {
            return roomType;
        }

        public double getNightlyRate() {
            return nightlyRate;
        }
    }