package labbook;
import java.util.function.*;
public class Lab10Exercise3Main {
	public static void main(String[] args) {
		String username="shreya",password="12345678";
		
		BiPredicate<String,String>predicate = (user,pass)->{
			if(user.equals(username)&&pass.equals(password)) {
				return true;
			}
			else
				return false;
		};
	}
}
