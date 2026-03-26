package ex05;

/*
num,name,kor,eng,mat	
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

// 입력:번호,이름,국어,영어,수학
// 		num, name, kor, eng, mat
// 출력:번호 이름 국어 영어 수학 총점 평균 등급
//      num, name, kor, eng, mat, tot, avg, grade	
// 모든 Field 는 private
// 생성자, Getter/Setter, toString 만들어서 작업 

class Score1 {
	// Field
	private int     num;
	private String  name;
	private int     kor;
	private int     eng;
	private int     mat;
	// 출력
	private int     tot;
	private double  avg;
	private char    grade;
	
	// Constructor
	public Score1() {
	}
	
	public Score1(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.tot = getTot();
		this.avg = getAvg();
	}
	

	// method : Getter
	public int getNum() {
		return this.num;	
	}
	public String getName() {
		return this.name;	
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public char getGrade() {
		return grade;
	}
	public int getTot() {
		return kor + eng + mat;
	}
	public double getAvg() {
		// return (kor + eng + mat)/ 3.0;
		return getTot() / 3.0;
	}
	
	// Setter
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}

	
	
	// toString
	@Override
	public String toString() {
		return "Score1 [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}

	public void calc() {
		this.tot   = getTot();
		this.avg   = getAvg();
		this.grade = getGrade();
	}
	static void title() {
		String title = "번호 이름 국어 영어 수학 총점 평균  등급";
		System.out.println( title );		
	}
	 void disp() {
		String fmt   = " %d   %s  %d   %d   %d   %d   %.2f  %c\n";
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
		
	}
}
	
	public class TestScore_1 {
		
		public static void main(String[] args) {
			Score1  sc1  =  new Score1(1,"사나",70,80,90);
			System.out.println( sc1.toString() );
			
			System.out.println( "번호:" + sc1.getNum() );
			System.out.println( "이름:" + sc1.getName() );
			System.out.println( "총점:" + sc1.getTot() );
			System.out.println( "평균:" + sc1.getAvg() );
			
			// Score1  sc2  =  new Score1(2,"모모",0,70,100);
			Score1	sc2  =  new Score1();
			sc2.setNum(2);
			sc2.setName("모모");
			sc2.setKor(0);
			sc2.setEng(70);
			sc2.setMat(100);
			sc2.calc();	// 새로 추가 필요
			
			System.out.println( sc2 ); // 값확인
			sc2.title();
			sc2.disp();
	    }
	}

	      

	


