import ra.examle.StopWatch;

public class Main {
    public static void main(String[] args) {
        //1. Khởi tạo đối tượng
        StopWatch stopWatch = new StopWatch();
        System.out.println("THỜI GIAN BẮT ĐẦU KHỞI TẠO---->"+stopWatch.getStartTime());
        //2. start
        stopWatch.start();
        //3. Khởi tạo mảng 100.000 số
        int[] arrInt = new int[100000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.random()*100000;
        }
        //4. Thực hiện sắp xếp mảng tăng dần
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = i+1; j < arrInt.length; j++) {
                if (arrInt[i]>arrInt[j]){
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        //5. end
        stopWatch.stop();
        System.out.println("THỜI GIAN TỪ LÚC START --> END: "+stopWatch.getElapseTime());
    }
}