package Collection;

import java.util.*;

/**
 * Created by Alex Zaharov
 *
 *
 1.	HashSet из растений Создать коллекцию HashSet с типом элементов String.
 Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 Посмотреть, как изменился порядок добавленных элементов.
 с алфавитного изменится на дыня ежевика банан арбуз груша картофель земляника ирис вишня жень-шень

 2.	HashMap из 10 пар Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
 арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 Пример вывода (тут показана только одна строка):картофель - клубень

 3.	Коллекция HashMap из котов Есть класс Cat, с полем имя (name, String).
 Создать коллекцию HashMap<String, Cat>. Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 Вывести результат на экран, каждый элемент с новой строки.

 4.	Вывести на экран список ключей Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 Вывести на экран список ключей, каждый элемент с новой строки.

 5.	Вывести на экран список значений Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 Вывести на экран список значений, каждый элемент с новой строки.

 6.	Коллекция HashMap из Object Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.Пример вывода (тут показана только одна строка): Sim - 5

 */
public class Main {
    public static void main(String[] args) {
        setWork();
        mapWorkVegitables();
        mapWorkCat();
        mapObject();


    }
    public static void setWork(){
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }
        System.out.println();
    }
    public static void mapWorkVegitables(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("арбуз","ягода");
        map.put("банан ","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень - шень","корень");
        map.put("земляника","ягода");
        map.put("ирис"," цветок");
        map.put("картофель","клубень");

        Iterator<Map.Entry<String,String>> iteratorMap = map.entrySet().iterator();
        while (iteratorMap.hasNext()){
            Map.Entry<String, String> pair = iteratorMap.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }
        System.out.println();
        Set<String>keys = map.keySet();
        for (String k : keys){
            System.out.println("Ключ "+k);
        }
        System.out.println();
        for (String k : map.values()){
            System.out.println("Значения "+k);
        }
        System.out.println();
}
    public static void mapWorkCat(){
        Map<String,Cat> mapCat = new HashMap<String, Cat>();
        Cat cat = new Cat();
        mapCat.put("Вася",cat);
        cat = new Cat();
        mapCat.put("Бася",cat );
        cat = new Cat();
        mapCat.put("Тотошка",cat );
        cat = new Cat();
        mapCat.put("Рой",cat );
        cat = new Cat();
        mapCat.put("Грей",cat );
        cat = new Cat();
        mapCat.put("Кити",cat );
        cat = new Cat();
        mapCat.put("Джо",cat );
        cat = new Cat();
        mapCat.put("Барсик",cat );
        cat = new Cat();
        mapCat.put("Тормоз",cat );
        cat = new Cat();
        mapCat.put("Дурень",cat );
        Iterator<Map.Entry<String,Cat>> iteratorMap = mapCat.entrySet().iterator();
        while (iteratorMap.hasNext()){
            Map.Entry<String, Cat> pair = iteratorMap.next();
            String key = pair.getKey();            //ключ
            Cat value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }
        System.out.println();
    }

    public static void mapObject(){
        Integer a = 10;
        boolean b = true;
        String c ="Лабуда";
        double d = 15;
        int e = 45;
        long f = 100000000;

        Map<String,Object> mapCat = new HashMap<String, Object>();
        Cat cat = new Cat();
        mapCat.put("Вася",cat);
        mapCat.put("Бася",a );
        mapCat.put("Тотошка",b );
        mapCat.put("Рой",c );
        mapCat.put("Грей",d );
        cat = new Cat();
        mapCat.put("Кити",cat );
        mapCat.put("Джо",e );
        mapCat.put("Барсик",f);
        mapCat.put("Тормоз",a );
        mapCat.put("Дурень",b );
        Iterator<Map.Entry<String,Object>> iteratorMap = mapCat.entrySet().iterator();
        while (iteratorMap.hasNext()){
            Map.Entry<String, Object> pair = iteratorMap.next();
            String key = pair.getKey();            //ключ
            Object value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }
        System.out.println();
    }
}
