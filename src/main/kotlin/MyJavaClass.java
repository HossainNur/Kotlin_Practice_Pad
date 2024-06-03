public class MyJavaClass {
    public static void main(String[] args){

    }
    public static void add(int a,int b){
        int result = a + b;
        System.out.println("printing inside Java class :"+result);
    }
    public static int area(int l, int b){
        int result = l * b;
        return result;
    }

    public void display(int... values) {
        for (int s : values) {
            System.out.println(s);
        }
    }
}
