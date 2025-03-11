package com.store.services

import java.util.concurrent.atomic.AtomicInteger

class AtomicIdService {
    companion object {
        private val atomicInt: AtomicInteger = AtomicInteger(1)

        @JvmStatic
        fun getNext(): Int {
            return atomicInt.getAndIncrement()
        }
    }
}