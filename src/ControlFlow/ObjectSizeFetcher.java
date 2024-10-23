package ControlFlow;

import java.lang.instrument.Instrumentation;

public class ObjectSizeFetcher {
	
	private static Instrumentation instrumentation;

    // The premain method will run before the main method
    public static void premain(String agentArgs, Instrumentation inst) {
        instrumentation = inst;
    }

    // This method returns the size of an object in bytes
    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }

}
