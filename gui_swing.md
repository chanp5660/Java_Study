# GUI 만들기 (Swing 사용)

참조 [Head First Java: 뇌 회로를 자극하는 자바 학습법(개정판)](http://www.hanbit.co.kr/store/books/look.php?p_code=B9738765259)

## 프레임을 만들고 크기설정, 버튼 추가해서 화면에 보이기
```java
//swing 패키지 연결.
import javax.swing.*;

public class SimpleGui1 {

	public static void main(String[] args) {
		//프레임 설정.
		JFrame frame = new JFrame();
		//버튼 설정.
		JButton button = new JButton("클릭");
		
		//창 종료시 크로그램 종료.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 추가(프레임의 내용 틀에 추가.
		frame.getContentPane().add(button);
		//프레임의 크기 조정(픽셀).
		frame.setSize(300,300);
		//화면에 표시(안 적으면 안 되고 프로그램 종료.
		frame.setVisible(true);
	}
}
```

## 버튼 클릭 시 반응 주는 방법

```java
import javax.swing.*;
//이벤트를 활용하는 패키지 연결. ActionListener ActionEvent
import java.awt.event.*;

// implements ActionListener 추가.
public class SimpleGui2 implements ActionListener{
	JButton button;

	public static void main(String[] args) {
		SimpleGui2 gui = new SimpleGui2();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		button = new JButton("클릭");
		
		//버튼에 등록.(ActionListener을 구현한 클래스만 가능)
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	// ActionListener의  actionPerformed을 작성. 
	//이벤트 발생시 발생할 메소드.
	public void actionPerformed(ActionEvent arg0) {
		button.setText("클릭 해보렸다...");
	}

}
```

## 2D원 그리기

```java

```

##

```java

```

##

```java

```

##

```java

```

##

```java

```

##

```java

```

##

```java

```

##

```java

```

##

```java

```

