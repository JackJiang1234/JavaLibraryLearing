package i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloArg {

	public static void main(String[] args) {
		// ����һ��Locale����
		Locale currentLocale = null;
		// ������г����ָ������������
		if (args.length == 2) {
			// ʹ�����г����������������Localeʵ��
			currentLocale = new Locale(args[0], args[1]);
		} else {
			// ����ֱ��ʹ��ϵͳĬ�ϵ�Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		// ����Locale����������Դ
		ResourceBundle bundle = ResourceBundle.getBundle("myMess", currentLocale);
		// ȡ���Ѽ��ص�������Դ�ļ���msg��Ӧ��Ϣ
		String msg = bundle.getString("msg");
		// ʹ��MessageFormatΪ��ռλ�����ַ����������
		System.out.println(MessageFormat.format(msg, "yeeku", new Date()));
		System.out.println(String.format(msg, "yeeku", new Date()));
	}

}