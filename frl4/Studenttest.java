public class studenttest {
    private String name;
    private double score;
    private static int antall=0;

    public studenttest(String name,double score){
        this.name=name;
        this.score=score;
        antall++;
    }

    public String getname(){
        return name;
    }

    public double getscore(){
        return score;

    }

    public void setscore(double score){
        if(score>=0 && score<=100){
            this.score=score;
        }

    } 

    public static int getantall(){
        return antall;
    }
}


 // for testing the code 
 public class Main{
    public static void main(String[] args){
        Studenttest s1=new Studenttest("ali",150);
        System.out.println("name: "+s1.getname()+" score: "+s1.getscore()+" antall: "+Studenttest.getantall());
    }
 }