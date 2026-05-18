package com.google.android.gms.internal.ads;

import V5.o0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpa extends zzblb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdqe {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdoc zze;
    private zzbdg zzf;

    public zzdpa(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        R5.t.c();
        zzcev.zza(view, this);
        R5.t.c();
        zzcev.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzbdg(view.getContext(), view);
    }

    public final synchronized void onClick(View view) {
        zzdoc zzdocVar = this.zze;
        if (zzdocVar != null) {
            zzdocVar.zzi(view, zzdE(), zzj(), zzk(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        zzdoc zzdocVar = this.zze;
        if (zzdocVar != null) {
            zzdocVar.zzu(zzdE(), zzj(), zzk(), zzdoc.zzI(zzdE()));
        }
    }

    public final synchronized void onScrollChanged() {
        zzdoc zzdocVar = this.zze;
        if (zzdocVar != null) {
            zzdocVar.zzu(zzdE(), zzj(), zzk(), zzdoc.zzI(zzdE()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdoc zzdocVar = this.zze;
        if (zzdocVar != null) {
            zzdocVar.zzk(view, motionEvent, zzdE());
        }
        return false;
    }

    public final synchronized void zzb(N6.a aVar) {
        Object r1 = N6.b.r1(aVar);
        if (!(r1 instanceof zzdoc)) {
            int i = o0.b;
            W5.p.f("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdoc zzdocVar = this.zze;
        if (zzdocVar != null) {
            zzdocVar.zzh(this);
        }
        zzdoc zzdocVar2 = (zzdoc) r1;
        if (!zzdocVar2.zzJ()) {
            int i2 = o0.b;
            W5.p.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdocVar2;
            zzdocVar2.zzg(this);
            this.zze.zzN(zzdE());
        }
    }

    public final synchronized void zzc() {
        zzdoc zzdocVar = this.zze;
        if (zzdocVar != null) {
            zzdocVar.zzh(this);
            this.zze = null;
        }
    }

    public final synchronized void zzd(N6.a aVar) {
        try {
            if (this.zze != null) {
                Object r1 = N6.b.r1(aVar);
                if (!(r1 instanceof View)) {
                    int i = o0.b;
                    W5.p.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzx((View) r1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final FrameLayout zzdA() {
        return null;
    }

    public final View zzdE() {
        return (View) this.zza.get();
    }

    public final zzbdg zzh() {
        return this.zzf;
    }

    public final synchronized void zzi(String str, View view, boolean z) {
        this.zzd.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    public final synchronized Map zzj() {
        return this.zzd;
    }

    public final synchronized Map zzk() {
        return this.zzb;
    }

    public final synchronized Map zzl() {
        return this.zzc;
    }

    public final synchronized View zzm(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized String zzn() {
        return "1007";
    }

    public final synchronized N6.a zzo() {
        return null;
    }

    public final synchronized JSONObject zzp() {
        return null;
    }

    public final synchronized JSONObject zzq() {
        zzdoc zzdocVar = this.zze;
        if (zzdocVar == null) {
            return null;
        }
        return zzdocVar.zzw(zzdE(), zzj(), zzk());
    }
}
