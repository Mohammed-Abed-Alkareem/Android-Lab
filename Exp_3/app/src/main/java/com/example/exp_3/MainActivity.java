package com.example.exp_3;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;


public class MainActivity extends AppCompatActivity {

    private static final String MY_CHANNEL_ID = "my_chanel_1";
    private static final String MY_CHANNEL_NAME = "My channel";
    private static final int NOTIFICATION_ID = 123;
    private static final String NOTIFICATION_TITLE = "Notification Title";
    private static final String NOTIFICATION_BODY = "This is the body of my notification";


    //////////////////Toast Text////////////////////////////////////////////////
    private static final String TOAST_TEXT = "This my toast message";
    /////////////////////////////////////////////////////////////////////////////



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /////////buttons for dial, gmail, maps, notification, toast/////////////////////

        Button dialButton = findViewById(R.id.button_dial);
        Button gmailButton = findViewById(R.id.button_mail);
        Button mapsButton = findViewById(R.id.button_maps);
        Button notificationButton = findViewById(R.id.button_notification);
        Button toastButton = findViewById(R.id.button_toast);
        /////////////////////////////////////////////////////////////////////////////


        //////////////////Dial Button////////////////////////////////////////////////
        dialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:+9725"));
                startActivity(dialIntent);
            }
        });
        /////////////////////////////////////////////////////////////////////////////


        //////////////////Gmail Button///////////////////////////////////////////////
        gmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent gmailIntent =new Intent();
                gmailIntent.setAction(Intent.ACTION_SENDTO);
                gmailIntent.setType("message/rfc822");
                gmailIntent.setData(Uri.parse("mailto:"));
                gmailIntent.putExtra(Intent.EXTRA_EMAIL, new String []{"rajaie.imseeh@gmail.com"});
                gmailIntent.putExtra(Intent.EXTRA_SUBJECT,"My Subject");
                gmailIntent.putExtra(Intent.EXTRA_TEXT,"Content of the message");
                startActivity(gmailIntent);
            }
        });
        /////////////////////////////////////////////////////////////////////////////


        //////////////////Maps Button///////////////////////////////////////////////
        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapsIntent =new Intent();
                mapsIntent.setAction(Intent.ACTION_VIEW);
                mapsIntent.setData(Uri.parse("geo:19.076,72.8777"));
                startActivity(mapsIntent);
            }
        });
        /////////////////////////////////////////////////////////////////////////////


        //////////////////Notification Button///////////////////////////////////////

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNotification(NOTIFICATION_TITLE,NOTIFICATION_BODY);
            }
        });

        /////////////////////////////////////////////////////////////////////////////


        //////////////////Toast Button///////////////////////////////////////////////
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast =Toast.makeText(MainActivity.this, TOAST_TEXT,Toast.LENGTH_SHORT);
                toast.show();
            }
        /////////////////////////////////////////////////////////////////////////

        });

    }

    //////////////////Notification methods/////////////////////////////////

    private void createNotificationChannel() {
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        NotificationChannel channel = new NotificationChannel(MY_CHANNEL_ID, MY_CHANNEL_NAME, importance);
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(channel);
        }
    }
    public void createNotification(String title, String body) {
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        createNotificationChannel();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, MY_CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(title).setContentText(body).setStyle(new NotificationCompat.BigTextStyle().bigText(body)).setPriority(NotificationCompat.PRIORITY_DEFAULT).setContentIntent(pendingIntent);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManager.notify(NOTIFICATION_ID, builder.build()); }
    /////////////////////////////////////////////////////////////////////////////

}