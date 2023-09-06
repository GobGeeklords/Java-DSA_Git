public class Pattern5 {
    public static void main(String[] args) {
        Pat6(5);
    }
    static void Pat6(int n){
        for (int row = 0; row <2* n ; row++) {
            int TotalCol=row>n?2*n-row: row;
            int TotalNoOfSpaces = n - TotalCol;
            for(int k=0;k<TotalNoOfSpaces;k++){
                System.out.print(" ");
            }
            for (int col=0;col<TotalCol;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pat5(int n){
        for (int row = 0; row <2* n ; row++) {
            int TotalCol=row>n?2*n-row: row;
            for (int col=0;col<TotalCol;col++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }

