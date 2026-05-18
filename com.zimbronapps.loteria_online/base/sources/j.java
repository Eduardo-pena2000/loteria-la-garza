// default package

import Da.M;
import Da.r;
import Da.v;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static final /* synthetic */ boolean a(Object obj, Object obj2) {
        return c(obj, obj2);
    }

    public static final /* synthetic */ List b(Throwable th) {
        return d(th);
    }

    public static final boolean c(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            Collection X = r.X(objArr);
            if (!(X instanceof Collection) || !X.isEmpty()) {
                M it = X.iterator();
                while (it.hasNext()) {
                    int a = it.a();
                    if (!c(objArr[a], objArr2[a])) {
                        return false;
                    }
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Collection o = v.o((Collection) obj);
            if (!(o instanceof Collection) || !o.isEmpty()) {
                M it2 = o.iterator();
                while (it2.hasNext()) {
                    int a2 = it2.a();
                    if (!c(list.get(a2), list2.get(a2))) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return t.c(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey()) || !c(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final List d(Throwable th) {
        return v.q(new String[]{th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th)});
    }
}
