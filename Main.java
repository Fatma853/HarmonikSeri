import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir n değeri giriniz: ");
    int n = input.nextInt();
    double sonuc= 0.0;

    for(double i= 1.0 ; i<= n ; i++) {
      sonuc += (1/i);
    }

    System.out.println("Sonucunuz: "+ sonuc);
  }
}