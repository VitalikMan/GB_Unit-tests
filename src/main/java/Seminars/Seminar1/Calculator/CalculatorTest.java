package Seminars.Seminar1.Calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        double purchaseAmount = 100.0;
        int discountAmount = 10;
        double expectedAmountWithDiscount = 90.0;

        double actualAmountWithDiscount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualAmountWithDiscount).isEqualTo(expectedAmountWithDiscount);
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        double purchaseAmount = -100.0;
        int discountAmount = 10;

        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid argument: purchaseAmount and discountAmount must be non-negative numbers");
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscountAmount() {
        double purchaseAmount = 100.0;
        int discountAmount = -10;

        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid argument: purchaseAmount and discountAmount must be non-negative numbers");
    }

    @Test
    public void testCalculateDiscountWithZeroPurchaseAmount() {
        double purchaseAmount = 0.0;
        int discountAmount = 10;
        double expectedAmountWithDiscount = 0.0;

        double actualAmountWithDiscount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualAmountWithDiscount).isEqualTo(expectedAmountWithDiscount);
    }

    @Test
    public void testCalculateDiscountWithZeroDiscountAmount() {
        double purchaseAmount = 100.0;
        int discountAmount = 0;
        double expectedAmountWithDiscount = 100.0;

        double actualAmountWithDiscount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualAmountWithDiscount).isEqualTo(expectedAmountWithDiscount);
    }

    @Test
    public void testCalculateDiscountWithZeroPurchaseAmountAndZeroDiscountAmount() {
        double purchaseAmount = 0.0;
        int discountAmount = 0;
        double expectedAmountWithDiscount = 0.0;

        double actualAmountWithDiscount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualAmountWithDiscount).isEqualTo(expectedAmountWithDiscount);
    }
}