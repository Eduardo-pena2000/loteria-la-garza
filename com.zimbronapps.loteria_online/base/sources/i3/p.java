package I3;

import D3.b;
import M2.z;
import java.util.ArrayList;
import java.util.List;
import o3.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public static final s7.q d = s7.q.d(':');
    public static final s7.q e = s7.q.d('*');
    public final List a = new ArrayList();
    public int b = 0;
    public int c;

    public static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    public static int b(String str) {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw z.a("Invalid SEF name", null);
        }
    }

    public static D3.b f(P2.z zVar, int i) {
        ArrayList arrayList = new ArrayList();
        List f = e.f(zVar.D(i));
        for (int i2 = 0; i2 < f.size(); i2++) {
            List f2 = d.f((CharSequence) f.get(i2));
            if (f2.size() != 3) {
                throw z.a(null, null);
            }
            try {
                arrayList.add(new b.b(Long.parseLong((String) f2.get(0)), Long.parseLong((String) f2.get(1)), 1 << (Integer.parseInt((String) f2.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw z.a(null, e2);
            }
        }
        return new D3.b(arrayList);
    }

    public final void a(o3.q qVar, I i) {
        P2.z zVar = new P2.z(8);
        qVar.readFully(zVar.e(), 0, 8);
        this.c = zVar.t() + 8;
        if (zVar.p() != 1397048916) {
            i.a = 0L;
        } else {
            i.a = qVar.b() - (this.c - 12);
            this.b = 2;
        }
    }

    public int c(o3.q qVar, I i, List list) {
        int i2 = this.b;
        long j = 0;
        if (i2 == 0) {
            long a2 = qVar.a();
            if (a2 != -1 && a2 >= 8) {
                j = a2 - 8;
            }
            i.a = j;
            this.b = 1;
        } else if (i2 == 1) {
            a(qVar, i);
        } else if (i2 == 2) {
            d(qVar, i);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            e(qVar, list);
            i.a = 0L;
        }
        return 1;
    }

    public final void d(o3.q qVar, I i) {
        long a2 = qVar.a();
        int i2 = this.c - 20;
        P2.z zVar = new P2.z(i2);
        qVar.readFully(zVar.e(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            zVar.U(2);
            short v = zVar.v();
            if (v == 2192 || v == 2816 || v == 2817 || v == 2819 || v == 2820) {
                this.a.add(new a(v, (a2 - this.c) - zVar.t(), zVar.t()));
            } else {
                zVar.U(8);
            }
        }
        if (this.a.isEmpty()) {
            i.a = 0L;
        } else {
            this.b = 3;
            i.a = ((a) this.a.get(0)).b;
        }
    }

    public final void e(o3.q qVar, List list) {
        long b = qVar.b();
        int a2 = (int) ((qVar.a() - qVar.b()) - this.c);
        P2.z zVar = new P2.z(a2);
        qVar.readFully(zVar.e(), 0, a2);
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = (a) this.a.get(i);
            zVar.T((int) (aVar.b - b));
            zVar.U(4);
            int t = zVar.t();
            int b2 = b(zVar.D(t));
            int i2 = aVar.c - (t + 8);
            if (b2 == 2192) {
                list.add(f(zVar, i2));
            } else if (b2 != 2816 && b2 != 2817 && b2 != 2819 && b2 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }
}
