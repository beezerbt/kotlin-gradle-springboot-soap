package com.example.kambiz.demo.kotlinws

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.oxm.jaxb.Jaxb2Marshaller

@Profile("test")
@Configuration
class MarshallerITonfig {
    @Bean
    @Primary
    fun marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath =
            "bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1"
        return marshaller
    }
}