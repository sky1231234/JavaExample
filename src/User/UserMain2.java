package User;

import java.util.List;

public class UserMain2 {

        public static void main(String[] args) {

            UserUI userUI = new UserUI();
            UserDAO userDAO = new UserDAO("/Users/yangs/IdeaProjects/example/users.dat");
//            UserDAO userDAO = new UserDAO("/Users/northtech/IdeaProjects/JavaExample/users.dat");
            //변경된 곳
            UserService userService = new UserServiceInMemory(userDAO.getUsers()) ;

            while (true){
                int menuId = userUI.menu();

                if( menuId == 5 ){
                    System.out.println("종료합니다.");
                    userDAO.saveUser(userService.getUsers());
                    break;
                }else if(menuId == 1){
                    User user = userUI.regMenu();
                    userService.addUser(user);
                    System.out.println("등록되었습니다.");
                }else if(menuId == 2){
                    userUI.printUserList(userService.getUsers());
                }else if(menuId == 3){
                    String email = userUI.inputEmail();

                    boolean isFindEmail = userService.exists(email);

                    if(isFindEmail){
                        User updateUser = userUI.inputUser(email);
                        userService.updateUser(updateUser);
                        System.out.println("수정되었습니다.");

                    }else{
                        System.out.println("수정할 회원 정보가 없습니다.");
                    }
                }else if(menuId == 4){
                    String email = userUI.deleteUser();
                    boolean isFindEmail = userService.exists(email);

                        if(isFindEmail){
                            System.out.println(email + "회원 정보를 삭제합니다.");
                            userService.deleteUser(email);
                        }else{
                            System.out.println("일치하는 회원 정보가 없습니다.");
                        }

                }
            }
        }


    }
;