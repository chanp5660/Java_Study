### 멀티 프로세스
프로세스 : 프로그램이 실행상태에 있는 것을 뜻한다.
일반적으로 프로그램 코드가 있으면 cpu는 코드를 하나하나 실행가면서 프로그램에 정의되어 있는 변수들을 값들을 계속해서 바꿔나가게 된다.
시간이 지남에 따라서 **프로세스는 상태를 가지게 되는데 cpu에 의해서 변경된 변수들의 집합이다.** 
마지막 프로그래머가 원하는 상태가 되면 프로그램이 끝나게 된다.

일반적으로 하나의 cpu를 가지고 여러개의 프로그램들을 시간에 따라서 실행을 시켜서 프로세스를 만들다가 그게 다른 프로그램을 건너가서 다른 프로세스를 만들게 된다.
그러면 cpu가 너무 빨라서 동시에 여러개의 프로세스가 만들어져서 동시에 실행되는 것처럼 보인다.

### 멀티 쓰레드
멀티 프로세스가 각자 다른 코드를 가지고 각자의 자기 일을 하게 되면 큰 문제는 없는데 두개 이상의 프로세스가 공통된 자원을 가지고 작업을 할때
또는 하나의 코드를 다른 시간으로 두개의 프로세스를 다룰 때 따라서 두 개의 프로세스가 각자의 상태를 가지고 있게 된다. 
그러면서 코드를 공유하는 프로세스가 자원을 공유하게 될때 우리는 상당히 많은 문제가 생긴다. 
어떤 프로세스가 먼저 실행되느냐에 따라 결과 값이 달라질 수 있다. 
즉, 동기화 문제(synchronization)가 발생한다.(나중에 운영체제 시간에 배움)

### 멀티 프로세스와 멀티 쓰레드의 차이점
하나의 프로세스는 하나의 프로그램을 단위로 실행된다고 생각할 수 있다. 
예를 들어서 어떤 프로세스 안에서 함수를 부른 다음에는 보통 함수가 실행되기를 기다린다.
함수가 실행이 되면 그 다음 단계를 수행하게 된다.

하나의 프로세스 안에서 함수를 호출한 다음에 병렬로 새로운 하나의 프로세스에서 쓰레드를 만들었다라고 한다.
그리고 그 쓰레드는 하나의 프로세스 안에서 여러개를 만들 수 있다. 이게 멀티 프로세스와 멀티 쓰레드의 차이다.

멀티 쓰레드는 멀티 프로세스에 비해 상당한 이점을 가진다.
- 컨텍스트 스위칭 시에 공유 메모리 만큼의 시간(자원) 손실이 줄어든다. : 프로세스 간의 


### JVM 이란? [참조 사이트](https://medium.com/@lazysoul/jvm-%EC%9D%B4%EB%9E%80-c142b01571f2)
Java Virtual Machine의 줄임말이며 Java Byte Code를 OS에 맞게 해석 해주는 역할을 합니다.
Java compiler는 .java 파일을 .class라는 Java Byte code로 변환시켜줍니다.
또 Byte Code는 기계어가 아니기 때문에 OS에서 바로 실행되지 않습니다.
이때 JVM은 OS가 ByteCode를 이해할 수 있도록 해석 해줍니다.
하지만 JVM의 해석을 거치기 떄문에 c언어 같은 네이티브 언어에 비해 속도가 느렸지만 JIT(Just In Time)컴파일러를 구현해 이점을 극복했습니다.
Byte Code는 JVM위에서 OS상관없이 실행된다.
이런 점이 Java의 가장 큰 장점이라고 할수 있습니다. OS에 종속적이지 않고 Java파일 하나만 만들면 어느 디바이스든 JVM 위에서 실행 할 수 있습니다.
JVM은 크게 Class Loader, Runtiome Data Areas, Excution Engine 3가지로 구성되어 있습니다. 

