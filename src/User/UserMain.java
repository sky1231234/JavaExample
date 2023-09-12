package User;

import java.util.List;

public class UserMain {
//    public static void main(String[] args) {
//        UserUI userUI = new UserUI();
//        UserDAO userDAO = new UserDAO("/Users/yangs/IdeaProjects/example/users.dat");
//        List<User> users = userDAO.getUsers(); //메모리상에 User정보를 관리한다.
//
//        while (true){
//            int menuId = userUI.menu();
//
//            if( menuId == 5 ){
//                System.out.println("종료합니다.");
////                userDAO.saveUser(users);
//                break;
//            }else if(menuId == 1){
//                User user = userUI.regMenu();
//                users.add(user);
//                System.out.println("등록되었습니다.");
//            }else if(menuId == 2){
//                userUI.printUserList(users);
//            }else if(menuId == 3){
//                String email = userUI.inputEmail();
//
//                int findIndex = -1;
//                for (int i = 0; i < users.size(); i++){
//                    User u = users.get(i);
//                    if (u.getEmail().equals(email)){
//                        findIndex = i;
//                        break;
//                    }
//                }
//
//                if(findIndex != -1){
//                    User updateUser = userUI.inputUser(email);
//                    users.remove(findIndex);
//                    users.add(updateUser);
//                    System.out.println("수정되었습니다.");
//
//                }else{
//                    System.out.println("수정할 회원 정보가 없습니다.");
//                }
//            }else if(menuId == 4){
//                String email = userUI.deleteUser();
//                int deleteIndex = -1;
//
//                for (int i =0; i < users.size(); i++){
//                    User u = users.get(i);
//                    if (u.getEmail().equals(email)){
//                        deleteIndex = i;
//                        break;
//                    }
//
//                    if(deleteIndex != -1){
//                        System.out.println(email + "회원 정보를 삭제합니다.");
//                        users.remove(deleteIndex);
//                    }else{
//                        System.out.println("일치하는 회원 정보가 없습니다.");
//                    }
//                }
//            }
//        }
//
//    }
}
