package baselib;

import java.util.Scanner;

/**
 * ÃüÁîĞĞ»·¾³²âÊÔ
 * java baselib/ScannnerKeyBoardTest
 * */
public class ScannnerKeyBoardTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println("input is: " + sc.next());
		}
	}

}
