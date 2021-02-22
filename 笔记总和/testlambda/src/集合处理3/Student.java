package 集合处理3;
/**
 * 
 *  普通的POJO(javaBean):自定义对象
 *  	特点: 属性私有
 *  		提供无参构造方法
 *  		提供公有访问属性的方法
 * 
 * @author Administrator
 *
 */
public class Student {
	private String name;
	private String address;
	private Integer age;
	private String sex;
	private Double grade;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String address, Integer age, String sex, Double grade) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + ", sex=" + sex + ", grade=" + grade
				+ "]";
	}
	
	

}
