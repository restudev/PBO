public class KonversiSuhu {
    float Celcius;

    float Kelvin(float Celcius){
        return Celcius + 273.14f;
    }
    float Farhenheit(float Celcius){
        return Celcius * 1.8f + 23;
    }
    float Rankine(float Celcius){
        return Celcius * 1.8f + 491.67f;
    }
    float Delisle(float Celcius){
        return (100 - Celcius) * 1.5f;
    }
    float Newton(float Celcius){
        return Celcius * 33/100;
    }
    float Reaumur(float Celcius){
        return Celcius * 0.8f;
    }
    float Romer(float Celcius){
        return Celcius * 21/40 + 7.5f;
    }
}
