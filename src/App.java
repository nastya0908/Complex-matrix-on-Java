import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер первой матрицы (два числа через пробел):");
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            ComplexMtr a = new ComplexMtr(n, m);

            System.out.println("Введите значения  (первое число - действительная часть числа, второе - мнимая)");
            a.fillMtr();
            System.out.println();
            System.out.println("Первая матрица:");
            a.printMtr();
            System.out.println();

            System.out.println("Введите размер второй матрицы(два числа через пробел):");
            n=scanner.nextInt();
            m=scanner.nextInt();
            ComplexMtr b = new ComplexMtr(n, m);

            System.out.println();
            System.out.println("Введите значения (первое число - действительная часть числа, второе - мнимая)");
            b.fillMtr();
            System.out.println();
            System.out.println("Вторая матрица:");
            b.printMtr();

            ComplexMtr c;

            System.out.println();
            System.out.println("Умножение");
            a.mul(b);

            System.out.println();
            System.out.println("Сложение");
            a.add(b);

            System.out.println();
            System.out.println("Вычитание");
            a.sub(b);

            System.out.println();
            System.out.println("Умножение на константу (первая матрица)");
            System.out.println("Введите константу");
            double k = scanner.nextDouble();
            c=a.mul(k);
            c.printMtr();

            System.out.println();
            System.out.println("Транспонирование первой матрицы");
            a.transp();

            System.out.println();
            System.out.println("Транспонирование второй матрицы");
            b.transp();
        }
    }
}
