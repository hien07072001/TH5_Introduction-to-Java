import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap ngay ban muon tim");
        int month=scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay ");
                break;
            case 2:
                System.out.println("thang co 29 hoac 28 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay");
        }
    }
}
