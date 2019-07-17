/*
객체지향언어란?
객체 지향 언어의 3대 속성
1. 상속성 : 클래스를 상속해서 클래스를 만든다.
2. 은닉성 : 감추고 싶은건 감출 수 있다.
3. 다형성 : 하나의 심볼(이름)

class를 이용하는 세가지 방법
1. 참조형 변수 선언 가능
2. 인스턴스 생성
3. 상속받아 클래스를 선언할 수 있다.
*/
class A{
	int apple = 10;
}

//클래스 B는 클래스 A를 상속하여 만들어졌음을 명시함.
class B extends A{
//	int apple = 10; //상속 : A에서 선언한 멤버 변수와 함수를 물려받겠다
	int add(int i, int j){return 100;}
}
public class Test027{
	public static void main(String[] args){
		B t = new B();  //Q. 참조형 변수 선언 가능한 것과 인스턴스 생성하는 것은 같은 것 아닌가? //인스턴스는 class를 실체화 하는 것이고, 참조형 변수는 그것을 가르키는 기능을 하는 것.
		System.out.println(t.apple);
	}
}
//Q. 에러가 안나는 이유를 설명하시오.
//Aclass에 있는 멤버변수  apple을 Bclass가 상속받음으로서 B인스턴스가 생성될때, Aclass의 apple이라는 멤버변수도 메모리를 할당받는다.
//따라서 위 코드에서 에러가 나지 않는다.