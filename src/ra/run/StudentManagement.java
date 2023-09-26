package ra.run;

import ra.examle.Student;

import java.util.Scanner;

public class StudentManagement {
    //1. Khai báo mảng Student gồm 100 phần tử
    Student[] arrStudents = new Student[100];
    int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khởi tạo đối tượng StudentManagement
        StudentManagement studentManagement = new StudentManagement();
        do {
            System.out.println("****************MENU**************");
            System.out.println("1. Hiển thị thông tin sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManagement.displayStudents();
                    break;
                case 2:
                    studentManagement.createStudent(scanner);
                    break;
                case 3:
                    studentManagement.updateStudent(scanner);
                    break;
                case 4:
                    studentManagement.deleteStudent(scanner);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
        } while (true);
    }

    public void displayStudents() {
        //In thông tin sinh viên
        System.out.println("Thông tin các sinh viên:");
        for (int i = 0; i < currentIndex; i++) {
            arrStudents[i].displayData();
        }
    }

    public void createStudent(Scanner scanner){
        //1. Khởi tạo phần tử có chỉ số currentIndex là đối tượng Student
        arrStudents[currentIndex] = new Student();
        //2. Nhập thông tin cho phần tử currentIndex
        arrStudents[currentIndex].inputData(scanner);
        //3. Tăng currentIndex
        currentIndex++;
    }

    /**
     *
     * @param studentId
     * @return index Student of arrStudents
     * Author: QuangND
     * Created: 2023-09-26
     */
    public int getIndexByStudentId(int studentId){
        for (int i = 0; i < currentIndex; i++) {
            if (arrStudents[i].getStudentId()==studentId){
                return i;
            }
        }
        return -1;
    }

    public void updateStudent(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên cần cập nhật:");
        int studentId = Integer.parseInt(scanner.nextLine());
        int indexUpdate = getIndexByStudentId(studentId);
        if (indexUpdate>=0){
            //Nhập thông tin cập nhật
            System.out.println("Nhập vào tên sinh viên cần cập nhật:");
            String studentName = scanner.nextLine();
            if (!studentName.trim().isEmpty()){
                arrStudents[indexUpdate].setStudentName(studentName);
            }
            System.out.println("Nhập vào tuổi sinh viên cần cập nhật:");
            String age = scanner.nextLine();
            if (!age.trim().isEmpty()){
                arrStudents[indexUpdate].setAge(Integer.parseInt(age));
            }
            System.out.println("Nhập vào giới tính sinh viên cần cập nhật:");
            String gender = scanner.nextLine();
            if (!gender.trim().isEmpty()){
                arrStudents[indexUpdate].setGender(Boolean.parseBoolean(gender));
            }
            System.out.println("Nhập vào địa chỉ sinh viên cần cập nhật:");
            String address = scanner.nextLine();
            if(!address.trim().isEmpty()){
                arrStudents[indexUpdate].setAddress(address);
            }
            System.out.println("Nhập vào số điện thoại sinh viên cần cập nhật:");
            String phone = scanner.nextLine();
            if (!phone.trim().isEmpty()){
                arrStudents[indexUpdate].setPhone(phone);
            }
        }else{
            System.err.println("Mã sinh viên không tồn tại");
        }
    }

    public void deleteStudent(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên cần xóa:");
        int studentId = Integer.parseInt(scanner.nextLine());
        int indexDelete = getIndexByStudentId(studentId);
        if (indexDelete>=0){
            for (int i = indexDelete; i < currentIndex-1; i++) {
                arrStudents[i] = arrStudents[i+1];
            }
            arrStudents[currentIndex-1] = null;
            currentIndex--;
        }else{
            System.err.println("Mã sinh viên không tồn tại");
        }
    }
}
