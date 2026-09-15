public class Stock{
    String symbol;
    String name;
    double pcp;
    double cp;

    public Stock(String newsymbol, String newname){
        symbol=newsymbol;
        name=newname;
    }
    public double getcp(){
        return (cp-pcp)/pcp*100;
    }
}
