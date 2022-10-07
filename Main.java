import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Task1
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
*/

//Task2
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i);
        }
    }
}
 */

//Task3
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
 */

//Task4
/*
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
 */

//Task5
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for (String i : cars){
            System.out.println(i);
        }
    }
}
 */

//Task6
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);
        for (int i : myNumbers){
            System.out.println(i);
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String car = cars.get(0);
        System.out.println("get method:" + car);

        cars.set(0, "Opel");
        System.out.println("set method:" + cars);

        cars.remove(0);
        System.out.println("remove method:" + cars);

        cars.clear();
        System.out.println("clear method:" + cars);

        int s = cars.size();
        System.out.println("list size:" + s);
    }
}
 */

//Problem 1
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        System.out.println(colors);
    }
}
*/

//Problem 2
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add(0, "White");
        System.out.println(colors);
    }
}
 */

//Problem 3
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        String color = colors.get(2);
        System.out.println(color);
    }
}
 */

//Problem 4
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("Blue");
        colors.add("White");
        colors.set(3, "Yellow");
        System.out.println(colors);    }
}
*/


//Problem 5
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");
        colors.remove(2);
        System.out.println(colors);
    }
}
 */

//Problem 6
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");
        if (colors.contains("Purple")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
*/

//Problem 7
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");
        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("1");
        colors2.add("2");
        colors2.add("3");
        colors2.add("4");
        colors2.add("5");
        colors2.add("6");
        Collections.copy(colors2, colors);
        System.out.println("First array list" + colors);
        System.out.println("Second array list" + colors2);
    }
}
 */


//Problem 8
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");Collections.shuffle(colors);
        System.out.println(colors);
    }
}
*/

//Problem 9
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Beige");
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");
        Collections.reverse(colors);
        System.out.println(colors);
    }
}
 */





