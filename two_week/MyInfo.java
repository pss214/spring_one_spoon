package two_week;

public class MyInfo {
    private String name;
    private int age;
    private String student_id;
    private String school_name;
    public void printAll(){
        System.out.println("name : "+name+"| age : "+age+"| student_id : "+
                student_id+"| school_name : "+ school_name);
    }
    public MyInfo(){
        school_name = "한국IT전문직업학교";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}
