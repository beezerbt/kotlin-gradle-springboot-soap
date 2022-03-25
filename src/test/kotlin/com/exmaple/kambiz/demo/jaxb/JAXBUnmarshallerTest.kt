package com.exmaple.kambiz.demo.jaxb

import com.entity.Book
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
class JAXBUnmarshallerTest {
    @Test
    fun unMarshalBook() {
        val book = BookJAXBUnmarshaller().unMarshall()
        assertNotNull(book)
        if(book is Book) {
            println("book.id  ::"+book.id)
            println("book.name::"+book.name)
        }
    }
}