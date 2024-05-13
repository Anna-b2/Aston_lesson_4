package animals;

class Cat extends Animal {
    String cat_name;
    static int count = 0;
    boolean well_fed;

    public Cat(String type_of_animal, String cat_name, boolean well_fed) {
        this.type_of_animal = type_of_animal;
        this.cat_name = cat_name;
        this.well_fed = false;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance_for_run) {
        if (distance_for_run <= 200) {
            System.out.println(type_of_animal + cat_name + " пробежал " + distance_for_run + " метров");
        }
    }

    public void swim(int distance_for_swim)
    {
        if (distance_for_swim == 0)
            System.out.println(type_of_animal + " " + cat_name + " проплыл " + distance_for_swim + " метров");
            else System.out.println(type_of_animal + " " + cat_name + " не может проплыть такое расстояние ");

    }


    public static int addFoodAtPlate(int plate, int amountOfFood) {
        return plate + amountOfFood;
    }
}