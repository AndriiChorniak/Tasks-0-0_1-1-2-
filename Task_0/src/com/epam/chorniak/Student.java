package com.epam.chorniak;



public class Student {
	private int id;
	private String lastName;
	private String firstName;
	
	private String date;
	private String address;
	private int phone;
	private String faculty;
	private int course;
	private String group;

	public Student(int id, String lastName, String firstName,
			 String date, String address, int phone,
			String faculty, int course, String group) {
		super();
		if (id >=0 )
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		
		this.date = date;
		this.address = address;
		if (phone >= 0)
		this.phone = phone;
		this.faculty = faculty;
		if (course > 0)
		this.course = course;
		this.group = group;
	}
	public Student(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 0)
			this.id = id;
		else
			System.out.println("Input correct id");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if ((lastName == null) || (lastName == "") || (lastName == " "))
			System.out.println("Input correct lastName");
		else
			this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if ((firstName == null) || (firstName == "") || (firstName == " "))
			System.out.println("Input correct firstName");
		else
			this.firstName = firstName;
	}

	
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		if ((date == null) || (date == "") || (date == " "))
			System.out.println("Input correct date");
		else
			this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if ((address == null) || (address == "") || (address == " "))
			System.out.println("Input correct address");
		else
			this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		if (phone >= 0)
			this.phone = phone;
		else
			System.out.println("Input correct phone");
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		if ((faculty == null) || (faculty == "") || (faculty == " "))
			System.out.println("Input correct faculty");
		else
			this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		if (course > 0)
			this.course = course;
		else
			System.out.println("Input correct course");

	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		if ((group == null) || (group == "") || (group == " "))
			System.out.println("Input correct group");
		else
			this.group = group;
	}

	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastName + ", firstName="
				+ firstName + ", date=" + date
				+ ", address=" + address + ", phone=" + phone + ", faculty="
				+ faculty + ", course=" + course + ", group=" + group + "]";
	}
	
	public void findFaculty(Student[] st, String faculty){
			for (int i = 0; i < st.length; i++){
				if (st[i].getFaculty() == faculty){
					System.out.println(st[i].toString());
				}
			}
		 
	}
	
	public void findFaculty(Student[] st, String faculty, int course){
		for (int i = 0; i < st.length; i++){
			if ((st[i].getFaculty() == faculty) && (st[i].getCourse() == course)){
				System.out.println(st[i].toString());
			}
		}
	 
}
	
	public void findGroup(Student[] st, String group){
		for (int i = 0; i < st.length; i++){
			if (st[i].getGroup() == group){
				System.out.println(st[i].toString());
			}
		}
	 
}
	public void afterYear(Student[] st, String date){
		String[] str = date.split("[.]+");
		int year = Integer.parseInt(str[2]);
		for (int i = 0; i < st.length; i++){
			String[] currentDate = st[i].getDate().split("[.]+");
			int currentYear = Integer.parseInt(currentDate[2]);
			if (currentYear > year){
				System.out.println(st[i].toString());
			}
				
		}
	}
	
	
	
	

}
