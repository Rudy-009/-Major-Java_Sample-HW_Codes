접근자

1. Class

   1. Public

      다른 모든 클래스가 접근 가능

   2. Default(package private)

      같은 패키지 내에 있는 클래스에서만 접근 가능

   

2. Member

   1. Default

      같은 패키지 내의 다른 클래스만 접근 가능

   2. Public

      패키지 맴버에 관련없이 모든 클래스에서 접근가능

   3. Private

      클래스 내에서만 접근가능

      상속 받은 하위 클래스에서도 접근 불가능

      (접근 가능한 방법이 따로 있다  /public/protected  메소드 이용)

   4. Protected

      같은 패키지 내의 다른 모든 클래스에서 접근가능

      상속받은 하위 클래스는 다른 패키지에 있어도 접근가능



​		5. Static 맴버와 Non-Static 맴버	

|             | non-static 멤버                                              | static 멤버                                                  |
| :---------: | ------------------------------------------------------------ | ------------------------------------------------------------ |
|    선언     | class Sample{<br />  int n<br />  void g(){...}<br />}       | class Sample{<br />  static int n<br />  static void g(){...}<br />} |
| 공간적 특징 | 맴버는 객체마다 별도로 존재<br />* 인스턴스 멤버라고 부름    | 멤버는 클래스당 하나 생성<br />* 멤버는 객체 내부가 아닌 별도의 공간 생성<br />*클래스 멤버라고도 부름 |
| 시간적 특징 | 객체가 생성될 때 생성<br />객체 생성 후 멤버 사용 가능<br />객체가 사라지면 멤버도 사라짐<br /> | 객체가 생성되기 전에 이미 생성<br />객체가 생기기 전에 사용 가능<br />객체가 사라져도 멤버는 사라지지 않음<br />프로그램이 종료될 때 사라짐 |
| 공유의 특성 | 공유되지 않음                                                | 동일한 클래스의 모든 객체들에 의해 공유됨                    |

​			제약조건 1-1 ) static method 는 오직 static member 만 사용 가능

​			제약조건 1-2 ) static reference를 non-static 메소드에서 생성 불가
​							Cannot make a static reference to the non-static method toDollar(int)

​			제약조건 2 )  static method 는 this 사용 불가



6. final Class & Method

   Class 상속 불가능

   Method 오버라이딩 불가능

7. final Field

   초기에 값 설정 => 변경 불가능



