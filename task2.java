import java.util.Arrays;
public class task2 {
    public static void main (String[] args) {
        System.out.println(Repeat("hello", 2));//task1
        System.out.println(MaxMin (new int[]{2,4,6}));//task2
        System.out.println(Mediana(new int[]{1,2,3,4}));//task3
        System.out.println(CumulativeSum(new int[]{1,2,3,4}));//task4
        System.out.println(getDecimalPlace("14.1456"));//task5

        /*System.out.println(fibbonachi(0));
        System.out.println(fibbonachi(1));
        System.out.println(fibbonachi(2));
        System.out.println(fibbonachi(3));
        System.out.println(fibbonachi(4));
        System.out.println(fibbonachi(5));
        System.out.println(fibbonachi(6));
        System.out.println(fibbonachi(7));
        System.out.println(fibbonachi(8));
        System.out.println(fibbonachi(9));
        System.out.println(fibbonachi(10));
        System.out.println(fibbonachi(11));*/
        System.out.println(fibbonachi(12));//task6
        System.out.println(isValid("45489"));//task 7
        System.out.println(isStrangePair("opne","ipen"));//task8
        System.out.println("task9:");
        System.out.println(isPrefix("automation", "auto-"));//task9
        System.out.println(isSuffix("automation","-tion"));//task9
        System.out.println(boxSeq(2));//task10
    }
    public static String Repeat(String word,int n){//task1 function
        String newword="";
        for (int i=0; i<word.length(); i++){
            for (int k=0; k<n; k++){
            newword=newword+word.charAt(i);}

        }
        return newword;
    }
    public static String MaxMin (int[] massiv){//task2 function
        int maxim=0;
        int minim=100000;
        for (int i=0; i<massiv.length; i++)
        {if (maxim<massiv[i]){
            maxim=massiv[i];}
        if (minim>massiv[i]){
            minim=massiv[i];}
        }
        return ("Smallest number is  "+minim+", biggest is "+maxim);
    }
    public static boolean Mediana(int[] massiv){//task3 function
        double summa=0;
        for (int i=0; i<massiv.length; i++){
            summa=summa+massiv[i];
        }
        if ((summa/massiv.length)%1==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static String CumulativeSum(int [] massiv){//task4 function
        int[] massiv2=new int [massiv.length];
        String result = new String();
        for (int i=0; i<massiv.length; i++)
        {
            for (int k=0; k<i; k++){
                massiv2[i]+=massiv[k];
                
            }
        }
        result = Arrays.toString(massiv2);
        return result;
    }
    public static int getDecimalPlace(String word){
        int n = word.indexOf('.');
        //int n=(String.asList(word).indexOf("."));
        if (n==-1){
            return 0;
        }
        return (word.length()-n-1);
    }

   // String[] s = {"Arial", "Colibri", "Times New Roman", "Windings", "FontMacOS"};
   // System.out.println(Arrays.asList(s).indexOf("Times New Roman"));

    public static int fibbonachi(int n) {//task 6 function
        int result = 1;
        if (n == 1 || n == 2) {
            return result;
        }
        if (n==0){
            return result-1;
        }
        result = fibbonachi(n-1)+fibbonachi(n-2);
        return result;
    }
    public static boolean isValid(String str) { //task 7 function
        try {  
          Double.parseDouble(str);  
          if ((str.length())==5){
            return true;
          }
          else{
            return false;
          }
          
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    public static boolean isStrangePair(String string1, String string2){
        if (string1.charAt(0) == (string2.charAt(string2.length() - 1))){
            if (string2.charAt(0) == (string1.charAt(string1.length() - 1)))
            return true;
        }
        return false;
    }
    public static boolean isPrefix(String word, String prefix){
        for (int i=0; i<(prefix.length()-1); i++){
            if (word.charAt(i)!=prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }
    //automation -tion  c 9 до длины суффикса
    //с 9 до 4   9 8 7 6 5 4 
    //
    public static boolean isSuffix(String word, String suffix){
        String newsuffix="";
        for (int i=1; i<suffix.length();i++){
            newsuffix=newsuffix+suffix.charAt(i);
        }
            if (word.endsWith(newsuffix)){
                return true;
            }
        return false;
    }
    public static int boxSeq(int n){
        int result=0;
        for (int i=1; i<=n; i++){
            if (i%2==0){
                result=result-1;
            }
            if (i%2==1){
                result=result+3;
            }
        }
        return result;
    }
}