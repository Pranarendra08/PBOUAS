public class Player2 extends Player{
    public Player2(String charName, int addHp, int addAtk, int addDef) {
        super(charName, addHp, addAtk, addDef);
    }
    int FinalHp = Hp + (this.addHp * 100);
    int FinalAtk = Atk + (this.addAtk * 10);
    int FinalDef = Def + (this.addDef * 5);

    public void display() {
        System.out.println("HP  : " + FinalHp);
        System.out.println("ATK : " + FinalAtk);
        System.out.println("DEF : " + FinalDef);
    }

    public void punch(Player1 KarB) {
        KarB.FinalHp -= FinalAtk;
    }

    public void Kick(Player1 KarB) {
        KarB.FinalHp -= FinalAtk;
    }

    public void Slash(Player1 KarB) {
        KarB.FinalHp -= FinalAtk;
    }
}
