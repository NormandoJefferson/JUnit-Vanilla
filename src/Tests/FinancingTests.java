package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void ConstructorShouldCreateObjectWhenValidData() {

		Financing f = new Financing(100_000.0, 2000.0, 80);

		// assertions
		Assertions.assertEquals(100_000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	@Test
	public void ConstructorShouldThowsIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100_000.0, 2000.0, 20);
		});
	}

	@Test
	public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {

		// arrange
		Financing f = new Financing(100_000.0, 2000.0, 80);

		// action
		f.setTotalAmount(90_000.0);

		// assertions
		Assertions.assertEquals(90_000.0, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThowsIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100_000.0, 2000.0, 80);
			f.setTotalAmount(150_000.0);
		});
	}

	@Test
	public void setIncomeShouldUpdateIncomeWhenValidData() {

		// arrange
		Financing f = new Financing(100_000.0, 2000.0, 80);

		// action
		f.setIncome(3000.0);

		// assertions
		Assertions.assertEquals(3000.0, f.getIncome());
	}

	@Test
	public void setIncomeShouldThowsIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100_000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthshShouldUpdateMonthsWhenValidData() {

		// arrange
		Financing f = new Financing(100_000.0, 2000.0, 80);

		// action
		f.setMonths(81);

		// assertions
		Assertions.assertEquals(81, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThowsIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100_000.0, 2000.0, 80);
			f.setMonths(79);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {

		Financing f = new Financing(100_000.0, 2000.0, 80);

		Assertions.assertEquals(20_000.0, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
	
		Financing f = new Financing(100_000.0, 2000.0, 80);

		Assertions.assertEquals(1000.0, f.quota());
	}
}
