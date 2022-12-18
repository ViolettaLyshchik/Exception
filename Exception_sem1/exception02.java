package Exception_sem1;

public class exception02 {
    public static void main(String[] args) {
        try{
            int number = 10;
            System.out.println(factorial(number));
            if (number < 30){
            throw new Exception("Number is too low!");
            } 
        }catch(Exception e) {
            System.out.println(e.getMessage());

        }finally {
            System.out.println("Finally block");
        }
        System.out.println("Finished");
    }
    public static int factorial(int value) throws Exception{
        int result = 1;
        if (value < 1) {
        throw new Exception("Value < 1");
        }
        for (int i = 1;i<=value;i++) {
            result *=i;
        }
        return result;
    }
}