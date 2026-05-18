package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzzp {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer.OnSpatializerStateChangedListener zzd;

    public zzzp(Context context, zzaaa zzaaaVar, Boolean bool) {
        AudioManager zza = context == null ? null : zzcj.zza(context);
        if (zza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer a = j3.o.a(zza);
        this.zza = a;
        this.zzb = j3.p.a(a) != 0;
        zzzn zzznVar = new zzzn(this, zzaaaVar);
        this.zzd = zzznVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.zzc = handler;
        Objects.requireNonNull(handler);
        j3.q.a(a, new zzzo(handler), zzznVar);
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return j3.s.a(T.a(spatializer));
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return j3.t.a(T.a(spatializer));
    }

    public final boolean zzd(zzd zzdVar, zzv zzvVar) {
        int i;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i = zzvVar.zzG;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i = zzvVar.zzG;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i = zzvVar.zzG;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzvVar.zzG;
        }
        int zzB = zzfj.zzB(i);
        if (zzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzB);
        int i2 = zzvVar.zzH;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return j3.u.a(T.a(spatializer), zzdVar.zza(), channelMask.build());
    }

    public final void zze() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (onSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        j3.r.a(spatializer, onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages((Object) null);
    }
}
