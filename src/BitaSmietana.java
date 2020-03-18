public class BitaSmietana extends SkladnikDekorator {
    Napoj napoj;
    BitaSmietana(Napoj napoj){
        this.napoj=napoj;
    }

    public String pobierzOpis(){
        return napoj.pobierzOpis()+", Bita smietana";
    }

    public double koszt(){
        return napoj.koszt()+0.75;
    }
}
