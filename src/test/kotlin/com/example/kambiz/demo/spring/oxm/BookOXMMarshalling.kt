package com.example.kambiz.demo.spring.oxm

import com.entity.Book
import java.io.FileOutputStream
import java.io.IOException
import javax.xml.bind.JAXBException
import javax.xml.transform.stream.StreamResult


class BookOXMMarshalling {
    @Throws(JAXBException::class, IOException::class)
    fun marshal() {
        val book = Book()
        book.id = 1L
        book.name = "OXMBook1"
        book.author = "OXMAuthor1"
        val oXMMarshaller = OXMMarshaller()
        var fos: FileOutputStream? = null
        try {
            fos = FileOutputStream("C:\\temp\\oxm_book.xml")
            oXMMarshaller.getCastorMarshaller("com.entity")?.marshal(book, StreamResult(fos))
        } finally {
            fos!!.close()
        }
    }
}