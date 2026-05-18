package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q {
    public static final q d = new q(true);
    public final d0 a;
    public boolean b;
    public boolean c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m0.b.values().length];
            b = iArr;
            try {
                iArr[m0.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[m0.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[m0.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[m0.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[m0.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[m0.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[m0.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[m0.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[m0.b.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[m0.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[m0.b.k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[m0.b.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[m0.b.o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[m0.b.q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[m0.b.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[m0.b.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[m0.b.t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[m0.b.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[m0.c.values().length];
            a = iArr2;
            try {
                iArr2[m0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[m0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[m0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[m0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[m0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[m0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[m0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[m0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[m0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        m0.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public q() {
        this.a = d0.u();
    }

    public static int b(m0.b bVar, int i, Object obj) {
        int O = i.O(i);
        if (bVar == m0.b.l) {
            O *= 2;
        }
        return O + c(bVar, obj);
    }

    public static int c(m0.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return i.i(((Double) obj).doubleValue());
            case 2:
                return i.q(((Float) obj).floatValue());
            case 3:
                return i.x(((Long) obj).longValue());
            case 4:
                return i.S(((Long) obj).longValue());
            case 5:
                return i.v(((Integer) obj).intValue());
            case 6:
                return i.o(((Long) obj).longValue());
            case 7:
                return i.m(((Integer) obj).intValue());
            case 8:
                return i.d(((Boolean) obj).booleanValue());
            case 9:
                return i.s((K) obj);
            case 10:
                return i.A((K) obj);
            case 11:
                return obj instanceof f ? i.g((f) obj) : i.N((String) obj);
            case 12:
                return obj instanceof f ? i.g((f) obj) : i.e((byte[]) obj);
            case 13:
                return i.Q(((Integer) obj).intValue());
            case 14:
                return i.F(((Integer) obj).intValue());
            case 15:
                return i.H(((Long) obj).longValue());
            case 16:
                return i.J(((Integer) obj).intValue());
            case 17:
                return i.L(((Long) obj).longValue());
            case 18:
                return i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        m0.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!bVar.isPacked()) {
            int i2 = 0;
            while (i < size) {
                i2 += b(liteType, number, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += c(liteType, list.get(i));
            i++;
        }
        return i.O(number) + i3 + i.Q(i3);
    }

    public static int i(m0.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.b();
    }

    public static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    public static boolean m(m0.b bVar, Object obj) {
        u.a(obj);
        switch (a.a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof f) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof K;
            default:
                return false;
        }
    }

    public static q r() {
        return new q();
    }

    public static void u(i iVar, m0.b bVar, int i, Object obj) {
        if (bVar == m0.b.l) {
            iVar.q0(i, (K) obj);
        } else {
            iVar.M0(i, i(bVar, false));
            v(iVar, bVar, obj);
        }
    }

    public static void v(i iVar, m0.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                iVar.h0(((Double) obj).doubleValue());
                break;
            case 2:
                iVar.p0(((Float) obj).floatValue());
                break;
            case 3:
                iVar.x0(((Long) obj).longValue());
                break;
            case 4:
                iVar.Q0(((Long) obj).longValue());
                break;
            case 5:
                iVar.v0(((Integer) obj).intValue());
                break;
            case 6:
                iVar.n0(((Long) obj).longValue());
                break;
            case 7:
                iVar.l0(((Integer) obj).intValue());
                break;
            case 8:
                iVar.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                iVar.s0((K) obj);
                break;
            case 10:
                iVar.z0((K) obj);
                break;
            case 11:
                if (!(obj instanceof f)) {
                    iVar.L0((String) obj);
                    break;
                } else {
                    iVar.f0((f) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof f)) {
                    iVar.c0((byte[]) obj);
                    break;
                } else {
                    iVar.f0((f) obj);
                    break;
                }
            case 13:
                iVar.O0(((Integer) obj).intValue());
                break;
            case 14:
                iVar.D0(((Integer) obj).intValue());
                break;
            case 15:
                iVar.F0(((Long) obj).longValue());
                break;
            case 16:
                iVar.H0(((Integer) obj).intValue());
                break;
            case 17:
                iVar.J0(((Long) obj).longValue());
                break;
            case 18:
                iVar.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q clone() {
        q r = r();
        int o = this.a.o();
        for (int i = 0; i < o; i++) {
            Map.Entry n = this.a.n(i);
            android.support.v4.media.session.b.a(n.getKey());
            r.s(null, n.getValue());
        }
        for (Map.Entry entry : this.a.q()) {
            android.support.v4.media.session.b.a(entry.getKey());
            r.s(null, entry.getValue());
        }
        r.c = this.c;
        return r;
    }

    public Iterator e() {
        return j() ? Collections.emptyIterator() : this.c ? new x(this.a.k().iterator()) : this.a.k().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.a.equals(((q) obj).a);
        }
        return false;
    }

    public int f() {
        int o = this.a.o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            i += g(this.a.n(i2));
        }
        Iterator it = this.a.q().iterator();
        while (it.hasNext()) {
            i += g((Map.Entry) it.next());
        }
        return i;
    }

    public final int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int o = this.a.o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            Map.Entry n = this.a.n(i2);
            android.support.v4.media.session.b.a(n.getKey());
            i += d(null, n.getValue());
        }
        for (Map.Entry entry : this.a.q()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i += d(null, entry.getValue());
        }
        return i;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean j() {
        return this.a.isEmpty();
    }

    public boolean k() {
        int o = this.a.o();
        for (int i = 0; i < o; i++) {
            if (!l(this.a.n(i))) {
                return false;
            }
        }
        Iterator it = this.a.q().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.c ? new x(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void o() {
        if (this.b) {
            return;
        }
        int o = this.a.o();
        for (int i = 0; i < o; i++) {
            Map.Entry n = this.a.n(i);
            if (n.getValue() instanceof t) {
                ((t) n.getValue()).z();
            }
        }
        this.a.t();
        this.b = true;
    }

    public void p(q qVar) {
        int o = qVar.a.o();
        for (int i = 0; i < o; i++) {
            q(qVar.a.n(i));
        }
        Iterator it = qVar.a.q().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.isRepeated()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.a.v(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(bVar.getNumber()), bVar.getLiteType().a(), obj.getClass().getName()}));
        }
    }

    public q(boolean z) {
        this(d0.u());
        o();
    }

    public q(d0 d0Var) {
        this.a = d0Var;
        o();
    }
}
