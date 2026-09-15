public class Lconv{
    double inches=1.0;
    public Lconv(double newinches){
        inches=newinches;

    }
    /*public Lconv(){
        inches=1.0;
    }*/
    public double tocen(){
        return inches*2.54;
    }
    public double tometer(){
        return tocen()/100;
    }
    
}