public class Task1 {
    public static void main(String[] args) {
        System.out.println(ternaryEvaluation(5,7));
    }
    // таск 1
    public static double convert(int gall) {
        return gall * 3.785;
    }
    // таск 2
    public static int fitCalc(int time, int intens) {
        return time * intens;
    }
    // таск 3
    public static int containers(int box, int mes, int bar) {
        return box * 20 + mes * 50 + bar * 100;
    }
    // таск 4
    public static String triangleType(int a, int b, int c) {
        if (a == b && a == c) {
            return "Треугольник равносторонний";
        }
        else if (a == b || a == c || b == c) {
            return "Треугольник равнобедренный";
        }
        else if (a + b < c || a + c < b || b + c < a) {
            return "Не является треугольником";
        }
        return  "Треугольник разносторонний";
    }
    // таск 5
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }
    // таск 6
    public static int howManyItems(int n, double w, double h) {
        return (int) ((n/2) / (w*h));
    }
    // таск 7
    public static  int factorial(int f) {
        if (f <= 1) {
            return 1;
        }
        return f * factorial(f-1);
    }
    // таск 8
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    // таск 9
    public static double ticketSaler(int ticket, int cost) {
        double nalog = 0.72;
        return Math.round(nalog * ticket * cost);
    }
    // таск 10
    public static int tables(int stud, int part) {
        stud = stud - (part * 2);
        if (stud <= 0) {
            return 0;
        }
        return (int) Math.ceil((double)stud/2);
    }
}
