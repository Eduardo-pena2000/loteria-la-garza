package b6;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdye;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k0 {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Context c;
    public final zzdye d;
    public final ExecutorService e;

    public k0(Context context, zzdye zzdyeVar, ExecutorService executorService) {
        this.c = context;
        this.d = zzdyeVar;
        this.e = executorService;
    }

    public final synchronized void a() {
        h(true);
        h(false);
    }

    public final synchronized void b(Object obj, e6.b bVar) {
        zzcei.zzf.execute(new j0(this, obj, new Pair(bVar, Long.valueOf(R5.t.o().a()))));
    }

    public final synchronized void c(boolean z, m0 m0Var) {
        try {
            Map map = this.a;
            Boolean valueOf = Boolean.valueOf(z);
            m0 m0Var2 = (m0) map.get(valueOf);
            if (m0Var2 == null || m0Var2.c() || m0Var2.a() == null || m0Var.a() != null) {
                map.put(valueOf, m0Var);
            }
            zzcei.zzd.schedule(new g0(this, z, m0Var.a() == null), (m0Var.a() != null ? (Long) zzbjj.zzf.zze() : (Long) zzbjj.zzg.zze()).longValue(), TimeUnit.SECONDS);
            Map map2 = this.b;
            List list = (List) map2.get(valueOf);
            map2.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j(m0Var, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final /* synthetic */ void d(Object obj, Pair pair) {
        boolean z = false;
        if (obj instanceof WebView) {
            CookieManager a = R5.t.j().a(this.c);
            if (a != null) {
                z = a.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.a;
        Boolean valueOf = Boolean.valueOf(z);
        m0 m0Var = (m0) map.get(valueOf);
        if (m0Var != null && !m0Var.c()) {
            j(m0Var, pair, true);
            return;
        }
        Map map2 = this.b;
        ArrayList arrayList = (List) map2.get(valueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(valueOf, arrayList);
        }
        arrayList.add(pair);
    }

    public final /* synthetic */ void f(boolean z) {
        e(z, false);
    }

    public final /* synthetic */ Object g(AdRequest adRequest, l0 l0Var) {
        e6.a.a(this.c, L5.c.BANNER, adRequest, l0Var);
        return Boolean.TRUE;
    }

    public final void h(boolean z) {
        Map map = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new ArrayList());
        this.e.submit(new h0(this, z));
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void e(boolean z, boolean z2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            Map map = this.a;
            Boolean valueOf = Boolean.valueOf(z);
            m0 m0Var = (m0) map.get(valueOf);
            int i = 0;
            if (z2 && m0Var != null) {
                i = m0Var.d() + 1;
            }
            m0 m0Var2 = (m0) map.get(valueOf);
            l0 l0Var = new l0(this, z, i, m0Var2 == null ? null : Boolean.valueOf(m0Var2.e()), this.d);
            AdRequest o = ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).o();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmA)).booleanValue()) {
                this.e.submit(new i0(this, o, l0Var));
            } else {
                e6.a.a(this.c, L5.c.BANNER, o, l0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(m0 m0Var, Pair pair, boolean z) {
        m0Var.f();
        e6.a a = m0Var.a();
        if (a != null) {
            ((e6.b) pair.first).onSuccess(a);
        } else {
            ((e6.b) pair.first).onFailure(m0Var.b());
        }
        c.e(this.d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", L5.c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(R5.t.o().a() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(m0Var.a() != null)));
    }
}
