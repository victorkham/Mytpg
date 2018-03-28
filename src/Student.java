public class Student implements Comparable<Student>{

	Integer id;
	String name;
	double gpa;

	public Student(Integer id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return  name + "\n";
	}

	@Override
	public int compareTo(Student s){
		if(Double.compare(gpa, s.getGpa())!=0){
        	return Double.valueOf(gpa).compareTo(s.getGpa());
        }
        
        return s.getId().compareTo(id);
   }
}
