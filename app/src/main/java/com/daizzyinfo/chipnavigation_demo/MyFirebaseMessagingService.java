package com.daizzyinfo.chipnavigation_demo;

import static android.provider.Settings.System.getString;
import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {


    public void onMessageReceived(RemoteMessage remoteMessage) {

        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload:----------------------------" + remoteMessage.getData());
            Log.e("MyFirebaseMessagingService", "onResponse" + remoteMessage.getData());


            if (true) {
                // For long-running tasks (10 seconds or more) use WorkManager.


            } else {

                // Handle message within 10 seconds

            }


        }

        // Check if message contains a notification payload.
      /*  if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }


        FirebaseMessaging.getInstance().

                getToken()
                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(@NonNull Task<String> task) {
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "Fetching FCM registration token failed", task.getException());
                            return;
                        }

                        // Get new FCM registration token
                        String token = task.getResult();

                        // Log and toast
                        String msg = getString(R.string.msg_token_fmt, token);
                        Log.d(TAG, msg);
                        // Toast.makeText(MyFirebaseMessagingService.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });*/


    }


}
