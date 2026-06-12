package com.codemanship.refactoring.divergentchange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private final CustomerService service = new CustomerService();

    // -------------------------
    // isValidEmail tests
    // -------------------------

    @Test
    void isValidEmail_shouldReturnFalse_whenEmailIsNull() {
        assertFalse(service.isValidEmail(null));
    }

    @Test
    void isValidEmail_shouldReturnFalse_whenEmailIsEmpty() {
        assertFalse(service.isValidEmail(""));
    }

    @Test
    void isValidEmail_shouldReturnFalse_whenMissingAtSymbol() {
        assertFalse(service.isValidEmail("invalid.email.com"));
    }

    @Test
    void isValidEmail_shouldReturnFalse_whenMissingLocalPart() {
        assertFalse(service.isValidEmail("@domain.com"));
    }

    @Test
    void isValidEmail_shouldReturnFalse_whenMissingDomain() {
        assertFalse(service.isValidEmail("user@"));
    }

    @Test
    void isValidEmail_shouldReturnTrue_whenEmailIsValid() {
        assertTrue(service.isValidEmail("user.name+tag@example.com"));
    }

    @Test
    void isValidEmail_shouldReturnTrue_whenSimpleValidEmail() {
        assertTrue(service.isValidEmail("user@example.com"));
    }

    // -------------------------
    // formatDisplayName tests
    // -------------------------

    @Test
    void formatDisplayName_shouldTrimAndUppercaseLastName() {
        String result = service.formatDisplayName(" John ", " smith ");
        assertEquals("John SMITH", result);
    }

    @Test
    void formatDisplayName_shouldHandleEmptyStrings() {
        String result = service.formatDisplayName("", "");
        assertEquals(" ", result);
    }

    @Test
    void formatDisplayName_shouldHandleSingleCharacterNames() {
        String result = service.formatDisplayName("A", "b");
        assertEquals("A B", result);
    }

    // -------------------------
    // calculateLoyaltyPoints tests
    // -------------------------

    @Test
    void calculateLoyaltyPoints_shouldReturnZero_whenNoPurchases() {
        assertEquals(0, service.calculateLoyaltyPoints(0));
    }

    @Test
    void calculateLoyaltyPoints_shouldCalculateCorrectly_forPositiveValues() {
        assertEquals(50, service.calculateLoyaltyPoints(5));
    }

    @Test
    void calculateLoyaltyPoints_shouldHandleLargeNumbers() {
        assertEquals(100_000, service.calculateLoyaltyPoints(10_000));
    }

    @Test
    void calculateLoyaltyPoints_shouldAllowNegativeValues_butStillMultiply() {
        assertEquals(-50, service.calculateLoyaltyPoints(-5));
    }

    // -------------------------
    // determineAccountStatus tests
    // -------------------------

    @Test
    void determineAccountStatus_shouldReturnInactive_whenDaysOver365() {
        assertEquals("INACTIVE", service.determineAccountStatus(366));
    }

    @Test
    void determineAccountStatus_shouldReturnDormant_whenBetween31And365() {
        assertEquals("DORMANT", service.determineAccountStatus(100));
    }

    @Test
    void determineAccountStatus_shouldReturnActive_when30DaysOrLess() {
        assertEquals("ACTIVE", service.determineAccountStatus(30));
        assertEquals("ACTIVE", service.determineAccountStatus(0));
    }

    @Test
    void determineAccountStatus_shouldTreatNegativeDaysAsActive() {
        assertEquals("ACTIVE", service.determineAccountStatus(-10));
    }
}