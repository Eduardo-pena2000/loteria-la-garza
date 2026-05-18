package Z2;

import L3.s;
import M2.q;
import M2.x;
import M2.y;
import P2.E;
import U2.x1;
import U3.J;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements h {
    public static final int[] f = {8, 13, 11, 2, 0, 1, 7};
    public final int b;
    public s.a c;
    public boolean d;
    public final boolean e;

    public d() {
        this(0, true);
    }

    public static void d(int i, List list) {
        if (w7.f.i(f, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    public static I3.h g(s.a aVar, boolean z, E e, M2.q qVar, List list) {
        int i = j(qVar) ? 4 : 0;
        if (!z) {
            aVar = s.a.a;
            i |= 32;
        }
        s.a aVar2 = aVar;
        int i2 = i;
        if (list == null) {
            list = t7.r.s();
        }
        return new I3.h(aVar2, i2, e, null, list, null);
    }

    public static J h(int i, boolean z, M2.q qVar, List list, E e, s.a aVar, boolean z2) {
        int i2;
        int i3 = i | 16;
        if (list != null) {
            i3 = i | 48;
        } else {
            list = z ? Collections.singletonList(new q.b().o0("application/cea-608").K()) : Collections.emptyList();
        }
        String str = qVar.j;
        if (!TextUtils.isEmpty(str)) {
            if (!y.b(str, "audio/mp4a-latm")) {
                i3 |= 2;
            }
            if (!y.b(str, "video/avc")) {
                i3 |= 4;
            }
        }
        if (z2) {
            i2 = 0;
        } else {
            aVar = s.a.a;
            i2 = 1;
        }
        return new J(2, i2, aVar, e, new U3.j(i3, list), 112800);
    }

    public static boolean j(M2.q qVar) {
        x xVar = qVar.k;
        if (xVar == null) {
            return false;
        }
        for (int i = 0; i < xVar.j(); i++) {
            if (xVar.i(i) instanceof t) {
                return !((t) r2).c.isEmpty();
            }
        }
        return false;
    }

    public static boolean k(o3.p pVar, o3.q qVar) {
        try {
            boolean d = pVar.d(qVar);
            qVar.f();
            return d;
        } catch (EOFException unused) {
            qVar.f();
            return false;
        } catch (Throwable th) {
            qVar.f();
            throw th;
        }
    }

    public M2.q b(M2.q qVar) {
        String str;
        if (!this.d || !this.c.a(qVar)) {
            return qVar;
        }
        q.b S = qVar.a().o0("application/x-media3-cues").S(this.c.c(qVar));
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.n);
        if (qVar.j != null) {
            str = " " + qVar.j;
        } else {
            str = "";
        }
        sb.append(str);
        return S.O(sb.toString()).s0(Long.MAX_VALUE).K();
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b c(Uri uri, M2.q qVar, List list, E e, Map map, o3.q qVar2, x1 x1Var) {
        int a = M2.o.a(qVar.n);
        int b = M2.o.b(map);
        int c = M2.o.c(uri);
        int[] iArr = f;
        ArrayList arrayList = new ArrayList(iArr.length);
        d(a, arrayList);
        d(b, arrayList);
        d(c, arrayList);
        for (int i : iArr) {
            d(i, arrayList);
        }
        qVar2.f();
        o3.p pVar = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            o3.p pVar2 = (o3.p) P2.a.e(f(intValue, qVar, list, e));
            if (k(pVar2, qVar2)) {
                return new b(pVar2, qVar, e, this.c, this.d);
            }
            if (pVar == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                pVar = pVar2;
            }
        }
        return new b((o3.p) P2.a.e(pVar), qVar, e, this.c, this.d);
    }

    public final o3.p f(int i, M2.q qVar, List list, E e) {
        if (i == 0) {
            return new U3.b();
        }
        if (i == 1) {
            return new U3.e();
        }
        if (i == 2) {
            return new U3.h();
        }
        if (i == 7) {
            return new H3.f(0, 0L);
        }
        if (i == 8) {
            return g(this.c, this.d, e, qVar, list);
        }
        if (i == 11) {
            return h(this.b, this.e, qVar, list, e, this.c, this.d);
        }
        if (i != 13) {
            return null;
        }
        return new w(qVar.d, e, this.c, this.d);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public d a(boolean z) {
        this.d = z;
        return this;
    }

    public d(int i, boolean z) {
        this.b = i;
        this.e = z;
        this.c = new L3.h();
    }
}
