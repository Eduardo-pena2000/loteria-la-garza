package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfyy extends zzibr implements zzidd {
    private static final zzfyy zzb;
    private static volatile zzidk zzc;
    private zzicw zza = zzicw.zza();

    static {
        zzfyy zzfyyVar = new zzfyy();
        zzb = zzfyyVar;
        zzibr.zzbu(zzfyy.class, zzfyyVar);
    }

    private zzfyy() {
    }

    public static zzfyy zzc(InputStream inputStream) throws IOException {
        return (zzfyy) zzibr.zzbW(zzb, inputStream);
    }

    public static zzfyy zzd() {
        return zzb;
    }

    public static /* synthetic */ zzfyy zzg() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfyx.zza});
        }
        if (ordinal == 3) {
            return new zzfyy();
        }
        if (ordinal == 4) {
            return new zzfyw(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzfyy.class) {
                try {
                    zzidkVar = zzc;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzb);
                        zzc = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
