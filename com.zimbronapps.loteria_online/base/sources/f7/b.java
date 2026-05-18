package F7;

import B7.g;
import F7.a;
import G7.f;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.measurement.zzfb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k7.W3;
import k7.l5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b implements F7.a {
    public static volatile F7.a c;
    public final j7.a a;
    public final Map b;

    public class a implements a.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ b b;

        public a(b bVar, String str) {
            this.a = str;
            Objects.requireNonNull(bVar);
            this.b = bVar;
        }
    }

    public b(j7.a aVar) {
        t.l(aVar);
        this.a = aVar;
        this.b = new ConcurrentHashMap();
    }

    public static F7.a h(g gVar, Context context, i8.d dVar) {
        t.l(gVar);
        t.l(context);
        t.l(dVar);
        t.l(context.getApplicationContext());
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (gVar.y()) {
                            dVar.b(B7.b.class, d.a, c.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.x());
                        }
                        c = new b(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void i(i8.a aVar) {
        boolean z = ((B7.b) aVar.a()).a;
        synchronized (b.class) {
            ((b) t.l(c)).a.i(z);
        }
    }

    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (G7.b.a(str) && G7.b.b(str2, bundle) && G7.b.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.e(str, str2, bundle);
        }
    }

    public a.a b(String str, a.b bVar) {
        t.l(bVar);
        if (G7.b.a(str) && !j(str)) {
            j7.a aVar = this.a;
            Object dVar = "fiam".equals(str) ? new G7.d(aVar, bVar) : "clx".equals(str) ? new f(aVar, bVar) : null;
            if (dVar != null) {
                this.b.put(str, dVar);
                return new a(this, str);
            }
        }
        return null;
    }

    public void c(String str, String str2, Object obj) {
        if (G7.b.a(str) && G7.b.d(str, str2)) {
            this.a.h(str, str2, obj);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || G7.b.b(str2, bundle)) {
            this.a.a(str, str2, bundle);
        }
    }

    public Map d(boolean z) {
        return this.a.d(null, null, z);
    }

    public void e(a.c cVar) {
        String str;
        t7.t tVar = G7.b.a;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.c;
        if ((obj == null || l5.b(obj) != null) && G7.b.a(str) && G7.b.d(str, cVar.b)) {
            String str2 = cVar.k;
            if (str2 == null || (G7.b.b(str2, cVar.l) && G7.b.e(str, cVar.k, cVar.l))) {
                String str3 = cVar.h;
                if (str3 == null || (G7.b.b(str3, cVar.i) && G7.b.e(str, cVar.h, cVar.i))) {
                    String str4 = cVar.f;
                    if (str4 == null || (G7.b.b(str4, cVar.g) && G7.b.e(str, cVar.f, cVar.g))) {
                        j7.a aVar = this.a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.c;
                        if (obj2 != null) {
                            W3.a(bundle, obj2);
                        }
                        String str7 = cVar.d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.e);
                        String str8 = cVar.f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.j);
                        String str10 = cVar.k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.m);
                        bundle.putBoolean("active", cVar.n);
                        bundle.putLong("triggered_timestamp", cVar.o);
                        aVar.g(bundle);
                    }
                }
            }
        }
    }

    public int f(String str) {
        return this.a.c(str);
    }

    public List g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.b(str, str2)) {
            t7.t tVar = G7.b.a;
            t.l(bundle);
            a.c cVar = new a.c();
            cVar.a = (String) t.l((String) W3.b(bundle, "origin", String.class, null));
            cVar.b = (String) t.l((String) W3.b(bundle, "name", String.class, null));
            cVar.c = W3.b(bundle, "value", Object.class, null);
            cVar.d = (String) W3.b(bundle, "trigger_event_name", String.class, null);
            cVar.e = ((Long) W3.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f = (String) W3.b(bundle, "timed_out_event_name", String.class, null);
            cVar.g = (Bundle) W3.b(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.h = (String) W3.b(bundle, "triggered_event_name", String.class, null);
            cVar.i = (Bundle) W3.b(bundle, "triggered_event_params", Bundle.class, null);
            cVar.j = ((Long) W3.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.k = (String) W3.b(bundle, "expired_event_name", String.class, null);
            cVar.l = (Bundle) W3.b(bundle, "expired_event_params", Bundle.class, null);
            cVar.n = ((Boolean) W3.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.m = ((Long) W3.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.o = ((Long) W3.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final boolean j(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.b;
        return map.containsKey(str) && map.get(str) != null;
    }
}
