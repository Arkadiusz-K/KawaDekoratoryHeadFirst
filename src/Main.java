public class Main {
    public static void main(String[] args){
        Napoj napoj1 = new Lungo();
        System.out.println(napoj1.pobierzOpis()+", koszt: "+napoj1.koszt());

        Napoj napoj2 = new Espresso();
        napoj2 = new Czekolada(napoj2);
        napoj2 = new BitaSmietana(napoj2);
        System.out.println(napoj2.pobierzOpis()+", koszt: "+napoj2.koszt());
    }
}
