package baseball.member.baseball;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import baseball.member.baseball.web.controller.Sanchic;

@SpringBootTest
class BaseballApplicationTests {
	int a = 10;
	int b = 20;
	int result;
	Sanchic sanchic = new Sanchic();

	@Test
	void addTest() {
		result = sanchic.add(a, b);
		assertEquals(result, sanchic.add(a, b));
	}

	@Test
	void subTest() {
		result = sanchic.sub(a, b);
		assertEquals(result, sanchic.sub(a, b));
	}

	@Test
	void mulTest() {
		result = sanchic.mul(a, b);
		assertEquals(result, sanchic.mul(a, b));
	}

	@Test
	void divTest() {
		result = sanchic.div(a, b);
		assertEquals(result, sanchic.div(a, b));
	}

}
