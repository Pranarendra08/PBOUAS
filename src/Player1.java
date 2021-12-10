public class Player1 extends Player{
    public Player1(String charName, int addHp, int addAtk, int addDef, int addEner) {
        super(charName, addHp, addAtk, addDef, addEner);
    }
    int FinalHp = Hp + (this.addHp * 100);
    int FinalAtk = Atk + (this.addAtk * 10);
    int FinalDef = Def + (this.addDef * 5);
    int FinalEner = Ener + (this.addEner * 2);

    public void display() {
        System.out.println("HP      : " + FinalHp);
        System.out.println("ATK     : " + FinalAtk);
        System.out.println("DEF     : " + FinalDef);
        System.out.println("Energy  : " + FinalEner);
    }

    public void punch(Player2 KarB) {
        KarB.FinalHp = FinalAtk - (KarB.FinalDef * (50 / 100));
        FinalEner -= 2;
    }

    public void Kick(Player2 KarB) {
        KarB.FinalHp -= FinalAtk - (KarB.FinalDef * (25 / 100));
        FinalEner -= 4;
    }

    public void Slash(Player2 KarB) {
        KarB.FinalHp -= FinalAtk - (KarB.FinalDef * (10 / 100));
        FinalEner -= 7;
    }

    public void Sleep() {
        FinalEner += 10;
    }
}
