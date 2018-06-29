package org.np.ContactHigh.Config

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter
import org.springframework.http.MediaType

import org.np.ContactHigh.Model.*;

@Configuration
class RepositoryConfig : RepositoryRestConfigurerAdapter() {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.setBasePath("/api")
        config.setDefaultMediaType(MediaType.APPLICATION_JSON)
        config.exposeIdsFor(ContactHighFriendEntry::class.java)
        config.exposeIdsFor(ContactHighUser::class.java)
    }
}