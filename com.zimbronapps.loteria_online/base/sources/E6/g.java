package E6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class g {
    public static List a(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List b(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.emptyList();
    }

    public static Map c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map h = h(3, false);
        h.put(obj, obj2);
        h.put(obj3, obj4);
        h.put(obj5, obj6);
        return Collections.unmodifiableMap(h);
    }

    public static Map d(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(objArr[0], objArr2[0]);
        }
        Map h = h(length, false);
        for (int i = 0; i < objArr.length; i++) {
            h.put(objArr[i], objArr2[i]);
        }
        return Collections.unmodifiableMap(h);
    }

    public static Set e(Object obj, Object obj2, Object obj3) {
        Set g = g(3, false);
        g.add(obj);
        g.add(obj2);
        g.add(obj3);
        return Collections.unmodifiableSet(g);
    }

    public static Set f(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Set g = g(2, false);
            g.add(obj);
            g.add(obj2);
            return Collections.unmodifiableSet(g);
        }
        if (length == 3) {
            return e(objArr[0], objArr[1], objArr[2]);
        }
        if (length != 4) {
            Set g2 = g(length, false);
            Collections.addAll(g2, objArr);
            return Collections.unmodifiableSet(g2);
        }
        Object obj3 = objArr[0];
        Object obj4 = objArr[1];
        Object obj5 = objArr[2];
        Object obj6 = objArr[3];
        Set g3 = g(4, false);
        g3.add(obj3);
        g3.add(obj4);
        g3.add(obj5);
        g3.add(obj6);
        return Collections.unmodifiableSet(g3);
    }

    public static Set g(int i, boolean z) {
        if (i <= (true != z ? 256 : 128)) {
            return new w.b(i);
        }
        return new HashSet(i, true != z ? 1.0f : 0.75f);
    }

    public static Map h(int i, boolean z) {
        return i <= 256 ? new w.a(i) : new HashMap(i, 1.0f);
    }
}
