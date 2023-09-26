package ra.examle;

import java.util.Scanner;

public class Student {
    //1.Attributes
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    //2.Constructors
    public Student() {
    }

    public Student(int studentId, String studentName, int age, boolean gender, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    //Methods
    //Getter-Setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Method
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính:");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ:");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào số điện thoại:");
        this.phone = scanner.nextLine();
    }

    public void displayData() {
        System.out.printf("Mã SV: %d - Tên SV: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Địa chỉ: %s - Điện thoại: %s\n", this.gender, this.address, this.phone);
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
