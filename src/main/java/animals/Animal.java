package animals;

    class Animal
    {
        String type_of_animal;
        static int count = 0;

        public Animal(String type_of_animal)
        {
            this.type_of_animal = type_of_animal;

        }

        public static int getCount()
        {
            return count;
        }
        public Animal()
        {
            count++;
        }

        public void animal_run() {
        }
        public void animal_swim() {
        }
    }

