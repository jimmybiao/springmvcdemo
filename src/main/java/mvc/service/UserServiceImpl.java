package mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mvc.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users=new ArrayList<User>();
		User user1=new User();
		user1.setId(1);
		user1.setName("Jimmy");
		users.add(user1);
		
		User user2=new User();
		user2.setId(2);
		user2.setName("Chris");
		users.add(user2);
		
		return users;
	}

}
