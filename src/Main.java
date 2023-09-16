/*
Задача 13
Из ведра объемом 30 литров нужно перелить воду в пустое ведро.
Каждый десятый литр проливается мимо. Вывести процесс перелива в консоль — в первом
ведре количество уменьшается, во втором увеличивается. Пример:
 */

public class Main {
    public static void main(String[] args) {
        int vedro1 = 30;
        int vedro2 = 0;
        int i = 1;
        while (vedro1 > 0) {
            if (i == 10){
                i = 1;
                vedro1--;
                continue;
            } else {
                vedro1--;
                vedro2++;
                System.out.println("Erste Eimer " + vedro1);
                System.out.println("Zweite Eimer " + vedro2);
            }
            i++;
        }
    }
}