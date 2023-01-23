public class Main {
    public static void main(String[] args) {
        task1();
        task4();
        task5();
        task6();
        task8();
    }
    public static void task1() {
        System.out.println("Задача №1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача №6-7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов: " + totalWeight + " кг.");
        var differenceWeight1 = Math.abs(firstBoxer - secondBoxer);
        System.out.println("Разница в весе бойцов рассчитанная вычитанием: " + differenceWeight1 + " кг.");
        var differenceWeight2 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе бойцов рассчитанная остатком от деления: " + differenceWeight2 + " кг.");
    }
    public static void task8() {
        System.out.println("Задача №8");
        var totalWorkTimes = 640;
        var workTimesOneEmployee = 8;
        var amountEmployee = totalWorkTimes/workTimesOneEmployee;
        System.out.println("Всего работников в компании — " + amountEmployee + " человек.");
        var newAmountEmployee = amountEmployee + 94;
        var newWorkTimesOneEmployee = workTimesOneEmployee * newAmountEmployee;
        System.out.println("Если в компании работает " + newAmountEmployee + " человек, то всего " + newWorkTimesOneEmployee + " часов работы может быть поделено между сотрудниками.");
    }
}