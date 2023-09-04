public class User {

    private String email;
    private String password;
    private String name;

    //생성자를 하나라도 만들게 되면 기본생성자가 만들어지지 않는다.
    //다른 곳에서 기본생성자 사용할 수 없음
    public User(String email, String name){
//        this.email = email;
//        this.name = name;
        //this 생성자는 맨 첫줄에 있어야 에러가 나지않음
        this(email, name, null);
    }

    //생성자 오버로딩
    public User(String email, String name, String password){
//        this.email = email;
//        this.name = name;
//        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

