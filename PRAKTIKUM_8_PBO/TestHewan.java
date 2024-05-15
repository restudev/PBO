import java.util.Scanner;

class TestHewan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hewan singa = new Singa("Mamalia", "Berkulit Cokelat");
        Hewan elang = new Elang("Burung", "Memiliki sayap lebar");
        Hewan lebah = new Lebah("Serangga", "Memiliki sengat");
        Hewan paus = new Paus("Mamalia", "Hidup di dalam air");

        while(true){
            System.out.println("Hewan : ");
            System.out.println("1. Singa");
            System.out.println("2. Elang");
            System.out.println("3. Lebah");
            System.out.println("4. Paus");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda [1-5]: ");
            int choose = input.nextInt();
            switch(choose) {
                case 1:
                    singa.suara(); 
                    singa.berjalan();
                    singa.bernafas();
                    break;
                case 2:
                    elang.suara();
                    elang.berjalan();
                    elang.bernafas();
                    break;
                case 3:
                    lebah.suara();
                    lebah.berjalan();
                    lebah.bernafas();
                    break;
                case 4:
                    paus.suara();
                    paus.berjalan();
                    paus.bernafas();
                    break;
                case 5:
                    System.exit(choose);
            }
        }
    }
}
