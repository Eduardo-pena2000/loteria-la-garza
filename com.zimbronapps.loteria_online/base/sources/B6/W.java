package b6;

import S5.l2;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdtk;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgrt;
import com.google.android.gms.internal.ads.zzgzg;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w extends zzcdc {
    public static final List G = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    public static final List H = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    public static final List I = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    public static final List J = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public final zzbij D;
    public final k0 E;
    public final b0 F;
    public final zzcma a;
    public Context b;
    public final zzazh c;
    public final zzfjo d;
    public final zzfkj e;
    public final zzgzy f;
    public final ScheduledExecutorService g;
    public zzbyk h;
    public final zzdye k;
    public final zzfqk l;
    public final W5.a t;
    public String u;
    public final List w;
    public final List x;
    public final List y;
    public final List z;
    public Point i = new Point();
    public Point j = new Point();
    public final AtomicInteger s = new AtomicInteger(0);
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final AtomicInteger C = new AtomicInteger(0);
    public final boolean m = ((Boolean) S5.D.c().zzd(zzbhe.zzii)).booleanValue();
    public final boolean n = ((Boolean) S5.D.c().zzd(zzbhe.zzih)).booleanValue();
    public final boolean o = ((Boolean) S5.D.c().zzd(zzbhe.zzik)).booleanValue();
    public final boolean p = ((Boolean) S5.D.c().zzd(zzbhe.zzim)).booleanValue();
    public final String q = (String) S5.D.c().zzd(zzbhe.zzil);
    public final String r = (String) S5.D.c().zzd(zzbhe.zzin);
    public final String v = (String) S5.D.c().zzd(zzbhe.zzio);

    public w(zzcma zzcmaVar, Context context, zzazh zzazhVar, zzfkj zzfkjVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzdye zzdyeVar, zzfqk zzfqkVar, W5.a aVar, zzbij zzbijVar, zzfjo zzfjoVar, k0 k0Var, b0 b0Var) {
        List list;
        this.a = zzcmaVar;
        this.b = context;
        this.c = zzazhVar;
        this.d = zzfjoVar;
        this.e = zzfkjVar;
        this.f = zzgzyVar;
        this.g = scheduledExecutorService;
        this.k = zzdyeVar;
        this.l = zzfqkVar;
        this.t = aVar;
        this.D = zzbijVar;
        this.E = k0Var;
        this.F = b0Var;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzip)).booleanValue()) {
            this.w = Q1((String) S5.D.c().zzd(zzbhe.zziq));
            this.x = Q1((String) S5.D.c().zzd(zzbhe.zzir));
            this.y = Q1((String) S5.D.c().zzd(zzbhe.zzis));
            list = Q1((String) S5.D.c().zzd(zzbhe.zzit));
        } else {
            this.w = G;
            this.x = H;
            this.y = I;
            list = J;
        }
        this.z = list;
    }

    public static final /* synthetic */ Uri F1(Uri uri, String str, String str2) {
        return P1(uri, str, "1");
    }

    public static final /* synthetic */ Uri G1(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? P1(uri, "nas", str) : uri;
    }

    public static boolean L1(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri P1(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    public static final List Q1(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzgrt.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ zzfoo d2(x7.e eVar, zzcdh zzcdhVar) {
        if (!zzfor.zza() || !((Boolean) zzbix.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfoo zzb = ((e) zzgzo.zzs(eVar)).zzb();
            zzb.zzb(new ArrayList(Collections.singletonList(zzcdhVar.zzb)));
            l2 l2Var = zzcdhVar.zzd;
            zzb.zzc(l2Var == null ? "" : l2Var.p);
            zzb.zzd(l2Var.m);
            return zzb;
        } catch (ExecutionException e) {
            R5.t.l().zzg(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ String A1() {
        return this.u;
    }

    public final /* synthetic */ void B1(String str) {
        this.u = str;
    }

    public final /* synthetic */ String C1() {
        return this.v;
    }

    public final /* synthetic */ AtomicBoolean D1() {
        return this.B;
    }

    public final /* synthetic */ AtomicInteger E1() {
        return this.C;
    }

    public final void H1(List list, N6.a aVar, zzbyh zzbyhVar, boolean z) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = V5.o0.b;
                W5.p.d("", e);
                return;
            }
        }
        zzgzy zzgzyVar = this.f;
        x7.e submit = zzgzyVar.submit(new k(this, list, aVar));
        if (O1()) {
            submit = zzgzo.zzj(submit, new m(this), zzgzyVar);
        } else {
            int i2 = V5.o0.b;
            W5.p.e("Asset view map is empty.");
        }
        zzgzo.zzr(submit, new g(this, zzbyhVar, z), this.a.zzb());
    }

    public final void I1(List list, N6.a aVar, zzbyh zzbyhVar, boolean z) {
        x7.e submit;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zziF)).booleanValue()) {
            int i = V5.o0.b;
            W5.p.f("The updating URL feature is not enabled.");
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                W5.p.d("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (S1((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            String valueOf = String.valueOf(list);
            int i3 = V5.o0.b;
            W5.p.f("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (S1(uri)) {
                zzgzy zzgzyVar = this.f;
                submit = zzgzyVar.submit(new n(this, uri, aVar));
                if (O1()) {
                    submit = zzgzo.zzj(submit, new o(this), zzgzyVar);
                } else {
                    int i4 = V5.o0.b;
                    W5.p.e("Asset view map is empty.");
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i5 = V5.o0.b;
                W5.p.f("Not a Google URL: ".concat(valueOf2));
                submit = zzgzo.zza(uri);
            }
            arrayList.add(submit);
        }
        zzgzo.zzr(zzgzo.zzm(arrayList), new h(this, zzbyhVar, z), this.a.zzb());
    }

    public final void J1() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkZ)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzlc)).booleanValue()) {
                return;
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzlg)).booleanValue() && this.A.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.E.a();
        } else {
            zzgzo.zzr(((Boolean) S5.D.c().zzd(zzbhe.zzmA)).booleanValue() ? zzgzo.zzf(new p(this), zzcei.zza) : M1(this.b, null, L5.c.BANNER.name(), null, null, 0, null, new Bundle(), null).zza(), new i(this), this.a.zzb());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b6.e M1(android.content.Context r14, java.lang.String r15, java.lang.String r16, S5.q2 r17, S5.l2 r18, int r19, java.lang.String r20, android.os.Bundle r21, com.google.android.gms.internal.ads.zzcdh r22) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.w.M1(android.content.Context, java.lang.String, java.lang.String, S5.q2, S5.l2, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzcdh):b6.e");
    }

    public final x7.e N1(String str) {
        zzdtk[] zzdtkVarArr = new zzdtk[1];
        x7.e zzb = this.e.zzb();
        u uVar = new u(this, zzdtkVarArr, str);
        zzgzy zzgzyVar = this.f;
        x7.e zzj = zzgzo.zzj(zzb, uVar, zzgzyVar);
        zzj.addListener(new l(this, zzdtkVarArr), zzgzyVar);
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzi(zzgzg.zzw(zzj), ((Integer) S5.D.c().zzd(zzbhe.zziG)).intValue(), TimeUnit.MILLISECONDS, this.g), s.a, zzgzyVar), Exception.class, t.a, zzgzyVar);
    }

    public final boolean O1() {
        Map map;
        zzbyk zzbykVar = this.h;
        return (zzbykVar == null || (map = zzbykVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    public final boolean R1(Uri uri) {
        return L1(uri, this.y, this.z);
    }

    public final boolean S1(Uri uri) {
        return L1(uri, this.w, this.x);
    }

    public final /* synthetic */ e T1(zzcdh zzcdhVar, int i, Bundle bundle) {
        return M1(this.b, zzcdhVar.zza, zzcdhVar.zzb, zzcdhVar.zzc, zzcdhVar.zzd, i, zzcdhVar.zzf, bundle, zzcdhVar);
    }

    public final /* synthetic */ ArrayList U1(List list, N6.a aVar) {
        zzazh zzazhVar = this.c;
        String zzj = zzazhVar.zzb() != null ? zzazhVar.zzb().zzj(this.b, (View) N6.b.r1(aVar), null) : "";
        if (TextUtils.isEmpty(zzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (R1(uri)) {
                arrayList.add(P1(uri, "ms", zzj));
            } else {
                String valueOf = String.valueOf(uri);
                int i = V5.o0.b;
                W5.p.f("Not a Google URL: ".concat(valueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ x7.e V1(ArrayList arrayList) {
        return zzgzo.zzk(N1("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new q(this, arrayList), this.f);
    }

    public final /* synthetic */ Uri W1(Uri uri, N6.a aVar) {
        zzfjo zzfjoVar;
        try {
            uri = (!((Boolean) S5.D.c().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.d) == null) ? this.c.zzd(uri, this.b, (View) N6.b.r1(aVar), null) : zzfjoVar.zza(uri, this.b, (View) N6.b.r1(aVar), null);
        } catch (zzazi e) {
            int i = V5.o0.b;
            W5.p.g("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ x7.e X1(Uri uri) {
        return zzgzo.zzk(N1("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new r(this, uri), this.f);
    }

    public final /* synthetic */ x7.e Y1() {
        return M1(this.b, null, L5.c.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    public final /* synthetic */ ArrayList Z1(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!R1(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(P1(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ x7.e a2(zzdtk[] zzdtkVarArr, String str, zzdtk zzdtkVar) {
        zzdtkVarArr[0] = zzdtkVar;
        Context context = this.b;
        zzbyk zzbykVar = this.h;
        Map map = zzbykVar.zzb;
        JSONObject e = V5.V.e(context, map, map, zzbykVar.zza, null);
        JSONObject b = V5.V.b(this.b, this.h.zza);
        JSONObject c = V5.V.c(this.h.zza);
        JSONObject d = V5.V.d(this.b, this.h.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", e);
        jSONObject.put("ad_view_signal", b);
        jSONObject.put("scroll_view_signal", c);
        jSONObject.put("lock_screen_signal", d);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", V5.V.f(null, this.b, this.j, this.i));
        }
        return zzdtkVar.zzc(str, jSONObject);
    }

    public final /* synthetic */ void b2(zzdtk[] zzdtkVarArr) {
        zzdtk zzdtkVar = zzdtkVarArr[0];
        if (zzdtkVar != null) {
            this.e.zzc(zzgzo.zza(zzdtkVar));
        }
    }

    public final /* synthetic */ void c2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (S1((Uri) it.next())) {
                this.s.getAndIncrement();
                return;
            }
        }
    }

    public final /* synthetic */ Context e2() {
        return this.b;
    }

    public final /* synthetic */ zzdye q1() {
        return this.k;
    }

    public final /* synthetic */ zzfqk r1() {
        return this.l;
    }

    public final /* synthetic */ boolean s1() {
        return this.m;
    }

    public final /* synthetic */ boolean t1() {
        return this.n;
    }

    public final /* synthetic */ boolean u1() {
        return this.o;
    }

    public final /* synthetic */ boolean v1() {
        return this.p;
    }

    public final /* synthetic */ String w1() {
        return this.q;
    }

    public final /* synthetic */ String x1() {
        return this.r;
    }

    public final /* synthetic */ AtomicInteger y1() {
        return this.s;
    }

    public final /* synthetic */ W5.a z1() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[PHI: r1
      0x007c: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v17 int) binds: [B:8:0x006e, B:10:0x007a, B:12:0x0088, B:14:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(N6.a r11, com.google.android.gms.internal.ads.zzcdh r12, com.google.android.gms.internal.ads.zzcda r13) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.w.zze(N6.a, com.google.android.gms.internal.ads.zzcdh, com.google.android.gms.internal.ads.zzcda):void");
    }

    public final void zzf(N6.a aVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zziF)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) N6.b.r1(aVar);
            zzbyk zzbykVar = this.h;
            this.i = V5.V.h(motionEvent, zzbykVar == null ? null : zzbykVar.zza);
            if (motionEvent.getAction() == 0) {
                this.j = this.i;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.i;
            obtain.setLocation(point.x, point.y);
            this.c.zzc(obtain);
            obtain.recycle();
        }
    }

    public final void zzg(List list, N6.a aVar, zzbyh zzbyhVar) {
        H1(list, aVar, zzbyhVar, false);
    }

    public final void zzh(List list, N6.a aVar, zzbyh zzbyhVar) {
        I1(list, aVar, zzbyhVar, false);
    }

    public final void zzi(zzbyk zzbykVar) {
        this.h = zzbykVar;
        this.e.zza(1);
    }

    public final void zzj(N6.a aVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkY)).booleanValue()) {
            zzbgv zzbgvVar = zzbhe.zziw;
            if (!((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                J1();
            }
            WebView webView = (WebView) N6.b.r1(aVar);
            if (webView == null) {
                int i = V5.o0.b;
                W5.p.c("The webView cannot be null.");
                return;
            }
            b0 b0Var = this.F;
            f0 f0Var = new f0(webView, b0Var, zzcei.zzf);
            webView.addJavascriptInterface(new a(webView, this.c, this.k, this.l, this.d, this.E, b0Var, f0Var), "gmaSdk");
            if (((Boolean) S5.D.c().zzd(zzbhe.zzli)).booleanValue()) {
                R5.t.l().zzm();
            }
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                b0Var.a(webView);
                if (((Boolean) zzbjj.zzd.zze()).booleanValue()) {
                    zzcei.zzd.scheduleWithFixedDelay(new e0(f0Var), 0L, ((Integer) S5.D.c().zzd(zzbhe.zzlj)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                J1();
            }
        }
    }

    public final void zzk(List list, N6.a aVar, zzbyh zzbyhVar) {
        H1(list, aVar, zzbyhVar, true);
    }

    public final void zzl(List list, N6.a aVar, zzbyh zzbyhVar) {
        I1(list, aVar, zzbyhVar, true);
    }

    public final N6.a zzm(N6.a aVar, N6.a aVar2, String str, N6.a aVar3) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzlm)).booleanValue()) {
            return N6.b.s1(null);
        }
        Context context = (Context) N6.b.r1(aVar);
        v.c cVar = (v.c) N6.b.r1(aVar2);
        v.b bVar = (v.b) N6.b.r1(aVar3);
        zzbij zzbijVar = this.D;
        zzbijVar.zza(context, cVar, str, bVar);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.E.a();
        }
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            this.F.a(null);
        }
        return N6.b.s1(zzbijVar.zzb());
    }
}
