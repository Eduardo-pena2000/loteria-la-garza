package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzejv implements zzejw {
    public static /* synthetic */ zzekb zzl(String str, String str2, String str3, zzejx zzejxVar, String str4, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zza = zzfsx.zza("Google", str2);
        zzfsw zzn = zzn("javascript");
        zzfso zzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzn == zzfswVar) {
            int i = o0.b;
            W5.p.f("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzejxVar);
            int i2 = o0.b;
            W5.p.f("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        zzfsw zzn2 = zzn(str4);
        if (zzp != zzfso.VIDEO || zzn2 != zzfswVar) {
            zzfsl zza2 = zzfsl.zza(zza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzp, zzo(zzejyVar.toString()), zzn, zzn2, true), zza2), zza2);
        }
        String valueOf2 = String.valueOf(str4);
        int i3 = o0.b;
        W5.p.f("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    public static /* synthetic */ zzekb zzm(String str, String str2, String str3, String str4, zzejx zzejxVar, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zza = zzfsx.zza(str, str2);
        zzfsw zzn = zzn("javascript");
        zzfsw zzn2 = zzn(str4);
        zzfso zzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzn == zzfswVar) {
            int i = o0.b;
            W5.p.f("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzejxVar);
            int i2 = o0.b;
            W5.p.f("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        if (zzp != zzfso.VIDEO || zzn2 != zzfswVar) {
            zzfsl zzb = zzfsl.zzb(zza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzp, zzo(zzejyVar.toString()), zzn, zzn2, true), zzb), zzb);
        }
        String valueOf2 = String.valueOf(str4);
        int i3 = o0.b;
        W5.p.f("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    private static zzfsw zzn(String str) {
        return "native".equals(str) ? zzfsw.NATIVE : "javascript".equals(str) ? zzfsw.JAVASCRIPT : zzfsw.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzfsr zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.UNSPECIFIED
            goto L46
        L3e:
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.ONE_PIXEL
            goto L46
        L41:
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.DEFINED_BY_JAVASCRIPT
            goto L46
        L44:
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.BEGIN_TO_RENDER
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejv.zzo(java.lang.String):com.google.android.gms.internal.ads.zzfsr");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzfso zzp(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzfso r4 = com.google.android.gms.internal.ads.zzfso.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zzfso r4 = com.google.android.gms.internal.ads.zzfso.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zzfso r4 = com.google.android.gms.internal.ads.zzfso.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejv.zzp(java.lang.String):com.google.android.gms.internal.ads.zzfso");
    }

    private static final Object zzq(zzeju zzejuVar) {
        try {
            return zzejuVar.zza();
        } catch (RuntimeException e) {
            R5.t.l().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            R5.t.l().zzh(e, "omid exception");
        }
    }

    public final boolean zza(Context context) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzejt(context));
            return bool != null && bool.booleanValue();
        }
        int i = o0.b;
        W5.p.f("Omid flag is disabled");
        return false;
    }

    public final String zzb(Context context) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue()) {
            return (String) zzq(zzejk.zza);
        }
        return null;
    }

    public final zzekb zzc(String str, WebView webView, String str2, String str3, String str4, zzejy zzejyVar, zzejx zzejxVar, String str5) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            return (zzekb) zzq(new zzejl("Google", str, "javascript", zzejxVar, str4, webView, str5, "", zzejyVar));
        }
        return null;
    }

    public final zzekb zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzejy zzejyVar, zzejx zzejxVar, String str6) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            return (zzekb) zzq(new zzejm(str5, str, "javascript", str4, zzejxVar, webView, str6, "", zzejyVar));
        }
        return null;
    }

    public final void zze(zzfsj zzfsjVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            Objects.requireNonNull(zzfsjVar);
            zzr(new zzejj(zzfsjVar));
        }
    }

    public final void zzf(zzfsj zzfsjVar) {
        zzr(new zzejn(zzfsjVar));
    }

    public final void zzg(zzfsj zzfsjVar, View view) {
        zzr(new zzejo(zzfsjVar, view));
    }

    public final void zzh(zzfsj zzfsjVar, View view) {
        zzr(new zzejp(zzfsjVar, view));
    }

    public final zzfsv zzi(W5.a aVar, WebView webView, boolean z) {
        return (zzfsv) zzq(new zzejq(aVar, webView, true));
    }

    public final void zzj(zzfsv zzfsvVar, zzfsu zzfsuVar) {
        zzr(new zzejr(zzfsvVar, zzfsuVar));
    }

    public final void zzk(zzfsv zzfsvVar, View view) {
        zzr(new zzejs(zzfsvVar, view));
    }
}
