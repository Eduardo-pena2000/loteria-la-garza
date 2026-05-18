package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfyq implements SensorEventListener {
    public zzfyq(String str, String str2) {
        zzfyp.zza();
        zzfyo.zza();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        zzd(sensorEvent);
    }

    public abstract void zzd(SensorEvent sensorEvent);
}
