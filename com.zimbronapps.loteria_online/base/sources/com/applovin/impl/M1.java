package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final com.applovin.impl.sdk.k a;
    private final f0 b;
    private final Sensor c;
    private final a d;
    private float e;

    public interface a {
        void a();

        void b();
    }

    public m1(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        f0 f0Var = new f0();
        this.b = f0Var;
        this.c = f0Var.a(1);
        this.d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean((String) this.a.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.b.b(this);
        this.b.b(this, this.c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.a.O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.b.b(this);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.b.b(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.e;
            float f2 = (f * 0.5f) + (max * 0.5f);
            this.e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.d.a();
            } else {
                if (f <= -0.8f || f2 >= -0.8f) {
                    return;
                }
                this.d.b();
            }
        }
    }
}
