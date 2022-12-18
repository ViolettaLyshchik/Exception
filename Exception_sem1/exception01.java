package Exception_sem1;
public class exception01 {
    public static void main(String[] args) {
        try{
            int [] numbers = new int [3];
            numbers[4]=10;
        } catch(Exception e){
            System.out.println("Exeption: " + e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Finished");
    }
}
