package 集合处理1;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		List<Student> stuList=dao.getList();
		dao.queryStudentByAge(stuList);

	}

}
