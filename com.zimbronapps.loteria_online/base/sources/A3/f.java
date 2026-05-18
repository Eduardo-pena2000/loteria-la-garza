package a3;

import M2.m;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t7.r;
import t7.s;
import t7.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends h {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final m q;
    public final List r;
    public final List s;
    public final Map t;
    public final long u;
    public final f v;

    public static final class b extends e {
        public final boolean l;
        public final boolean m;

        public b(String str, d dVar, long j, int i, long j2, m mVar, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, mVar, str2, str3, j3, j4, z, null);
            this.l = z2;
            this.m = z3;
        }

        public b b(long j, int i) {
            return new b(this.a, this.b, this.c, i, j, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
    }

    public static final class c {
        public final Uri a;
        public final long b;
        public final int c;

        public c(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    public static class e implements Comparable {
        public final String a;
        public final d b;
        public final long c;
        public final int d;
        public final long e;
        public final m f;
        public final String g;
        public final String h;
        public final long i;
        public final long j;
        public final boolean k;

        public /* synthetic */ e(String str, d dVar, long j, int i, long j2, m mVar, String str2, String str3, long j3, long j4, boolean z, a aVar) {
            this(str, dVar, j, i, j2, mVar, str2, str3, j3, j4, z);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.e > l.longValue()) {
                return 1;
            }
            return this.e < l.longValue() ? -1 : 0;
        }

        public e(String str, d dVar, long j, int i, long j2, m mVar, String str2, String str3, long j3, long j4, boolean z) {
            this.a = str;
            this.b = dVar;
            this.c = j;
            this.d = i;
            this.e = j2;
            this.f = mVar;
            this.g = str2;
            this.h = str3;
            this.i = j3;
            this.j = j4;
            this.k = z;
        }
    }

    public static final class f {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public f(long j, boolean z, long j2, long j3, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public f(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, m mVar, List list2, List list3, f fVar, Map map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = mVar;
        this.r = r.n(list2);
        this.s = r.n(list3);
        this.t = s.e(map);
        if (!list3.isEmpty()) {
            b bVar = (b) u.d(list3);
            this.u = bVar.e + bVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            d dVar = (d) u.d(list2);
            this.u = dVar.e + dVar.c;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = fVar;
    }

    public f c(long j, int i) {
        return new f(this.d, this.a, this.b, this.e, this.g, j, true, i, this.k, this.l, this.m, this.n, this.c, this.o, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public f d() {
        return this.o ? this : new f(this.d, this.a, this.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, true, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public long e() {
        return this.h + this.u;
    }

    public boolean f(f fVar) {
        if (fVar == null) {
            return true;
        }
        long j = this.k;
        long j2 = fVar.k;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.r.size() - fVar.r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.s.size();
        int size3 = fVar.s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.o && !fVar.o;
        }
        return true;
    }

    public static final class d extends e {
        public final String l;
        public final List m;

        public d(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, r.s());
        }

        public d b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                b bVar = (b) this.m.get(i2);
                arrayList.add(bVar.b(j2, i));
                j2 += bVar.c;
            }
            return new d(this.a, this.b, this.l, this.c, i, j, this.f, this.g, this.h, this.i, this.j, this.k, arrayList);
        }

        public d(String str, d dVar, String str2, long j, int i, long j2, m mVar, String str3, String str4, long j3, long j4, boolean z, List list) {
            super(str, dVar, j, i, j2, mVar, str3, str4, j3, j4, z, null);
            this.l = str2;
            this.m = r.n(list);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List list) {
        return this;
    }
}
