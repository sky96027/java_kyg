package day11;
//정사각형 클래스 : 직사각형 클래스를 상속
public class Square extends Rect {
	
	int side;
	
	public Square() {
	
		
		//lt는 부모의 멤버변수이지만 private로 되어 있어서 
		//물려 받긴 했지만 직접 접근 불가
		//lt에 값을 수정 => lt의 setter
		//lt = new Point(0, 0);
		//Point tmp = new Point(10, 10);
		//public으로 된 setter를 이용하여 lt에 접근해야함
		//setLt(tmp);
	}
	public Square(Point pt, int side) {
		//pt를 lt에 저장
		//setLt(pt); //lt와 밖에서 알려준 pt를 공유
		Point tmp = new Point(pt);
		setLt(tmp);
		//side를 멤버변수 side에 저장
		this.side = side;
	}
	public void resize(int side) {
		this.side = side;
	}
	@Override
	//Rect에서 물려받은 print() 메소드를 재정의
	public void print() {
		System.out.println("---정사각형---");
		System.out.print("시작점 : ");
		//lt의 print 기능 호출
		//lt의 값을 수정 X => getter
		//lt.print();//접근 권한이 없어서 에러
		getLt().print();
		System.out.println("한 변의 길이 : " + side);
		
	}
}
