package com.google.android.gms.internal.ads;

import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbou implements zzboh {
    private final R5.b zza;
    private final zzdxz zzb;
    private final zzbwr zzd;
    private final zzeiu zze;
    private final zzcrv zzf;
    private final zzdae zzg;
    private W5.v zzc = null;
    private U5.b zzh = null;
    private final zzgzy zzi = zzcei.zzg;

    public zzbou(R5.b bVar, zzbwr zzbwrVar, zzeiu zzeiuVar, zzdxz zzdxzVar, zzcrv zzcrvVar, zzdae zzdaeVar) {
        this.zza = bVar;
        this.zzd = zzbwrVar;
        this.zze = zzeiuVar;
        this.zzb = zzdxzVar;
        this.zzf = zzcrvVar;
        this.zzg = zzdaeVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzd(Context context, zzazh zzazhVar, Uri uri, View view, Activity activity, zzfjo zzfjoVar) {
        if (zzazhVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zznv)).booleanValue() || zzfjoVar == null) {
                if (zzazhVar.zze(uri)) {
                    uri = zzazhVar.zzd(uri, context, view, activity);
                }
            } else if (zzazhVar.zze(uri)) {
                uri = zzfjoVar.zza(uri, context, view, activity);
            }
        } catch (zzazi unused) {
        } catch (Exception e) {
            R5.t.l().zzg(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            int i = o0.b;
            W5.p.d("Error adding click uptime parameter to url: ".concat(valueOf), e);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0367  */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.String r29, S5.a r30, java.util.Map r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzf(java.lang.String, S5.a, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (((java.lang.Boolean) S5.D.c().zzd(com.google.android.gms.internal.ads.zzbhe.zzjQ)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) S5.D.c().zzd(com.google.android.gms.internal.ads.zzbhe.zzjL)).booleanValue() : ((java.lang.Boolean) S5.D.c().zzd(com.google.android.gms.internal.ads.zzbhe.zzjK)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzi(S5.a r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzi(S5.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzeiu zzeiuVar = this.zze;
        zzeiuVar.zzd(str);
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzk(context, zzdxzVar, zzeiuVar, str, "dialog_not_shown", zzgui.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (com.google.android.gms.internal.ads.zzbot.zzb(r2, r12, r13, r14, r15) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        r22 = r7;
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(S5.a r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbou.zzk(S5.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzl(boolean z) {
        zzbwr zzbwrVar = this.zzd;
        if (zzbwrVar != null) {
            zzbwrVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i) {
        zzdxz zzdxzVar;
        String str;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzfy)).booleanValue() || (zzdxzVar = this.zzb) == null) {
            return;
        }
        zzdxy zza = zzdxzVar.zza();
        zza.zzc("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzc("cct_open_status", str);
        zza.zzd();
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcrv zzcrvVar;
        S5.a aVar = (S5.a) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcjl zzcjlVar = (zzcjl) aVar;
        if (zzcjlVar.zzC() != null) {
            hashMap = zzcjlVar.zzC().zzaw;
        }
        String zza = zzccs.zza(str, zzcjlVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = o0.b;
            W5.p.f("Action missing from an open GMSG.");
            return;
        }
        R5.b bVar = this.zza;
        if (bVar == null || bVar.b()) {
            zzgzo.zzr((((Boolean) S5.D.c().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzf) != null && zzcrv.zzc(zza)) ? zzcrvVar.zzb(zza, S5.B.h()) : zzgzo.zza(zza), new zzboq(this, map, aVar, str2), this.zzi);
        } else {
            bVar.c(zza);
        }
    }
}
