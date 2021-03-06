public class Ball { // blueprint

    /*
       Public - anyone can access
       Private - Only accessed within the class
       Protected - can be used in the same package or derived classes
     */


    //Properties or instance variables
    protected String color;
    protected String name;
    protected int capacity;
    protected int bounceRate;
    
    //final helps to prevent our properties or methods from  being overwritten;
    final protected boolean inflated = false;



    //constructor function with no parameters. This is called default constructors
    public Ball() {
        //default
    }

    public Ball(String mColor, String mName, int mCapacity, int mBounceRate) {

        color = mColor;
        name = mName;
        capacity = mCapacity;
        bounceRate = mBounceRate;
    }

    public Ball(String mColor, String mName) {
        color = mColor;
        name = mName;

    }

    public Ball( String mColor, String mName, int mCapacity) {

        color = mColor;
        name = mName;
        capacity = mCapacity;

    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    //Behaviors

    public void showColor() {
        System.out.println(color);
    }

    public  void showName() {
        System.out.println(name);
    }
    public void bounce(){
        System.out.println("Bouncing");
    }

    public void deflate(){
        System.out.println("Deflating...");
    }

    public void inflates(){
        System.out.println("Inflating...");
    }





}
