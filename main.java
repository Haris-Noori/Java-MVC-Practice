package pkg;

public class main {

	public static void main(String args[])
	{
		StudentModel model = new StudentModel();    // model instance
		StudentView view = new StudentView();       // view instance
		StudentController controller = new StudentController(model, view);    // controller instance
		controller.setStudentDetails();
		controller.getStudentRollNo();
		controller.getStudentName();
		
		controller.updateView();
	}
}
