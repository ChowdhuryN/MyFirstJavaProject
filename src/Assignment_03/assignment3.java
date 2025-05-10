package Assignment_03;

public class assignment3 {
    public String name = "Car";
    protected int  speed =250;
    private char type = 'a';

    public assignment3(){

    }

  public assignment3(String name, int speed, char type){
     this.name=name;
     this.speed=speed;
     this.type=type;

  }

    public static void main(String[] args) {
        assignment3 car=new assignment3();
        car.name="Car";
        car.speed=250;
        car.type='a';
        System.out.println("Name" +car.name);
        System.out.println("Speed" +car.speed);
        System.out.println("Type" +car.type);
    }

  public void practice3(){
        System.out.println("This is practice3 method");

    }

    public String  practice4(){
        return name;


    }
}
