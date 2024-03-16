import java.util.Scanner;

public class KonversiDetik {
    int detik;

    Scanner key = new Scanner(System.in);

    int hari(int detik){
        return detik/86400;
    }
    int jam(int detik){
        return (detik%86400)/3600;
    }
    int menit(int detik){
        return ((detik%86400)%3600)/60;
    }
    int detik(int detik){
        return ((detik%86400)%3600)%60;
    }
}
