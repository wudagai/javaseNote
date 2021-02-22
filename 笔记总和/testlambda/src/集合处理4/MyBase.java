package 集合处理4;
/**
 * 策略总接口
 * @author Administrator
 *函数式接口:静态方法,默认方法,抽象方法（只有一个）
 */
@FunctionalInterface
public interface MyBase<E> {
	public boolean test(E obj);
	
	public static void getName() {
		System.out.println("name");
	}

}
