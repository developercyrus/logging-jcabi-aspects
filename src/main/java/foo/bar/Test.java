package foo.bar;
import com.jcabi.aspects.Loggable;

public class Test {
	@Loggable(value = Loggable.DEBUG, prepend = true)
	public double power(int x, int p ) {
		return Math.pow(x, p);
	}
	
	public static void main(String[] args) {
		Test t = new Test();		
		System.out.println(t.power(1, 2));
	}
}
