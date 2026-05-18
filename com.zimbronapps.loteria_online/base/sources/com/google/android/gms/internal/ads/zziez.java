package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziez extends zziew implements Set, Ra.a {
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziez(Set set) {
        super((Collection) set);
        kotlin.jvm.internal.t.g(set, "delegate");
        this.zza = set;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    public final Iterator iterator() {
        return new zziey(this.zza.iterator());
    }
}
