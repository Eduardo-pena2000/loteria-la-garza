package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaiw {
    private List zza;

    public zzaiw() {
        this(null);
    }

    public static zzaiw zza() {
        return new zzaiw(null);
    }

    public final List zzb() {
        return this.zza;
    }

    private zzaiw(List list) {
        this.zza = new ArrayList();
    }

    public zzaiw(int i, List list) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, v.a((String) list.get(i2)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.emptyList();
    }
}
