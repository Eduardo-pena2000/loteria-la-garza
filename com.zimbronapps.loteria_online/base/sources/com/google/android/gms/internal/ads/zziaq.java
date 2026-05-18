package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zziaq {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zziaq() {
    }

    public static zziaq zzF(InputStream inputStream, int i) {
        if (inputStream != null) {
            return new zziap(inputStream, 4096, null);
        }
        byte[] bArr = zzice.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    public static zziaq zzG(byte[] bArr, int i, int i2, boolean z) {
        zziao zziaoVar = new zziao(bArr, i, i2, z, null);
        try {
            zziaoVar.zzz(i2);
            return zziaoVar;
        } catch (zzicg e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzK(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzL(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int zzM(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    public abstract void zzA(int i);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public final void zzH() throws zzicg {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() throws zzicg {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws IOException {
        int zza;
        do {
            zza = zza();
            if (zza == 0) {
                return;
            }
            zzH();
            this.zzb++;
            this.zzb--;
        } while (zzc(zza));
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i) throws zzicg;

    public abstract boolean zzc(int i) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzian zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i) throws zzicg;

    public /* synthetic */ zziaq(byte[] bArr) {
    }
}
