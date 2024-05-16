public class TestEksekutifManajer {
    public static void main(String[] args) {
        Sekretaris sekr = new Sekretaris("Restu", 8000000, 2500000);
        EksekutifManajer em = new EksekutifManajer("Restu Lestari", 15000000, 5000000);
        em.setSekretaris(sekr);
        em.info();
    }
}
