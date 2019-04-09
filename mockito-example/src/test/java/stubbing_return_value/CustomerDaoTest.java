package stubbing_return_value;

import com.ashim.stubbing_return_value.Customer;
import com.ashim.stubbing_return_value.CustomerDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class CustomerDaoTest {

	private CustomerDao dao;

	@Mock
	private EntityManager entityManager;

	@BeforeEach
	void init() {
		this.dao = new CustomerDao(entityManager);
	}

	@Test
	void finding_existing_customer_should_return_customer() {
		// Given
		long expectedId = 10;
		String expectedName = "Ashim Khadka";
		String expectedAddress = "Khadka Bhadrakali";
		Customer expectedCustomer = new Customer(expectedId, expectedName, expectedAddress);

		Mockito.when(entityManager.find(Customer.class, expectedId)).thenReturn(expectedCustomer);

		// When
		Optional<Customer> actualCustomer = dao.findById(expectedId);

		// Then
		assertAll("Find By Id", () -> {
			assertTrue(actualCustomer.isPresent());
			assertEquals(expectedId, actualCustomer.get().getId());
			assertEquals(expectedName, actualCustomer.get().getName());
			assertEquals(expectedAddress, actualCustomer.get().getAddress());
		});
	}

	@Test
	void invoking_mock_with_unexpected_argument_should_return_null() {
		// Given
		long expectedId = 10;

		// When
		Optional<Customer> actualCustomer = dao.findById(expectedId);

		// Then
		assertFalse(actualCustomer.isPresent());
	}

	@Test
	void invoking_mock_with_different_argument_return_different_customers() {
		// Given
		long expectedId = 10;
		String expectedName = "Ashim Khadka";
		String expectedAddress = "Khadka Bhadrakali";
		Customer expectedCustomer = new Customer(expectedId, expectedName, expectedAddress);
	}

}
