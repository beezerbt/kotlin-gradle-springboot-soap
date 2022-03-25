import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("java")
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
}

group = "com.example.kambiz"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web-services")
	//The following 3 are NEEDED for the tests to be able to resolve against JAXB
	implementation("javax.xml.bind:jaxb-api:2.3.0")
	implementation("javax.activation:activation:1.1")
	implementation("org.glassfish.jaxb:jaxb-runtime:2.3.0")
	//implementation("org.jetbrains.kotlin:kotlin-reflect")
	//implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("junit:junit:4.13.1")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.mockito:mockito-junit-jupiter:4.3.1")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
