public class ClassAndObjects_1 {
    public static void main(String[]args){
    Person person3 = new Person();
    person3.name = "Sergey";
    person3.age = 30;
    person3.speak();
    Person person2 = new Person();
    person2.name = "Nikolay";
    person2.age = 28;
    person2.speak();

    }
}
class Person{
    String name;
    int age;
void speak(){
//    for (int i=0;i<2;i++){ // ete uzum enq 2 kam aveli angamner krknvi mer tox@
   System.out.println("меня зовут "+ name +" ,мне "+ age +" лет.");
//}
}
}