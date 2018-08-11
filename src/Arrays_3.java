public class Arrays_3 {
    public static void main(String[]args){
        String[]strings=new String[4];
        strings[0]="hello";
        strings[1]="how are you";
        strings[2]="thank's fine";
        strings[3]="bye";
        for (int i = 0; i<strings.length;i++){  // arajin tarberak
            System.out.println(strings[i]);
        }
        System.out.println("!*!*!");

//            for (String string : strings) { // erkrord tarberak
//            System.out.println(string);
//        }
    }
}
