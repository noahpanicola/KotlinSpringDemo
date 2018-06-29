/*  Populate ch_user table */
INSERT INTO contact_high.ch_user (first_name, last_name, email, phone, address, password, image_url) VALUES ("admin", "admin", "admin@contacthigh.com", "314-654-3210", "32 West Bay Ave. St. Louis, MO 63109", "root", "adminadmin1.png");
INSERT INTO contact_high.ch_user (first_name, last_name, email, phone, address, password, image_url) VALUES ("Noah", "Panicola", "noahpanicola@gmail.com", "314-769-1277", "1016 Washington Ave. Minneapolis, MN 52314", "root", "noahpanicola2.png");
INSERT INTO contact_high.ch_user (first_name, last_name, email, phone, address, password, image_url) VALUES ("Anthony", "Forsythe", "tonyf@gmail.com", "314-805-3419", "Quarry Ave. St. Paul, MN 63109", "root", "anthonyforsythe3.png");
INSERT INTO contact_high.ch_user (first_name, last_name, email, phone, address, password, image_url) VALUES ("Edward", "Forsythe", "edwardforsythe@gmail.com", "314-805-0527", "508 Williams Ave. Columbia, MO 63109", "root", "edwardforsythe4.png");

/*  Populate ch_friend_entry table */
INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (2, 1);
INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (2, 3);
INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (2, 4);

INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (3, 1);
INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (3, 2);

INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (4, 1);
INSERT INTO contact_high.ch_friend_entry (`requester_user_id`, `receiver_user_id`) VALUES (4, 2);

SET SQL_SAFE_UPDATES = 0;
UPDATE contact_high.ch_friend_entry cfe SET cfe.is_accepted=1 WHERE 1=1;
SET SQL_SAFE_UPDATES = 1;
