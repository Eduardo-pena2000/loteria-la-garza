package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpb implements zzboh {
    private final Context zza;

    public zzbpb(Context context) {
        this.zza = context;
    }

    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        o0.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            R5.t.g();
            F0.B(this.zza, intent);
        } catch (RuntimeException e) {
            W5.p.g("Failed to open Share Sheet", e);
            R5.t.l().zzg(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
