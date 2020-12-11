package ggg;

public class Course {

	String name;
	String[] Students=new String[100];
	int number=0;
Course(String name){
	this.name=name;
}
 String getCourseName(){
	return this.name;
}
 void addStudent(String str) {
	Students[this.number]=str;
	this.number++;
}
 void dropStudent(String str) {
	for(int i=0;i<this.number;i++) {
		if(str==this.Students[i]) {
			this.Students=razmestvane(Students,i);
		}
	}
	
}
private String[] razmestvane(String[] str,int m) {
	for(int i=m+1;i<this.number;i++) {
		str[i-1]=str[i];
		
	}
	str[this.number]=null;
	this.number--;
	return str;
}
  int getNumber() {
	return this.number;
}
  String[] getStudents() {
	return this.Students;
}
}
