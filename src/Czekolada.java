public class Czekolada extends SkladnikDekorator {
    Napoj napoj; // tu bedzie przechowywac dekorowany obiekt
    public Czekolada(Napoj napoj){
        this.napoj = napoj;
    }

    public String pobierzOpis(){
        return napoj.pobierzOpis()+", Czekolada";
    }

    public double koszt(){
        return napoj.koszt()+0.5;
    }
}
