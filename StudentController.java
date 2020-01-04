package pkg;

public class StudentController {

	private StudentModel model;    //model class instance
	private StudentView view;    //view class instance
	
	public StudentController(StudentModel model, StudentView view)
	{
		this.model = model;
		this.view = view;
	}
	
	
	public void setStudentDetails()  //recieve request from controller, get input from view, pass it to the model
	{
		model.setRollNo(view.vSetRollNo());
		model.setName(view.vSetName());
	}
	
	
	public String getStudentRollNo()  // this function will get rollNo from model getRollNo function
	{
		return model.getRollNo();
	}
	
	public String getStudentName()  // this function will get Name from model getName function
	{
		return model.getName();
	}
	
	public void updateView() // after Entering the data, it will show on the view
	{
		view.printStudentDetails(model.getRollNo(), model.getName());
	}
}
