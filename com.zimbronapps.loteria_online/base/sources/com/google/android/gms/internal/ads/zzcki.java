package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcki implements zzboh {
    final /* synthetic */ zzcko zza;

    public zzcki(zzcko zzckoVar) {
        Objects.requireNonNull(zzckoVar);
        this.zza = zzckoVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                zzcko zzckoVar = this.zza;
                synchronized (zzckoVar) {
                    try {
                        if (zzckoVar.zzaX() != parseInt) {
                            zzckoVar.zzaY(parseInt);
                            zzckoVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                int i = o0.b;
                W5.p.g("Exception occurred while getting webview content height", e);
            }
        }
    }
}
