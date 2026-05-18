package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbee extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbdv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbee() {
        zzbdv zzbdvVar = new zzbdv();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbdvVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbiv.zzd.zze()).intValue();
        this.zzg = ((Long) zzbiv.zza.zze()).intValue();
        this.zzh = ((Long) zzbiv.zze.zze()).intValue();
        this.zzi = ((Long) zzbiv.zzc.zze()).intValue();
        this.zzj = ((Integer) S5.D.c().zzd(zzbhe.zzaC)).intValue();
        this.zzk = ((Integer) S5.D.c().zzd(zzbhe.zzaD)).intValue();
        this.zzl = ((Integer) S5.D.c().zzd(zzbhe.zzaE)).intValue();
        this.zze = ((Long) zzbiv.zzf.zze()).intValue();
        this.zzm = (String) S5.D.c().zzd(zzbhe.zzaG);
        this.zzn = ((Boolean) S5.D.c().zzd(zzbhe.zzaH)).booleanValue();
        this.zzo = ((Boolean) S5.D.c().zzd(zzbhe.zzaI)).booleanValue();
        ((Boolean) S5.D.c().zzd(zzbhe.zzaJ)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = R5.t.k().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        r1 = V5.o0.b;
        W5.p.a("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0095, code lost:
    
        R5.t.l().zzg(r0, "ContentFetchTask.extractContent");
        r2 = V5.o0.b;
        W5.p.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cd, code lost:
    
        r1 = V5.o0.b;
        W5.p.d("Error in ContentFetchTask", r0);
        R5.t.l().zzg(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:
    
        r1 = V5.o0.b;
        W5.p.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e8->B:16:0x00e8, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbee.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i = o0.b;
                    W5.p.a("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(View view) {
        try {
            zzbdu zzbduVar = new zzbdu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zze = R5.t.k().zze();
            if (zze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(zze.getResources().getIdentifier((String) S5.D.c().zzd(zzbhe.zzaF), "id", zze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbed zzc = zzc(view, zzbduVar);
            zzbduVar.zzi();
            if (zzc.zza == 0 && zzc.zzb == 0) {
                return;
            }
            int i = zzc.zzb;
            if (i != 0) {
                if (i == 0) {
                }
                this.zzd.zzc(zzbduVar);
            } else if (zzbduVar.zzl() == 0) {
                return;
            }
            if (this.zzd.zza(zzbduVar)) {
                return;
            }
            this.zzd.zzc(zzbduVar);
        } catch (Exception e) {
            int i2 = o0.b;
            W5.p.d("Exception in fetchContentOnUIThread", e);
            R5.t.l().zzg(e, "ContentFetchTask.fetchContent");
        }
    }

    public final zzbed zzc(View view, zzbdu zzbduVar) {
        if (view == null) {
            return new zzbed(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbed(this, 0, 0);
            }
            zzbduVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbed(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcjl)) {
            WebView webView = (WebView) view;
            zzbduVar.zze();
            webView.post(new zzbec(this, zzbduVar, webView, globalVisibleRect));
            return new zzbed(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbed(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzbed zzc = zzc(viewGroup.getChildAt(i3), zzbduVar);
            i += zzc.zza;
            i2 += zzc.zzb;
        }
        return new zzbed(this, i, i2);
    }

    public final void zzd(zzbdu zzbduVar, WebView webView, String str, boolean z) {
        zzbduVar.zzd();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbduVar.zzf(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzbduVar.zzf(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzbduVar.zza()) {
                this.zzd.zzb(zzbduVar);
            }
        } catch (JSONException unused) {
            int i = o0.b;
            W5.p.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = o0.b;
            W5.p.b("Failed to get webview content.", th);
            R5.t.l().zzg(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = ");
            sb.append(true);
            String sb2 = sb.toString();
            int i = o0.b;
            W5.p.a(sb2);
        }
    }
}
