package com.nesoft.javase.Map集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap:基于散列表,key+value存储数据，可以把一组对象当成一个元素
 * 		   通过key获取value
 * 
 *     特点：
 *     		双列存储，通过key获取value
 *     		key不能重复
 *     		key可以有null值，但只能有一个
 *     		HashMap是无序的
 *     		value可以有重复值，可以有多个null
 * @author Administrator
 *
 */
public class TestMap {

	public static void main(String[] args) {
		Map<Integer,Object> map=new HashMap<>();
//		给map集合调加元素
		map.put(1, "zhangsan");
		map.put(5, "lisi");
		
//		访问map集合,通过key获取value
		System.out.println(map);//{1=zhangsan, 5=lisi}
		System.out.println(map.get(5));//lisi
		
//		key不能重复,如果集合中已经存在的key,会用当前key对应的vlue值替换之前存在的key对应的value
		map.put(5, "wangwu");
		System.out.println(map);//{1=zhangsan, 5=wangwu}
		
//		key可以有null值，但只能有一个
		map.put(null, "zhaoliu");
		System.out.println(map);//{null=zhaoliu, 1=zhangsan, 5=wangwu}
		map.put(null, "zhaoliu1");
		System.out.println(map);//{null=zhaoliu1, 1=zhangsan, 5=wangwu}
		map.put(8, "lisi1");
		map.put(6, "lisi2");
		map.put(7, "lisi3");
		map.put(66, "lisi4");
		System.out.println(map);//{null=zhaoliu1, 1=zhangsan, 66=lisi4, 5=wangwu, 6=lisi2, 7=lisi3, 8=lisi1}
		map.put(67, "lisi4");
		map.put(68, null);
		map.put(69, null);
		System.out.println(map);//{null=zhaoliu1, 1=zhangsan, 66=lisi4, 67=lisi4, 68=null, 5=wangwu, 69=null, 6=lisi2, 7=lisi3, 8=lisi1}
//		遍历Map集合
//		方式一：先将key转为Set集合，再通过get(key)方法获取每一个value值
		for(Integer key:map.keySet()) {
			System.out.println("key:"+key+" value:"+map.get(key));
		}
		System.out.println("------------------------------------");
//		方式二：将双列集合转为单列集合
		Set<Entry<Integer, Object>> sets=map.entrySet();
		Iterator it=sets.iterator();
		while(it.hasNext()) {
//			迭代器中的每一个元素都是entry对象
			Entry entry=(Entry) it.next();
			System.out.println("key:"+entry.getKey() +" value:"+entry.getValue());
		}
			
	}

}
