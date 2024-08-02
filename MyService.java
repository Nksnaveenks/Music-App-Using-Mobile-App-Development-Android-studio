package com.example.music;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.media.MediaPlayer;
import android.provider.*;


public class MyService extends Service {
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {

    return null;

    }
    public int onStartCommand(Intent intent,int flags,int startId){
        mp=MediaPlayer.create(this,R.raw.song1);
        //mp.setLooping(true);
        mp.start();
        return  START_STICKY;
    }
    public void onDestroy()
    {
        super.onDestroy();
        mp.stop();
    }
}
