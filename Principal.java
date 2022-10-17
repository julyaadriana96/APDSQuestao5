package colisoes;

import java.awt.Rectangle;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
	Retangulo rt1 = new Retangulo();
	Retangulo rt2 = new Retangulo();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("quantos arquivos você quer ler?");
	int y = sc.nextInt();
	sc.nextLine();
	for (int i = 0; i < y; i++ ) {
		System.out.println("digite a URL do seu arquivo");
	// String txt1 = sc.nextLine();
	String txt = sc.nextLine();
	Scanner lerA = new Scanner(new FileReader(txt));
	rt1.setPonto1(lerA.nextInt()); rt1.setPonto2(lerA.nextInt());rt1.setPonto3(lerA.nextInt());rt1.setPonto4(lerA.nextInt());
	rt2.setPonto1(lerA.nextInt());rt2.setPonto2(lerA.nextInt());rt2.setPonto3(lerA.nextInt());rt2.setPonto4(lerA.nextInt());
	Rectangle ret1 = new Rectangle (rt1.getPonto1(), rt1.getPonto2(), rt1.getPonto3(), rt1.getPonto4());
	Rectangle ret2 = new Rectangle (rt2.getPonto1(), rt2.getPonto2() ,rt2.getPonto3(), rt2.getPonto4());
	

	boolean x = ret1.intersects(ret2);
	if(x) {
		System.out.println("COLIDIU");
	} else {
		System.out.println("NÃO COLIDIU");
		}
	
		
	}
	
	
	}
		
}
		
	