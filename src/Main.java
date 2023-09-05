 public class Main {
     public static void main(String[] args) {
         System.out.println("Üç Basamaklı Amstrong Sayıları Bulma");

         int number,result, pow, basvalue, basnumber, temp;

         for (number = 99; number <= 999; number++) {
             temp = number;
             result = 0;
             while (temp != 0) {
                 basvalue = temp % 10;
                 pow = 1;
                 basnumber = 3;
                 for (int i = 1; i <= basnumber; i++) {
                     pow *= basvalue;
                 }
                 result += pow;
                 temp /= 10;
             }
             if (result == number) {
                 System.out.println(number + " sayısı bir Armstrong sayıdır.");
             }
         }
         System.out.println("Geri Kalan Üç Basamaklı Sayılar Amstrong Sayı Değildir. ");
     }
 }