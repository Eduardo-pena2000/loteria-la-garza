package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzco {
    public static final ByteBuffer zza = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    default long zza(long j) {
        return j;
    }

    zzcl zzb(zzcl zzclVar) throws zzcn;

    boolean zzc();

    void zzd(ByteBuffer byteBuffer);

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    @Deprecated
    default void zzh() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    default void zzi(zzcm zzcmVar) {
        zzh();
    }

    void zzj();
}
