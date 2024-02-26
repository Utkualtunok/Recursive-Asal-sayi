import java.util.Scanner;
public class Main {
    static boolean isPrime(int num, int divisor) {
        //Sayı 2'den küçükse veya eşitse asal değildir.
        if (num <= 2) {
            return (num == 2);
        }
        //Eğer bölen, sayının kendisine kadar olan değere ulaşırsa sayı asaldır.
        if (divisor >= num) {
            return  true;
        }
        //Eğer sayı herhangi bir bölenle bölünüyorsa asal değildir
        if (num % divisor == 0) {
            return false;
        }
        //Sonraki böleni kontrol
        return isPrime(num , divisor + 1);
    }
    public static void main(String[] args) {
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num = inp.nextInt();
        //Gelen değeri if'e sokarak yazdırıyoruz.
        if (isPrime(num,2)) {
            System.out.println(num + "bir asal sayıdır.");
        } else System.out.println(num + "bir asal sayı değildir.");
    }
}