package b6;

import V5.V0;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a {
    public final Context a;
    public final WebView b;
    public final zzazh c;
    public final zzfjo d;
    public final int e;
    public final zzdye f;
    public final boolean g;
    public final zzgzy h = zzcei.zzf;
    public final zzfqk i;
    public final k0 j;
    public final b0 k;
    public final f0 l;

    public a(WebView webView, zzazh zzazhVar, zzdye zzdyeVar, zzfqk zzfqkVar, zzfjo zzfjoVar, k0 k0Var, b0 b0Var, f0 f0Var) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = zzazhVar;
        this.f = zzdyeVar;
        zzbhe.zza(context);
        this.e = ((Integer) S5.D.c().zzd(zzbhe.zzla)).intValue();
        this.g = ((Boolean) S5.D.c().zzd(zzbhe.zzlb)).booleanValue();
        this.i = zzfqkVar;
        this.d = zzfjoVar;
        this.j = k0Var;
        this.k = b0Var;
        this.l = f0Var;
    }

    public final /* synthetic */ void a(Bundle bundle, e6.b bVar) {
        V0 j = R5.t.j();
        Context context = this.a;
        CookieManager a = j.a(context);
        bundle.putBoolean("accept_3p_cookie", a != null ? a.acceptThirdPartyCookies(this.b) : false);
        e6.a.a(context, L5.c.BANNER, ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).o(), bVar);
    }

    public final /* synthetic */ void b(String str) {
        zzfjo zzfjoVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) S5.D.c().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.d) == null) ? this.c.zzd(parse, this.a, this.b, null) : zzfjoVar.zza(parse, this.a, this.b, null);
        } catch (zzazi e) {
            int i = V5.o0.b;
            W5.p.b("Failed to append the click signal to URL: ", e);
            R5.t.l().zzg(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.i.zzb(parse.toString(), null, null, null);
    }

    public final /* synthetic */ WebView c() {
        return this.b;
    }

    public final /* synthetic */ zzgzy d() {
        return this.h;
    }

    public final /* synthetic */ b0 e() {
        return this.k;
    }

    public final /* synthetic */ f0 f() {
        return this.l;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long a = R5.t.o().a();
            String zzg = this.c.zzb().zzg(this.a, str, this.b);
            if (this.g) {
                c.e(this.f, null, "csg", new Pair("clat", String.valueOf(R5.t.o().a() - a)));
            }
            return zzg;
        } catch (RuntimeException e) {
            int i = V5.o0.b;
            W5.p.d("Exception getting click signals. ", e);
            R5.t.l().zzg(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i);
            String sb2 = sb.toString();
            int i2 = V5.o0.b;
            W5.p.c(sb2);
            return "";
        }
        try {
            return (String) zzcei.zza.submit(new V(this, str)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            int i3 = V5.o0.b;
            W5.p.d("Exception getting click signals with timeout. ", e);
            R5.t.l().zzg(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        R5.t.g();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        T t = new T(this, uuid);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.j.b(this.b, t);
        } else {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzld)).booleanValue()) {
                this.h.execute(new X(this, bundle, t));
            } else {
                e6.a.a(this.a, L5.c.BANNER, ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).o(), t);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long a = R5.t.o().a();
            String zzj = this.c.zzb().zzj(this.a, this.b, null);
            if (this.g) {
                c.e(this.f, null, "vsg", new Pair("vlat", String.valueOf(R5.t.o().a() - a)));
            }
            return zzj;
        } catch (RuntimeException e) {
            int i = V5.o0.b;
            W5.p.d("Exception getting view signals. ", e);
            R5.t.l().zzg(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i);
            String sb2 = sb.toString();
            int i2 = V5.o0.b;
            W5.p.c(sb2);
            return "";
        }
        try {
            return (String) zzcei.zza.submit(new U(this)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            int i3 = V5.o0.b;
            W5.p.d("Exception getting view signals with timeout. ", e);
            R5.t.l().zzg(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzlf)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcei.zza.execute(new W(this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            try {
                if (i6 != 0) {
                    int i7 = 1;
                    if (i6 != 1) {
                        i7 = 2;
                        if (i6 != 2) {
                            i7 = 3;
                            i2 = i6 != 3 ? -1 : 0;
                        }
                    }
                    i = i7;
                    this.c.zzc(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                this.c.zzc(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e) {
                e = e;
                int i8 = V5.o0.b;
                W5.p.d("Failed to parse the touch string. ", e);
                R5.t.l().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e2) {
                e = e2;
                int i82 = V5.o0.b;
                W5.p.d("Failed to parse the touch string. ", e);
                R5.t.l().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i = i2;
        } catch (JSONException | RuntimeException e3) {
            e = e3;
        }
    }
}
