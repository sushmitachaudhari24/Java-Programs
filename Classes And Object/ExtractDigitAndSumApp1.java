import java.util.Scanner;
class ExtractDigitAndSum
{
    char[] c;
    void setValue(char[] ch)
    {
        c = ch;
    }
    int getSum() {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
               // sum += Character.getNumericValue(c[i]);
               sum= sum+ Integer.parseInt(String.valueOf(c[i]));
            }
        }
        return sum;
    }
}
  public class ExtractDigitAndSumApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        ExtractDigitAndSum e = new ExtractDigitAndSum();
        e.setValue(ch);
        int sum = e.getSum();
        System.out.println("Sum of digits in the string: " + sum);
    }
}
