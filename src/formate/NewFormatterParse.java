package formate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewFormatterParse {

	public static void main(String[] args) {
		// ����һ�������ʽ������ʱ���ַ���
		String str1 = "2014==04==12 01ʱ06��09��";
		// ������Ҫ���������ڡ�ʱ���ַ�������������õĸ�ʽ��
		DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HHʱmm��ss��");
		// ִ�н���
		LocalDateTime dt1 = LocalDateTime.parse(str1, fomatter1);
		System.out.println(dt1); // ��� 2014-04-12T01:06:09
		// ---��������ٴν�����һ���ַ���---
		String str2 = "2014$$$����$$$13 20Сʱ";
		DateTimeFormatter fomatter2 = DateTimeFormatter.ofPattern("yyy$$$MMM$$$dd HHСʱ");
		LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
		System.out.println(dt2); // ��� 2014-04-13T20:00

	}

}