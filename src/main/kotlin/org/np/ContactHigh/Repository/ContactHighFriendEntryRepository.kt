package org.np.ContactHigh.Repository

import org.np.ContactHigh.Model.ContactHighFriendEntry
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "/friend_entry", itemResourceRel = "/friend_entry")
interface ContactHighFriendEntryRepository : PagingAndSortingRepository<ContactHighFriendEntry, Long>