import com.softhinkers.annotations.JunitAnnotation;
import com.softhinkers.assertions.TestAssertions;
import com.softhinkers.bizlogic.TestEmpBussinessLogic;
import com.softhinkers.executionprocedure.ExecutionProcedureJunit;
import com.softhinkers.messageutil.TestMessageUtil;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertions.class, ExecutionProcedureJunit.class,
                TestEmpBussinessLogic.class, JunitAnnotation.class, TestMessageUtil.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}

