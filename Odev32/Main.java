/**
 * ��renci Not Sistemi
 */
import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 21.09.2021
		 */
		
		
		Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ay�e", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("�nek �aban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40,50,60,80);
        s1.isPass();

        Student s2 = new Student("G�d�k Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40,50,75,60);
        s2.isPass();

        Student s3 = new Student("Hayta Kaz�m", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40,90,30,58);
        s3.isPass();

		
		
		
	}

}


