package 集合处理2;
/**
 * 根据学生的年龄查询学生信息
 * @author Administrator
 *
 */
public class MyBaseAge implements MyBase<Student>{

	@Override
	public boolean test(Student obj) {
//		如果学生的年龄大于18返回true，否者返回false
		return 18<obj.getAge();
	}

}
