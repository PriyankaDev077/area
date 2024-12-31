class shape{
    public double getarea(){
        return 0;
    }
}
class triangle extends shape{
    private double base;
    private double height;
    public triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double getarea(){
        return 0.5*base*height;
    }
}
class square extends shape {
    private double side;

    public square(double side) {
        this.side = side;
    }

    public double getarea() {
        return side * side;
    }
}
class main{
    public static void main(String [] args){
        shape[] x=new shape[2];
        x[0]=new square(7);
        x[1]=new triangle(4, 6);
        System.out.println("area of a square"+x[0].getarea());
        System.out.println("area of a triangle" + x[1].getarea());
    }
}