package moduleOne;

/**
 * 数据访问：对表操作
 * 	
 * 
 * @author Administrator
 *
 */
public class Dao implements IDao{
	
	public void selectAll() {
		System.out.println("查询信息");
	}
	
	public void deleteAll() {
		System.out.println("删除信息");
	}
	
	public void addAll() {
		System.out.println("添加信息");
	}

}
