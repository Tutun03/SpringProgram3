package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {// by @Conmponent anotation we will able to create object of Student class
						// ,object name will be student.
	@Value("aniket")
	private String name;
	@Value("101")
private int rollno;
    @Value("94.23f")
	private float marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}

}
