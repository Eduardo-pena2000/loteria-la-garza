package R5;

import S5.B;
import S5.H;
import S5.K;
import S5.N;
import S5.V0;
import S5.X;
import S5.d0;
import S5.d1;
import S5.e2;
import S5.g1;
import S5.k1;
import S5.l2;
import S5.p0;
import S5.q2;
import S5.t0;
import S5.w0;
import S5.w2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzcam;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s extends X {
    public final W5.a a;
    public final q2 b;
    public final Context c;
    public final r d;
    public WebView e;
    public K f;
    public AsyncTask g;

    public s(Context context, q2 q2Var, String str, W5.a aVar) {
        this.c = context;
        this.a = aVar;
        this.b = q2Var;
        this.e = new WebView(context);
        this.d = new r(context, str);
        r1(0);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.getSettings().setJavaScriptEnabled(true);
        this.e.setWebViewClient(new o(this));
        this.e.setOnTouchListener(new p(this));
    }

    public final int q1(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            B.a();
            return W5.g.c(this.c, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void r1(int i) {
        if (this.e == null) {
            return;
        }
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public final String s1() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbiq.zzd.zze());
        r rVar = this.d;
        builder.appendQueryParameter("query", rVar.b());
        builder.appendQueryParameter("pubId", rVar.c());
        builder.appendQueryParameter("mappver", rVar.d());
        Map e = rVar.e();
        for (String str : e.keySet()) {
            builder.appendQueryParameter(str, (String) e.get(str));
        }
        Uri build = builder.build();
        String t1 = t1();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(t1.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(t1);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    public final String t1() {
        String a = this.d.a();
        if (true == TextUtils.isEmpty(a)) {
            a = "www.google.com";
        }
        String str = (String) zzbiq.zzd.zze();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }

    public final /* synthetic */ void u1(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.c.startActivity(intent);
    }

    public final /* synthetic */ WebView v1() {
        return this.e;
    }

    public final /* synthetic */ K w1() {
        return this.f;
    }

    public final boolean zzA() {
        return false;
    }

    public final boolean zzB() {
        return false;
    }

    public final void zzC(zzcam zzcamVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzD(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzE(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final g1 zzF() {
        return null;
    }

    public final void zzG(e2 e2Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzH(k1 k1Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzI(w2 w2Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzJ(zzbfa zzbfaVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzK(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final long zzU() {
        return 0L;
    }

    public final void zzY(t0 t0Var) {
        throw new IllegalStateException("Unused method");
    }

    public final N6.a zzb() {
        com.google.android.gms.common.internal.t.e("getAdFrame must be called on the main UI thread.");
        return N6.b.s1(this.e);
    }

    public final void zzc() {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        this.g.cancel(true);
        this.e.destroy();
        this.e = null;
    }

    public final boolean zzd() {
        return false;
    }

    public final void zzdR(K k) {
        this.f = k;
    }

    public final boolean zze(l2 l2Var) {
        com.google.android.gms.common.internal.t.m(this.e, "This Search Ad has already been torn down");
        this.d.f(l2Var, this.a);
        this.g = new q(this, null).execute(new Void[0]);
        return true;
    }

    public final void zzf() {
        com.google.android.gms.common.internal.t.e("pause must be called on the main UI thread.");
    }

    public final void zzg() {
        com.google.android.gms.common.internal.t.e("resume must be called on the main UI thread.");
    }

    public final void zzi(p0 p0Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzj(d0 d0Var) {
        throw new IllegalStateException("Unused method");
    }

    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    public final void zzl() {
        throw new IllegalStateException("Unused method");
    }

    public final void zzm() {
        throw new IllegalStateException("Unused method");
    }

    public final q2 zzn() {
        return this.b;
    }

    public final void zzo(q2 q2Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zzp(zzbyb zzbybVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzq(zzbye zzbyeVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final String zzr() {
        return null;
    }

    public final String zzs() {
        return null;
    }

    public final d1 zzt() {
        return null;
    }

    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final p0 zzv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final K zzw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zzx(zzbhz zzbhzVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzy(H h) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzP(V0 v0) {
    }

    public final void zzR(N6.a aVar) {
    }

    public final void zzS(w0 w0Var) {
    }

    public final void zzT(long j) {
    }

    public final void zzz(boolean z) {
    }

    public final void zzQ(l2 l2Var, N n) {
    }
}
