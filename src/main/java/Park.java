public class Park {

    public static class Attractions {
        private String name;
        private String timeOfWork;
        private String cost;


        public Attractions(String name, String timeOfWork, String cost) {
            this.name = name;
            this.timeOfWork = timeOfWork;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }
        public String getTimeOfWork() {
            return timeOfWork;
        }
        public String getCost() {
            return cost;
        }
        public void setName (String name){
            this.name = name;
        }
        public void setTimeOfWork (String timeOfWork){
            this.timeOfWork = timeOfWork;
        }
        public void setCost (String cost){
            this.cost = cost;
        }
    }
}
