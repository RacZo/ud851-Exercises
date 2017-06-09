package com.example.android.waitlist.data;

public class WaitlistContract {

    private WaitlistContract() {

    }

    public class WaitListEntry {

        public static final String TABLE_NAME = "waitlist";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_PARTY_SIZE = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";

    }

}
