package baselib;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String detail;

	public Address(String detail) {
		this.detail = detail;
	}
}

class User implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int age;
	Address address;

	public User(int age) {
		this.age = age;
		address = new Address("guanzhou");
	}

	/**
	 * shadow copy
	 */
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
	}

	public User deepClone() {
		return (User) deepCopy(this);
	}

	public static Object deepCopy(Object from) {
		Object obj = null;
		try {
			// 将对象写成 Byte Array
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(from);
			out.flush();
			out.close();

			// 从流中读出 byte array，调用readObject函数反序列化出对象
			ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
			obj = in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		return obj;
	}
}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		User u1 = new User(29);
		User u2 = u1.clone();
		User u3 = u1.deepClone();

		System.out.println("shadow copy:" + (u1 == u2));
		System.out.println("shadow copy:" + (u1.address == u2.address));

		System.out.println("deep copy:" + (u1 == u3));
		System.out.println("deep copy:" + (u1.address == u3.address));
		
		System.out.println("deep equals:" + (Objects.deepEquals(u1, u2)));
	}
}
