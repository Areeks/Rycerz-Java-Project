public class Rycerz {
    private String Nazwa;
    private int Atak;
    private int Obrona;
    private int HP;
    private Ekwipunek eq;

    public Rycerz(String Nazwa, int Atak, int Obrona, int HP, int eqAtak, int eqObrona, int eqHP) {
        this.Nazwa = Nazwa;
        this.Atak = Atak;
        this.Obrona = Obrona;
        this.HP = HP;
        this.eq = new Ekwipunek(eqAtak, eqObrona, eqHP);
    }

    public Rycerz() {
        Nazwa = "NewKnight";
        Atak = 0;
        Obrona = 0;
        HP = 0;
        this.eq = new Ekwipunek();
    }

    public void setImie(String name)
    {
        Nazwa = name;
    }

    public void setAtak(int Atak)
    {
        this.Atak = Atak;
    }

    public void setObrona(int Obrona)
    {
        this.Obrona = Obrona;
    }

    public void setHP(int HP)
    {
        this.HP = HP;
    }

    public String getImie()
    {
        return Nazwa;
    }

    public int getHP()
    {
        return HP;
    }

    public int getAtak()
    {
        return Atak;
    }

    public int getObrona()
    {
        return Obrona;
    }

    public void Walka(Rycerz r)
    {
        int round = 1;
        int hp_one = HP+eq.getHP();
        int hp_two = r.getHP()+r.eq.getHP();

        while(hp_one > 0 && hp_two > 0 && round < 100)
        {
            int attack_point = 0;
            System.out.println("Runda " + (round));
            if(round%2!=0) attack_point = (Atak+eq.getAtak()) - (r.getObrona()+r.eq.getObrona());
            else attack_point = (r.getAtak()+r.eq.getAtak()) - (Obrona+eq.getObrona());
            if(attack_point>0)
            {
                if(round%2!=0)
                {
                    System.out.println(Nazwa+" uderza " + r.getImie() + " i zabiera mu " + attack_point + " punktow zycia");
                    hp_two-=attack_point;
                }
                else
                {
                    System.out.println(r.getImie()+" uderza " + Nazwa + " i zabiera mu " + attack_point + " punktow zycia");
                    hp_one-=attack_point;
                }
            }
            else
            {
                if(round%2!=0) System.out.println(Nazwa+" uderza " + r.getImie() + " i zabiera mu " + 0 + " punktow zycia");
                else System.out.println(r.getImie()+ " uderza " + Nazwa + " i zabiera mu " + 0 + " punktow zycia");
            }
            round++;
        }

        if(hp_one<=0) System.out.println(r.getImie() + " wygrywa walke!");
        else if(hp_two<=0) System.out.println(Nazwa + " wygrywa walke!");
        else System.out.println("Zaden z rycerzy nie byl w stanie pokonac drugiego");
    }

    public void Wyswietl() {

        System.out.println(Nazwa);
        System.out.println("Atak: " + Atak);
        System.out.println("Obrona: " + Obrona);
        System.out.println("HP: " + HP);
        System.out.println("Rycerz z Ekwipunkiem ");
        System.out.println("Atak: " + (Atak + eq.getAtak()));
        System.out.println("Obrona: " + (Obrona + eq.getObrona()));
        System.out.println("HP: " + (HP + eq.getHP()));
    }
}