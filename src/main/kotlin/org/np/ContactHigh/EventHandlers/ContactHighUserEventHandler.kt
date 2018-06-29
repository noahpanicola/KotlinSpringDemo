package org.np.ContactHigh.EventHandlers

import org.np.ContactHigh.Model.ContactHighUser
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.stereotype.Component

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Component
@RepositoryEventHandler
class ContactHighUserEventHandler {

    private val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @HandleBeforeCreate(value = [ContactHighUser::class])
    fun handleBeforeCreate (user: ContactHighUser) {
        log.info("Saving (New User) ${user.getFullName()} to Database.")
    }

}