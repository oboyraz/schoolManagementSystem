public class Student extends Person{
    private String classInfo;
    private int studNo;

    public Student(String name, String surName, String tcNo, int age, String classInfo, int studNo) {
        super(name, surName, tcNo, age);
        this.classInfo = classInfo;
        this.studNo = studNo;
    }

    public Student() {
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    public int getStudNo() {
        return studNo;
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classInfo='" + classInfo + '\'' +
                ", studNo=" + studNo +
                '}';
    }
}
