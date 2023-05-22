import java.util.Scanner;
public class Pontos {
    
 private int x;
 private int y;
 public Pontos (int x, int y){
 this.x = x;
 this.y = y;
}
public Pontos (){
 this.x = 0;
 this.y = 0;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		double xA, xB, yA, yB;
    
System.out.println("Considerando dois pontos A e B, defina: ");
System.out.println("A coordenada x de A:");
xA = sc.nextDouble(); 
System.out.println("A coordenada y de A:");
yA = sc.nextDouble();
System.out.println("A coordenada x de B:");
 xB = sc.nextDouble();
System.out.println("A coordenada y de B:"); 
 yB = sc.nextDouble(); 


if (xA == xB && yA == yB){
System.out.printf("Os pontos são congruentes (iguais). Logo, a distância entre eles é igual a zero.");
} else {
double dAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2)) ;
System.out.printf("Os pontos não são congruentes (iguais). Logo, a distância entre eles é igual: " + dAB);
}
   }
      }
