package com.google.android.gms.internal.ads;

import V5.o0;
import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzclk {
    private t4.b zza = null;

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                t4.i.n(webView, "GMA_WEBVIEW_PROFILE");
                o0.k("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String concat = "WebViewCompat error: ".concat(e.toString());
                int i = o0.b;
                W5.p.f(concat);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzpx)).booleanValue()) {
                    R5.t.l().zzg(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    public final void zzb(zzclo zzcloVar) {
        ProfileStore profileStore;
        if (!t4.j.a("MULTI_PROFILE")) {
            int i = o0.b;
            W5.p.a("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore", "getInstance", new zzfyr[0]);
        } catch (IllegalStateException | IllegalAccessException | ClassCastException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            int i2 = o0.b;
            W5.p.a("Unable to get ProfileStore instance: ".concat(valueOf));
            try {
                profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfyr[0]);
            } catch (ClassNotFoundException | ClassCastException | NoSuchMethodException | InvocationTargetException | IllegalStateException | IllegalAccessException e2) {
                W5.p.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpw)).booleanValue()) {
                long b = R5.t.o().b() - zzcloVar.zza;
                zzdxy zza = zzcloVar.zzb.zzd().zza();
                zza.zzc("action", "webview_p_l");
                zza.zzc("webview_p_l", Long.toString(b));
                zza.zzd();
                return;
            }
            return;
        }
        int i3 = o0.b;
        W5.p.f("WebViewCompat failure: No instance");
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpw)).booleanValue()) {
            zzdxy zza2 = zzcloVar.zzb.zzd().zza();
            zza2.zzc("action", "webview_p_f");
            zza2.zzc("webview_p_f", "No instance");
            zza2.zzd();
        }
    }
}
