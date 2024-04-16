public class Luar {
    void cetakLuar(){
        System.out.println("Cetak Luar........");
        //CetakTengah();
    }
    class Tengah{
        void cetakTengah(){
            cetakLuar();
            System.out.println("Cetak Tengah........");
            // CetakDalam();
        }
        class Dalam{
            void CetakDalam(){
                cetakLuar();
                cetakTengah();
                System.out.println("Cetak dalam........");
            }
        }
    }
}
