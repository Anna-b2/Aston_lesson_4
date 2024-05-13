package animals;

public class Main {
    public static void main(String[] args) {
        Animal first_animal = new Animal("Кошка");
        Animal second_animal = new Animal("Кот");
        Animal third_animal = new Animal("Собака");
        Animal fourth_animal = new Animal("Собака");
        Cat first_cat = new Cat("Кошка", "Мурка", false);
        Cat second_cat = new Cat("Кот", "Пушистик", false);
        Dog first_dog = new Dog("Собака", "Мухтар");
        Dog second_dog = new Dog("Собака", "Дружок");

        System.out.println("Количество котов и кошек: "+ Cat.getCount() );
        System.out.println("Количество собак: "+ Dog.getCount());
        System.out.println("Количество животных: "+ Animal.getCount());

        first_cat.run(150);
        first_cat.swim(10);
        second_cat.swim(0);
        first_dog.run(450);
        second_dog.swim(1);

        Cat[] eating_cat = new Cat[2];
        eating_cat[0] = new Cat("Кошка", "Барсик", false);
        eating_cat[1] = new Cat("Кошка", "Вукан", false);
        int plate = 45;
        for (Cat cat : eating_cat) {
            System.out.println("Кот " + cat.cat_name + " покушал: " + cat.well_fed);
            if (!cat.well_fed && plate >= 1) {
                cat.well_fed = true;
                plate -= 1;
            }

        }
        System.out.println(Cat.addFoodAtPlate(plate, 10));

    }
}
