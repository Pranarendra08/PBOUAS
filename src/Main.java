import java.util.Scanner;
// tinggal fitur batasan additional point
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        String namaChar1, namaChar2;
        int addHp1, addAtk1, addDef1, addHp2, addAtk2, addDef2, addEner1, addEner2, skill, adds = 10;

        //Mengambil input untuk membuat player 1
        System.out.print("Masukkan Nama Karakter Player1 : ");
        namaChar1 = scan.next();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk HP : ");
        addHp1 = scan.nextInt();
        adds -= addHp1;
        while (adds < 0) {
            addHp1 = 10;
            break;
        }

        System.out.println("Masukkan additional point untuk Attack : ");
        addAtk1 = scan.nextInt();
        adds -= addAtk1;
        while (adds < 0) {
            addAtk1 = 0;
            break;
        }

        System.out.println("Masukkan additional point untuk Defendse : ");
        addDef1 = scan.nextInt();
        adds -= addDef1;
        while (adds < 0) {
            addDef1 = 0;
            break;
        }

        System.out.println("Masukkan additional point untuk Energy : ");
        addEner1 = scan.nextInt();
        adds -= addEner1;
        while (adds < 0) {
            addEner1 = 0;
            break;
        }
        //bikin fungsi ngecek adds >10

        //membuat objek player 1
        Player1 P1 = new Player1(namaChar1,  addHp1, addAtk1, addDef1, addEner1);
        P1.display();
        System.out.println(" ");
        adds = 10;

        //Mengambil input untuk membuat player 2
        System.out.print("Masukkan Nama Karakter Player2 : ");
        namaChar2 = scan.next();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk HP : ");
        addHp2 = scan.nextInt();
        adds -= addHp2;
        while (adds < 0) {
            addHp2 = 10;
            break;
        }

        System.out.println("Masukkan additional point untuk Attack : ");
        addAtk2 = scan.nextInt();
        adds -= addAtk2;
        while (adds < 0) {
            addAtk2 = 0;
            break;
        }

        System.out.println("Masukkan additional point untuk Defendse : ");
        addDef2 = scan.nextInt();
        adds -= addDef2;
        while (adds < 0) {
            addDef2 = 0;
            break;
        }

        System.out.println("Masukkan additional point untuk Energy : ");
        addEner2 = scan.nextInt();
        adds -= addEner1;
        while (adds < 0) {
            addEner2 = 0;
            break;
        }
        //bikin fungsi ngecek adds >10

        //membuat objek player 2
        Player2 P2 = new Player2(namaChar2,  addHp2, addAtk2, addDef2, addEner2);
        P2.display();
        System.out.println(" ");

        //the games
        do {
            //giliran player 1
            if (P1.FinalHp > 0) {
                System.out.println(P1.getCharName() + " turn");
                System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + " Energy = " + P1.FinalEner);
                System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + " Energy = " + P2.FinalEner);
                System.out.println("1. Punch\n2. Kick\n3. Slash\n4. Sleep");
                System.out.println("Choose your skill");
                skill = scan.nextInt();
                switch (skill) {
                    case 1 -> {
                        P1.punch(P2);
                        System.out.println(P1.getCharName() + " Punch " + P2.getCharName() + " " + P1.FinalAtk);
                        System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + "\n");
                    }
                    case 2 -> {
                        P1.Kick(P2);
                        System.out.println(P1.getCharName() + " Kick " + P2.getCharName() + " " + P1.FinalHp);
                        System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + "\n");
                    }
                    case 3 -> {
                        P1.Slash(P2);
                        System.out.println(P1.getCharName() + " Slash " + P2.getCharName() + " " + P1.FinalAtk);
                        System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + "\n");
                    }
                    case 4 -> {
                        P1.Sleep();
                        System.out.println("Your energy increased by 7");
                        System.out.println("Energy = " + P1.FinalEner + "\n");
                    }
                    default -> {
                        P1.Sleep();
                        System.out.println("Your energy increased by 7");
                        System.out.println("Energy = " + P1.FinalEner + "\n");
                    }
                }
            } else {
                System.out.println(P2.getCharName() + " WIN!");
                break;
            }
            //giliran player 2
            if (P2.FinalHp > 0) {
                System.out.println(P2.getCharName() + " turn");
                System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + " Energy = " + P1.FinalEner);
                System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + " Energy = " + P2.FinalEner);
                System.out.println("1. Punch\n2. Kick\n3. Slash\n4. Sleep");
                System.out.println("Choose your skill");
                skill = scan.nextInt();
                switch (skill) {
                    case 1 -> {
                        P2.punch(P1);
                        System.out.println(P2.getCharName() + " Punch " + P1.getCharName() + " " + P2.FinalAtk);
                        System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + "\n");
                    }
                    case 2 -> {
                        P2.Kick(P1);
                        System.out.println(P2.getCharName() + " Kick " + P1.getCharName() + " " + P2.FinalAtk);
                        System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + "\n");
                    }
                    case 3 -> {
                        P2.Slash(P1);
                        System.out.println(P2.getCharName() + " Slash " + P1.getCharName() + " " + P2.FinalAtk);
                        System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + "\n");
                    }
                    case 4 -> {
                        P2.Sleep();
                        System.out.println("Your energy increased by 7");
                        System.out.println("Energy = " + P2.FinalEner + "\n");
                    }
                    default -> {
                        P2.Sleep();
                        System.out.println("Your energy increased by 7");
                        System.out.println("Energy = " + P2.FinalEner + "\n");
                    }
                }
            } else {
                System.out.println(P1.getCharName() + " WIN!");
                break;
            }
        }while (P1.FinalHp > 0 || P2.FinalHp > 0);
    }
}
