package com.example.kambiz.demo.kotlinws

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension

@ActiveProfiles("test")
@ExtendWith(SpringExtension::class)
@ContextConfiguration(classes = [CobClientTestConfig::class])
class CobClientTestConfigTest {

    @Autowired
    private val marshmallow: String? = null

    @Autowired
    private val marshaller: Jaxb2Marshaller? = null

    @Test
    fun contextLoads() {
        Assertions.assertNotNull(marshmallow)
        Assertions.assertNotNull(marshaller)
    }
}