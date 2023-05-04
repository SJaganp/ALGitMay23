//2.Package
package org.testing;

//3.class
public class CourseDetails {

	//4.Method 1
	private void javaCourseInfo() {

		System.out.println("Java class started by May 1");
		System.out.println("Java class time : 8.30am");
	}
	
	//4,.Method 2
	private void pythonCourseInfo() {

		System.out.println("Python class not started..");
	}

	//5.Main method
	public static void main(String[] args) {
		
		//6.Object creation ---Classname objRefname=new Classname();
		CourseDetails cd = new CourseDetails();
		
		//7.Method calling----> objRefname.methodname();
		cd.pythonCourseInfo();
		cd.javaCourseInfo();
		cd.javaCourseInfo();
	}
}




