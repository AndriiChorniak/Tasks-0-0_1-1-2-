package com.epam.chorniak;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student();
		Student[] studs = new Student[7];
		studs[0] = new Student(0, "Chorniak", "Andrii", "13.12.91", "L.Svobody", 0502135075, "TKVT", 5, "IMZs");
		studs[1] = new Student(1, "Kor", "Andrii", "13.11.93", "Lenina", 0662137075, "TKVT", 5, "IMZs");
		studs[2] = new Student(2, "Halush", "Vita", "3.12.90", "L.Svobody", 0502135222, "KN", 6, "KNs");
		studs[3] = new Student(3, "Filip", "Vasia", "13.1.91", "Botan", 0661105000, "KIU", 4, "IMZs");
		studs[4] = new Student(4, "Gus", "Vika", "13.12.91", "L.Svobody", 0502135075, "TKVT", 4, "IMZs");
		studs[5] = new Student(5, "Bim", "Sacha", "10.12.95", "Vokzal", 0507135075, "RT", 2, "RTs");
		studs[6] = new Student(6, "Tymoshenko", "Julia", "13.12.92", "Otakara", 0502111175, "RT", 3, "RTm");
		
		student.findFaculty(studs, "TKVT");
		System.out.println();
		student.findFaculty(studs, "TKVT", 5);
		System.out.println();
		student.findGroup(studs, "IMZs");
		System.out.println();
		student.afterYear(studs, "13.11.93");
		
		
		

	}

}
