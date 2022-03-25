package com.example.kambiz.demo.spring.oxm

import org.springframework.oxm.jaxb.Jaxb2Marshaller


class OXMMarshaller {
    fun getCastorMarshaller(pathToScanFor:String): Jaxb2Marshaller? {
        val jaxb2Marshaller = Jaxb2Marshaller()
        jaxb2Marshaller.setPackagesToScan(pathToScanFor)
        val map: MutableMap<String, Any?> = HashMap()
        map["jaxb.formatted.output"] = true
        jaxb2Marshaller.setMarshallerProperties(map)
        return jaxb2Marshaller
    }
}