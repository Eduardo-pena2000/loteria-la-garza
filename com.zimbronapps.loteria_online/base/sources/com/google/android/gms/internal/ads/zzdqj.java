package com.google.android.gms.internal.ads;

import S5.H0;
import S5.L0;
import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdqj implements zzdop, zzdgh {
    private final zzbui zza;
    private final zzdbx zzb;
    private final zzddy zzc;
    private final zzdbd zzd;
    private final zzdjk zze;
    private final Context zzf;
    private final zzfir zzg;
    private final W5.a zzh;
    private final zzfjk zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbue zzm;
    private final zzbuf zzn;

    public zzdqj(zzbue zzbueVar, zzbuf zzbufVar, zzbui zzbuiVar, zzdbx zzdbxVar, zzddy zzddyVar, zzdbd zzdbdVar, zzdjk zzdjkVar, Context context, zzfir zzfirVar, W5.a aVar, zzfjk zzfjkVar) {
        this.zzm = zzbueVar;
        this.zzn = zzbufVar;
        this.zza = zzbuiVar;
        this.zzb = zzdbxVar;
        this.zzc = zzddyVar;
        this.zzd = zzdbdVar;
        this.zze = zzdjkVar;
        this.zzf = context;
        this.zzg = zzfirVar;
        this.zzh = aVar;
        this.zzi = zzfjkVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            hashMap.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hashMap;
    }

    private final void zzi(View view) {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null && !zzbuiVar.zzu()) {
                zzbuiVar.zzw(N6.b.s1(view));
                this.zzd.onAdClicked();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null && !zzbueVar.zzq()) {
                zzbueVar.zzn(N6.b.s1(view));
                this.zzd.onAdClicked();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar == null || zzbufVar.zzo()) {
                return;
            }
            zzbufVar.zzl(N6.b.s1(view));
            this.zzd.onAdClicked();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmj)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Failed to call handleClick", e);
        }
    }

    public final void zzA() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzC();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Failed to call destroy", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:46:0x00b4, B:47:0x00c9, B:49:0x00cf), top: B:45:0x00b4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqj.zza(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    public final void zzb(View view, Map map) {
        try {
            N6.a s1 = N6.b.s1(view);
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzy(s1);
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null) {
                zzbueVar.zzs(s1);
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar != null) {
                zzbufVar.zzq(s1);
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Failed to call untrackView", e);
        }
    }

    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    public final void zzd(String str) {
    }

    public final void zzdG() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar == null || !zzbuiVar.zzt()) {
                return;
            }
            zzfir zzfirVar = this.zzg;
            if (zzfirVar.zze != 4 && !zzfirVar.zzaD) {
                return;
            }
            zzbuiVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Failed to report impression from an adapter", e);
        }
    }

    public final void zzdH() {
    }

    public final void zze(Bundle bundle) {
    }

    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = o0.b;
            W5.p.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i3 = o0.b;
            W5.p.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    public final void zzg() {
        this.zzk = true;
    }

    public final boolean zzh() {
        return this.zzg.zzL;
    }

    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzk(Bundle bundle) {
    }

    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void zzn() {
    }

    public final void zzo(View view) {
    }

    public final void zzp(zzbmj zzbmjVar) {
    }

    public final void zzq() {
    }

    public final void zzr(L0 l0) {
        int i = o0.b;
        W5.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzs(H0 h0) {
        int i = o0.b;
        W5.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzt() {
        int i = o0.b;
        W5.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    public final int zzu() {
        return 0;
    }

    public final boolean zzv() {
        return true;
    }

    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = R5.t.s().g(this.zzf, this.zzh.a, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbui zzbuiVar = this.zza;
                if (zzbuiVar == null) {
                    zzbue zzbueVar = this.zzm;
                    if (zzbueVar != null && !zzbueVar.zzp()) {
                        zzbueVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbuf zzbufVar = this.zzn;
                    if (zzbufVar == null || zzbufVar.zzn()) {
                        return;
                    }
                    zzbufVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfir zzfirVar = this.zzg;
                if (zzfirVar.zzaD) {
                    if (zzbuiVar.zzt()) {
                        return;
                    }
                    zzbuiVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbuiVar.zzt() && zzfirVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbuiVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Failed to call recordImpression", e);
        }
    }

    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    public final void zzy() {
    }

    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
