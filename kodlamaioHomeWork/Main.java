package kodlamaioHomeWork;

public class Main {

	public static void main(String[] args) {
		Lesson lesson1= new Lesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Engin Demiro�","�cretsiz");
		Lesson lesson2= new Lesson("Yaz�l�m Geli�tirici Yerle�tirme Kamp� (Java + React","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Engin Demiro�","�cretsiz");
		Lesson lesson3= new Lesson("Programlamaya Giri� ��in Temel Kurs","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.","Engin Demiro�","�cretsiz");
		
		Lesson[] lessons = {lesson1,lesson2,lesson3};
		for(Lesson lesson: lessons) {
			System.out.println(lesson.name);
		}
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.joinLesson(lesson1);
		lessonManager.joinLesson(lesson1);
		lessonManager.joinLesson(lesson1);
		

	}

}
