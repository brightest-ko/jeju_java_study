package temp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//어노테이션 생성할 때 @interface 사용. -호출하는 쪽에 메세지를 전달할 때 사용
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintStars{
	

}

//패키지가 있으니가 javac -d C:\A\ PrintStars.java