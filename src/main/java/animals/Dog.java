package animals;

class Dog extends Animal {
    String dog_name;
    static int count = 0;

    public Dog(String name, String dog_name) {
        this.type_of_animal = name;
        this.dog_name = dog_name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance_for_run) {
        if (distance_for_run <= 500) {
            System.out.println(type_of_animal + " " + dog_name + " пробежал " + distance_for_run + " метров");
        }
    }

    public void swim(int distance_for_swim) {
        if (distance_for_swim <= 10) {
            System.out.println(type_of_animal + " " + dog_name + " проплыл " + distance_for_swim + " метров");
        }
    }
}