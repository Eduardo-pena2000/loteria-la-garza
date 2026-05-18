package com.google.android.gms.internal.ads;

import T1.Z;
import V5.F0;
import V5.o0;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzcjw extends WebViewClient implements zzclj {
    public static final /* synthetic */ int zzc = 0;
    private zzdxz zzA;
    private zzczz zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzejf zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzcjl zza;
    protected zzcce zzb;
    private final zzbgd zzd;
    private S5.a zzg;
    private U5.E zzh;
    private zzclh zzi;
    private zzcli zzj;
    private zzbmx zzk;
    private zzbmz zzl;
    private zzdjm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private U5.e zzw;
    private zzbww zzx;
    private R5.b zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbwr zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzgG)).split(",")));

    public zzcjw(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z, zzbww zzbwwVar, zzbwr zzbwrVar, zzejf zzejfVar) {
        this.zzd = zzbgdVar;
        this.zza = zzcjlVar;
        this.zzs = z;
        this.zzx = zzbwwVar;
        this.zzH = zzejfVar;
    }

    private final void zzac(View view, zzcce zzcceVar, int i) {
        if (!zzcceVar.zzc() || i <= 0) {
            return;
        }
        zzcceVar.zzd(view);
        if (zzcceVar.zzc()) {
            F0.l.postDelayed(new zzcju(this, view, zzcceVar, i), 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        this.zza.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzbq)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        R5.t.g();
        R5.t.g();
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        R5.t.g();
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
    
        r0 = r7.getHeaderFields();
        r14 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018a, code lost:
    
        if (r0.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018c, code lost:
    
        r1 = (java.util.Map.Entry) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0196, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019c, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a8, code lost:
    
        if (((java.util.List) r1.getValue()).isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01aa, code lost:
    
        r14.put((java.lang.String) r1.getKey(), (java.lang.String) ((java.util.List) r1.getValue()).get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
    
        r10 = R5.t.j().c(r10, r11, r7.getResponseCode(), r7.getResponseMessage(), r14, r7.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013f, code lost:
    
        r1 = r1.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0144, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        if (r2 >= r1.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0157, code lost:
    
        if (r1[r2].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
    
        r3 = r1[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        r5 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016f, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0125, code lost:
    
        r10 = r1.split(";")[0].trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zzaf(java.lang.String r17, java.util.Map r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjw.zzaf(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (o0.m()) {
            o0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                o0.k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzboh) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzai(zzcjl zzcjlVar) {
        return zzcjlVar.zzC() != null && zzcjlVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z, zzcjl zzcjlVar) {
        return (!z || zzcjlVar.zzN().zzg() || zzcjlVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    public final void onAdClicked() {
        S5.a aVar = this.zzg;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        o0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzX()) {
                    o0.k("Blank page loaded, 1...");
                    zzcjlVar.zzY();
                    return;
                }
                this.zzC = true;
                zzcli zzcliVar = this.zzj;
                if (zzcliVar != null) {
                    zzcliVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcjl zzcjlVar2 = this.zza;
                if (zzcjlVar2.zzL() != null) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zznr)).booleanValue()) {
                        zzcjlVar2.zzL().B1(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzL(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    S5.a aVar = this.zzg;
                    if (aVar != null) {
                        aVar.onAdClicked();
                        zzcce zzcceVar = this.zzb;
                        if (zzcceVar != null) {
                            zzcceVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdjm zzdjmVar = this.zzm;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            View view = this.zza;
            if (view.zzD().willNotDraw()) {
                W5.p.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzazh zzS = view.zzS();
                    zzfjo zzT = view.zzT();
                    if (!((Boolean) S5.D.c().zzd(zzbhe.zznv)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, view.getContext(), view, view.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, view.getContext(), view, view.zzj());
                    }
                } catch (zzazi unused) {
                    W5.p.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                R5.b bVar = this.zzy;
                if (bVar == null || bVar.b()) {
                    U5.m mVar = new U5.m("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcjl zzcjlVar = this.zza;
                    zzv(mVar, true, false, zzcjlVar != null ? zzcjlVar.zzn() : "");
                } else {
                    bVar.c(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        U5.m mVar;
        zzbwr zzbwrVar = this.zzz;
        boolean zzd = zzbwrVar != null ? zzbwrVar.zzd() : false;
        R5.t.f();
        U5.A.a(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && (mVar = adOverlayInfoParcel.a) != null) {
                str = mVar.b;
            }
            zzcceVar.zzb(str);
        }
    }

    public final void zzB(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            try {
                HashMap hashMap = this.zze;
                CopyOnWriteArrayList copyOnWriteArrayList = (List) hashMap.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    hashMap.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbohVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbohVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, E6.r rVar) {
        synchronized (this.zzf) {
            try {
                List<zzboh> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzboh zzbohVar : list) {
                    if (rVar.apply(zzbohVar)) {
                        arrayList.add(zzbohVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbwr zzbwrVar = this.zzz;
                if (zzbwrVar != null) {
                    zzbwrVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzG(zzclh zzclhVar) {
        this.zzi = zzclhVar;
    }

    public final void zzH(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    public final zzdxz zzI() {
        return this.zzA;
    }

    public final void zzJ(zzczz zzczzVar) {
        this.zzB = zzczzVar;
    }

    public final zzczz zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0208 A[Catch: all -> 0x01b6, TryCatch #7 {all -> 0x01b6, blocks: (B:55:0x019b, B:57:0x01ad, B:59:0x01b9, B:42:0x01f6, B:44:0x0208, B:45:0x020f), top: B:28:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c8 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {NoClassDefFoundError -> 0x0020, Exception -> 0x0023, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b7, B:26:0x00cb, B:29:0x00e6, B:60:0x01c3, B:47:0x017a, B:50:0x02c8, B:65:0x0245, B:66:0x0278, B:46:0x0213, B:61:0x0149, B:82:0x00d9, B:83:0x0279, B:85:0x0283, B:87:0x0289, B:89:0x02bc, B:92:0x02d7, B:94:0x02dd, B:96:0x02eb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {NoClassDefFoundError -> 0x0020, Exception -> 0x0023, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b7, B:26:0x00cb, B:29:0x00e6, B:60:0x01c3, B:47:0x017a, B:50:0x02c8, B:65:0x0245, B:66:0x0278, B:46:0x0213, B:61:0x0149, B:82:0x00d9, B:83:0x0279, B:85:0x0283, B:87:0x0289, B:89:0x02bc, B:92:0x02d7, B:94:0x02dd, B:96:0x02eb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzL(java.lang.String r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjw.zzL(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzM(boolean z) {
        this.zzn = false;
    }

    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcei.zzf.execute(new zzcjs(this));
        }
    }

    public final void zzO(boolean z) {
        this.zzF = z;
    }

    public final void zzP(int i, int i2) {
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zze(i, i2);
        }
    }

    public final void zzQ(Uri uri) {
        o0.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            o0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzhF)).booleanValue() || R5.t.l().zza() == null) {
                return;
            }
            zzcei.zza.execute(new zzcjt((path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgF)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) S5.D.c().zzd(zzbhe.zzgH)).intValue()) {
                o0.k("Parsing gmsg query params on BG thread: ".concat(path));
                zzgzo.zzr(R5.t.g().S(uri), new zzcjn(this, list, path, uri), zzcei.zzf);
                return;
            }
        }
        R5.t.g();
        zzaa(F0.v(uri), list, path);
    }

    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    public final void zzS(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    public final void zzT(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    public final /* synthetic */ void zzU(View view, zzcce zzcceVar, int i) {
        zzac(view, zzcceVar, i - 1);
    }

    public final /* synthetic */ void zzV(boolean z, long j) {
        zzY(true, j);
    }

    public final /* synthetic */ void zzZ(View view, zzcce zzcceVar, int i) {
        zzac(view, zzcceVar, 10);
    }

    public final void zza(int i, int i2, boolean z) {
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzbwwVar.zzb(i, i2);
        }
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zzc(i, i2, false);
        }
    }

    public final void zzab(S5.a aVar, zzbmx zzbmxVar, U5.E e, zzbmz zzbmzVar, U5.e eVar, boolean z, zzbok zzbokVar, R5.b bVar, zzbwy zzbwyVar, zzcce zzcceVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzbpc zzbpcVar, zzdjm zzdjmVar, zzbpb zzbpbVar, zzbov zzbovVar, zzboi zzboiVar, zzcrv zzcrvVar, zzdzc zzdzcVar, zzdae zzdaeVar, zzczz zzczzVar) {
        R5.b bVar2 = bVar == null ? new R5.b(this.zza.getContext(), zzcceVar, null) : bVar;
        zzcjl zzcjlVar = this.zza;
        this.zzz = new zzbwr(zzcjlVar, zzbwyVar);
        this.zzb = zzcceVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzbz)).booleanValue()) {
            zzB("/adMetadata", new zzbmw(zzbmxVar));
        }
        if (zzbmzVar != null) {
            zzB("/appEvent", new zzbmy(zzbmzVar));
        }
        zzB("/backButton", zzbog.zzj);
        zzB("/refresh", zzbog.zzk);
        zzB("/canOpenApp", zzbog.zzb);
        zzB("/canOpenURLs", zzbog.zza);
        zzB("/canOpenIntents", zzbog.zzc);
        zzB("/close", zzbog.zzd);
        zzB("/customClose", zzbog.zze);
        zzB("/instrument", zzbog.zzn);
        zzB("/delayPageLoaded", zzbog.zzp);
        zzB("/delayPageClosed", zzbog.zzq);
        zzB("/getLocationInfo", zzbog.zzr);
        zzB("/log", zzbog.zzg);
        zzB("/mraid", new zzboo(bVar2, this.zzz, zzbwyVar));
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzB("/mraidLoaded", zzbwwVar);
        }
        R5.b bVar3 = bVar2;
        zzB("/open", new zzbou(bVar2, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, zzdaeVar));
        zzB("/precache", new zzchs());
        zzB("/touch", zzbog.zzi);
        zzB("/video", zzbog.zzl);
        zzB("/videoMeta", zzbog.zzm);
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(zzdjmVar, zzcrvVar));
            zzB("/httpTrack", zzbog.zzf);
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, zzdjmVar));
            zzB("/httpTrack", zzfjv.zzb(zzeiuVar, zzfqkVar));
        }
        if (R5.t.d().zza(zzcjlVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcjlVar.zzC() != null) {
                hashMap = zzcjlVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), hashMap));
        }
        if (zzbokVar != null) {
            zzB("/setInterstitialProperties", new zzboj(zzbokVar));
        }
        if (zzbpcVar != null) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpcVar);
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkJ)).booleanValue() && zzbpbVar != null) {
            zzB("/shareSheet", zzbpbVar);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zziP)).booleanValue() && zzdzcVar != null) {
            zzB("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue() && zzbovVar != null) {
            zzB("/inspectorOutOfContextTest", zzbovVar);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkT)).booleanValue() && zzboiVar != null) {
            zzB("/inspectorStorage", zzboiVar);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmW)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbog.zzu);
            zzB("/presentPlayStoreOverlay", zzbog.zzv);
            zzB("/expandPlayStoreOverlay", zzbog.zzw);
            zzB("/collapsePlayStoreOverlay", zzbog.zzx);
            zzB("/closePlayStoreOverlay", zzbog.zzy);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzee)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbog.zzA);
            zzB("/resetPAID", zzbog.zzz);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zznq)).booleanValue() && zzcjlVar.zzC() != null && zzcjlVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbog.zzB);
            zzB("/clearLocalStorageKeys", zzbog.zzC);
        }
        this.zzg = aVar;
        this.zzh = e;
        this.zzk = zzbmxVar;
        this.zzl = zzbmzVar;
        this.zzw = eVar;
        this.zzy = bVar3;
        this.zzm = zzdjmVar;
        this.zzA = zzdxzVar;
        this.zzB = zzczzVar;
        this.zzn = z;
    }

    public final void zzb(zzfir zzfirVar) {
        zzcjl zzcjlVar = this.zza;
        if (R5.t.d().zza(zzcjlVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), zzfirVar.zzaw));
        }
    }

    public final void zzc(zzcrv zzcrvVar) {
        zzD("/click");
        zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
    }

    public final void zzd(zzcrv zzcrvVar, zzeiu zzeiuVar, zzfqk zzfqkVar) {
        zzD("/click");
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, this.zzm));
        }
    }

    public final void zzdQ() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    public final void zzdu() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    public final void zze(zzcrv zzcrvVar, zzeiu zzeiuVar, zzdxz zzdxzVar) {
        zzD("/open");
        zzB("/open", new zzbou(this.zzy, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, null));
    }

    public final R5.b zzh() {
        return this.zzy;
    }

    public final void zzi(R5.b bVar) {
        this.zzy = bVar;
    }

    public final void zzj(zzcce zzcceVar) {
        this.zzb = zzcceVar;
    }

    public final boolean zzk() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final void zzq() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            View view = this.zza;
            WebView zzD = view.zzD();
            if (Z.G(zzD)) {
                zzac(zzD, zzcceVar, 10);
                return;
            }
            zzad();
            zzcjm zzcjmVar = new zzcjm(this, zzcceVar);
            this.zzI = zzcjmVar;
            view.addOnAttachStateChangeListener(zzcjmVar);
        }
    }

    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    public final void zzs() {
        this.zzE--;
        zzu();
    }

    public final void zzt() {
        zzbgd zzbgdVar = this.zzd;
        if (zzbgdVar != null) {
            zzbgdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue()) {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzq() != null) {
                    zzbhl.zza(zzcjlVar.zzq().zzc(), zzcjlVar.zzi(), "awfllc");
                }
            }
            zzclh zzclhVar = this.zzi;
            boolean z = false;
            if (!this.zzD && !this.zzo) {
                z = true;
            }
            zzclhVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(U5.m mVar, boolean z, boolean z2, String str) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean z3 = zzaj(zzW, zzcjlVar) || z2;
        zzA(new AdOverlayInfoParcel(mVar, z3 ? null : this.zzg, zzW ? null : this.zzh, this.zzw, zzcjlVar.zzs(), zzcjlVar, z3 || !z ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzejf zzejfVar = this.zzH;
        zzcjl zzcjlVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcjlVar, zzcjlVar.zzs(), str, str2, 14, zzejfVar));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        zzcjl zzcjlVar = this.zza;
        boolean zzaj = zzaj(zzcjlVar.zzW(), zzcjlVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        zzA(new AdOverlayInfoParcel(zzaj ? null : this.zzg, this.zzh, this.zzw, zzcjlVar, z, i, zzcjlVar.zzs(), z3 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean zzaj = zzaj(zzW, zzcjlVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        zzA(new AdOverlayInfoParcel(zzaj ? null : this.zzg, zzW ? null : new zzcjv(zzcjlVar, this.zzh), this.zzk, this.zzl, this.zzw, zzcjlVar, z, i, str, zzcjlVar.zzs(), z4 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null, z3));
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean zzaj = zzaj(zzW, zzcjlVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        zzA(new AdOverlayInfoParcel(zzaj ? null : this.zzg, zzW ? null : new zzcjv(zzcjlVar, this.zzh), this.zzk, this.zzl, this.zzw, zzcjlVar, z, i, str, str2, zzcjlVar.zzs(), z3 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null));
    }
}
