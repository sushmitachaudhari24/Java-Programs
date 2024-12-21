public class damboPattern {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i + 1; j <= 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int i = 6 - 2; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i + 1; j <= 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
