package 集合处理2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		List<Student> stuList=dao.getList();
//		根据年龄查询学生信息
		MyBase mybaseAge=new MyBaseAge();
		dao.queryStudentByAge(stuList,mybaseAge);
		System.out.println("=======================================");
//		根据性别查询学生信息
		MyBase mybaseSex=new MyBaseSex();
		dao.queryStudentBySex(stuList,mybaseSex);
		System.out.println("=======================================");
//		根据成绩查询学生信息
		MyBase mybaseGrade=new MyBaseGrade();
		dao.queryStudentBySex(stuList,mybaseGrade);

	}

}
