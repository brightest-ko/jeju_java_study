package temp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//������̼� ������ �� @interface ���. -ȣ���ϴ� �ʿ� �޼����� ������ �� ���
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintStars{
	

}

//��Ű���� �����ϰ� javac -d C:\A\ PrintStars.java