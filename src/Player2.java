public class Player2 extends Player{
    public Player2(String charName, int addHp, int addAtk, int addDef) {
        super(charName, addHp, addAtk, addDef);
    }
    public int Hp = 1000 + (this.addHp * 200);
    final int Atk = 100 + (this.addAtk * 10);
    private final int Def = 100 + (this.addDef * 10);

    public void display() {
        System.out.println("HP  : " + Hp);
        System.out.println("ATK : " + Atk);
        System.out.println("DEF : " + Def);
    }

    public void punch(Player1 KarB) {
        KarB.Hp -= Atk;
    }

    public void Kick(Player1 KarB) {
        KarB.Hp -= Atk;
    }

    public void Slash(Player1 KarB) {
        KarB.Hp -= Atk;
    }
}
