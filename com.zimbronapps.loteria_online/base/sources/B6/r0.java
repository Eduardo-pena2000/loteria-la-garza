package b6;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r0 {
    public final zzdye h;
    public Map i;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final int a = ((Integer) S5.D.c().zzd(zzbhe.zzhP)).intValue();
    public final long b = ((Long) S5.D.c().zzd(zzbhe.zzhQ)).longValue();
    public final boolean c = ((Boolean) S5.D.c().zzd(zzbhe.zzhU)).booleanValue();
    public final boolean d = ((Boolean) S5.D.c().zzd(zzbhe.zzhT)).booleanValue();
    public final Map e = Collections.synchronizedMap(new o0(this));

    public r0(zzdye zzdyeVar) {
        this.h = zzdyeVar;
    }

    public static final void l(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void a(String str, String str2, zzdxt zzdxtVar) {
        this.e.put(str, new p0(Long.valueOf(R5.t.o().a()), str2, new HashSet()));
        i();
        j(zzdxtVar);
    }

    public final synchronized String b(String str, zzdxt zzdxtVar) {
        p0 p0Var = (p0) this.e.get(str);
        zzdxtVar.zzc().put("request_id", str);
        if (p0Var == null) {
            zzdxtVar.zzc().put("mhit", "false");
            return null;
        }
        zzdxtVar.zzc().put("mhit", "true");
        return p0Var.b;
    }

    public final synchronized void c(String str) {
        this.e.remove(str);
    }

    public final synchronized boolean d(String str, String str2) {
        p0 p0Var = (p0) this.e.get(str);
        if (p0Var != null) {
            if (p0Var.c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean e(String str, String str2, int i) {
        p0 p0Var = (p0) this.e.get(str);
        if (p0Var == null) {
            return false;
        }
        Set set = p0Var.c;
        set.add(str2);
        return set.size() < i;
    }

    public final /* synthetic */ void f(zzdxt zzdxtVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        k(zzdxtVar, arrayDeque, "to");
        k(zzdxtVar, arrayDeque2, "of");
    }

    public final /* synthetic */ int g() {
        return this.a;
    }

    public final /* synthetic */ ArrayDeque h() {
        return this.f;
    }

    public final synchronized void i() {
        long a = R5.t.o().a();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a - ((p0) entry.getValue()).a.longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), ((p0) entry.getValue()).b));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            R5.t.l().zzg(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized void j(zzdxt zzdxtVar) {
        if (this.c) {
            ArrayDeque arrayDeque = this.g;
            ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f;
            ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcei.zza.execute(new q0(this, zzdxtVar, clone, clone2));
        }
    }

    public final void k(zzdxt zzdxtVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdxtVar.zzc());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(c.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.i, "e_type", (String) pair.first);
                l(this.i, "e_agent", (String) pair.second);
            }
            this.h.zzb(this.i);
        }
    }
}
