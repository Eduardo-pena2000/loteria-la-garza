package W2;

import P2.K;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import t7.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Random d;

    public b() {
        this(new Random());
    }

    public static /* synthetic */ int a(X2.b bVar, X2.b bVar2) {
        return d(bVar, bVar2);
    }

    public static void b(Object obj, long j, Map map) {
        if (map.containsKey(obj)) {
            j = Math.max(j, ((Long) K.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j));
    }

    public static int d(X2.b bVar, X2.b bVar2) {
        int compare = Integer.compare(bVar.c, bVar2.c);
        return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(((X2.b) list.get(i)).c));
        }
        return hashSet.size();
    }

    public static void h(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public final List c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.a);
        h(elapsedRealtime, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            X2.b bVar = (X2.b) list.get(i);
            if (!this.a.containsKey(bVar.b) && !this.b.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void e(X2.b bVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        b(bVar.b, elapsedRealtime, this.a);
        int i = bVar.c;
        if (i != Integer.MIN_VALUE) {
            b(Integer.valueOf(i), elapsedRealtime, this.b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List c = c(list);
        for (int i = 0; i < c.size(); i++) {
            hashSet.add(Integer.valueOf(((X2.b) c.get(i)).c));
        }
        return hashSet.size();
    }

    public void i() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    public X2.b j(List list) {
        List c = c(list);
        if (c.size() < 2) {
            return (X2.b) u.c(c, (Object) null);
        }
        Collections.sort(c, new a());
        ArrayList arrayList = new ArrayList();
        int i = ((X2.b) c.get(0)).c;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            X2.b bVar = (X2.b) c.get(i2);
            if (i == bVar.c) {
                arrayList.add(new Pair(bVar.b, Integer.valueOf(bVar.d)));
                i2++;
            } else if (arrayList.size() == 1) {
                return (X2.b) c.get(0);
            }
        }
        X2.b bVar2 = (X2.b) this.c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        X2.b k = k(c.subList(0, arrayList.size()));
        this.c.put(arrayList, k);
        return k;
    }

    public final X2.b k(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((X2.b) list.get(i2)).d;
        }
        int nextInt = this.d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            X2.b bVar = (X2.b) list.get(i4);
            i3 += bVar.d;
            if (nextInt < i3) {
                return bVar;
            }
        }
        return (X2.b) u.d(list);
    }

    public b(Random random) {
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
