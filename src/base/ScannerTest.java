package base;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		while(sc.hasNext())
		{
			System.out.println("�����������:" + sc.next());
		}
		sc.close();
	}

}
