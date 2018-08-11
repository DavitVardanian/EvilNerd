
public class New {
    public static void main(String[]args){    // Ключевое слово this.
        Humanoid humanoid1 = new Humanoid();
        humanoid1.setAge(4);
        humanoid1.setName("Karen");
        humanoid1.getInfo();
    }
          }
class Humanoid{
    String name;
    int age;
    public  void  setName(String Name)
    {
        this.name = Name;
    }

    public void setAge(int Age) {
       this. age = Age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo (){
        System.out.println(name+", "+age);
    }
}

