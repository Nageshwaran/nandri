package java4s;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "student")
public class Student {
    @XmlElement
	private int id;
	@XmlElement
	private int age;

	// Must have no-argument constructor
	public Student() {

	}

	public Student( int id, int age) {
		
		this.age = age;
		this.id = id;
	}

	

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return new StringBuffer(" Age : ").append(this.age).append(" ID : ")
				.append(this.id).toString();
	}

}
