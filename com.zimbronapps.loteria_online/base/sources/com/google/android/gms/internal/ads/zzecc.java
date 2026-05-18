package com.google.android.gms.internal.ads;

import S5.X0;
import S5.d1;
import V5.F0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzecc extends X0 {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzebq zzd;
    private final zzgzy zze;
    private zzebf zzf;

    public zzecc(Context context, WeakReference weakReference, zzebq zzebqVar, zzece zzeceVar, zzgzy zzgzyVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzebqVar;
        this.zze = zzgzyVar;
    }

    public static /* synthetic */ String zzh(Object obj) {
        return zzm(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzebx(this), this.zze);
        } catch (NullPointerException e) {
            R5.t.l().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzeby(this), this.zze);
        } catch (NullPointerException e) {
            R5.t.l().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static String zzm(Object obj) {
        L5.z responseInfo;
        d1 i;
        if (obj instanceof L5.n) {
            responseInfo = ((L5.n) obj).f();
        } else if (obj instanceof N5.a) {
            responseInfo = ((N5.a) obj).getResponseInfo();
        } else if (obj instanceof X5.a) {
            responseInfo = ((X5.a) obj).getResponseInfo();
        } else if (obj instanceof f6.c) {
            responseInfo = ((f6.c) obj).getResponseInfo();
        } else if (obj instanceof g6.a) {
            responseInfo = ((g6.a) obj).getResponseInfo();
        } else if (obj instanceof L5.j) {
            responseInfo = ((L5.j) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (i = responseInfo.i()) == null) {
            return "";
        }
        try {
            return i.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzebf zzebfVar) {
        this.zzf = zzebfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzecd r8) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecc.zzc(com.google.android.gms.internal.ads.zzecd):void");
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity zzo = this.zzd.zzo();
            if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbgv zzbgvVar = zzbhe.zzkP;
                if (!((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() || (obj instanceof N5.a) || (obj instanceof X5.a) || (obj instanceof f6.c) || (obj instanceof g6.a)) {
                    map.remove(str);
                }
                zzk(zzm(obj));
                if (obj instanceof N5.a) {
                    ((N5.a) obj).show(zzo);
                    return;
                }
                if (obj instanceof X5.a) {
                    ((X5.a) obj).show(zzo);
                    return;
                }
                if (obj instanceof f6.c) {
                    ((f6.c) obj).show(zzo, zzecb.zza);
                    return;
                }
                if (obj instanceof g6.a) {
                    ((g6.a) obj).show(zzo, zzebz.zza);
                    return;
                }
                if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() && ((obj instanceof L5.j) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context zzl = zzl();
                    intent.setClassName(zzl, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    R5.t.g();
                    F0.B(zzl, intent);
                }
            }
        } finally {
        }
    }

    public final void zze(String str, N6.a aVar, N6.a aVar2) {
        Context context = (Context) N6.b.r1(aVar);
        ViewGroup viewGroup = (ViewGroup) N6.b.r1(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof L5.j) {
            zzece.zza(context, viewGroup, (L5.j) obj);
        } else if (obj instanceof NativeAd) {
            zzece.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzebq zzi() {
        return this.zzd;
    }
}
