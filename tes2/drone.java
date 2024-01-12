package tes2;

class drone{
    //atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    //method/fungsi
    void terbang(){
        energi--;
        if(energi > 10){
        //terbang berarti nilai ketinggian bertambah
        ketinggian++;
        System.out.println("Drone terbang...");
    }else {
        System.out.println("Energi lemah: Drone ga bisa terbang");
    }
 }
 void MatikanMesin(){
    if(ketinggian > 0){
        System.out.println("Mesin Tidak bisa dimatikan karena sedang terbang");
    }else {
        System.out.println("Mesin dimatikan...");
    }
 }
 void turun(){
    //ketinggian berkurang, karena turun
    ketinggian--;
    energi--;
    System.out.println("drone turun");
 }

}