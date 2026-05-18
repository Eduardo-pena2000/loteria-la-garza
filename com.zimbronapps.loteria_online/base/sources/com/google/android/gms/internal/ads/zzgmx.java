package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgmx implements zzgmu {
    private final zzgoe zza;
    private final long zzb;

    public zzgmx(zzgao zzgaoVar, zzgoe zzgoeVar, long j) {
        this.zza = zzgoeVar;
        this.zzb = j;
    }

    private static boolean zzc(zzgdu zzgduVar) {
        int zza = zzgduVar.zzb().zza().zza();
        int zzb = zzgduVar.zzb().zza().zzb();
        byte[] zza2 = zzatu.zza();
        kotlin.jvm.internal.t.g(zza2, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        kotlin.jvm.internal.t.f(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) zza);
        allocate.putInt(zzb);
        byte[] array = allocate.array();
        kotlin.jvm.internal.t.f(array, "array(...)");
        return Arrays.equals(array, zza2);
    }

    public final boolean zza(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgduVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z = zzgduVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z) {
            this.zza.zzb(20203);
        }
        return z;
    }

    public final boolean zzb(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgduVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
