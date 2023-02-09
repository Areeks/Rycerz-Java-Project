public class Main {
    public static void main(String[] args) {

        System.out.println("Rycerz pierwszy: ");
        Rycerz r1 = new Rycerz("Trolek",25,20,100,5,20,100);
        r1.Wyswietl();
        System.out.println();
        System.out.println("Rycerz drugi:");
        Rycerz r2 = new Rycerz("Areeks",25,20,100,26,0,100);
        r2.Wyswietl();

        r1.Walka(r2);
    }
}