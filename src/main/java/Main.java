public class Main {
    public static void main(final String[] args) {
        //copyFromBoxToBox
        Apple apple1 = new Apple("Антоновка", true); //Создаём яблоко
        Box<Fruit> fruitBox = new Box<>(); //Создаем коробку для фруктов
        Box<Apple> appleBox = new Box<>(); //Создаем коробку для яблок
        appleBox.put(apple1); //Кладём яблоко в коробку для яблок
        BoxUtil.copyFromBoxToBox(appleBox, fruitBox); //Кладём объект из коробки для яблок в коробку для фруктов

        //copyFreshFruitFromBoxToBox
        Apple apple2 = new Apple("Голден", false); //Создаём яблоко
        Box<Fruit> fruitBox1 = new Box<>(); //Создаем две коробки для фруктов
        Box<Fruit> fruitBox2 = new Box<>();
        fruitBox1.put(apple2); //Кладём яблоко в одну из коробок
        BoxUtil.copyFreshFruitFromBoxToBox(fruitBox1, fruitBox2); //Кладём объект из первой коробки во вторую

        //printElementFromTwoBoxes
        Apple apple3 = new Apple("Макиннтош", true); //Создаём яблоко
        Box<Fruit> box1 = new Box<>(); //Создаем коробку для чего-либо (пусть для фруктов)
        Box<Box<Fruit>> box2 = new Box<>(); //Создаем вторую коробку для коробки
        box1.put(apple3); //Кладём яблоко в первую коробку
        box2.put(box1); //Кладём первую коробку во вторую
        BoxUtil.printElementFromTwoBoxes(box2); //Выводим элемент из второй коробки

        //printElementFromBoxes
        Apple apple4 = new Apple("Гала", true); //Создаём яблоко
        Box<Box<Box<Fruit>>> box3 = new Box<>(); //Создаем третью коробку для второй
        Box<Box<Box<Box<Fruit>>>> box4 = new Box<>(); //Создаем четвёртую коробку для третьей
        box1.put(apple4); //Кладём яблоко в первую коробку
        box2.put(box1); //Кладём первую коробку во вторую
        box3.put(box2); //Кладём вторую коробку в третью
        box4.put(box3); //Кладём третью коробку в четвёртую
        BoxUtil.printElementFromBoxes(box4); //Выводим элемент из последней коробки
    }
}
