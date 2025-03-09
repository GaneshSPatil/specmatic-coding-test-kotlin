package com.store.annotations

import com.store.validators.TextOnlyValidator
import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [TextOnlyValidator::class])
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class TextOnly(
    val message: String = "Must be a valid text",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)