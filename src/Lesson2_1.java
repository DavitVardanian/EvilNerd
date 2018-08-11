public class Lesson2_1 {                    // Урок 16
    public static void main(String[]arg){
        Baron baron1 = new Baron();
        baron1.name = "Вардан Варданян";
        baron1.age = 55;
        baron1.height = 105.00f;
        baron1.weight = 20;
        baron1.sayHello();
        baron1.speak();
         baron1.calculateYearsToRetirment();

    }
}
class Baron{
    String name;
    int age;
    float height;
    int weight;

    void calculateYearsToRetirment(){
        int years = 65-age;
        System.out.println("количество лет до пенсии - "+ years + "лет.");

    }

    void speak(){
        for (int i=0;i<1;i++){
        System.out.println("Меня зовут "+ name +", "+" мне "+age +" лет "+", "+ "рост у меня "
                +height+" см"+", "+"мои вес "+ weight+" кг !");
        }

    }
    void sayHello(){
        for (int i=0;i<1;i++){
            System.out.println("Hello !");
        }
    }

}