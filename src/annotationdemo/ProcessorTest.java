package annotationdemo;

import java.lang.reflect.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ProcessorTest
{
	public static void process(String clazz)
		throws ClassNotFoundException
	{
		int passed = 0;
		int failed = 0;

		for (Method m : Class.forName(clazz).getMethods())
		{

			if (m.isAnnotationPresent(Testable.class))
			{
				try
				{

					m.invoke(null);
					passed++;
				}
				catch (Exception ex)
				{
					System.out.println("method" + m + " run fail. exception:"
						+ ex.getCause());
					failed++;
				}
			}
		}

		System.out.println("total: " + (passed + failed)
			+ "methods\n" + "fail:" + failed + "\n"
			+ "sucess:" + passed);
	}
}

