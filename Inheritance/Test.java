package Inheritance;

public class Test {
	public static void main(String ar[]) {
		Student ss =new Student();
		ss.setRollno(52);
		ss.setAge(23);
		ss.setCourse("B.tech");
		ss.setName("Kunal Shah");
		ss.setAddress("Haryana");
		System.out.println("Student Details are : \n");
		System.out.println("Student Name is : "+ss.getName()+"\nStudent Age is : "+ss.getAge()+"\nStudent course is :"+ss.getCourse()+"\nStudent address is : "+ss.getAddress()
		+"\nStudent Rollno is : "+ ss.getRollno());
		System.out.println("***********************************************************************");
		Teacher t =new Teacher();
		t.setAddress("Bangali chouraha");
		t.setAge(36);
		t.setName("Parvati");
		t.setSalary(55000);
		t.setSubject("Chemistry");
		System.out.println("Teacher Details are : ");
		System.out.println("Teacher Name is: "+t.getName()+"\nTeacher age is : "+t.getAge()+"\nTeacher address is : "+t.getAddress()+"\nTeacher Subject is : "+t.getSubject()+
				"\nTeacher Salary is : "+t.getSalary());
		System.out.println("***********************************************************************");
		Businessman b=new Businessman();
		b.setName("Gautam Adani");
		b.setAge(60);
		b.setAssets("11 lakh crore");
		b.setLiablity("5 lakh crore");
		b.setCompany("Adani Enterprises");
		System.out.println("Businessman Details are : ");
		System.out.println("Businessman Name is : "+b.getName()+"\nBusinessman Age is : "+b.getAge()+"\nBusinessman Company is : " +b.getCompany()+"\nBusinessman Assets is : " 
				+b.getAssets()+"\nBusinessman liablity is : "+b.getLiablity());
	}
}
