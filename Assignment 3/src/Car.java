public class Car {

    private  String make;
    private  String model;
    private  String regnum;
    private String fueltype;

    private static int nowheels;
    private static  final int vType= 1; //constant

    Car(){

    }

     Car(String regnum){
        this.regnum= regnum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public static int getNowheels() {
        return nowheels;
    }

    public static void setNowheels(int nowheels) {
        Car.nowheels = nowheels;
    }


    private void print(){


        System.out.println("make=" + make + ", fuelType=" + fueltype);


    }

    public static void main(String[] args) {

        Car c1= new Car();
        c1.setMake("renault");
        c1.setFueltype("diesel");
c1.setNowheels(4);



c1.print();
    }









}
