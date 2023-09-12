package User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//메모리상에 User정보를 관리하는 클래스
public class UserServiceInMemory implements UserService{
    private List<User> users;

    public UserServiceInMemory(){
        this.users = new ArrayList<>();
    }

    public UserServiceInMemory(List<User> list){
        this.users = list;
    }
    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public boolean updateUser(User user) {
        boolean deleteFlag = deleteUser(user.getEmail());

        if (deleteFlag) {
            users.add(user);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean deleteUser(String email) {
        int findIndex = getFindIndex(email);

        if (findIndex > -1) {
            users.remove(findIndex);
            return true;
        }else{
            return false;
        }
    }

    //필드 user정보를 그대로 리턴할 것이냐? -> 외부에서 리스트 조작할 수도 있음(수정, 삭제)
    //users정보를 복사한 후 정보를 리턴할 것이냐? -> 삭제한 정보도 나올 수 있음
    //읽기전용으로 만들어줌 => 내부에서만 수정 가능
    @Override
    public Iterator<User> getUsers() {
        return users.iterator();
    }

    @Override
    public boolean exists(String email) {

        if (getFindIndex(email) >= 0){
            return true;
        }else{
            return false;
        }
    }

    public int getFindIndex(String email){
        int findIndex = -1;
        for (int i = 0; i < users.size(); i++){
            User u = users.get(i);
            if(u.getEmail().equals(email)){
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }
}
