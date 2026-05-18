package j8;

import Ca.I;
import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import s2.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class u {
    public static final f.a b = s2.i.f("fire-global");
    public static final f.a c = s2.i.f("fire-count");
    public static final f.a d = s2.i.g("last-used-date");
    public final b8.c a;

    public u(Context context, String str) {
        this.a = new b8.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ I a(long j, s2.c cVar) {
        return n(j, cVar);
    }

    public static /* synthetic */ I b(u uVar, String str, String str2, f.a aVar, s2.c cVar) {
        return uVar.m(str, str2, aVar, cVar);
    }

    public static /* synthetic */ I c(u uVar, s2.c cVar) {
        return uVar.k(cVar);
    }

    public static /* synthetic */ I d(u uVar, String str, s2.c cVar) {
        return uVar.l(str, cVar);
    }

    public static /* synthetic */ I n(long j, s2.c cVar) {
        cVar.j(b, Long.valueOf(j));
        return null;
    }

    public final synchronized long e(s2.c cVar) {
        long j;
        try {
            long longValue = ((Long) b8.d.a(cVar, c, 0L)).longValue();
            String str = "";
            Collection hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Collection<String> collection = (Set) entry.getValue();
                    for (String str3 : collection) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((f.a) entry.getKey()).a();
                            hashSet = collection;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            cVar.j(s2.i.h(str), hashSet2);
            j = longValue - 1;
            cVar.j(c, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public synchronized void f() {
        this.a.g(new r(this));
    }

    public synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String h = h(System.currentTimeMillis());
            for (Map.Entry entry : this.a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(h);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(v.a(((f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            t(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String h(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.a(m.a(l.a(com.applovin.shadow.okhttp3.a.a(new Date(j)), k.a())), n.a());
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized f.a i(s2.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return s2.i.h(((f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean j(long j, long j2) {
        return h(j).equals(h(j2));
    }

    public final /* synthetic */ I k(s2.c cVar) {
        long j = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a aVar = (f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String h = h(System.currentTimeMillis());
                if (set.contains(h)) {
                    cVar.j(aVar, p.a(h));
                    j++;
                } else {
                    cVar.i(aVar);
                }
            }
        }
        if (j == 0) {
            cVar.i(c);
            return null;
        }
        cVar.j(c, Long.valueOf(j));
        return null;
    }

    public final /* synthetic */ I l(String str, s2.c cVar) {
        cVar.j(d, str);
        p(cVar, str);
        return null;
    }

    public final /* synthetic */ I m(String str, String str2, f.a aVar, s2.c cVar) {
        f.a aVar2 = d;
        if (((String) b8.d.a(cVar, aVar2, "")).equals(str)) {
            f.a i = i(cVar, str);
            if (i == null || i.a().equals(str2)) {
                return null;
            }
            u(cVar, aVar, str);
            return null;
        }
        f.a aVar3 = c;
        long longValue = ((Long) b8.d.a(cVar, aVar3, 0L)).longValue();
        if (longValue + 1 == 30) {
            longValue = e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) b8.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.j(aVar, hashSet);
        cVar.j(aVar3, Long.valueOf(longValue + 1));
        cVar.j(aVar2, str);
        return null;
    }

    public synchronized void o() {
        this.a.g(new s(this, h(System.currentTimeMillis())));
    }

    public final synchronized void p(s2.c cVar, String str) {
        try {
            f.a i = i(cVar, str);
            if (i == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) b8.d.a(cVar, i, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.i(i);
            } else {
                cVar.j(i, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean q(long j) {
        return r(b, j);
    }

    public synchronized boolean r(f.a aVar, long j) {
        if (j(((Long) this.a.j(aVar, -1L)).longValue(), j)) {
            return false;
        }
        this.a.k(aVar, Long.valueOf(j));
        return true;
    }

    public synchronized void s(long j, String str) {
        this.a.g(new q(this, h(j), str, s2.i.h(str)));
    }

    public synchronized void t(long j) {
        this.a.g(new t(j));
    }

    public final synchronized void u(s2.c cVar, f.a aVar, String str) {
        p(cVar, str);
        HashSet hashSet = new HashSet((Collection) b8.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.j(aVar, hashSet);
    }
}
