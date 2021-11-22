package in.bhavneshit.bhavnesh;

public class Test {

	public static void main(String[] args) {
		try {
			ModuleInfo info = new ModuleInfo("Category", "in.bhavneshit.bhavnesh", Long.class, "D:/outputs");
			EntityGen.generate(info);
			RepositoryGen.generate(info);
			ServiceGen.generate(info);
			CustomExceptionGen.generate(info);
			ServiceImplGen.generate(info);
			ControllerGen.generate(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("STARTED!!");
	}
}
