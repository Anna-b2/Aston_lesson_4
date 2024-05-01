public class Employee {

            private String FIO;
            private String position;
            private String email;
            private String phoneNumber;
            private String salary;
            private String age;

            public Employee(String FIO, String position, String email, String phoneNumber, String salary, String age) {
                this.FIO = FIO;
                this.position = position;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
            }

            public String getFIO() {
                return FIO;
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
                return age;
            }
}
