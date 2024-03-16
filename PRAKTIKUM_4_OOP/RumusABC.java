import static java.lang.Math.sqrt;

public class RumusABC {
    float a, b, c, D, x1, x2;

    void Determinan(float a, float b, float c) {
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + (float) sqrt(D) / (2 * a));
            x2 = (-b - (float) sqrt(D) / (2 * a));
            System.out.println("Akar-akar persamaan kuadrat adalah: \n x1 = " + x1 + "\n x2 = " + x2);
        } else if (D == 0) {
            x1 = x2 = -b / 2 * a;
            System.out.println("Akar-akar persamaan kuadrat adalah: x1 = x2" + x1);
        } else if (D < 0) {
            x1 = ((-b / 2 * a) + (float) sqrt(-D) / 2 * a);
            x2 = ((-b / 2 * a) - (float) sqrt(-D) / 2 * a);
            System.out.println("Akar-akar imajiner persamaan kuadrat adalah:\nx1 = " + x1 + "i\nx2 = " + x2 + "i");
        }

    }

}
