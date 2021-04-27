package kodlamaioHomeWork;

public class Lesson {
	String name;
	String description;
	String teacher;
	String price;
	
	public Lesson() {
		System.out.println("Ders olulturuldu!");
	}
	
	public Lesson(String name, String description, String teacher, String price) {
		this.name=name;
		this.description=description;
		this.teacher=teacher;
		this.price=price;
		
	}
	
	
}
