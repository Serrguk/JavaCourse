
public class Loader
{
    public static void main(String[] args)
    {
        //Думаю, пяти кошек будет достаточно

        Cat murka = new Cat("Мурка");
        Cat vasya = new Cat("Васька");
        Cat pushok  = new Cat("Пушок");
        Cat chui = new Cat("Чуи");
        Cat man = new Cat("Мэн");

        //Проверяем вывод параметров трёх из них
        System.out.println(murka.getName() + ": " + murka.getWeight() + "гр, " + murka.getStatus() + "; ");
        System.out.println(vasya.getName() + ": " + vasya.getWeight() + "гр, " + vasya.getStatus() + "; ");
        System.out.println(pushok.getName() + ": " + pushok.getWeight() + "гр, " + pushok.getStatus() + "; ");
        System.out.println();//Отбивка пустой строкой для красоты

        murka.setWeight(1005.0);//Зададим вес Мурки ближе к минимуму, чтобы она не мяукала слишком долго перед смертью
        while (murka.getWeight() >= murka.getMinWeight()) {
            murka.meow();
        }
        System.out.println(murka.getName() + " " + murka.getStatus() + "\n");//Проверяем, что с ней

        vasya.setWeight(8000.0);//Зададим вес Васьки ближе к максимуму, чтобы он не жрал слишком долго перед взрывом
        while (vasya.getWeight() <=vasya.getMaxWeight()) {
            vasya.feed(vasya.getWeight() / 50);//Чем Васька толще, тем больше он жрёт
            System.out.println("Вес Васьки: " + vasya.getWeight());//Напишем вывод в цикле, чтобы вес печатался каждый раз после кормления
        }
        System.out.println(vasya.getName() + " " + vasya.getStatus());//Проверяем статус Василия
        System.out.println();


        System.out.println(pushok.getName() + " " + pushok.getStatus());
        System.out.println(chui.getName() + " " + chui.getStatus());
        System.out.println(man.getName() + ", " + man.getWeight() + " " + man.getStatus());

        man.feed(50.0);//Покормим Мэна
        man.drink(25.0);//и напоим

        System.out.println(man.getName() + ", " + man.getWeight() + " " + man.getStatus());//И посмотрим, изменился ли вес

        System.out.println("Количество кошек: " + Cat.getCatCount());//Проверяем, как работает подсчёт количества живых кошек
        System.out.println();

        System.out.println(pushok.getName() + " " + pushok.getWeight());
        pushok.goToilet();//Проверяем поход в туалет

        System.out.println();
        System.out.println("Глаз у кошки всегда " + Cat.EYES_COUNT + " (это константа!).");//Констатируем количество глаз

        chui.setColor(ColorOfCats.BLACK);//Проверяем работает ли выбор цвета с помощью класса Enum
        System.out.println("Цвет кота " + chui.getName() + ": " + chui.getColor());
        System.out.println();

        /** Ниже сделаем
         * копию одной из
         * живых кошек.
         * Например, Пушка.
         */

        System.out.println("Имя: " + pushok.getName() + ", " + "вес: " + pushok.getWeight());
        Cat rufus = pushok.copy();//Метод копирования, который в классе Сat выделен зелёными комментами
        System.out.println("Имя Руфуса: " + rufus.getName() + ", и его вес: " + rufus.getWeight());//Проверяем имя и вес Руфуса
        System.out.println();

        /** Поскольку мы копированием создали
         * новую кошку, проверим теперь их общее количество
         */
        System.out.println("Количество кошек: " + Cat.getCatCount());



    }
}