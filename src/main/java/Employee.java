public class Employee {

            private String surname;
            private String name;
            private String middle_name;
            private String position;
            private String email;
            private String phoneNumber;
            private String salary;
            private String age;

            public Employee(String surname,String name,String middle_name, String position, String email, String phoneNumber, String salary, String age) {
                this.surname = surname;
                this.name = name;
                this.middle_name = middle_name;
                this.position = position;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
            }

            public String getSurname() {
                return surname;
            }
            public String getName() { return name;}
            public String getMiddle_name() {
        return middle_name;
    }
            public String getPosition() {
                return position;
            }
            public String getEmail() {
                return email;
            }
            public String getPhoneNumber() {
                return phoneNumber;
            }
            public String getSalary() {
                return salary;
            }
            public String getAge() {
                return age;}
                public void printEmployee() {
                    System.out.println(getSurname());
                    System.out.println(getName());
                    System.out.println(getMiddle_name());
                    System.out.println(getPosition());
                    System.out.println(getEmail());
                    System.out.println(getPhoneNumber());
                    System.out.println(getSalary());
                    System.out.println(getAge());
                }
            }

