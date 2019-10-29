package mvc.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mvc.service.UserService;

@ContextConfiguration(locations="classpath*:springmvc.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MvcTest {
	
	@Autowired
	private UserService userService;

}
