package 集合处理3;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		List<Student> stuList=dao.getList();
//		根据年龄查询学生信息
//		消除实现类，使用匿名内部类，
		dao.queryStudentByAge(stuList,new MyBase<Student>() {
			@Override
			public boolean test(Student obj) {
				return 18<obj.getAge();
			}

		});
		System.out.println("=======================================");
//		根据性别查询学生信息
		dao.queryStudentBySex(stuList,new MyBase<Student>() {
			@Override
			public boolean test(Student obj) {
				return "女".equals(obj.getSex());
			}
		});
		System.out.println("=======================================");
//		根据成绩查询学生信息
		dao.queryStudentBySex(stuList,new MyBase<Student>() {

			@Override
			public boolean test(Student obj) {
				return 80<obj.getGrade();
			}
		});

	}

}
