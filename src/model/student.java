package model;

public class student {
        private String iD;
        private String nameStudent;
        private String dob;
        private int age;
        private String classes;
        private int weight;
        private int height;

        public student(String iD, String nameStudent, String dob, int age, String classes, int weight, int height) {
            this.iD = iD;
            this.nameStudent = nameStudent;
            this.dob = dob;
            this.age = age;
            this.classes = classes;
            this.weight = weight;
            this.height = height;
        }

        public String getiD() {
            return iD;
        }

        public void setiD(String iD) {
            this.iD = iD;
        }

        public String getNameStudent() {
            return nameStudent;
        }

        public void setNameStudent(String nameStudent) {
            this.nameStudent = nameStudent;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getClasses() {
            return classes;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String printValue(int age){
            return "Tuoi la: "+age;
        }

        public String printValue(int age, String name){
            return name+": "+ age;
        }

        @Override
        public String toString() {
            return "student{" +
                    "iD='" + iD + '\'' +
                    ", nameStudent='" + nameStudent + '\'' +
                    ", dob=" + dob +
                    ", age=" + age +
                    ", classes=" + classes +
                    ", weight=" + weight +
                    ", height=" + height +
                    '}';
        }

}

