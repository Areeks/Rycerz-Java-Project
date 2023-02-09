public class Ekwipunek {
    private int Atak;
    private int Obrona;
    private int HP;

    public Ekwipunek(int Atak, int Obrona, int HP) {
        this.Atak = Atak;
        this.Obrona = Obrona;
        this.HP = HP;
    }

    public Ekwipunek(){
        Atak = 100;
        Obrona = 100;
        HP = 100;
    }

    public int getAtak()
    {
        return Atak;
    }

    public int getObrona()
    {
        return Obrona;
    }

    public int getHP()
    {
        return HP;
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
}