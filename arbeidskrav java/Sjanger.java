public class Sjanger {
    private String navn;
    private String beskrivelse;


    public Sjanger (String navn, String beskrivelse){
        this.navn=navn;
        this.beskrivelse=beskrivelse;
    }

    public String getnavn(){
        return navn;
    }

    public String getbesk(){
        return beskrivelse;
    }

    public void setnavn(String navn){
        this.navn = navn;
    }

    public void setbesk(String beskrivelse){
        this.beskrivelse = beskrivelse;
    }

} 