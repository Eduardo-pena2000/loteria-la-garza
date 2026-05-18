package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcqy implements zzcql {
    public final void zza(Map map) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzlR)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        R5.t.l().zzo().d(Boolean.parseBoolean(str));
    }
}
