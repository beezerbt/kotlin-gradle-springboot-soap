package com.example.kambiz.demo.kotlinws

import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

@Profile("test")
@Configuration
class MarshallerITonfig {
    /*@Bean
    @Primary
    fun marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath =
            "bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1"
        return marshaller
    }*/
    @Bean
    @Primary
    fun marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        val packagesToScan = arrayOf("bc.web.api.capability.business.b010_02")
        marshaller.setPackagesToScan(*packagesToScan)
        return marshaller
    }
}