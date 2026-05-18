package com.google.android.gms.internal.ads;

import V5.F0;
import V5.i0;
import V5.m0;
import V5.o0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcko extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcjl {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzckr zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbkf zzE;
    private zzbkc zzF;
    private zzber zzG;
    private int zzH;
    private int zzI;
    private zzbhq zzJ;
    private final zzbhq zzK;
    private zzbhq zzL;
    private final zzbhr zzM;
    private int zzN;
    private U5.z zzO;
    private boolean zzP;
    private final m0 zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbgd zzY;
    private boolean zzZ;
    private final zzcln zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final zzbil zze;
    private final W5.a zzf;
    private R5.n zzg;
    private final R5.a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfir zzk;
    private zzfiu zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjw zzo;
    private U5.z zzp;
    private zzekb zzq;
    private zzejz zzr;
    private zzclv zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcko(zzcln zzclnVar, zzclv zzclvVar, String str, boolean z, boolean z2, zzazh zzazhVar, zzbil zzbilVar, W5.a aVar, zzbht zzbhtVar, R5.n nVar, R5.a aVar2, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzfjo zzfjoVar) {
        zzfiu zzfiuVar2;
        super(zzclnVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzclnVar;
        this.zzs = zzclvVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzazhVar;
        this.zzd = zzfjoVar;
        this.zze = zzbilVar;
        this.zzf = aVar;
        this.zzg = nVar;
        this.zzh = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        R5.t.g();
        DisplayMetrics k0 = F0.k0(windowManager);
        this.zzi = k0;
        this.zzj = k0.density;
        this.zzY = zzbgdVar;
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
        this.zzQ = new m0(zzclnVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzna)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = o0.b;
            W5.p.d("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmZ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoG)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(R5.t.g().R(zzclnVar, aVar.a));
        R5.t.g();
        F0.e0(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzckw(this, new zzcku(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbhr zzbhrVar = new zzbhr(new zzbht(true, "make_wv", this.zzt));
        this.zzM = zzbhrVar;
        zzbhrVar.zzc().zza(null);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue() && (zzfiuVar2 = this.zzl) != null && zzfiuVar2.zzb != null) {
            zzbhrVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbhrVar.zzc();
        zzbhq zzf = zzbht.zzf();
        this.zzK = zzf;
        zzbhrVar.zza("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        i0.a().b(zzclnVar);
        R5.t.l().zzj();
    }

    public static /* synthetic */ void zzaT(zzcko zzckoVar) {
        super.destroy();
    }

    private final synchronized void zzaZ(String str) {
        try {
            F0.l.post(new zzckl(this, "about:blank"));
        } catch (Throwable th) {
            R5.t.l().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = o0.b;
            W5.p.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean zzc = R5.t.l().zzc();
        this.zzy = zzc;
        if (zzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbhl.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfir zzfirVar = this.zzk;
        if (zzfirVar != null && zzfirVar.zzam) {
            int i = o0.b;
            W5.p.a("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i2 = o0.b;
            W5.p.a("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i3 = o0.b;
        W5.p.a("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, (Paint) null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, (Paint) null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        R5.t.l().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzchr) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbh() {
        zzbhr zzbhrVar = this.zzM;
        if (zzbhrVar == null) {
            return;
        }
        zzbht zzc = zzbhrVar.zzc();
        zzbhj zza2 = R5.t.l().zza();
        if (zza2 != null) {
            zza2.zzb(zzc);
        }
    }

    private final void zzbi(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.c();
            U5.z zVar = this.zzp;
            if (zVar != null) {
                zVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener((View.OnClickListener) null);
            setOnTouchListener((View.OnTouchListener) null);
            if (this.zzv) {
                return;
            }
            R5.t.b().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzmk)).booleanValue()) {
                o0.k("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity zzb = this.zzb.zzb();
            if (zzb != null && zzb.isDestroyed()) {
                o0.k("Destroying the WebView immediately...");
                zzY();
            } else {
                o0.k("Initiating WebView self destruct sequence in 3...");
                o0.k("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzX()) {
            int i = o0.b;
            W5.p.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzml)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcei.zzf.submit(new zzckn(this, str, valueCallback));
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        R5.t.b().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i = o0.b;
            W5.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzX()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            int i = o0.b;
            W5.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (zzX()) {
            int i = o0.b;
            W5.p.f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            F0.l.post(new zzckk(this, str));
        } catch (Throwable th) {
            R5.t.l().zzg(th, "AdWebViewImpl.loadUrl");
            int i2 = o0.b;
            W5.p.g("Could not call loadUrl. ", th);
        }
    }

    public final void onAdClicked() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.onAdClicked();
        }
    }

    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.d();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z = this.zzC;
            zzcjw zzcjwVar = this.zzo;
            if (zzcjwVar != null && zzcjwVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z = true;
            }
            zzbi(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void onDetachedFromWindow() {
        zzcjw zzcjwVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.e();
                }
                super/*android.view.View*/.onDetachedFromWindow();
                if (this.zzD && (zzcjwVar = this.zzo) != null && zzcjwVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmz)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            R5.t.g();
            F0.B(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String sb2 = sb.toString();
            int i = o0.b;
            W5.p.a(sb2);
            R5.t.l().zzg(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    public final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzaM = zzaM();
        U5.z zzL = zzL();
        if (zzL == null || !zzaM) {
            return;
        }
        zzL.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcko.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoa)).booleanValue() && t4.j.a("MUTE_AUDIO")) {
                int i = o0.b;
                W5.p.a("Muting webview");
                t4.i.m(this, true);
            }
        } catch (Exception e) {
            int i2 = o0.b;
            W5.p.d("Could not pause webview.", e);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzod)).booleanValue()) {
                R5.t.l().zzg(e, "AdWebViewImpl.onPause");
            }
        }
    }

    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoa)).booleanValue() && t4.j.a("MUTE_AUDIO")) {
                int i = o0.b;
                W5.p.a("Unmuting webview");
                t4.i.m(this, false);
            }
        } catch (Exception e) {
            int i2 = o0.b;
            W5.p.d("Could not resume webview.", e);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzod)).booleanValue()) {
                R5.t.l().zzg(e, "AdWebViewImpl.onResume");
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) S5.D.c().zzd(zzbhe.zzer)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z) {
            zzazh zzazhVar = this.zzc;
            if (zzazhVar != null) {
                zzazhVar.zzc(motionEvent);
            }
            zzbil zzbilVar = this.zze;
            if (zzbilVar != null) {
                zzbilVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbkf zzbkfVar = this.zzE;
                    if (zzbkfVar != null) {
                        zzbkfVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjw) {
            this.zzo = (zzcjw) webViewClient;
        }
    }

    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = o0.b;
            W5.p.d("Could not stop loading webview.", e);
        }
    }

    public final void zzA(int i) {
    }

    public final void zzB(int i) {
    }

    public final zzfir zzC() {
        return this.zzk;
    }

    public final WebView zzD() {
        return this;
    }

    public final View zzE() {
        return this;
    }

    public final List zzF() {
        return new ArrayList();
    }

    public final void zzG() {
        zzbb();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.a);
        zze("onhide", hashMap);
    }

    public final void zzH(int i) {
        if (i == 0) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbhr zzbhrVar2 = this.zzM;
        zzbhrVar2.zzc();
        zzbhrVar2.zzc().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzf.a);
        zze("onhide", hashMap);
    }

    public final void zzI() {
        if (this.zzJ == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aes2");
            zzbhrVar.zzc();
            zzbhq zzf = zzbht.zzf();
            this.zzJ = zzf;
            zzbhrVar.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.a);
        zze("onshow", hashMap);
    }

    public final void zzJ() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(R5.t.m().d()));
        hashMap.put("app_volume", String.valueOf(R5.t.m().b()));
        hashMap.put("device_volume", String.valueOf(V5.b.e(getContext())));
        zze("volume", hashMap);
    }

    public final Context zzK() {
        return this.zzb.zzc();
    }

    public final synchronized U5.z zzL() {
        return this.zzp;
    }

    public final synchronized U5.z zzM() {
        return this.zzO;
    }

    public final synchronized zzclv zzN() {
        return this.zzs;
    }

    public final synchronized String zzO() {
        return this.zzt;
    }

    public final /* synthetic */ zzclj zzP() {
        return this.zzo;
    }

    public final WebViewClient zzQ() {
        return this.zzo;
    }

    public final synchronized boolean zzR() {
        return this.zzu;
    }

    public final zzazh zzS() {
        return this.zzc;
    }

    public final zzfjo zzT() {
        return this.zzd;
    }

    public final synchronized zzekb zzU() {
        return this.zzq;
    }

    public final synchronized zzejz zzV() {
        return this.zzr;
    }

    public final synchronized boolean zzW() {
        return this.zzw;
    }

    public final synchronized boolean zzX() {
        return this.zzv;
    }

    public final synchronized void zzY() {
        o0.k("Destroying WebView!");
        zzbf();
        F0.l.post(new zzckj(this));
    }

    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    public final void zza(String str) {
        zzaP(str);
    }

    public final boolean zzaA(boolean z, int i) {
        destroy();
        zzckm zzckmVar = new zzckm(z, i);
        zzbgd zzbgdVar = this.zzY;
        zzbgdVar.zzb(zzckmVar);
        zzbgdVar.zzc(10003);
        return true;
    }

    public final boolean zzaB() {
        return false;
    }

    public final zzfiu zzaC() {
        return this.zzl;
    }

    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
    }

    public final synchronized void zzaE(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        U5.z zVar = this.zzp;
        if (zVar != null) {
            zVar.zzu(z);
        }
    }

    public final x7.e zzaF() {
        zzbil zzbilVar = this.zze;
        return zzbilVar == null ? zzgzo.zza(null) : zzbilVar.zzb();
    }

    public final void zzaG(boolean z) {
        this.zzZ = true;
    }

    public final void zzaH(U5.m mVar, boolean z, boolean z2, String str) {
        this.zzo.zzv(mVar, z, z2, str);
    }

    public final void zzaI(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzy(z, i, str, z2, z3);
    }

    public final void zzaK(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    public final void zzaL(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaM() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcjw r0 = r10.zzo
            boolean r0 = r0.zzk()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcjw r0 = r10.zzo
            boolean r0 = r0.zzl()
            if (r0 == 0) goto L86
        L11:
            S5.B.a()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = W5.g.a(r0, r2)
            S5.B.a()
            int r2 = r0.heightPixels
            int r5 = W5.g.a(r0, r2)
            com.google.android.gms.internal.ads.zzcln r2 = r10.zzb
            android.app.Activity r2 = r2.zzb()
            r3 = 1
            if (r2 == 0) goto L50
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L35
            goto L50
        L35:
            R5.t.g()
            int[] r2 = V5.F0.x(r2)
            S5.B.a()
            r6 = r2[r1]
            int r6 = W5.g.a(r0, r6)
            S5.B.a()
            r2 = r2[r3]
            int r2 = W5.g.a(r0, r2)
            r7 = r2
            goto L52
        L50:
            r6 = r4
            r7 = r5
        L52:
            R5.t.g()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L87
            int r2 = r10.zzR
            if (r2 != r5) goto L87
            int r2 = r10.zzT
            if (r2 != r6) goto L87
            int r2 = r10.zzU
            if (r2 != r7) goto L87
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzaB
            com.google.android.gms.internal.ads.zzbhc r8 = S5.D.c()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L86
            int r2 = r10.zzV
            if (r2 == r9) goto L86
            goto L87
        L86:
            return r1
        L87:
            int r2 = r10.zzS
            if (r2 != r4) goto La5
            int r2 = r10.zzR
            if (r2 != r5) goto La5
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzaB
            com.google.android.gms.internal.ads.zzbhc r8 = S5.D.c()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La6
            int r2 = r10.zzV
            if (r2 == r9) goto La6
        La5:
            r1 = r3
        La6:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbwx r3 = new com.google.android.gms.internal.ads.zzbwx
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzl(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcko.zzaM():boolean");
    }

    public final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i = o0.b;
            W5.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i = o0.b;
            W5.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        R5.t.l().zzb(bool);
    }

    public final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcjw zzaS() {
        return this.zzo;
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    public final /* synthetic */ void zzaY(int i) {
        this.zzI = i;
    }

    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    public final void zzab(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzB(str, zzbohVar);
        }
    }

    public final void zzac(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzC(str, zzbohVar);
        }
    }

    public final void zzad(String str, E6.r rVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzE(str, rVar);
        }
    }

    public final synchronized void zzae(U5.z zVar) {
        this.zzp = zVar;
    }

    public final synchronized void zzaf(zzclv zzclvVar) {
        this.zzs = zzclvVar;
        requestLayout();
    }

    public final synchronized void zzag(boolean z) {
        try {
            boolean z2 = this.zzw;
            this.zzw = z;
            zzbc();
            if (z != z2) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzaz)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbwx(this, "").zzk(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzah() {
        this.zzQ.b();
    }

    public final void zzai(Context context) {
        zzcln zzclnVar = this.zzb;
        zzclnVar.setBaseContext(context);
        this.zzQ.a(zzclnVar.zzb());
    }

    public final synchronized void zzaj(boolean z) {
        U5.z zVar = this.zzp;
        if (zVar != null) {
            zVar.x1(this.zzo.zzk(), z);
        } else {
            this.zzu = z;
        }
    }

    public final synchronized void zzak(zzekb zzekbVar) {
        this.zzq = zzekbVar;
    }

    public final synchronized void zzal(zzejz zzejzVar) {
        this.zzr = zzejzVar;
    }

    public final synchronized void zzam(int i) {
        U5.z zVar = this.zzp;
        if (zVar != null) {
            zVar.y1(i);
        }
    }

    public final synchronized void zzan(U5.z zVar) {
        this.zzO = zVar;
    }

    public final synchronized void zzao(boolean z) {
        this.zzz = z;
    }

    public final void zzap() {
        if (this.zzL == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhrVar.zzc();
            zzbhq zzf = zzbht.zzf();
            this.zzL = zzf;
            zzbhrVar.zza("native:view_load", zzf);
        }
    }

    public final synchronized void zzaq(zzbkf zzbkfVar) {
        this.zzE = zzbkfVar;
    }

    public final synchronized zzbkf zzar() {
        return this.zzE;
    }

    public final synchronized void zzas(boolean z) {
        U5.z zVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zVar = this.zzp) == null) {
            return;
        }
        zVar.s1();
    }

    public final void zzat() {
        setBackgroundColor(0);
    }

    public final synchronized void zzau(String str, String str2, String str3) {
        String str4;
        try {
            if (zzX()) {
                int i = o0.b;
                W5.p.f("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String str5 = (String) S5.D.c().zzd(zzbhe.zzay);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                int i2 = o0.b;
                W5.p.g("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, zzclc.zza(str2, str4), "text/html", "UTF-8", (String) null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzav() {
        o0.k("Cannot add text view to inner AdWebView");
    }

    public final void zzaw(boolean z) {
        this.zzo.zzO(z);
    }

    public final synchronized void zzax(zzbkc zzbkcVar) {
        this.zzF = zzbkcVar;
    }

    public final synchronized void zzay(zzber zzberVar) {
        this.zzG = zzberVar;
    }

    public final synchronized zzber zzaz() {
        return this.zzG;
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    public final void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = o0.b;
        W5.p.a("Dispatching AFMA event: ".concat(sb2));
        zzaP(sb.toString());
    }

    public final void zzdQ() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdQ();
        }
    }

    public final void zzdj(zzbdd zzbddVar) {
        boolean z;
        synchronized (this) {
            z = zzbddVar.zzj;
            this.zzC = z;
        }
        zzbi(z);
    }

    public final synchronized void zzdk() {
        R5.n nVar = this.zzg;
        if (nVar != null) {
            nVar.zzdk();
        }
    }

    public final synchronized void zzdl() {
        R5.n nVar = this.zzg;
        if (nVar != null) {
            nVar.zzdl();
        }
    }

    public final zzcft zzdm() {
        return null;
    }

    public final void zzdn(boolean z) {
        this.zzo.zzM(false);
    }

    public final void zzdu() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdu();
        }
    }

    public final void zze(String str, Map map) {
        try {
            zzd(str, S5.B.a().t(map));
        } catch (JSONException unused) {
            int i = o0.b;
            W5.p.f("Could not convert parameters to JSON.");
        }
    }

    public final synchronized zzckr zzh() {
        return this.zzB;
    }

    public final zzbhq zzi() {
        return this.zzK;
    }

    public final Activity zzj() {
        return this.zzb.zzb();
    }

    public final R5.a zzk() {
        return this.zzh;
    }

    public final void zzl() {
        U5.z zzL = zzL();
        if (zzL != null) {
            zzL.zzE();
        }
    }

    public final synchronized String zzm() {
        return this.zzA;
    }

    public final synchronized String zzn() {
        zzfiu zzfiuVar = this.zzl;
        if (zzfiuVar == null) {
            return null;
        }
        return zzfiuVar.zzb;
    }

    public final synchronized void zzo(int i) {
        this.zzN = i;
    }

    public final synchronized int zzp() {
        return this.zzN;
    }

    public final zzbhr zzq() {
        return this.zzM;
    }

    public final synchronized zzchr zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzchr) map.get(str);
    }

    public final W5.a zzs() {
        return this.zzf;
    }

    public final synchronized void zzt(String str, zzchr zzchrVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzchrVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzu(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zze("onCacheAccessComplete", hashMap);
    }

    public final void zzv(int i) {
    }

    public final synchronized void zzw(zzckr zzckrVar) {
        if (this.zzB == null) {
            this.zzB = zzckrVar;
        } else {
            int i = o0.b;
            W5.p.c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    public final int zzx() {
        return getMeasuredHeight();
    }

    public final int zzy() {
        return getMeasuredWidth();
    }

    public final synchronized void zzz() {
        zzbkc zzbkcVar = this.zzF;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
        }
    }
}
