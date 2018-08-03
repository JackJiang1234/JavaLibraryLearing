package classloader;

import java.util.*;

public class NotInitializationArray {

	private static Iterator list(ClassLoader CL)
	        throws NoSuchFieldException, SecurityException,
	        IllegalArgumentException, IllegalAccessException {
	        Class CL_class = CL.getClass();
	        while (CL_class != java.lang.ClassLoader.class) {
	            CL_class = CL_class.getSuperclass();
	        }
	        java.lang.reflect.Field ClassLoader_classes_field = CL_class
	                .getDeclaredField("classes");
	        ClassLoader_classes_field.setAccessible(true);
	        Vector classes = (Vector) ClassLoader_classes_field.get(CL);
	        return classes.iterator();
	    }
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SuperClass[] sca = new SuperClass[10];
		
		ClassLoader myCL = Thread.currentThread().getContextClassLoader();
        while (myCL != null) {
            System.out.println("ClassLoader: " + myCL);
            for (Iterator iter = list(myCL); iter.hasNext();) {
                System.out.println("\t" + iter.next());
            }
            myCL = myCL.getParent();
        }

	}

}
