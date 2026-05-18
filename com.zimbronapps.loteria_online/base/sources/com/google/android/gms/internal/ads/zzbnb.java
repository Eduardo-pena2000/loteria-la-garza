package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnb implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        View view = (zzcjl) obj;
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        R5.t.g();
        DisplayMetrics k0 = F0.k0(windowManager);
        int i = k0.widthPixels;
        int i2 = k0.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        view.zze("locationReady", hashMap);
        int i3 = o0.b;
        W5.p.f("GET LOCATION COMPILED");
    }
}
