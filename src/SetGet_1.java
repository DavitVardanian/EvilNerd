public class SetGet_1 {
    public static void main( String [] args){
        Apollo apollo1 = new Apollo();
        apollo1.setName("какое то нмия. ");
        apollo1.setAge(-1);
        System.out.println("Выводим значение в main методе " + apollo1.getName());
        System.out.println("Выводим значение в main методе " + apollo1.getAge()+".");
    }
}
class  Apollo{
    private String name;
    private int age;

    public  void  setName( String userName){
        name = userName;

    }
    public String getName (){
        return  name;
    }
    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Возраст должен быть положительным");
        } else{
        age = userAge;}
    }
    public  int getAge(){
        return  age;
    }
}