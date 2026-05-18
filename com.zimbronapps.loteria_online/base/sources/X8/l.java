package x8;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import w8.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class l {
    public static final Charset e = Charset.forName("UTF-8");
    public static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    public final Set a = new HashSet();
    public final Executor b;
    public final e c;
    public final e d;

    public l(Executor executor, e eVar, e eVar2) {
        this.b = executor;
        this.c = eVar;
        this.d = eVar2;
    }

    public static /* synthetic */ void a(E6.d dVar, String str, com.google.firebase.remoteconfig.internal.b bVar) {
        i(dVar, str, bVar);
    }

    public static com.google.firebase.remoteconfig.internal.b e(e eVar) {
        return eVar.f();
    }

    public static Set f(e eVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.b e2 = e(eVar);
        if (e2 == null) {
            return hashSet;
        }
        Iterator keys = e2.g().keys();
        while (keys.hasNext()) {
            hashSet.add((String) keys.next());
        }
        return hashSet;
    }

    public static String g(e eVar, String str) {
        com.google.firebase.remoteconfig.internal.b e2 = e(eVar);
        if (e2 == null) {
            return null;
        }
        try {
            return e2.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static /* synthetic */ void i(E6.d dVar, String str, com.google.firebase.remoteconfig.internal.b bVar) {
        dVar.accept(str, bVar);
    }

    public static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    public void b(E6.d dVar) {
        synchronized (this.a) {
            this.a.add(dVar);
        }
    }

    public final void c(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    this.b.execute(new k((E6.d) it.next(), str, bVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.c));
        hashSet.addAll(f(this.d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public v h(String str) {
        String g2 = g(this.c, str);
        if (g2 != null) {
            c(str, e(this.c));
            return new q(g2, 2);
        }
        String g3 = g(this.d, str);
        if (g3 != null) {
            return new q(g3, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
