package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
//	private SortService sut = new SortService(new BubbleSort<String>());
	private SortService sut = new SortService(new JavaSort<String>());

	@DisplayName("DI 테스트")
	@Test
	void doSortTest() {
		// [ Given ]


		// [ when ]
		List<String> actual = sut.doSort(Arrays.asList("3", "2", "1"));

		// [ then ]
		assertEquals(Arrays.asList("1", "2", "3"), actual);
	}
}