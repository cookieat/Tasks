public class task1
{
    public static void main(String[] args){
        System.out.println(Division(6,4));//task1
        System.out.println(Triangle(7,14));//task2
        System.out.println(Animals(2,3,5));//task3
        System.out.println(ProfitableGamble(0.2,50,9));//task4
        System.out.println(Operation(24,2,12));//task5
        System.out.println(Ctoa('A'));//task6
        System.out.println(AddUpTo(10));//task7
        System.out.println(MaxEdge(8,10));//task8
        System.out.println(SquareMassiv (new int[]{2,4,6}));//task9
        System.out.println(abcmath(5,2,1));//task10
    }

    public static int Division(int a, int b){//task1 function
        return a%b;
    }
    public static int Triangle(int base, int height){//task2 function
        return (base*height/2);
    }
    public static int Animals(int chickens, int cows, int pigs){//task3 function
        return (chickens*2+cows*4+pigs*4);
    }
    public static boolean ProfitableGamble(double prob, double prize, double pay){//task4 function
        if (prob*prize>pay){
            return true;
        }
        else{
            return false;
        }
    }
    public static String Operation(double a, double b, double c){//task5 function
        if (a+b==c){
            return "added";
        }
        if (a-b==c){
            return "subtracted";
        }
        if (a*b==c){
            return "multiply";
        }
        if (a/b==c){
            return "divide";
        }
    return "None";
    }
    public static int Ctoa(char a){//task 6 function
        return (int) a;
    }
    public static int AddUpTo(int a){//task7 function
        int s=0;
        for (int i=1; i<=a; i++)
        {
            s=s+i;
        }
    return s;
    }
    public static int MaxEdge(int edge1, int edge2){//task8 function
        return edge1+edge2-1;
    }
    public static int SquareMassiv (int[] massiv){//task9 function not work
        int summa=0;
        for (int i=0; i<massiv.length; i++)
        {
         summa=summa+(massiv[i]*massiv[i]*massiv[i]);
        }
        return summa;
    }
    public static boolean abcmath(int a, int b, int c){//task10 function
        for (int i=1;i<=b;i++){
            a=a+a;
        }
        if (a%c==0){
            return true;
        }
        else{
            return false;
        }
    }
}