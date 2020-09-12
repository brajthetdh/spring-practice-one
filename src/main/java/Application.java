import practice.service.UserService;
import practice.service.UserServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 UserService userService = new UserServiceImpl();
		 
		 System.out.println(userService.findAll().get(0).getFirstName());

	}

}
