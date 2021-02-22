package moduleTwo;

import moduleOne.Dao;
import moduleOne.IDao;

public class Service {
//	这个模块功能的完成必须依赖于Dao(数据访问)
//	Dao在Service中可见：耦合度非常高
	Dao d=new Dao();
//	向上塑型
//	IDao d=new Dao();

	public void getAllMessage() {
		d.selectAll();
		
	}
	
	public void delectAllMessage() {
		d.deleteAll();
	}
	
	public void addAllMessage() {
		
		
	}
	
	public static void main(String[] args) {
		Service s=new Service();
		s.getAllMessage();
    }

}
