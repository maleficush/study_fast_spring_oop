package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.JavaSort;
import com.fastcampus.javaoop.Sort;

import java.util.List;

public class SortService {
	// DI : 서비스 객체 생성시에만
	//      생성자에서 한번만 셋팅하고 변경하지 않을 것이므로 final 키워드 사용

	private final Sort<String> sort;

	// 생성자 주입방식의 DI
	// > 이제 앞으로 이 클래스는 어떤 Sort클래스를 주입받는 지 모른다.
	public SortService(Sort<String> sort){
		this.sort = sort;
		System.out.println("구현체 : " + this.sort.getClass().getName());
	}

	public List<String> doSort(List<String> list){
//      DI를 사용하여 인터페이스의 구현 클래스를 적용할 수 있게 된다.
//		Sort<String> sort = new JavaSort<>();
		return sort.sort(list);
	}
}
