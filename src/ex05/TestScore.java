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

class Score {
	private int     num;
	private String  name;
	private int     kor, eng, mat;
	private int     tot;
    private double  avg;
    private char    grade;

	
    public Score(int num, String name, int kor, int eng, int mat) {
        this.num  = num;
        this.name = name;
        this.kor  = kor;
        this.eng  = eng;
        this.mat  = mat;
    

    this.tot = kor + eng + mat;
    this.avg = this.tot / 3.0;

    int   v  =  (int) this.avg / 10;
    switch ( v ) {
        case 10 : 
        case  9 :  this.grade = 'A'; break;
        case  8 :  this.grade = 'B'; break;
        case  7 :  this.grade = 'C'; break;
        case  6 :  this.grade = 'D'; break;
        default :  this.grade = 'F'; break;
    }
}

    public int 	  getNum()   { return num; }
    public String getName()  { return name; }
    public int    getKor()   { return kor; }
    public int    getEng()   { return eng; }
    public int    getMat()   { return mat; }
    public int    getTot()   { return tot; }
    public double getAvg()   { return avg; }
    public char   getGrade() { return grade; }

    public void   setNum(int num)      { this.num = num; }
    public void   setName(String name) { this.name = name; }
    public void   setKor(int kor)      { this.kor = kor; }
    public void   setEng(int eng) 	   { this.eng = eng; }
    public void   setMat(int mat)      { this.mat = mat; }

   
    @Override
    public String toString() {
        return num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" 
               + tot + "\t" + String.format("%.2f", avg) + "\t" + grade; }
}


	public class TestScore {
		public static void main(String[] args) {
	      
	   Score[] sc = new Score[6];
	    sc[0] = new Score(1, "사나", 70, 80, 90);
	    sc[1] = new Score(2, "모모", 0, 70, 100);
	    sc[2] = new Score(3, "쯔위", 70, 90, 90);
	    sc[3] = new Score(4, "정연", 80, 90, 70);
	    sc[4] = new Score(5, "원영", 90, 90, 89);
	    sc[5] = new Score(6, "유진", 100, 100, 100);

	        
	     System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
	     for (int i = 0; i < sc.length; i++) {
	     
	     System.out.println(sc[i].toString());}
	    }
	}
	 
	      

	


