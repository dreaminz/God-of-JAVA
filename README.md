####생각해보기 1
#Q1. 메인에서 메소드들을 호출하고 하려면 객체를 생성했는데, 왜 메소드들간의 참조는 객체생성없이도 가능한것인가 ?
     ->심지어, 다른 메소소들에서도 객체 생성도 가능하다!


#Answer. 
void instanceMethod(){} //인스턴스 메서드
	static void staticMethod(){} // static 메서드

	void instanceMethod2(){ //인스턴스 메서드
		instanceMethod();//다른 인스턴스메서드를 호출한다.
		staticMethod();// static 메서드를 호출한다.
	}

	static void staticMethod2(){//static 메서드
		instanceMethod();// 에러!! 인스턴스메서드를 호출할 수 없다. static 메서드는 같은 클래스 내의 인스턴스 메서드를 호출할 수 없다.
		staticMethod();// static 메서드는 호출할 수 있다.
	}
}// end of class;
