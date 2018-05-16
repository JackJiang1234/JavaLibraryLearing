package annotation;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface NotNull {
}

@NotNull
public class TypeAnnotationTest {

	public static void main(@NotNull String[] args)
			// throws时使用Type Annotation
			throws @NotNull FileNotFoundException {
		Object obj = "fkjava.org";
		// 强制类型转换时使用Type Annotation
		String str = (@NotNull String) obj;
		// 创建对象时使用Type Annotation
		Object win = new @NotNull JFrame("疯狂软件");
	}

	// 泛型中使用Type Annotation
	public void foo(List<@NotNull String> info) {
	}

}
