package User;

import java.util.Iterator;
import java.util.List;

public interface UserService {

    //회원정보를 등록하다.
    public void addUser(User user);
    //회원정보를 수정하다. user.getEmail()에 해당하는 회원정보를 수정한다.
    //수정할 데이터를 찾았으면 true,아니면 false
    public boolean updateUser(User user);
    //회원정보를 삭제하다.
    //삭제할 데이터를 찾았으면 true,아니면 false
    public boolean deleteUser(String email);
    //모든 회원정보를 반환하다.
    public Iterator<User> getUserS();

}
