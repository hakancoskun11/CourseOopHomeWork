package kodlamaioHomeWork;

public class Main {

	public static void main(String[] args) {
		Lesson lesson1= new Lesson("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Engin Demiroð","Ücretsiz");
		Lesson lesson2= new Lesson("Yazýlým Geliþtirici Yerleþtirme Kampý (Java + React","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Engin Demiroð","Ücretsiz");
		Lesson lesson3= new Lesson("Programlamaya Giriþ Ýçin Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.","Engin Demiroð","Ücretsiz");
		
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
