package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbd {
    private final String zza = ",\n  ";

    private zzbd(String str) {
    }

    public static zzbd zza(String str) {
        return new zzbd(",\n  ");
    }

    public static /* bridge */ /* synthetic */ String zzb(zzbd zzbdVar) {
        return zzbdVar.zza;
    }

    public static final CharSequence zzd(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder zzc(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(zzd(it.next()));
                while (it.hasNext()) {
                    sb.append(this.zza);
                    sb.append(zzd(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
