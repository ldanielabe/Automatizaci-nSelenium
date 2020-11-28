package Formularios;


import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class TestClassParallel {
	
	@Test
	public void test() {
		@SuppressWarnings("rawtypes")
		Class[] cls = { AllTests.class, AllTestsSimcard.class };
		JUnitCore.runClasses(ParallelComputer.classes(), new Class[]{AllTests.class, AllTestsSimcard.class});
		// Parallel among classes
		//JUnitCore.runClasses(ParallelComputer.classes(), cls);

		System.out.println("----------------------------");
		
		// Parallel among methods in a class
		//JUnitCore.runClasses(ParallelComputer.methods(), cls);

		//System.out.println("----------------------------");
		
		// Parallel all methods in all classes
		
		JUnitCore.runClasses(new ParallelComputer(true, false), cls);
	}
}
