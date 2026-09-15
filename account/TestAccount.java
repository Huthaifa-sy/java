public class TestAccount {
    public static void main(String[] args) {

        Account acc = new Account(1122, 20000.0);
        acc.setårligrente(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.println("Saldo: " + acc.getbalance());
        System.out.println("Månedlig rente: " + acc.getmånedlirente());
        System.out.println("opprettet dato er: "+ acc.getdatoopprettet());
        System.out.println(acc.getmånedli());




       Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Fan 2 – medium hastighet, radius 5, blå, av
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());




        Student ola = new Student("Ola", 85);
        Student kari = new Student("Kari", 60);
        Student ali = new Student("Ali", 92);

        System.out.println("Ola har høyere score enn Kari: " + ola.hasHigherScoreThan(kari));
        System.out.println("Kari har høyere score enn Ola: " + kari.hasHigherScoreThan(ola));
        System.out.println("Ali har høyere score enn Ola: " + ali.hasHigherScoreThan(ola));
        System.out.println("Kari har høyere score enn Ali: " + kari.hasHigherScoreThan(ali));
        
        

        RegularPolygon p1 = new RegularPolygon();

        // 2: n=6, side=4
        RegularPolygon p2 = new RegularPolygon(6, 4);

        // 3: n=10, side=4, x=5.6, y=7.8
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1: omkrets = " + p1.getPerimeter() +
                           ", areal = " + p1.getArea());

        System.out.println("Polygon 2: omkrets = " + p2.getPerimeter() +
                           ", areal = " + p2.getArea());

        System.out.println("Polygon 3: omkrets = " + p3.getPerimeter() +
                           ", areal = " + p3.getArea());



        




        StopWatch sw = new StopWatch();  // starter automatisk

        sw.start();  // nullstill starttid

        long sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }

        sw.stop();  // stopp tiden

        System.out.println("Tid brukt: " + sw.getElapsedTime() + " ms");






        
    }
}
