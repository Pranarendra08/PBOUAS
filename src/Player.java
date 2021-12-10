public class Player {
    public String charName;
    public int addHp;
    public int addAtk;
    public int addDef;
    public int addEner;
    protected int Hp = 500; //add 100
    protected int Atk = 100; //add 10
    protected int Def = 50; //add 5
    protected int Ener = 25; //add 2

    public Player(String charName, int addHp, int addAtk, int addDef, int addEner) {
        this.charName = charName;
        this.addHp = addHp;
        this.addAtk = addAtk;
        this.addDef = addDef;
        this.addEner = addEner;
    }

    public String getCharName(){
        return charName;
    }
}
