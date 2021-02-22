package 集合处理2;
/**
 * 根据学生的成绩查询学生信息
 * @author Administrator
 *
 */
public class MyBaseGrade implements MyBase<Student>{

	@Override
	public boolean test(Student obj) {
//		如果学生的成绩大于80返回true，否者返回false
		return 80<obj.getGrade();
	}

}
