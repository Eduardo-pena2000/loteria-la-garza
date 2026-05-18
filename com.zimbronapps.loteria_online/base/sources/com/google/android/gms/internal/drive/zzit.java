package com.google.android.gms.internal.drive;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzit implements zzlq {
    private static boolean zznf = false;
    protected int zzne = 0;

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzcx()];
            zzjr zzb = zzjr.zzb(bArr);
            zzb(zzb);
            zzb.zzcb();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final zzjc zzbl() {
        try {
            zzjk zzu = zzjc.zzu(zzcx());
            zzb(zzu.zzby());
            return zzu.zzbx();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int zzbm() {
        throw new UnsupportedOperationException();
    }

    public void zzo(int i) {
        throw new UnsupportedOperationException();
    }
}
