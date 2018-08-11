public class This {
    public static void main(String [] args){
        Humann humann2 = new Humann();
        humann2.setAge(20);
        humann2.setName("Tom Markovich");
        humann2.getInfo();
    }
}

class Humann{
     String name;
     int age;

    public void setName (String name){
       this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name +", "+ age);
    }
}
