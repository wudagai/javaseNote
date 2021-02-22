package 集合处理2;
/**
 * 根据学生的性别查询学生信息
 * @author Administrator
 *
 */
public class MyBaseSex implements MyBase<Student>{

	@Override
	public boolean test(Student obj) {
//		如果学生的性别为女返回true，否者返回false
		return "女".equals(obj.getSex());
	}

}
