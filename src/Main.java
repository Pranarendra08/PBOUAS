import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat datang digame Duel Fighter");
        System.out.println("Buatlah karaktermu");
        Scanner scan = new Scanner(System.in);
        String namaChar1, namaChar2;
        int addHp1, addAtk1, addDef1, addHp2, addAtk2, addDef2, addEner1, addEner2, skill, TotalAdds = 10, adds = 0;

        //Mengambil input untuk membuat player 1
        System.out.print("Masukkan Nama Karakter Player1 : ");
        namaChar1 = scan.next();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk HP : ");
        addHp1 = scan.nextInt();
        if (adds + addHp1 > TotalAdds) {
            addHp1 = TotalAdds - adds;
            adds += addHp1;
        } else {
            addHp1 = addHp1;
            adds += addHp1;
        }

        System.out.println("Masukkan additional point untuk Attack : ");
        addAtk1 = scan.nextInt();
        if (adds + addAtk1> TotalAdds) {
            addAtk1 = TotalAdds - adds;
            adds += addAtk1;
        } else {
            addAtk1 = addAtk1;
            adds += addAtk1;
        }

        System.out.println("Masukkan additional point untuk Defense : ");
        addDef1 = scan.nextInt();
        if (adds + addDef1> TotalAdds) {
            addDef1 = TotalAdds - adds;
            adds += addDef1;
        } else {
            addDef1 = addDef1;
            adds += addDef1;
        }

        System.out.println("Masukkan additional point untuk Energy : ");
        addEner1 = scan.nextInt();
        if (adds + addEner1> TotalAdds) {
            addEner1 = TotalAdds - adds;
            adds += addEner1;
        } else {
            addEner1 = addEner1;
            adds += addEner1;
        }

        //membuat objek player 1
        Player1 P1 = new Player1(namaChar1,  addHp1, addAtk1, addDef1, addEner1);
        P1.display();
        System.out.println(" ");
        adds = 0;

        //Mengambil input untuk membuat player 2
        System.out.print("Masukkan Nama Karakter Player2 : ");
        namaChar2 = scan.next();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk HP : ");
        addHp2 = scan.nextInt();
        if (adds + addHp2 > TotalAdds) {
            addHp2 = TotalAdds - adds;
            adds += addHp2;
        } else {
            addHp2 = addHp2;
            adds += addHp2;
        }

        System.out.println("Masukkan additional point untuk Attack : ");
        addAtk2 = scan.nextInt();
        if (adds + addAtk2> TotalAdds) {
            addAtk2 = TotalAdds - adds;
            adds += addAtk2;
        } else {
            addAtk2 = addAtk2;
            adds += addAtk2;
        }

        System.out.println("Masukkan additional point untuk Defense : ");
        addDef2 = scan.nextInt();
        if (adds + addDef2> TotalAdds) {
            addDef2 = TotalAdds - adds;
            adds += addDef2;
        } else {
            addDef2 = addDef2;
            adds += addDef2;
        }

        System.out.println("Masukkan additional point untuk Energy : ");
        addEner2 = scan.nextInt();
        if (adds + addEner2> TotalAdds) {
            addEner2 = TotalAdds - adds;
            adds += addEner2;
        } else {
            addEner2 = addEner2;
            adds += addEner2;
        }

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

                System.out.println("\n1. Punch cost 2 energy\n2. Kick cost 4 energy\n3. Slash cost 7 energy\n4. Sleep restore 10 energy");
                System.out.println("Choose your skill");
                skill = scan.nextInt();
                switch (skill) {
                    case 1 -> {
                        if (P1.FinalEner < 2) {
                            System.out.println("Your energy is bellow 2, you gonna sleep");
                            P1.Sleep();
                            System.out.println("You're sleep and your energy increased by 10");
                            System.out.println("Energy = " + P1.FinalEner + "\n");
                        } else {
                            P1.punch(P2);
                            System.out.println(P1.getCharName() + " Punch " + P2.getCharName() + " " + P1.Damage);
                            System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + "\n");
                        }
                    }
                    case 2 -> {
                        if (P1.FinalEner < 4) {
                            System.out.println("Your energy is bellow 4, you gonna sleep");
                            P1.Sleep();
                            System.out.println("You're sleep and your energy increased by 10");
                            System.out.println("Energy = " + P1.FinalEner + "\n");
                        } else {
                            P1.Kick(P2);
                            System.out.println(P1.getCharName() + " Kick " + P2.getCharName() + " " + P1.Damage);
                            System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + "\n");
                        }
                    }
                    case 3 -> {
                        if (P1.FinalEner < 7) {
                            System.out.println("Your energy is bellow 7, you gonna sleep");
                            P1.Sleep();
                            System.out.println("You're sleep and your energy increased by 10");
                            System.out.println("Energy = " + P1.FinalEner + "\n");
                        } else {
                            P1.Slash(P2);
                            System.out.println(P1.getCharName() + " Slash " + P2.getCharName() + " " + P1.Damage);
                            System.out.println(P2.getCharName() + " HP = " + P2.FinalHp + "\n");
                        }
                    }
                    case 4 -> {
                        P1.Sleep();
                        System.out.println("Your energy increased by 10");
                        System.out.println("Energy = " + P1.FinalEner + "\n");
                    }
                    default -> {
                        P1.Sleep();
                        System.out.println("Your energy increased by 10");
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

                System.out.println("\n1. Punch cost 2 energy\n2. Kick cost 4 energy\n3. Slash cost 7 energy\n4. Sleep restore 10 energy");
                System.out.println("Choose your skill");
                skill = scan.nextInt();
                switch (skill) {
                    case 1 -> {
                        if (P2.FinalEner < 2) {
                            System.out.println("Your energy is bellow 2, you gonna sleep");
                            P2.Sleep();
                            System.out.println("You're sleep and your energy increased by 10");
                            System.out.println("Energy = " + P2.FinalEner + "\n");
                        } else {
                            P2.punch(P1);
                            System.out.println(P2.getCharName() + " Punch " + P1.getCharName() + " " + P2.Damage);
                            System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + "\n");
                        }
                    }
                    case 2 -> {
                        if (P2.FinalEner < 4) {
                            System.out.println("Your energy is bellow 4, you gonna sleep");
                            P2.Sleep();
                            System.out.println("You're sleep and your energy increased by 10");
                            System.out.println("Energy = " + P2.FinalEner + "\n");
                        } else {
                            P2.Kick(P1);
                            System.out.println(P2.getCharName() + " Kick " + P1.getCharName() + " " + P2.Damage);
                            System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + "\n");
                        }
                    }
                    case 3 -> {
                        if (P2.FinalEner < 7) {
                            System.out.println("Your energy is bellow 7, you gonna sleep");
                            P2.Sleep();
                            System.out.println("You're sleep and your energy increased by 10");
                            System.out.println("Energy = " + P2.FinalEner + "\n");
                        } else {
                            P2.Slash(P1);
                            System.out.println(P2.getCharName() + " Slash " + P1.getCharName() + " " + P2.Damage);
                            System.out.println(P1.getCharName() + " HP = " + P1.FinalHp + "\n");
                        }
                    }
                    case 4 -> {
                        P2.Sleep();
                        System.out.println("Your energy increased by 10");
                        System.out.println("Energy = " + P2.FinalEner + "\n");
                    }
                    default -> {
                        P2.Sleep();
                        System.out.println("Your energy increased by 10");
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
