

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@javax.persistence.Table(name="student")
public class Stu {
	@Id
private int stu_id;
private String stu_name;
public Stu() {
	
}
public int getStu_id() {
	return stu_id;
}
public void setStu_id(int stu_id) {
	this.stu_id = stu_id;
}
public String getStu_name() {
	return stu_name;
}
public void setStu_name(String stu_name) {
	this.stu_name = stu_name;
}
public Stu(int stu_id, String stu_name) {
	super();
	this.stu_id = stu_id;
	this.stu_name = stu_name;
}
@Override
public String toString() {
	return "Stu[stu_id=" + stu_id + ", stu_name=" + stu_name + "]";
}

	
}
