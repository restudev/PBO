public class KonversiSuhu {
    // float Celcius;

    // float Kelvin(float Celcius){
    //     return Celcius + 273.14f;
    // }
    // float Farhenheit(float Celcius){
    //     return Celcius * 1.8f + 23;
    // }
    // float Rankine(float Celcius){
    //     return Celcius * 1.8f + 491.67f;
    // }
    // float Delisle(float Celcius){
    //     return (100 - Celcius) * 1.5f;
    // }
    // float Newton(float Celcius){
    //     return Celcius * 33/100;
    // }
    // float Reaumur(float Celcius){
    //     return Celcius * 0.8f;
    // }
    // float Romer(float Celcius){
    //     return Celcius * 21/40 + 7.5f;
    // }

    float Celcius;
    float Kelvin;
    float Farhenheit;
    Float Rankine;
    float Dalisle;
    float Newton;
    Float Reaumur;
    float Romer;

    void hitungKelvin (float Celcius){
        Kelvin = Celcius + 273.14f;
        System.out.println("Konversi Celcius ke Kelvin : " + Kelvin);
    }
    void hitungFarhenheit (float Celcius){
        Farhenheit = Celcius * 1.8f + 23;
        System.out.println("Konversi Celcius ke Farhenheit : " + Farhenheit);
    }
    void hitungRankine (float Celcius){
        Rankine = Celcius * 1.8f + 491.67f;
        System.out.println("Konversi Celcius ke Rankine : " + Rankine);
    }
    void hitungDalisle (float Celcius){
        Dalisle = (100 - Celcius) * 1.5f;
        System.out.println("Konversi Celcius ke Dalisle : " + Dalisle);
    }
    void hitungNewton (float Celcius){
        Newton = Celcius * 33/100;
        System.out.println("Konversi Celcius ke Newton : " + Newton);
    }
    void hitungReaumur (float Celcius){
        Reaumur = Celcius * 0.8f;
        System.out.println("Konversi Celcius ke Reaumur : " + Reaumur);
    }
    void hitungRomer(float Celcius){
        Romer = Celcius * 21/40 + 7.5f;
        System.out.println("Konversi Celcius ke Romer : " + Romer);
    }
}
