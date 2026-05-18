package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzks implements zznm {
    protected int zza = 0;

    public static void zzce(Iterable iterable, List list) {
        zzkr.zzaU(iterable, list);
    }

    public final zzlh zzcb() {
        try {
            int zzcn = zzcn();
            zzlh zzlhVar = zzlh.zzb;
            byte[] bArr = new byte[zzcn];
            int i = zzlm.zzb;
            zzlk zzlkVar = new zzlk(bArr, 0, zzcn);
            zzcB(zzlkVar);
            return zzle.zza(zzlkVar, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzcc() {
        try {
            int zzcn = zzcn();
            byte[] bArr = new byte[zzcn];
            int i = zzlm.zzb;
            zzlk zzlkVar = new zzlk(bArr, 0, zzcn);
            zzcB(zzlkVar);
            zzlkVar.zzE();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int zzcd(zznx zznxVar) {
        throw null;
    }
}
