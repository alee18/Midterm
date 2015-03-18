public class RunProgram {

	static int s = 0;
	public static void main(String[] args){
	Person student = new student("Yu Narukami","503 School Street","547-657-7854","SojiSeta@gmail.com", "sophomore");
	s++;
	Person employee = new Employee("Joe Black", "199 Movie lane", "200-005-4575", "JoeBlack@yahoo.com");
	Person studnet = new student1("Makoto Yuki","21 Jump Street", "547-654-5687","MinatoArisato@hotmail.com", "senior");
	s++;
	System.out.println("Number of student made " + s );
	student = null;
	s--;
	System.out.println("Number of student made " + s );
}
}