package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzear extends zzfyq {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzeaq zzi;
    private boolean zzj;

    public zzear(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = R5.t.o().a();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzeaq zzeaqVar) {
        this.zzi = zzeaqVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkz)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        o0.k("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i = o0.b;
                        W5.p.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    o0.k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkz)).booleanValue()) {
            long a = R5.t.o().a();
            if (this.zze + ((Integer) S5.D.c().zzd(zzbhe.zzkB)).intValue() < a) {
                this.zzf = 0;
                this.zze = a;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.zzc;
            zzbgv zzbgvVar = zzbhe.zzkA;
            if (floatValue > f + ((Float) S5.D.c().zzd(zzbgvVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) S5.D.c().zzd(zzbgvVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                o0.k("Flick detected.");
                this.zze = a;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzeaq zzeaqVar = this.zzi;
                if (zzeaqVar != null) {
                    if (i == ((Integer) S5.D.c().zzd(zzbhe.zzkC)).intValue()) {
                        zzebf zzebfVar = (zzebf) zzeaqVar;
                        zzebfVar.zzo(new zzebd(zzebfVar), zzebe.zzc);
                    }
                }
            }
        }
    }
}
