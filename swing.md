# How to use Swing in java?

참조사이트(https://www.javatpoint.com/java-jbutton)

# 프레임 관련
```java
import javax.swing.*;  
public class SwingExample {  
  public static void main(String[] args) {  
    //프레임 생성
    JFrame f=new JFrame();

    //버튼생성
    JButton b=new JButton("click");
    b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

    //프레임에 버튼 객체 추가
    f.add(b);//adding button in JFrame

    // 프레임 사이즈 설정
    f.setSize(400,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
  }  
}
```
### 프레임 안에 만들기
```java
import javax.swing.*;  
public class SwingExample {  
	JFrame f;  
  
  //생성자 생성
	SwingExample(){  
  //객체를 생성할 때 프레임 객체 생성
	f=new JFrame();//creating instance of JFrame  
  
  //버튼 생성
	JButton b=new JButton("click");//creating instance of JButton  
	b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
  
	//버튼 추가
	f.add(b);//adding button in JFrame  
	
  // 프레임 사이즈 설정 및 보이기
	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
}  
  
public static void main(String[] args) {  
  //객체 생성 => 자동으로 프레임 
	new SwingExample();  
	}  
}  

```
### 프레임 상속해서 만들기
