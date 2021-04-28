package odev;


public class course {

	
	public course(int id,String courseName,String educatorName)
	{
		System.out.println("Kurslar Getiriliyor.. (Yapýcý Blok Calýstý)" );
		this.setId(id);
		this.setCourseName(courseName);
		this.setEducatorName(educatorName);
	}
		public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
		public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
		public String getEducatorName() {
		return educatorName;
	}
	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}
		private int id;
		private String courseName;
		private String educatorName;}


	
	
	

	

 


