package com.google.android.gms.internal.ads;

import S5.q2;
import V5.V;
import V5.o0;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdqc {
    private final zzduv zza;
    private final zzdtk zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdqc(zzduv zzduvVar, zzdtk zzdtkVar) {
        this.zza = zzduvVar;
        this.zzb = zzdtkVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        S5.B.a();
        return W5.g.c(context, i);
    }

    public final View zza(View view, WindowManager windowManager) throws zzcka {
        zzcjl zza = this.zza.zza(q2.N1(), null, null);
        zza.zzE().setVisibility(4);
        zza.zzE().setContentDescription("policy_validator");
        zza.zzab("/sendMessageToSdk", new zzdqb(this));
        zza.zzab("/hideValidatorOverlay", new zzdpw(this, windowManager, view));
        zza.zzab("/open", new zzbou(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zza);
        zzdpx zzdpxVar = new zzdpx(this, view, windowManager);
        zzdtk zzdtkVar = this.zzb;
        zzdtkVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzdpxVar);
        zzdtkVar.zzh(new WeakReference(zza), "/showValidatorOverlay", zzdpy.zza);
        return zza.zzE();
    }

    public final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcjl zzcjlVar, Map map) {
        int i = o0.b;
        W5.p.a("Hide native ad policy validator overlay.");
        zzcjlVar.zzE().setVisibility(8);
        if (zzcjlVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcjlVar.zzE());
        }
        zzcjlVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(View view, WindowManager windowManager, zzcjl zzcjlVar, Map map) {
        zzcjlVar.zzP().zzG(new zzdqa(this, map));
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) S5.D.c().zzd(zzbhe.zzjs)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) S5.D.c().zzd(zzbhe.zzjt)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcjlVar.zzaf(zzclv.zzc(zzf, zzf2));
        try {
            zzcjlVar.zzD().getSettings().setUseWideViewPort(((Boolean) S5.D.c().zzd(zzbhe.zzju)).booleanValue());
            zzcjlVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) S5.D.c().zzd(zzbhe.zzjv)).booleanValue());
        } catch (NullPointerException unused) {
        }
        WindowManager.LayoutParams k = V.k();
        k.x = zzf3;
        k.y = zzf4;
        windowManager.updateViewLayout(zzcjlVar.zzE(), k);
        String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            this.zzc = new zzdpz(view, zzcjlVar, str, k, (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4, windowManager);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcjlVar.loadUrl(str2);
    }

    public final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
