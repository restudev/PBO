import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Determinan {
    int a, b, c;
	long D;
    double x1, x2;
    Scanner key = new Scanner(System.in);

    //public Determinan(int a, int b, int c) {
    //    this.a = a;
    //    this.b = b;
    //      this.c = c;
    //}

    void inputABC() {
        System.out.print("Masukkan nilai a : "); a = key.nextInt();
        System.out.print("Masukkan nilai b : "); b = key.nextInt();
        System.out.print("Masukkan nilai c : "); c = key.nextInt();
    }

    void hitungD() {
        D = (b * b)-(4 * a * c);
    }

    void hitungX1X2() {
        if (D > 0) {
            x1 = (-b + Math.sqrt(D) / (2 * a));
            x2 = (-b - Math.sqrt(D) / (2 * a));
            System.out.println("Akar-akar persamaan kuadrat adalah: \n x1 = " + x1 + "\n x2 = " + x2);
        } else if (D == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Akar-akar persamaan kuadrat adalah: x1 = x2" + x1);
        } else {
            x1 = -b / (2 * a) + Math.sqrt(-D) / (2 * a);
            x2 = -b / (2 * a) - Math.sqrt(-D) / (2 * a);
            System.out.println("Akar-akar imajiner persamaan kuadrat adalah:\nx1 = " + x1 + "i\nx2 = " + x2 + "i");
        }
    }

    void cetakdeterminan() {
        hitungD();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("D : " + D);
        hitungX1X2();

    }

}
