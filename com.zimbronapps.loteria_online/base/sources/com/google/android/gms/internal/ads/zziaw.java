package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zziaw extends zziae {
    private static final boolean zza = zziem.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zziaw() {
        throw null;
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzC(zzidc zzidcVar) {
        int zzbr = zzidcVar.zzbr();
        return zzA(zzbr) + zzbr;
    }

    public static /* synthetic */ boolean zzE() {
        return zza;
    }

    public static int zzz(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public final void zzD() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzH(int i, int i2) throws IOException;

    public abstract void zzI(int i, int i2) throws IOException;

    public abstract void zzJ(int i, int i2) throws IOException;

    public abstract void zzK(int i, int i2) throws IOException;

    public abstract void zzL(int i, long j) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(int i, boolean z) throws IOException;

    public abstract void zzj(int i, String str) throws IOException;

    public abstract void zzk(int i, zzian zzianVar) throws IOException;

    public abstract void zzl(zzian zzianVar) throws IOException;

    public abstract void zzm(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzn(int i, zzidc zzidcVar) throws IOException;

    public abstract void zzo(int i, zzian zzianVar) throws IOException;

    public abstract void zzp(zzidc zzidcVar) throws IOException;

    public abstract void zzq(byte b) throws IOException;

    public abstract void zzr(int i) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(int i) throws IOException;

    public abstract void zzu(long j) throws IOException;

    public abstract void zzv(long j) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract void zzy() throws IOException;

    public /* synthetic */ zziaw(byte[] bArr) {
    }
}
