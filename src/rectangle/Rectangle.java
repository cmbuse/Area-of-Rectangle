package rectangle;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Citirea de la tastatura a dimensiunilor unui dreptunghi
		Scanner input =new Scanner(System.in);
		System.out.print("Introduceti latimea dreptunghiului: ");
		int width= input.nextInt();
		System.out.print("Introduceti lungimea dreptunghiului: ");
		int length= input.nextInt();
		input.close();
//Calcularea Ariei dreptunghiului
		int area = 0;
		area = length * width;
		System.out.println("Aria dreptunghiului este: "+ area);
		
	}

}
