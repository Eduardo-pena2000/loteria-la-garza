package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeci extends zzfyq {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzech zzf;
    private boolean zzg;

    public zzeci(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(zzech zzechVar) {
        this.zzf = zzechVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzku)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = o0.b;
                            W5.p.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = R5.t.o().a() - ((Integer) S5.D.c().zzd(zzbhe.zzkw)).intValue();
                        this.zzg = true;
                        o0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        o0.k("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzku)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((Float) S5.D.c().zzd(zzbhe.zzkv)).floatValue()) {
                long a = R5.t.o().a();
                if (this.zzd + ((Integer) S5.D.c().zzd(zzbhe.zzkw)).intValue() <= a) {
                    if (this.zzd + ((Integer) S5.D.c().zzd(zzbhe.zzkx)).intValue() < a) {
                        this.zze = 0;
                    }
                    o0.k("Shake detected.");
                    this.zzd = a;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzech zzechVar = this.zzf;
                    if (zzechVar != null) {
                        if (i == ((Integer) S5.D.c().zzd(zzbhe.zzky)).intValue()) {
                            zzebf zzebfVar = (zzebf) zzechVar;
                            zzebfVar.zzo(new zzebc(zzebfVar), zzebe.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
