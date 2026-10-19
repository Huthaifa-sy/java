public class Film{
    private String title;
    private int spiletid;
    private Sjanger Sjanger;


    public Film(String title, int spiletid, Sjanger Sjanger){
        this.title=title;
        this.spiletid=spiletid;
        this.Sjanger=Sjanger;
    }

    public String gettitle(){
        return title;
    }

    public int getspiletid(){
        return spiletid;
    }

    public Sjanger getSjanger(){
        return Sjanger;
    }

    public void utskrift(){
        
    }

}