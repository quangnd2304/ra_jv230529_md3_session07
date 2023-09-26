package ra.examle;

public class StopWatch {
    //1. Attributes - Fields
    private long startTime;
    private long endTime;

    //2. Constructor
    public StopWatch() {
        //Khởi tạo startTime
        this.startTime = System.currentTimeMillis();
    }

    //3. Methods
    //3.1. Getter
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    //3.2. Method
    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("START TIME ----> " + this.startTime);
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        System.out.println("END TIME ----> " + this.endTime);
    }

    public long getElapseTime() {
        return this.endTime - this.startTime;
    }

}
