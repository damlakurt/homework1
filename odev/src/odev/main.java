package odev;


public class main {

	public static void main(String[] args) {
		course course1 = new course(1, "C# + Angular", "Engin Demirog");
		
		course1.setId(1);
		course1.setCourseName("C# Angular");
		course1.setEducatorName("Engin Demirog");
		
		course course2= new course(2, "Java Kamp", "Engin Demirog");

	    course2.setId(2);
		course2.setCourseName("Java Kamp");
		course2.setEducatorName("Engin Demirog");
	
		course[] courses = {course1,course2};
		for(course course : courses) {
			System.out.println(course.getCourseName());
			
		}
		
		
		courseManager courseManager =new courseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
	
		
	
	}

}
