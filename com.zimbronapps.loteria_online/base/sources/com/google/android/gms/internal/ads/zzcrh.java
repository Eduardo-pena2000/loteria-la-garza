package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcrh implements zzcql {
    private final CookieManager zza;

    public zzcrh(Context context) {
        this.zza = R5.t.j().a(context);
    }

    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) S5.D.c().zzd(zzbhe.zzbu), str);
            return;
        }
        String str2 = (String) S5.D.c().zzd(zzbhe.zzbu);
        CharSequence cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List zze = zzgrr.zza(zzgqq.zzc(';')).zze(cookie);
            for (int i = 0; i < zze.size(); i++) {
                Iterator it = zzgrr.zza(zzgqq.zzc('=')).zzd((String) zze.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) S5.D.c().zzd(zzbhe.zzbg))));
            }
        }
    }
}
