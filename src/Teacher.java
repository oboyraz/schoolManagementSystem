public class Teacher extends Person{

    private String department;
    private int sicilNo;

    public Teacher(String name, String surName, String tcNo, int age, String department, int sicilNo) {
        super(name, surName, tcNo, age);
        this.department = department;
        this.sicilNo = sicilNo;
    }

    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }
}
