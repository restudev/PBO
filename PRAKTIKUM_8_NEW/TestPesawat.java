public class TestPesawat {
    public static void main(String[] args) {
        Pesawat airbus = new Pesawat();
        PesawatTempur f16 = new PesawatTempur();

        System.out.println("...airbus...");
        airbus.terbang();
        airbus.mendarat();

        System.out.println("...f16...");
        f16.terbang();
        f16.mendarat();
        f16.manuver();
    }
}
