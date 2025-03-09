package com.store.validators

import com.store.annotations.TextOnly
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class TextOnlyValidator : ConstraintValidator<TextOnly?, String?> {
    override fun isValid(value: String?, context: ConstraintValidatorContext): Boolean {
        return value != null && !value.matches(INVALID_PATTERN.toRegex())
    }

    companion object {
        private const val INVALID_PATTERN = ".*\\d.*|(?i)\\b(true|false)\\b"
    }
}