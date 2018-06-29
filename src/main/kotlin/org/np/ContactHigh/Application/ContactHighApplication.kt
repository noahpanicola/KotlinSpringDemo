package org.np.ContactHigh.Application

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@SpringBootApplication
@ComponentScan(basePackages = ["org.np.ContactHigh"])
@EnableJpaRepositories(basePackages = ["org.np.ContactHigh.Repository"])
@EntityScan(basePackages = ["org.np.ContactHigh.Model"])
class ContactHighApplication {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(this.javaClass)
        fun printApplicatonHeader(title: String, version: String, author: String){
            logger.info("**************************************")
            logger.info("** $title Application Started.")
            logger.info("** Version: $version")
            logger.info("** Author: $author")
            logger.info("**************************************")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<ContactHighApplication>(*args)
    ContactHighApplication.Companion.printApplicatonHeader("Contact High", "1.0.1", "Noah Panicola")
}
