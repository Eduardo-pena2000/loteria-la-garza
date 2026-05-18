package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f0 {
    private final SensorManager a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");
    private Handler b;

    public f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public static /* synthetic */ void a(f0 f0Var, SensorEventListener sensorEventListener, Sensor sensor, int i, com.applovin.impl.sdk.o oVar) {
        f0Var.a(sensorEventListener, sensor, i, oVar);
    }

    public static /* synthetic */ void b(f0 f0Var, SensorEventListener sensorEventListener) {
        f0Var.a(sensorEventListener);
    }

    public Sensor a(int i) {
        return this.a.getDefaultSensor(i);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i, com.applovin.impl.sdk.o oVar) {
        this.b.post(new Q0(this, sensorEventListener, sensor, i, oVar));
    }

    private /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i, com.applovin.impl.sdk.o oVar) {
        try {
            this.a.registerListener(sensorEventListener, sensor, i, this.b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        this.b.post(new P0(this, sensorEventListener));
    }

    private /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.a.unregisterListener(sensorEventListener);
    }
}
