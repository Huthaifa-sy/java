import java.util.Random;
public class Main{
    public static void main(String[] args){
        Rectangle r1=new Rectangle(4.3,43.2);
        Rectangle r2=new Rectangle(3.5,34.6);
    
        System.out.println("bredde"+r1.width+", høyde"+r1.height+", areal"+r1.getArea()+", omkrets"+r1.getper());
        System.out.println("bredde"+r2.width+", høyde"+r2.height+", areal"+r2.getArea()+", omkrets"+r2.getper());
        Stock s=new Stock("lg","ali");
        s.pcp=34.5;
        s.cp=34.35;
        System.out.println("det blir :"+s.symbol+" "+s.getcp()+"%");

        Lconv l=new Lconv(10.1);
        Lconv l2=new Lconv(60.8);
        System.out.println("lengen :"+l.inches+" tommer, "+l.tocen()+" cm "+l.tometer()+" meter");
        System.out.println("lengen :"+l2.inches+" tommer, "+l2.tocen()+" cm "+l2.tometer()+" meter");
        l.inches=20;
        System.out.println("lengen :"+l.inches+" tommer, "+l.tocen()+" cm "+l.tometer()+" meter");
        Random r=new Random(1000);
        for (int i=0;i<50;i++){
            System.out.println(r.nextInt(100)+" ");
        }

    }
}