package ra.examle;

public class Counter {
    private static int count = 0;
    private static String webName = "Rikkei Academy";
    private String webColor = "red";
    private final float PI = 3.14F;
    //Static Block
    static {
        count = 5;
        webName = "Học viện Rikkei";
    }

    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void visited(){
        count++;
        this.printCount();
    }
    public void printCount(){
        System.out.println("COUNT---> "+this.count);
    }

    //In ra câu xin chào khách hàng khi khách hàng vào ứng dụng web
    public static void helloUser(String userName){
        System.out.println("Xin chào khách hàng "+userName);
    }
}
