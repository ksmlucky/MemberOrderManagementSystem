package hello.core.singleton;

public class SingletonService {

    //자기 자신을 내부에 프라이빗으로 하나 가지고 있는데 스태틱으로 가지고 있음.
    //이렇게 하면 클래스 레벨에 올라가기 때문에 딱 하나만 존재하게 됨.
    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    //자바 시작할 때 자기 자신 객체를 생성해서 instance에 넣어 놓음
    //2. public으로 열어서 객체 인스터스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance() {
        return instance;
    }

    //3.생성자를 private으로 선언해서 외부에서 new 키워드를
    //사용한 객체 생성을 못하게 막는다.
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
