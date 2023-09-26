package ra.run;

import ra.examle.Counter;

public class WebManagement {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.visited();
        //Gọi phương thức static
        Counter.helloUser("Khách hàng 1");
        Counter counter2 = new Counter();
        counter2.visited();
        Counter.helloUser("Khách hàng 2");
        Counter counter3 = new Counter();
        counter3.visited();
        Counter.helloUser("Khách hàng 3");
    }
}
