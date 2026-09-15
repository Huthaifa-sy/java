public class Rectangle{
    double width=1;
    double height=1;

    public Rectangle(){

    }
    public Rectangle(double newwidth, double newheight){
        width=newwidth;
        height=newheight;
    }
    public double getArea(){
        return width*height;
    }
    public double getper(){
        return 2*(width+height);
    }
}
