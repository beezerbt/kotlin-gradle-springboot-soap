package com.exmaple.kambiz.demo.jaxb

import com.entity.Book
import java.io.File
import java.io.IOException
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException
import javax.xml.bind.Marshaller

class BookJAXBMarshaller {
    @Throws(JAXBException::class, IOException::class)
    fun marshal() {
        val book = Book()
        book.id = 1L
        book.name = "JAXBBook1"
        book.author = "JAXBAuthor1"
        val context = JAXBContext.newInstance(Book::class.java)
        val mar: Marshaller = context.createMarshaller()
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
        mar.marshal(book, File("C:\\temp\\jaxb_book.xml"))
    }
}