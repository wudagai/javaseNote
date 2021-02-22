package com.nesoft.javase.策略模式;

import java.util.ArrayList;
import java.util.Iterator;

import com.nesoft.javase.entity.Student;

public class StudentDao {
//	制作学生信息数据，相当于从学生表中查询的信息
	public static ArrayList<Student> studentList=new ArrayList<>();
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
	
	public ArrayList<Student> getResult(){
		ArrayList<Student> stuListGrade=new ArrayList<>();
//		查询出成绩大于80的学生信息
		Iterator it=studentList.iterator();
		while(it.hasNext()) {
			Student s=(Student)it.next();
			/*if(80<s.getGrade()) {
				stuListGrade.add(s);
			}*/
			IGrade g=new IGrade() {	
				@Override
				public boolean judge(Double grade) {
					if(80<grade) {
						return true;
					}
					return false;
				}
			};
			if(g.judge(s.getGrade())) {
				stuListGrade.add(s);
			}
		}
		return stuListGrade;

	}
	
	public ArrayList<Student> getResult2(){
		ArrayList<Student> stuListSex=new ArrayList<>();
//		查询出性别是女的学生信息
		Iterator it=studentList.iterator();
		while(it.hasNext()) {
			Student s=(Student)it.next();
			/*if("女".equals(s.getSex())) {
				stuListSex.add(s);
			}*/
			IBase<String> ib=(ss)->{
				if(ss.equals("女")) {
					return true;
				}
				return false;
			};
			if(ib.judge(s.getSex())) {
				stuListSex.add(s);
			}
		}
		return stuListSex;

	}
	
	public ArrayList<Student> getResult1(){
		ArrayList<Student> stuListAge=new ArrayList<>();
//		查询出年龄大于18岁的学生信息
		Iterator it=studentList.iterator();
		while(it.hasNext()) {
			Student s=(Student)it.next();
			/*if(18<s.getAge()) {
				stuListAge.add(s);
			}*/
			AgeImpl<Integer> age=new AgeImpl<>();
			if(age.judge(s.getAge())) {
				stuListAge.add(s);
			}
		}
		return stuListAge;

	}
	public static void main(String[] args) {
		for(Student s:studentList) {
			System.out.println(s);
		}
	}
}
