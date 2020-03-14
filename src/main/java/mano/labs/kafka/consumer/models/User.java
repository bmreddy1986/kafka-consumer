package mano.labs.kafka.consumer.models;

public class User {

	private String name;
	private String email;
	private String dept;
	
	public User(){}
	public User(String name, String email, String dept){
		this.name= name;
		this.email=email;
		this.dept=dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString(){
		return "name:" + name + " email:" + email + " dept:" + dept;
	}
}
