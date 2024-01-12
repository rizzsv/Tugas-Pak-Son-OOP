package tes2;

class drone2 {
    // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    // method
    void terbang(){
        energi--;
        if(energi > 10){
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("ketinggian " + ketinggian);
            System.out.println("energi " + energi);
            System.out.println("Dorne terbang...");
        } else {
            System.out.println("Energi lemah: Drone nggak bisa terbang");
            System.out.println("Drone jatuh.........");
             System.out.println("ketinggian " + ketinggian);
            System.out.println("energi " + energi);
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun(){
        // ketinggian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
         System.out.println("ketinggian " + ketinggian);
            System.out.println("energi " + energi);
    }

    void belok(){
        energi--;
        System.out.println("Drone belok");
       System.out.println("ketinggian " + ketinggian);
            System.out.println("energi " + energi);
        // belok ke mana? perlu dicek :)
    }

    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
         System.out.println("ketinggian " + ketinggian);
            System.out.println("energi " + energi);
            System.out.println("kecepattan " + kecepatan);
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("Drone mundur");
         System.out.println("ketinggian " + ketinggian);
            System.out.println("energi " + energi);
            System.out.println("kecepattan " + kecepatan);
        kecepatan++;
    }
}
