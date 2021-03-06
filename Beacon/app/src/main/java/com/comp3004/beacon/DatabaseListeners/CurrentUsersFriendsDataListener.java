package com.comp3004.beacon.DatabaseListeners;

import com.comp3004.beacon.User.BeaconUser;
import com.comp3004.beacon.User.CurrentBeaconUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by julianclayton on 16-10-04.
 */
public class CurrentUsersFriendsDataListener implements ValueEventListener {


    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        BeaconUser beaconUser = dataSnapshot.getValue(BeaconUser.class);
        CurrentBeaconUser.getInstance().setCurrentBeaconUser(beaconUser);

     

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }

}
