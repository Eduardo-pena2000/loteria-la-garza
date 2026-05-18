package L7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f {
    public final Object a;
    public final c b;

    public static class b implements c {
        public final Class a;

        public /* synthetic */ b(Class cls, a aVar) {
            this(cls);
        }

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class cls) {
            this.a = cls;
        }
    }

    public interface c {
        List a(Object obj);
    }

    public f(Object obj, c cVar) {
        this.a = obj;
        this.b = cVar;
    }

    public static /* synthetic */ ComponentRegistrar a(String str) {
        return e(str);
    }

    public static f c(Context context, Class cls) {
        return new f(context, new b(cls, null));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            }
            throw new v(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (NoSuchMethodException e) {
            throw new v(String.format("Could not instantiate %s", new Object[]{str}), e);
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (InvocationTargetException e2) {
            throw new v(String.format("Could not instantiate %s", new Object[]{str}), e2);
        } catch (InstantiationException e3) {
            throw new v(String.format("Could not instantiate %s.", new Object[]{str}), e3);
        } catch (IllegalAccessException e4) {
            throw new v(String.format("Could not instantiate %s.", new Object[]{str}), e4);
        }
    }

    public static /* synthetic */ ComponentRegistrar e(String str) {
        return d(str);
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.a(this.a).iterator();
        while (it.hasNext()) {
            arrayList.add(new e((String) it.next()));
        }
        return arrayList;
    }
}
