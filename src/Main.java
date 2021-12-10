import java.util.Scanner;
// tinggal fitur defends energy dan sleep
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namaChar1, namaChar2;
        int addHp1, addAtk1, addDef1, addHp2, addAtk2, addDef2, skill;

        //Mengambil input untuk membuat player 1
        System.out.print("Masukkan Nama Karakter Player1 : ");
        namaChar1 = scan.next();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk Hp : ");
        addHp1 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Atk : ");
        addAtk1 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Def : ");
        addDef1 = scan.nextInt();

        Player1 P1 = new Player1(namaChar1,  addHp1, addAtk1, addDef1);
        P1.display();

        //Mengambil input untuk membuat player 2
        System.out.print("Masukkan Nama Karakter Player2 : ");
        namaChar2 = scan.next();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk Hp : ");
        addHp2 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Atk : ");
        addAtk2 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Def : ");
        addDef2 = scan.nextInt();

        Player2 P2 = new Player2(namaChar2,  addHp2, addAtk2, addDef2);
        P2.display();

        do {
            if (P1.FinalHp > 0) {
                System.out.println("Player 1 turn");
                System.out.println("1. Punch\n2. Kick\n3. Slash\n4. Sleep");
                System.out.println(P1.getCharName() + " HP = " + P1.FinalHp);
                System.out.println(P2.getCharName() + " HP = " + P2.FinalHp);

                skill = scan.nextInt();
                switch (skill) {
                    case 1:
                        P1.punch(P2);
                        System.out.println(P1.getCharName() + " Punch " + P2.getCharName() + " " + P1.FinalAtk);
                        System.out.println(P2.getCharName() + " HP = " + P2.FinalHp);
                        break;
                    case 2:
                        P1.Kick(P2);
                        System.out.println(P1.getCharName() + " Kick " + P2.getCharName() + " " + P1.FinalHp);
                        System.out.println(P2.getCharName() + " HP = " + P2.FinalHp);
                        break;
                    case 3:
                        P1.Slash(P2);
                        System.out.println(P1.getCharName() + " Slash " + P2.getCharName() + " " + P1.FinalAtk);
                        System.out.println(P2.getCharName() + " HP = " + P2.FinalHp);
                        break;
                }
            } else {
                System.out.println(P2.getCharName() + " WIN!");
                break;
            }

            if (P2.FinalHp > 0) {
                System.out.println("Player 2 turn");
                System.out.println("1. Punch\n2. Kick\n3. Slash\n4. Sleep");
                System.out.println(P1.getCharName() + " HP = " + P1.FinalHp);
                System.out.println(P2.getCharName() + " HP = " + P2.FinalHp);

                skill = scan.nextInt();
                switch (skill) {
                    case 1:
                        P2.punch(P1);
                        System.out.println(P2.getCharName() + " Punch " + P1.getCharName() + " " + P2.FinalAtk);
                        System.out.println(P1.getCharName() + " HP = " + P1.FinalHp);
                        break;
                    case 2:
                        P2.Kick(P1);
                        System.out.println(P2.getCharName() + " Kick " + P1.getCharName() + " " + P2.FinalAtk);
                        System.out.println(P1.getCharName() + " HP = " + P1.FinalHp);
                        break;
                    case 3:
                        P2.Slash(P1);
                        System.out.println(P2.getCharName() + " Slash " + P1.getCharName() + " " + P2.FinalAtk);
                        System.out.println(P1.getCharName() + " HP = " + P1.FinalHp);
                        break;
                }
            } else {
                System.out.println(P1.getCharName() + " WIN!");
                break;
            }
        }while (P1.FinalHp > 0 || P2.FinalHp > 0);
    }
}
