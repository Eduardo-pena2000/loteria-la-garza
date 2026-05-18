package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzjx {
    private static volatile boolean zzol = false;
    private static volatile zzjx zzon;
    private final Map zzop;
    private static final Class zzom = zzch();
    static final zzjx zzoo = new zzjx(true);

    public static final class zza {
        private final int number;
        private final Object object;

        public zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.object == zzaVar.object && this.number == zzaVar.number;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    public zzjx() {
        this.zzop = new HashMap();
    }

    public static zzjx zzcg() {
        return zzki.zza(zzjx.class);
    }

    private static Class zzch() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzjx zzci() {
        return zzjw.zzcf();
    }

    public static zzjx zzcj() {
        zzjx zzjxVar = zzon;
        if (zzjxVar == null) {
            synchronized (zzjx.class) {
                try {
                    zzjxVar = zzon;
                    if (zzjxVar == null) {
                        zzjxVar = zzjw.zzcg();
                        zzon = zzjxVar;
                    }
                } finally {
                }
            }
        }
        return zzjxVar;
    }

    public final zzkk.zzd zza(zzlq zzlqVar, int i) {
        return (zzkk.zzd) this.zzop.get(new zza(zzlqVar, i));
    }

    private zzjx(boolean z) {
        this.zzop = Collections.emptyMap();
    }
}
