package JAVA25.Level5;

 import java.util.Scanner;
 import java.util.Random;



 public class lecture4_2 {
     public static void main(String[] args) {
         // Стартовые очки здоровья
         int knightHp = 100;
         int dragonHp = 50;

         // Дракон загадывает скрытый максимум удара 2..20
         Random rand = new Random();
         int dragonMax = rand.nextInt(19) + 2;
         System.out.println(dragonMax);

         // Ввод силы удара рыцаря
         Scanner console = new Scanner(System.in);
         System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");
         int knightKick;
         // Основной боевой цикл
         while (true) {
             // Ход рыцаря: промах, если превышает скрытый максимум
             System.out.println("Ход рыцаря, введите число от 1 до 20 (сила удара)");
             knightKick = console.nextInt();
             if (knightKick > dragonMax) {
                 System.out.println("Вы промахнулись");
             } else {
                 System.out.println("Вы попали, урон составил " + knightKick);
                 dragonHp -= knightKick;
                 System.out.println("У дракона осталось " + dragonHp + " жизней");
             }
             // Проверяем смерть дракона
             if (dragonHp <= 0) {
                 System.out.println("Вы победили!!!");
                 break;
             }
             // Ход дракона: первая голова атакует

             int dragonKick1 = rand.nextInt(10) + 1;
             int dragonKick2 = rand.nextInt(10) + 1;
             System.out.println("Дракон атакует: первая голова наносит урон " + dragonKick1+ " вторая " + dragonKick2);
             knightHp = knightHp - (dragonKick1 + dragonKick2);
             System.out.println("У Вас осталось " + knightHp + " жизней");
             if (knightHp <= 0) {
                 System.out.println("Вы проиграли!!!");
                 break;
             }

         }

     }
}
