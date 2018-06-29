package org.np.ContactHigh.Model

import javax.persistence.*

@Entity
@Table(name = "ch_friend_entry")
class ContactHighFriendEntry() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ch_friend_entry_id") val id: Long? = null

    @Column(name = "requester_user_id") val requesterUserId: Long = -1
    @Column(name = "receiver_user_id") val receiverUserId: Long = -1
    @Column(name = "is_active") val isActive: Boolean? = null
    @Column(name = "is_accepted") val isAccepted: Boolean? = null

}