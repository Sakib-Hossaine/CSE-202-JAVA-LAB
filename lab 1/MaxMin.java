public class MaxMin 
{
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 6;
        int num3 = 4;

        int max, min;

    
        if (num1 >= num2 && num1 >= num3)
         {
            max = num1;
        } 
        else if (num2 >= num1 && num2 >= num3) 
        {
            max = num2;
        } 
        else
         {
            max = num3;
        }

      
        if (num1 <= num2 && num1 <= num3) 
        {
            min = num1;
        } 
        else if (num2 <= num1 && num2 <= num3)
         {
            min = num2;
        } 
        else 
        {
            min = num3;
        }

      
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}