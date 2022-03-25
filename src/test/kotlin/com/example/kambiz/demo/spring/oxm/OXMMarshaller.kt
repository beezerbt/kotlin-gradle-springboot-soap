package com.example.kambiz.demo.spring.oxm

import org.springframework.oxm.jaxb.Jaxb2Marshaller


class OXMMarshaller {
    fun getCastorMarshaller(): Jaxb2Marshaller? {
        val jaxb2Marshaller = Jaxb2Marshaller()
        jaxb2Marshaller.setPackagesToScan("bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1")
        val map: MutableMap<String, Any?> = HashMap()
        map["jaxb.formatted.output"] = true
        jaxb2Marshaller.setMarshallerProperties(map)
        return jaxb2Marshaller
    }
}