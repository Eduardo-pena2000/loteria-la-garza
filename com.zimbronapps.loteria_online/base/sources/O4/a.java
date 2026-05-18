package o4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static volatile a d;
    public static final Object e = new Object();
    public final Context c;
    public final Set b = new HashSet();
    public final Map a = new HashMap();

    public a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static a e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void a() {
        try {
            try {
                p4.a.c("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new d((Throwable) e2);
            }
        } finally {
            p4.a.f();
        }
    }

    public void b(Bundle bundle) {
        String string = this.c.getString(c.a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new d((Throwable) e2);
            }
        }
    }

    public Object c(Class cls) {
        Object obj;
        synchronized (e) {
            try {
                obj = this.a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final Object d(Class cls, Set set) {
        Object obj;
        if (p4.a.h()) {
            try {
                p4.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                p4.a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
        }
        if (this.a.containsKey(cls)) {
            obj = this.a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = bVar.create(this.c);
                set.remove(cls);
                this.a.put(cls, obj);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        p4.a.f();
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.b.contains(cls);
    }
}
