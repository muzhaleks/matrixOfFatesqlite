package utils;




/**
 * Created by Lelouch on 04.11.2016.
 */

public class MatrixCount {


    public int counter(int a) {

        int b = 0;
        int res = 0;

        if (a <= 22) {
            res = a;
        }
        if (a > 22) {
            res = b;
            while (a != 0) {
                b = b + (a % 10);
                a /= 10;
            }
            if (b <= 22) {
                res = b;
            }
            if (b > 22) {

                while (b != 0) {
                    res = res + (b % 10);
                    b /= 10;
                }
            }
        }
        return res;
    }
}


