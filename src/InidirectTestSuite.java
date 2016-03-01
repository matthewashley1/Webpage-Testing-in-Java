import junit.framework.Test;
import junit.framework.TestSuite;

public class InidirectTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(LinkTesting.class);
    suite.addTestSuite(JavascriptTesting.class);
    suite.addTestSuite(DatebaseFirstNameTesting.class);
    suite.addTestSuite(DatebaseLastNameTesting.class);
    suite.addTestSuite(DatebaseDepartmentTesting.class);
    suite.addTestSuite(DatebaseLocationTesting.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
