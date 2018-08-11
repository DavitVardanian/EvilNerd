public class ClassAndObjects {
    public static void main(String[]args){
        Person person1=new Person();
        person1.name="Володя Петрович";
        person1.age= 42;

        System.out.println("меня зовут "+ person1.name +", "+"мне "+person1.age +"-лет");
    }
}
//class Person{
////    String name;
////    int age;
////}