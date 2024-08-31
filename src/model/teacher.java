package model;

public class teacher {
    private String iD;
    private String nameTeacher;
    private String major;
    private String age;

    public teacher(String iD, String nameTeacher, String major, String age) {
        this.iD = iD;
        this.nameTeacher = nameTeacher;
        this.major = major;
        this.age = age;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "iD='" + iD + '\'' +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", major='" + major + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void vesodotamgiac(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.printf(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.printf("*");
            }
            System.out.println();

        }
    }


}
