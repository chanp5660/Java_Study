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
```java
import javax.swing.*;  
//JFrame상속
public class SwingExample extends JFrame{//inheriting JFrame  
	//SwingExample 객체 생성하면 JFrame도 포함 되어 있는 것.
	JFrame f;  
	SwingExample(){  
	JButton b=new JButton("click");//create button  
	b.setBounds(130,100,100, 40);  
	          
	add(b);//adding button on frame  
	setSize(400,500);  
	setLayout(null);  
	setVisible(true);  
	}  
	public static void main(String[] args) {  
		new SwingExample();  
	}
}  
```
![프레임 결과](https://user-images.githubusercontent.com/46266247/57265147-1ed04a00-70b1-11e9-9b80-5493e7ed7017.PNG)
