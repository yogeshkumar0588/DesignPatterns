package prototype.design.pattern;

public class ProtoTypePatternMainClass {
	
	public static void main(String[] args) {
		ProfessionCache.loadProfessionCache();
		
		Profession doctorProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(doctorProfession);
		
		Profession enginnerProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(enginnerProfession);
		
		Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacherProfession);
		
		Profession doctorProfession2 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(doctorProfession2);
	}
}
