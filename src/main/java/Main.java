import com.fastcampus.javaoop.BubbleSort;
import com.fastcampus.javaoop.Sort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 문제점 1) Main클래스와 BuffleSort클래스 강결합
		//         Main클래스는 Sort가 어떤 클래스인지 알 고 있다.
//		BubbleSort<String> sort = new BubbleSort<>();
		// 문제점 2) 인터페이스를 사용해도 여전히 어떤 Sort 클래스인지 알 고 있다.
		Sort<String> sort = new BubbleSort<>();
		System.out.println(sort.sort(Arrays.asList(args)));
	}
}
