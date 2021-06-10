

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.CalculateSumImp;
import com.example.demo.DataService;

class SomeDataStub implements DataService {

	@Override
	public int[] getAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}	
}

class SecondImplementation implements DataService{

	@Override
	public int[] getAllData() {
		// TODO Auto-generated method stub
		return new int[] {3,5,7,3};
	}
}

class TestSumUsingService {
	CalculateSumImp calculate = new CalculateSumImp();
	
	@Test
	void TestMysumWithDataService() {
		//fail("Not yet implemented");
		calculate.setDataService(new SomeDataStub());
		int actualResult = calculate.sumUsingService();
		int expectedReult = 6;
		assertEquals(expectedReult, actualResult);
	}
	
	@Test
	void TestMysum_four_number() {
		//fail("Not yet implemented");
		calculate.setDataService(new SecondImplementation());
		int actualResult = calculate.sumUsingService();
		int expectedReult = 18;
		assertEquals(expectedReult, actualResult);
	}

}
