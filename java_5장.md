상속 (inheritance)

​	SuperClass & SubClass

​	Sub extends Super

|                           | default | private | protected | public |
| ------------------------- | :-----: | :-----: | :-------: | :----: |
| 같은 패키지의 클래스      |    O    |    X    |     O     |   O    |
| 다른 패키지의 클래스      |    X    |    X    |     X     |   O    |
| 같은 패키지의 서브 클래스 |    O    |    X    |     O     |   O    |
| 다른 패키지의 서브 클래스 |    X    |    X    |     O     |   O    |



서브 클래스 / 슈퍼 클래스의 생성자 호출과 실행

new에 의해 서브 클래스의 객체가 생성될 때

> 슈퍼클래스 생성자와 서브 클래스 생성자 모두 실행됨
>
> 호출 순서
> 서브클래스의 생성자가 먼저 호출 서브클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출
>
> 실행 순서
> 슈퍼클래스의 생성자가 먼저 실행된 후 서브클래스의 생성자 실행
>
> super(알맞은 매개변수) 를 이용한 수퍼 클래스 생성자 선택



Upcasting (업캐스팅) (자동)

​	서브 클래스의 레퍼런스 값을 슈퍼 클래스 레퍼런스에 대입

Downcasting (다운캐스팅) (다운)

​	슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입





instanceof 연산자와 객체 타입 구별

