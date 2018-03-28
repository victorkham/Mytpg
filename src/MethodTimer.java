import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTimer {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Method[] methods = Loop.class.getDeclaredMethods();

		Loop loop = new Loop();
		for (int i = 0; i < methods.length; i++) {
			long start = System.nanoTime();
			methods[i].invoke(loop);
			long time = System.nanoTime() - start;
			System.out.println(methods[i].getName()+" executed for " + time + " nanoseconds");
		}
	}
}
