package com.google.android.gms.internal.ads;

import V5.V;
import V5.o0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpc extends zzbkv implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdqe {
    public static final zzguf zza = zzguf.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgzy zzf;
    private View zzg;
    private zzdoc zzi;
    private zzbdg zzj;
    private zzbkp zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private N6.a zzk = null;
    private boolean zzn = false;
    private final int zzh = 254715000;

    public zzdpc(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        R5.t.c();
        zzcev.zza(frameLayout, this);
        R5.t.c();
        zzcev.zzb(frameLayout, this);
        this.zzf = zzcei.zzf;
        this.zzj = new zzbdg(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt() {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzmX)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdpk(this.zzi, this));
    }

    private final synchronized void zzu() {
        this.zzf.execute(new zzdpb(this));
    }

    private final synchronized void zzv(String str) {
        DisplayMetrics displayMetrics;
        try {
            FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        W5.p.g("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void onClick(View view) {
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar == null || !zzdocVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzj(), zzk(), false);
    }

    public final synchronized void onGlobalLayout() {
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdocVar.zzu(frameLayout, zzj(), zzk(), zzdoc.zzI(frameLayout));
        }
    }

    public final synchronized void onScrollChanged() {
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdocVar.zzu(frameLayout, zzj(), zzk(), zzdoc.zzI(frameLayout));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar != null) {
            zzdocVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmX)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public final synchronized void zzb(String str, N6.a aVar) {
        zzi(str, (View) N6.b.r1(aVar), true);
    }

    public final synchronized N6.a zzc(String str) {
        return N6.b.s1(zzm(str));
    }

    public final synchronized void zzd(N6.a aVar) {
        if (this.zzn) {
            return;
        }
        Object r1 = N6.b.r1(aVar);
        if (!(r1 instanceof zzdoc)) {
            int i = o0.b;
            W5.p.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar != null) {
            zzdocVar.zzh(this);
        }
        zzu();
        zzdoc zzdocVar2 = (zzdoc) r1;
        this.zzi = zzdocVar2;
        zzdocVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeM)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzv(this.zzi.zzK());
        }
        zzt();
    }

    public final FrameLayout zzdA() {
        return this.zze;
    }

    public final synchronized void zzdB(N6.a aVar) {
        if (this.zzn) {
            return;
        }
        this.zzk = aVar;
    }

    public final void zzdC(N6.a aVar) {
        onTouch(this.zzd, (MotionEvent) N6.b.r1(aVar));
    }

    public final synchronized void zzdD(zzbkp zzbkpVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbkpVar;
            zzdoc zzdocVar = this.zzi;
            if (zzdocVar != null) {
                zzdocVar.zzP().zzb(zzbkpVar);
            }
        }
    }

    public final /* synthetic */ View zzdE() {
        return this.zzd;
    }

    public final synchronized void zze() {
        try {
            if (this.zzn) {
                return;
            }
            zzdoc zzdocVar = this.zzi;
            if (zzdocVar != null) {
                zzdocVar.zzh(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzf(N6.a aVar, int i) {
    }

    public final synchronized void zzg(N6.a aVar) {
        this.zzi.zzx((View) N6.b.r1(aVar));
    }

    public final zzbdg zzh() {
        return this.zzj;
    }

    public final synchronized void zzi(String str, View view, boolean z) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (V.a(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final synchronized Map zzj() {
        return this.zzc;
    }

    public final synchronized Map zzk() {
        return this.zzc;
    }

    public final synchronized Map zzl() {
        return null;
    }

    public final synchronized View zzm(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final synchronized String zzn() {
        return this.zzb;
    }

    public final N6.a zzo() {
        return this.zzk;
    }

    public final synchronized JSONObject zzp() {
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar == null) {
            return null;
        }
        return zzdocVar.zzv(this.zzd, zzj(), zzk());
    }

    public final synchronized JSONObject zzq() {
        zzdoc zzdocVar = this.zzi;
        if (zzdocVar == null) {
            return null;
        }
        return zzdocVar.zzw(this.zzd, zzj(), zzk());
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
