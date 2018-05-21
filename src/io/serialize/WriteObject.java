package io.serialize;

import java.io.*;

public class WriteObject
{
	public static void main(String[] args)
	{
		try(
			// 创建一个ObjectOutputStream输出流
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("object.txt")))
		{
			Person per = new Person("孙悟空", 500);
			// 将per对象写入输出流
			oos.writeObject(per);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

