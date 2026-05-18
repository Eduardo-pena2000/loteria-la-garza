package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbop implements zzboh {
    private final zzdzc zza;

    public zzbop(zzdzc zzdzcVar) {
        this.zza = zzdzcVar;
    }

    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            o0.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get("event_type")), R5.t.o().a());
        } catch (NumberFormatException e) {
            o0.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }
}
