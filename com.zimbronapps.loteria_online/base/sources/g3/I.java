package g3;

import T2.x0;
import java.util.List;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements Q {
    public final t7.r a;
    public long b;

    public static final class a implements Q {
        public final Q a;
        public final t7.r b;

        public a(Q q, List list) {
            this.a = q;
            this.b = t7.r.n(list);
        }

        public t7.r a() {
            return this.b;
        }

        public long b() {
            return this.a.b();
        }

        public boolean c() {
            return this.a.c();
        }

        public boolean d(x0 x0Var) {
            return this.a.d(x0Var);
        }

        public long f() {
            return this.a.f();
        }

        public void h(long j) {
            this.a.h(j);
        }
    }

    public i(List list, List list2) {
        r.a j = t7.r.j();
        P2.a.a(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            j.h(new a((Q) list.get(i), (List) list2.get(i)));
        }
        this.a = j.k();
        this.b = -9223372036854775807L;
    }

    public long b() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.a.size(); i++) {
            long b = ((a) this.a.get(i)).b();
            if (b != Long.MIN_VALUE) {
                j = Math.min(j, b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public boolean c() {
        for (int i = 0; i < this.a.size(); i++) {
            if (((a) this.a.get(i)).c()) {
                return true;
            }
        }
        return false;
    }

    public boolean d(x0 x0Var) {
        boolean z;
        boolean z2 = false;
        do {
            long b = b();
            if (b == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (int i = 0; i < this.a.size(); i++) {
                long b2 = ((a) this.a.get(i)).b();
                boolean z3 = b2 != Long.MIN_VALUE && b2 <= x0Var.a;
                if (b2 == b || z3) {
                    z |= ((a) this.a.get(i)).d(x0Var);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public long f() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = (a) this.a.get(i);
            long f = aVar.f();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
            if (f != Long.MIN_VALUE) {
                j2 = Math.min(j2, f);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    public void h(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).h(j);
        }
    }
}
