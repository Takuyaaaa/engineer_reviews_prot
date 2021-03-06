package com.engineer_reviews.model.book

import com.engineer_reviews.model.book.value_objects.*


class Book(
    var title: BookTitle,
    var price: BookPrice,
    var category: BookCategory,
    var reviewScore: BookReviewScore,
    var url: BookUrl,
    var imagePath: BookImagePath
) {

    // TODO: add author field
    // TODO: fetching data from amazon directly by api or crawling
    companion object {
        data class SentData(
            val title: String,
            var price: Int,
            var category: Int,
            var reviewScore: Double,
            var url: String,
            var imagePath: String
        )

        fun new(data: SentData): Book {
            return Book(
                BookTitle(data.title),
                BookPrice(data.price),
                BookCategory(data.category),
                BookReviewScore(data.reviewScore),
                BookUrl(data.url),
                BookImagePath(data.imagePath)
            )
        }
    }

    var id: BookId? = null

    fun isEqual(other: Book): Boolean {
        // if entity is not saved (i.e not having id) return false
        if (this.id === null) {
            return false
        }
        if (other.id === null) {
            return false
        }

        // if both ids are same return true
        return this.id?.value === other.id?.value
    }
}
