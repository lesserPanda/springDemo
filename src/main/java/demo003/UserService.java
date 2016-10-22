package demo003;

import java.util.List;

public interface UserService {
	public void create(UserModel user);
	public UserModel get(String username);
	public void update(UserModel user);
	public void delete(UserModel user);
	public List<UserModel> list();
}
