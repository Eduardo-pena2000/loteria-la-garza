package com.google.android.gms.internal.ads;

import S5.H0;
import S5.L0;
import S5.V0;
import V5.F0;
import V5.o0;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdoc extends zzcwf {
    public static final zzguf zzc = zzguf.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdoh zze;
    private final zzdop zzf;
    private final zzdpg zzg;
    private final zzdom zzh;
    private final zzdor zzi;
    private final zzika zzj;
    private final zzika zzk;
    private final zzika zzl;
    private final zzika zzm;
    private final zzika zzn;
    private zzdqe zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzccn zzt;
    private final zzazh zzu;
    private final W5.a zzv;
    private final Context zzw;
    private final zzdoe zzx;
    private final zzers zzy;
    private final Map zzz;

    public zzdoc(zzcwe zzcweVar, Executor executor, zzdoh zzdohVar, zzdop zzdopVar, zzdpg zzdpgVar, zzdom zzdomVar, zzdor zzdorVar, zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, zzika zzikaVar4, zzika zzikaVar5, zzccn zzccnVar, zzazh zzazhVar, W5.a aVar, Context context, zzdoe zzdoeVar, zzers zzersVar, zzbdh zzbdhVar) {
        super(zzcweVar);
        this.zzd = executor;
        this.zze = zzdohVar;
        this.zzf = zzdopVar;
        this.zzg = zzdpgVar;
        this.zzh = zzdomVar;
        this.zzi = zzdorVar;
        this.zzj = zzikaVar;
        this.zzk = zzikaVar2;
        this.zzl = zzikaVar3;
        this.zzm = zzikaVar4;
        this.zzn = zzikaVar5;
        this.zzt = zzccnVar;
        this.zzu = zzazhVar;
        this.zzv = aVar;
        this.zzw = context;
        this.zzx = zzdoeVar;
        this.zzy = zzersVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzmb)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        R5.t.g();
        long a = F0.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (a >= ((Integer) S5.D.c().zzd(zzbhe.zzmc)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdqe zzdqeVar) {
        Iterator keys;
        View view;
        zzazc zzb;
        try {
            if (!this.zzp) {
                this.zzo = zzdqeVar;
                this.zzg.zza(zzdqeVar);
                this.zzf.zza(zzdqeVar.zzdE(), zzdqeVar.zzk(), zzdqeVar.zzl(), zzdqeVar, zzdqeVar);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzdq)).booleanValue() && (zzb = this.zzu.zzb()) != null) {
                    zzb.zzh(zzdqeVar.zzdE());
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzcq)).booleanValue()) {
                    zzfir zzfirVar = this.zzb;
                    if (zzfirVar.zzak && (keys = zzfirVar.zzaj.keys()) != null) {
                        while (keys.hasNext()) {
                            String str = (String) keys.next();
                            zzdqe zzdqeVar2 = this.zzo;
                            Reference reference = zzdqeVar2 == null ? null : (WeakReference) zzdqeVar2.zzj().get(str);
                            this.zzz.put(str, Boolean.FALSE);
                            if (reference != null && (view = (View) reference.get()) != null) {
                                zzbdg zzbdgVar = new zzbdg(this.zzw, view);
                                this.zzA.add(zzbdgVar);
                                zzbdgVar.zza(new zzdnr(this, str));
                            }
                        }
                    }
                }
                if (zzdqeVar.zzh() != null) {
                    zzdqeVar.zzh().zza(this.zzt);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdqe zzdqeVar) {
        this.zzf.zzb(zzdqeVar.zzdE(), zzdqeVar.zzj());
        if (zzdqeVar.zzdA() != null) {
            zzdqeVar.zzdA().setClickable(false);
            zzdqeVar.zzdA().removeAllViews();
        }
        if (zzdqeVar.zzh() != null) {
            zzdqeVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View zzag;
        if (!this.zzr && (zzag = zzag(map)) != null) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpc)).booleanValue()) {
                Rect rect = new Rect();
                if (zzag.getGlobalVisibleRect(rect, new Point()) && zzag.getHeight() == rect.height() && zzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) S5.D.c().zzd(zzbhe.zzpd)).booleanValue()) {
                zzbgv zzbgvVar = zzbhe.zzpe;
                if (((Float) S5.D.c().zzd(zzbgvVar)).floatValue() > 0.0d) {
                    double floatValue = ((Float) S5.D.c().zzd(zzbgvVar)).floatValue();
                    if (zzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= zzag.getHeight() * zzag.getWidth() * (floatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(zzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzguf zzgufVar = zzc;
            int size = zzgufVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgufVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar == null) {
            int i = o0.b;
            W5.p.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        N6.a zzo = zzdqeVar.zzo();
        if (zzo != null) {
            return (ImageView.ScaleType) N6.b.r1(zzo);
        }
        return zzdpg.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzgq)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        x7.e zzX = this.zze.zzX();
        if (zzX == null) {
            return;
        }
        zzgzo.zzr(zzX, new zzdns(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzekb zzekbVar) {
        zzcjl zzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzekbVar == null || zzW == null || view == null) {
            return;
        }
        R5.t.y().zzh(zzekbVar.zza(), view);
    }

    public final synchronized void zzA(L0 l0) {
        this.zzf.zzr(l0);
    }

    public final synchronized void zzB(H0 h0) {
        this.zzf.zzs(h0);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzd.execute(new zzdnx(this, zzdqeVar instanceof zzdpa));
        } else {
            int i = o0.b;
            W5.p.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public final synchronized void zzE(View view, int i) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmX)).booleanValue()) {
            zzdqe zzdqeVar = this.zzo;
            if (zzdqeVar != null) {
                this.zzd.execute(new zzdny(this, view, zzdqeVar instanceof zzdpa, i));
            } else {
                int i2 = o0.b;
                W5.p.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzekb zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzejx zzejxVar;
        zzejy zzejyVar;
        zzdom zzdomVar = this.zzh;
        if (zzdomVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdoh zzdohVar = this.zze;
            zzcjl zzW = zzdohVar.zzW();
            zzcjl zzT = zzdohVar.zzT();
            if (zzW == null && zzT == null) {
                int i = o0.b;
                W5.p.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdomVar.zzg();
            int zzc2 = zzdomVar.zzg().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    String str3 = zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String sb2 = sb.toString();
                    int i3 = o0.b;
                    W5.p.f(sb2);
                    return null;
                }
                if (zzW == null) {
                    int i4 = o0.b;
                    W5.p.f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzT != null) {
                z2 = true;
            } else {
                int i5 = o0.b;
                W5.p.f("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzW = zzT;
            }
            if (zzW == null) {
                int i6 = o0.b;
                W5.p.f("Webview is null in InternalNativeAd");
                return null;
            }
            if (!R5.t.y().zza(this.zzw)) {
                int i7 = o0.b;
                W5.p.f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            W5.a aVar = this.zzv;
            int i8 = aVar.b;
            int i9 = aVar.c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb3.append(i8);
            sb3.append(".");
            sb3.append(i9);
            String sb4 = sb3.toString();
            if (z2) {
                zzejxVar = zzejx.zzc;
                zzejyVar = zzejy.zzb;
            } else {
                zzejxVar = zzejx.zzb;
                zzejyVar = zzdohVar.zzx() == 3 ? zzejy.zzd : zzejy.zzc;
            }
            zzekb zzd = R5.t.y().zzd(sb4, zzW.zzD(), "", "javascript", str2, str, zzejyVar, zzejxVar, this.zzb.zzal);
            if (zzd == null) {
                int i10 = o0.b;
                W5.p.f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdohVar.zzq(zzd);
            zzW.zzak(zzd);
            if (z2) {
                zzfsj zza = zzd.zza();
                if (zzT != null) {
                    R5.t.y().zzh(zza, zzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                R5.t.y().zze(zzd.zza());
                zzW.zze("onSdkLoaded", new w.a());
            }
            return zzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgq)).booleanValue()) {
            zzdoh zzdohVar = this.zze;
            if (zzdohVar.zzx() != 3) {
                zzcen zzY = zzdohVar.zzY();
                if (zzY == null) {
                    return;
                }
                zzgzo.zzr(zzY, new zzdnt(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzekb zzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzZ == null || view == null) {
            return;
        }
        R5.t.y().zzg(zzZ.zza(), view);
    }

    public final zzdoe zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(V0 v0) {
        this.zzy.zza(v0);
    }

    public final void zzR(Bundle bundle) {
        zzcjl zzT = this.zze.zzT();
        if (zzT == null) {
            int i = o0.b;
            W5.p.c("Video webview is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new zzdnz(zzT, jSONObject));
        } catch (JSONException e) {
            int i2 = o0.b;
            W5.p.d("Error reading event signals", e);
        }
    }

    public final /* synthetic */ void zzS() {
        try {
            zzdoh zzdohVar = this.zze;
            int zzx = zzdohVar.zzx();
            if (zzx == 1) {
                zzblt zza = this.zzi.zza();
                if (zza != null) {
                    zzai("Google", true);
                    zza.zze((zzblj) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzx == 2) {
                zzblq zzb = this.zzi.zzb();
                if (zzb != null) {
                    zzai("Google", true);
                    zzb.zze((zzblh) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzx == 3) {
                zzblz zzf = this.zzi.zzf(zzdohVar.zzS());
                if (zzf != null) {
                    if (zzdohVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzf.zze((zzblm) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzx == 6) {
                zzbmg zzc2 = this.zzi.zzc();
                if (zzc2 != null) {
                    zzai("Google", true);
                    zzc2.zze((zzbmm) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzx != 7) {
                int i = o0.b;
                W5.p.c("Wrong native template id!");
            } else {
                zzbrb zze = this.zzi.zze();
                if (zze != null) {
                    zze.zze((zzbqv) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = o0.b;
            W5.p.d("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    public final /* synthetic */ void zzW(boolean z) {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzf.zzf(null, zzdqeVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z, zzah(), 0);
        } else {
            int i = o0.b;
            W5.p.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzf.zzf(view, zzdqeVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z, zzah(), i);
        } else {
            int i2 = o0.b;
            W5.p.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public final /* synthetic */ zzdoh zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    public final /* synthetic */ zzdqe zzaa() {
        return this.zzo;
    }

    public final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new zzdnu(this));
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzz = this.zzf.zzz(bundle);
        this.zzq = zzz;
        return zzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(zzdqe zzdqeVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzco)).booleanValue()) {
            F0.l.post(new zzdnv(this, zzdqeVar));
        } else {
            zzU(zzdqeVar);
        }
    }

    public final synchronized void zzh(zzdqe zzdqeVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzco)).booleanValue()) {
            F0.l.post(new zzdnw(this, zzdqeVar));
        } else {
            zzV(zzdqeVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzcjl zzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdoh zzdohVar = this.zze;
            if (zzdohVar.zzT() != null && (zzT = zzdohVar.zzT()) != null) {
                zzT.zze("onSdkAdUserInteractionClick", new w.a());
            }
        }
    }

    public final void zzj() {
        zzdoa zzdoaVar = new zzdoa(this);
        Executor executor = this.zzd;
        executor.execute(zzdoaVar);
        if (this.zze.zzx() != 7) {
            zzdop zzdopVar = this.zzf;
            Objects.requireNonNull(zzdopVar);
            executor.execute(new zzdob(zzdopVar));
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x000d, B:11:0x001f, B:13:0x0025, B:14:0x002f, B:16:0x0035, B:25:0x004a, B:28:0x005e, B:29:0x0066, B:31:0x006c, B:34:0x0080, B:37:0x0086, B:44:0x008d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x000d, B:11:0x001f, B:13:0x0025, B:14:0x002f, B:16:0x0035, B:25:0x004a, B:28:0x005e, B:29:0x0066, B:31:0x006c, B:34:0x0080, B:37:0x0086, B:44:0x008d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzu(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzcq     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzfir r0 = r3.zzb     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.Map r0 = r3.zzz     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzeL     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbhc r0 = S5.D.c()     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.zzd(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = zzI(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdoc.zzu(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbmj zzbmjVar) {
        this.zzf.zzp(zzbmjVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }
}
