import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Giai Phuong Trinh Bac 2");
        System.out.println("Hệ số a");
        int a = scanner.nextInt();
        System.out.println("Hệ số b");
        int b = scanner.nextInt();
        System.out.println("Hệ số c");
        int c = scanner.nextInt();
        

    }
    public class GiaiPhuongTrinh {
        double a,b,c;
        public GiaiPhuongTrinh(double a,double b,double c) {
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getDiscriminant(){
            double d;
            d = Math.pow(b,2) - 4*a*c;
            return d;
        }
        public double getRoot1(){
            double r1;
            r1 = (-b + Math.sqrt(getDiscriminant()))/(2*a);
            return r1;
        }
        public double getRoot2(){
            double r2;
            r2 = (-b-Math.sqrt(getDiscriminant()))/(2*a);
            return r2;
        }


    }
}
