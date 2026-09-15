import java.util.Date;
public class Account{
    private int id =0;
    private double balance = 0;
    private double årligrente = 0;
    private Date datoopprettet = new Date();

    public Account (){
        this.datoopprettet =new Date();
    }
    public Account (int id, double balance){
        this.id =id;
        this.balance=balance;
        this.datoopprettet = new Date();
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;

    }
    public double getbalance(){
        return balance;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }

    public double getårligrente(){
        return årligrente;
    }
    public void setårligrente(double årligrente){
        this.årligrente=årligrente;
    }

    public Date getdatoopprettet(){
        return new Date(datoopprettet.getTime());
    }
    public double getmånedli(){
        return årligrente/12;
    }

    public double getmånedlirente(){
        return balance * (getmånedli()/100);
    }
    public void withdraw(double beløp){
        balance -= beløp;
    }

    public void deposit(double beløp){
        balance += beløp;
    }
}