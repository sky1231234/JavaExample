public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        switch (day){
//case 다음에는 Day가 가지고 있는 상수의 이름이 나와야함
//            case 다음에 Day.SUNDAY 라고 사용하면 컴파일 오류 발생
            case MONDAY :
                System.out.println("월요일입니다.");
                break;
            case SUNDAY :
                System.out.println("일요일입니다.");
                break;
            default:
                System.out.println("그 밖의 요일");
        }
    }
}



