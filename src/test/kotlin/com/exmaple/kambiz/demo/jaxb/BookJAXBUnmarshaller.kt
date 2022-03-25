package com.exmaple.kambiz.demo.jaxb

import com.entity.Book
import java.io.File
import java.io.IOException
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller

class BookJAXBUnmarshaller {
    @Throws(JAXBException::class, IOException::class)
    fun unMarshall(): Any? {
        val context = JAXBContext.newInstance(Book::class.java)
        val unMar: Unmarshaller = context.createUnmarshaller()
        return unMar.unmarshal(File("C:\\temp\\jaxb_book.xml"))
    }
}