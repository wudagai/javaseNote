package 集合处理5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 需求：
 * 		查询年龄大于18的学生信息
 * 		查询成绩大于80的学生信息
 * 		查询性别为女的学生信息
 * @author Administrator
 *	使用策略模式：将简单的算法实现封装成一个个类中的方法实现，用一个策略者规定行为即可
 */
public class StudentDao {
//	制作学生信息数据，相当于从学生表中查询的信息
	public static List<Student> studentList=new ArrayList<>();
	static {
		Student s1=new Student("zhangsan","neusoft",50,"男",70.0);
		Student s2=new Student("lisi","neusoft",34,"女",75.0);
		Student s3=new Student("wangwu","neusoft",11,"男",85.0);
		Student s4=new Student("zhaoliu","neusoft",18,"女",66.0);
		Student s5=new Student("kaige","neusoft",18,"女",99.0);
		Student s6=new Student("jack","neusoft",16,"男",10.0);
		Student s7=new Student("tom","neusoft",70,"男",35.0);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
	} 
	/**
	 * 查询年龄大于18的学生信息
	 * @param list
	 * @param base
	 */
	public void queryStudentByAge(List list) {//为了方便测试该方法没有返回值，得到结果过直接在控制台输出即可
//		jdk1.8之后，可以省略策略接口		
//		遍历集合，查询出满足条件的学生	
//		list.stream()：返回集合的迭代形式，类似于list.iterator()
//		list.stream().filter(obj->18<((Student)obj).getAge());//根据方法的描述过滤集合中的数据,返回满足条件的数据
//		collect(Collection c):返回参数中的集合类型
		List<Student> list_stu=(List) list.stream().filter(obj->18<((Student)obj).getAge()).collect(Collectors.toList());//以集合的形式输出数据
//		System.out.println(list_stu);
		for(Student s:list_stu) {
			System.out.println(s);
		}
	}
	/**
	 * 查询性别为女的学生信息
	 * @param list
	 * @param base
	 */
	public void queryStudentBySex(List list) {//为了方便测试该方法没有返回值，得到结果过直接在控制台输出即可
//		遍历集合，查询出满足条件的学生
//		Iterator it=list.iterator();//返回集合的迭代形式
//		(obj)->{return "女".equals(((Student)obj).getSex());}
		List<Student> list_stu=(List) list.stream().filter(obj->"女".equals(((Student)obj).getSex())).collect(Collectors.toList());
//		System.out.println(list_stu);
		for(Student s:list_stu) {
			System.out.println(s);
		}
	}
	/**
	 * 查询成绩大于80的学生信息
	 * @param list
	 * @param base
	 */
	public void queryStudentByGrade(List list) {//为了方便测试该方法没有返回值，得到结果过直接在控制台输出即可
//		遍历集合，查询出满足条件的学生
//		Iterator it=list.iterator();//返回集合的迭代形式
//		(obj)->{return 80<((Student)obj).getGrade();}
		List<Student> list_stu=(List) list.stream().filter(obj->80<((Student)obj).getGrade()).collect(Collectors.toList());
//		System.out.println(list_stu);
		for(Student s:list_stu) {
			System.out.println(s);
		}
	}

	public List<Student> getList() {
		return studentList;
	}

}
