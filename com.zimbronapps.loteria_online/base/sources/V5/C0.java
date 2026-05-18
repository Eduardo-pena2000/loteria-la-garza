package V5;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbhe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c0 {
    public final Map a = new HashMap();
    public final List b = new ArrayList();
    public final Context c;

    public c0(Context context) {
        this.c = context;
    }

    public final void a() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlR)).booleanValue()) {
            R5.t.g();
            Map m0 = F0.m0((String) S5.D.c().zzd(zzbhe.zzlW));
            Iterator it = m0.keySet().iterator();
            while (it.hasNext()) {
                c((String) it.next());
            }
            b(new b0(m0));
        }
    }

    public final synchronized void b(a0 a0Var) {
        this.b.add(a0Var);
    }

    public final synchronized void c(String str) {
        try {
            Map map = this.a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
            Z z = new Z(this, str);
            map.put(str, z);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ List d() {
        return this.b;
    }
}
