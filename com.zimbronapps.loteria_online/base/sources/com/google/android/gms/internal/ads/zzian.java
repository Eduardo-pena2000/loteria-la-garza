package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzian implements Iterable, Serializable {
    public static final zzian zza = new zzial(zzice.zzb);
    private int zzb = 0;

    static {
        int i = zziaa.zza;
    }

    public static zziam zzA() {
        return new zziam(128);
    }

    public static void zzB(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public static int zzC(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean zzD(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzC(i, i4, bArr.length);
        zzC(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    private static zzian zzk(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        }
        if (i == 1) {
            return (zzian) it.next();
        }
        int i2 = i >>> 1;
        zzian zzk = zzk(it, i2);
        zzian zzk2 = zzk(it, i - i2);
        if (Integer.MAX_VALUE - zzk.zzc() >= zzk2.zzc()) {
            return zzidt.zzk(zzk, zzk2);
        }
        int zzc = zzk.zzc();
        int zzc2 = zzk2.zzc();
        StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 31 + String.valueOf(zzc2).length());
        sb.append("ByteString would be too long: ");
        sb.append(zzc);
        sb.append("+");
        sb.append(zzc2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static zzian zzs(byte[] bArr, int i, int i2) {
        try {
            return zzt(bArr, i, i2, false);
        } catch (zzicg e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static zzian zzt(byte[] bArr, int i, int i2, boolean z) throws zzicg {
        zzC(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzial(bArr2);
    }

    public static zzian zzu(byte[] bArr) {
        try {
            return new zzial(bArr);
        } catch (zzicg e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static zzian zzv(String str) {
        return new zzial(str.getBytes(zzice.zza));
    }

    public static zzian zzw(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzian)) {
            return false;
        }
        zzian zzianVar = (zzian) obj;
        int zzc = zzc();
        if (zzc != zzianVar.zzc()) {
            return false;
        }
        if (zzc == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzianVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzj(zzianVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzc = zzc();
            i = zzl(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzied.zza(this) : zzied.zza(zzd(0, 47)).concat("...")});
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzian zzd(int i, int i2);

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zziae zziaeVar) throws IOException;

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zzian zzianVar);

    public abstract int zzl(int i, int i2, int i3);

    public abstract zziaq zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zziai iterator() {
        return new zziaf(this);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i, int i2, int i3) {
        zzC(0, i3, zzc());
        zzC(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzy() {
        int zzc = zzc();
        if (zzc == 0) {
            return zzice.zzb;
        }
        byte[] bArr = new byte[zzc];
        zze(bArr, 0, 0, zzc);
        return bArr;
    }

    public final String zzz() {
        return zzc() == 0 ? "" : zzh(zzice.zza);
    }
}
