public class Park {
    Attraction attraction;
    public void addAttraction(String name, String timeOfWork, String cost) {
        this.attraction = new Attraction(name, timeOfWork, cost);

    }
    public void printAttraction() {
        System.out.println("Список аттракционов:");
        System.out.println(attraction.getName());
        System.out.println(attraction.getTimeOfWork());
        System.out.println(attraction.getCost());

    }

    private class Attraction {
        private String name;
        private String timeOfWork;
        private String cost;

        public Attraction(String name, String timeOfWork, String cost) {
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
    }
        public static void main(String[] args) {
            Park park = new Park();
            park.addAttraction("Солнце", "10:00-20:00", "12 руб.");
            park.printAttraction();
    }
}

