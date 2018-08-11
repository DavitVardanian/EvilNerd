public class Arrays_6 {
    public static void main(String[] args) {
      Woman woman1 = new Woman();
      woman1.name = "Балабек";
      woman1.age = 50;
      woman1.speak();
     int years = woman1.calculateYears();
        System.out.println("количество лет до пенсии  осталось "+ years+ " лет.");
}
}
class Woman{
    String name;
    int age;

    int calculateYears(){
        int years= 65 - age;
       return years;
    }

    void speak(){
        System.out.println("меня зовут "+ name+", "+"мне "+ age +" лет.");

    }
}