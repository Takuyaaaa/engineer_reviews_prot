package com.engineer_reviews.model.book.valu_objects

class BookPrice(val value: Int) {

    init {
        if (value < 0) {
            throw Exception("VALIDATE FAILED")
        }
    }
}