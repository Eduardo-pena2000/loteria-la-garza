package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzrj {
    void zzA();

    void zzB();

    default void zzC() {
    }

    void zza(zzrg zzrgVar);

    default void zzb(zzpq zzpqVar) {
    }

    default void zzc(zzdn zzdnVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzpz zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z);

    void zzh(zzv zzvVar, int i, int[] iArr) throws zzre;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzrf, zzri;

    void zzl() throws zzri;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z);

    void zzr(zzd zzdVar);

    void zzs(int i);

    void zzt(zze zzeVar);

    default void zzu(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzv(int i) {
    }

    long zzw();

    default void zzx(int i, int i2) {
    }

    void zzy(float f);

    void zzz();
}
