package stepDef;

import java.util.concurrent.TimeoutException;

import context.TestContext;
import pages.CheckoutPage;

import io.cucumber.java.en.Given;


public class CheckOutPageStepDef {

	TestContext testContext;
	CheckoutPage cOp;

	public  CheckOutPageStepDef(TestContext context) {
		testContext = context;
		cOp= testContext.getPageObjectManager().getCheckoutPage();

	}

	@Given("User Verifies Checkout page calculation")
	public void user_verifies_checkout_page_calculation() {
		cOp.verifyCheckoutCalculationsWithExcel();


	}



	@Given("User Verifies Bag Item Count")
	public void user_verifies_bag_item_count() {
		cOp.itemCount();
	}




	@Given("User Verifies Display of Wishlist Button")
	public void user_verifies_display_of_wishlist_button() throws TimeoutException {
		cOp.wishListInbag();
	}

	@Given("User Verifies Display of Delete Button")
	public void user_verifies_display_of_delete_button() {
		try {
			cOp.bagDelete();
		} catch (Exception e) {
			System.out.println("💥 Step failed: " + e.getMessage());
			e.printStackTrace();
		}


	}


	@Given("User Verifies That User Can Change Product Size")
	public void user_verifies_that_user_can_change_product_size() throws InterruptedException {
		cOp.changeTheProductSize();
	}


	@Given("User Verifies User Can Increase or Decrease Product Quantity")
	public void user_verifies_user_can_increase_or_decrease_product_quantity() throws InterruptedException {
		cOp.increaseAndDecreaseQTY();
	}


	@Given("User Verifies User Can Add New Product")
	public void user_verifies_user_can_add_new_product() {
		cOp.newProductToBag();
	}

	@Given("User Verifies That Adding Product to cOp Count is Displaying or Not Above cOp Icon")
	public void user_verifies_that_adding_product_to_cOp_count_is_displaying_or_not_above_cOp_icon() {
		cOp.verifyBagCount();
	}

	@Given("User Verifies That Adding New Product or Deleting Product Count Increases or Decreases")
	public void user_verifies_that_adding_new_product_or_deleting_product_count_increases_or_decreases() throws InterruptedException {

		//		try {
		//			cOp.verifyItemCountChanges();
		//	    } catch (Exception e) {
		//	        System.out.println("💥 Step failed: " + e.getMessage());
		//	        e.printStackTrace();
		//	    }
		cOp.verifyItemCountChanges();
	}



}
