public class AreaOfRectangle {
    public static void main(String[] args){

        Rectangle r1 = new Rectangle(5,6);
        Rectangle r2 = new Rectangle(4,5);
        Rectangle r3 = new Rectangle(7,8);

        r1.area();
        r2.area();
        r3.area();
    }
}

class Rectangle{
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        this.length= length;
        this.breadth= breadth;
    }

    void area(){
        System.out.println("The area of rectangle with Length "+ length+ 
        " and breadth "+ breadth+" is "+ length*breadth);
    }
}
