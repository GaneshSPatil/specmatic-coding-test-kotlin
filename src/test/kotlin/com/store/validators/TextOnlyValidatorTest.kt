package com.store.validators

import jakarta.validation.ConstraintValidatorContext
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class TextOnlyValidatorTest {
    private val validator: TextOnlyValidator = TextOnlyValidator()
    private val context: ConstraintValidatorContext = Mockito.mock(ConstraintValidatorContext::class.java)

    @Test
    fun `should return true for string values`() {
        assertTrue(validator.isValid("text", context))
        assertTrue(validator.isValid("name", context))
        assertTrue(validator.isValid("product", context))
    }

    @Test
    fun `should return false for numeric values`() {
        assertFalse(validator.isValid("1", context))
        assertFalse(validator.isValid("0", context))
        assertFalse(validator.isValid("123", context))
    }

    @Test
    fun `should return false for boolean values`() {
        assertFalse(validator.isValid("true", context))
        assertFalse(validator.isValid("false", context))
    }

    @Test
    fun `should return false for null values`() {
        assertFalse(validator.isValid(null, context))
    }
}