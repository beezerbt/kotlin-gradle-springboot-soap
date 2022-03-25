package com.example.kambiz.demo.spring.oxm

import com.exmaple.kambiz.demo.jaxb.BookJAXBMarshaller
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class OXMMarshallerTest {
    @Test
    fun givenBookOXMMarshaller_wheWeCreateOne_thenItIsSuccessful() {
        val oXMMarshaller = OXMMarshaller()
        Assertions.assertNotNull(oXMMarshaller.getCastorMarshaller())
    }

    @Test
    fun marshalBook() {
        val bookOXMMarshalling = BookOXMMarshalling()
        bookOXMMarshalling.marshal()
        val outputFile = File("C:\\temp\\oxm_book.xml")
        Assertions.assertTrue(outputFile.exists())
        outputFile.forEachLine { println(it) }
    }

}