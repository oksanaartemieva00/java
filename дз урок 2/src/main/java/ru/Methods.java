package ru;

public class Methods {
    //Д.З из 1 урока
    //№3
    public static float calculate(float a,float b,float c,float d){
        return a*(b+(c/d));
    }
    //№4
    public static boolean task10and20(int x1, int x2){
        return x1+x2>=10&&x1+x2<=20;
    }
    //№5
    public static void isPositiveOrNegative(int x){
        if(x>=0){
            System.out.println("Число: " +x +" положительное");
        } else{
            System.out.println("Число: " +x +" отрицательное");
        }
    }
    //№6
    public static boolean isNegative(int x){
        if (x<0){
            return true;
        }else{
            return false;
        }
    }
//№7
    public static String greetings(){
        return "Оксана";
    }
    //Д.З. из 2-ого урока
    //№1
    public static void invertArray(){
        int[] arr={1,0,0,1,1,0};
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==1){
                arr[i]=0;
            }else{
                arr[i]=1;
            }

            System.out.println(arr[i]);
        }
    }
    //№2
    public static void fillArray(){
        int[] arr=new int[8];
        for (int i = 0, j=0; i < arr.length; i++,j+=3) {
                arr[i] = j;
                System.out.println(arr[i]);


        }
    }
    //№3
    public static void changeArray(){
        int[] a={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i <a.length ; i++) {
            if( a[i]<6){
                a[i]=a[i]*2;
            }
            System.out.println(a[i]);
        }
    }
    // №4
    public static void fillDiagonal(){
        int[][] diag= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                diag[0][0]=1;
                diag[0][2]=1;
                diag[1][1]=1;
                diag[2][0]=1;
                diag [2][2]=1;
                System.out.println(diag [i][j]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Выражение равно: " +calculate(2.46f,15f,1.1f,0.25f));
        System.out.println(task10and20(8,6));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-2));
        System.out.println("Привет, "+greetings()+"!");
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();


    }
}
