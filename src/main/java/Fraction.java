import java.util.Scanner;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fraction other)) {
            return false;
        }
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Перший дріб (чисельник/знаменник):");
        String input1 = scanner.next();
        String[] parts1 = input1.split("/");
        int numerator1 = Integer.parseInt(parts1[0]);
        int denominator1 = Integer.parseInt(parts1[1]);
        Fraction fraction1 = new Fraction(numerator1, denominator1);

        System.out.println("Другий дріб (чисельник/знаменник):");
        String input2 = scanner.next();
        String[] parts2 = input2.split("/");
        int numerator2 = Integer.parseInt(parts2[0]);
        int denominator2 = Integer.parseInt(parts2[1]);
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        System.out.println("Результат:");
        System.out.println(fraction1.equals(fraction2));
    }
}