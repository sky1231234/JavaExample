public class EmptyCommandLineArgumentExam {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println(args.length);

//            status 숫자의 의미
            System.exit(0);
        }

        for (String arg : args
             ) {
            System.out.println(arg);
        }

    }


}

//String[] args = new String[0];
//main(args);

//javac EmptyCommandLineArgumentExam.java;
//java EmptyCommandLineArgumentExam a b c d e  //a,b,c,d,e라는 문자열이 args에 들어가게 됨