package PartII_JDBC.JUnitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGetAllCD.class, TestSearchById.class, TestSearchByName.class, TestSearchByNumbersongs.class,
		TestSearchBySinger.class, TestSearchCDByPrice.class })
public class AllTests {

}
