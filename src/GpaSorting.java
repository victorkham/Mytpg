import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GpaSorting {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File f = new File("gpa_list.txt");
			Scanner sc = new Scanner(f);

			List<Student> students = new ArrayList<>();
			String line = sc.nextLine();
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				String[] details = line.split(" ");
				int id = Integer.parseInt(details[0]);
				String name = details[1];
				double gpa = Double.parseDouble(details[2]);
				Student s = new Student(id, name, gpa);
				students.add(s);
			}
			Collections.sort(students, (a, b) -> b.compareTo(a));
			for(Student s:students){
				System.out.println(s);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
