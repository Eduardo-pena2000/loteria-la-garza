package X2;

import M2.q;
import X2.k;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public final long a;
    public final q b;
    public final r c;
    public final long d;
    public final List e;
    public final List f;
    public final List g;
    public final i h;

    public static class c extends j {
        public final Uri i;
        public final long j;
        public final String k;
        public final i l;
        public final m m;

        public c(long j, q qVar, List list, k.e eVar, List list2, List list3, List list4, String str, long j2) {
            super(j, qVar, list, eVar, list2, list3, list4, null);
            this.i = Uri.parse(((X2.b) list.get(0)).a);
            i c = eVar.c();
            this.l = c;
            this.k = str;
            this.j = j2;
            this.m = c != null ? null : new m(new i(null, 0L, j2));
        }

        public String k() {
            return this.k;
        }

        public W2.g l() {
            return this.m;
        }

        public i m() {
            return this.l;
        }
    }

    public /* synthetic */ j(long j, q qVar, List list, k kVar, List list2, List list3, List list4, a aVar) {
        this(j, qVar, list, kVar, list2, list3, list4);
    }

    public static j o(long j, q qVar, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j, qVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j, qVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract W2.g l();

    public abstract i m();

    public i n() {
        return this.h;
    }

    public j(long j, q qVar, List list, k kVar, List list2, List list3, List list4) {
        P2.a.a(!list.isEmpty());
        this.a = j;
        this.b = qVar;
        this.c = r.n(list);
        this.e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f = list3;
        this.g = list4;
        this.h = kVar.a(this);
        this.d = kVar.b();
    }

    public static class b extends j implements W2.g {
        public final k.a i;

        public b(long j, q qVar, List list, k.a aVar, List list2, List list3, List list4) {
            super(j, qVar, list, aVar, list2, list3, list4, null);
            this.i = aVar;
        }

        public long a(long j, long j2) {
            return this.i.h(j, j2);
        }

        public long b(long j, long j2) {
            return this.i.d(j, j2);
        }

        public long c(long j) {
            return this.i.j(j);
        }

        public long d(long j, long j2) {
            return this.i.f(j, j2);
        }

        public i e(long j) {
            return this.i.k(this, j);
        }

        public long f(long j, long j2) {
            return this.i.i(j, j2);
        }

        public long g(long j) {
            return this.i.g(j);
        }

        public boolean h() {
            return this.i.l();
        }

        public long i() {
            return this.i.e();
        }

        public long j(long j, long j2) {
            return this.i.c(j, j2);
        }

        public String k() {
            return null;
        }

        public i m() {
            return null;
        }

        public W2.g l() {
            return this;
        }
    }
}
