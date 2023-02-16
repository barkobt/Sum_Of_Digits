import java.util.Scanner;

/*
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 */
public class Armstrong_Number {
    public static void main(String[] args) {
      /*  System.out.println("Bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int digit = 0;
        int result = 0;
        int tempNumber = number;

        int powNumber;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digit++;
        }
        //digit bizim basamak sayımız şimdi basamaklardaki sayıları bulmaya ihtiyacımız var.

        tempNumber = number;
        while (tempNumber != 0) {
            int digitNumber = tempNumber % 10;
            powNumber = 1;
            for (int i = 1; i <= digit; i++) {

                powNumber *= digitNumber;

            }

            result +=powNumber;
            tempNumber /= 10;

        }
        if (result == number) {
            System.out.println(number +" bir Armstrong sayıdır. ");

        } else {
            System.out.println(number + " bir Armstrong sayı değildir.");
        }
        Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int entry = input.nextInt();
        int result = 0;
        int digit = 0;
        int tempEntry = entry;
        while (tempEntry!=0) {
            tempEntry /= 10;
            digit++;

        }
        tempEntry = entry;
        while (tempEntry != 0) {
            int digitNumber = tempEntry % 10;
            result += digitNumber;
            tempEntry /= 10;

            }
        System.out.println(result);
        }



    }

