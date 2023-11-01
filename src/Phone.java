public class Phone {
    String brand;
    String model;
    int price ;
    int memory;

    public void  call(){
        System.out.println(brand + " " + model + " " + " " + "phone is calling") ;
    }

    public  String listen(){
        return "listening" + brand + " " + model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                '}';
    }
}
