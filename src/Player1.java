public class Player1 extends Player{
    public Player1(String charName, int addHp, int addAtk, int addDef) {
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

    public void punch(Player2 KarB) {
        KarB.FinalHp -= FinalAtk;
    }

    public void Kick(Player2 KarB) {
        KarB.FinalHp -= FinalAtk;
    }

    public void Slash(Player2 KarB) {
        KarB.FinalHp -= FinalAtk;
    }
}
