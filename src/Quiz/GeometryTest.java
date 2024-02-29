package Quiz;

import java.util.function.Function;

// 최상위 추상 클래스 Geometry 생성 ==> 추상 메서드로 면적을 구하는 메서드 선언

// 자식 클래스들 생성 

abstract class Geometry {
	abstract double getArea();
}

class Circle extends Geometry {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Geometry {
	int w;
	int h;

	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}

class Triangle extends Geometry {
	int w;
	int h;
}

public class GeometryTest {

	public static void main(String[] args) {

		Function<Geometry, Double> func = (g) -> {
			return g.getArea();
		};

		System.out.println("원 면적 : " + func.apply(new Circle(5)));
		System.out.println("사각형 면적 : " + func.apply(new Rectangle(5, 10)));
	}
}