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
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final int a;
    private final float b;
    private final f0 c;
    private final Sensor d;
    private final Sensor e;
    private final com.applovin.impl.sdk.k f;
    private float[] g;
    private float h;

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f = kVar;
        f0 f0Var = new f0();
        this.c = f0Var;
        this.d = f0Var.a(9);
        this.e = f0Var.a(4);
        this.a = ((Integer) kVar.a(x4.h4)).intValue();
        this.b = ((Float) kVar.a(x4.g4)).floatValue();
    }

    public float a() {
        if (this.g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.h;
    }

    public void c() {
        if (Boolean.parseBoolean((String) this.f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.c.b(this);
        if (((Boolean) this.f.o0().a(x4.e4)).booleanValue()) {
            this.c.b(this, this.d, (int) TimeUnit.MILLISECONDS.toMicros(this.a), this.f.O());
        }
        if (((Boolean) this.f.o0().a(x4.f4)).booleanValue()) {
            this.c.b(this, this.e, (int) TimeUnit.MILLISECONDS.toMicros(this.a), this.f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.c.b(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            c();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.h * this.b;
            this.h = f;
            this.h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
