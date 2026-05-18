package z5;

import H5.N;
import H5.X;
import android.content.Context;
import z5.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e {

    public static final class b implements v.a {
        public Context a;

        public b() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.a = (Context) B5.d.b(context);
            return this;
        }

        public v build() {
            B5.d.a(this.a, Context.class);
            return new c(this.a, null);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends v {
        public final c a;
        public Ba.a b;
        public Ba.a c;
        public Ba.a d;
        public Ba.a e;
        public Ba.a f;
        public Ba.a g;
        public Ba.a h;
        public Ba.a i;
        public Ba.a j;
        public Ba.a k;
        public Ba.a l;
        public Ba.a m;
        public Ba.a n;

        public /* synthetic */ c(Context context, a aVar) {
            this(context);
        }

        public H5.d a() {
            return (H5.d) this.h.get();
        }

        public u b() {
            return (u) this.n.get();
        }

        public final void c(Context context) {
            this.b = B5.a.a(k.a());
            B5.b a = B5.c.a(context);
            this.c = a;
            A5.j a2 = A5.j.a(a, J5.c.a(), J5.d.a());
            this.d = a2;
            this.e = B5.a.a(A5.l.a(this.c, a2));
            this.f = X.a(this.c, H5.g.a(), H5.i.a());
            this.g = B5.a.a(H5.h.a(this.c));
            this.h = B5.a.a(N.a(J5.c.a(), J5.d.a(), H5.j.a(), this.f, this.g));
            F5.g b = F5.g.b(J5.c.a());
            this.i = b;
            F5.i a3 = F5.i.a(this.c, this.h, b, J5.d.a());
            this.j = a3;
            Ba.a aVar = this.b;
            Ba.a aVar2 = this.e;
            Ba.a aVar3 = this.h;
            this.k = F5.d.a(aVar, aVar2, a3, aVar3, aVar3);
            Ba.a aVar4 = this.c;
            Ba.a aVar5 = this.e;
            Ba.a aVar6 = this.h;
            this.l = G5.s.a(aVar4, aVar5, aVar6, this.j, this.b, aVar6, J5.c.a(), J5.d.a(), this.h);
            Ba.a aVar7 = this.b;
            Ba.a aVar8 = this.h;
            this.m = G5.w.a(aVar7, aVar8, this.j, aVar8);
            this.n = B5.a.a(w.a(J5.c.a(), J5.d.a(), this.k, this.l, this.m));
        }

        public c(Context context) {
            this.a = this;
            c(context);
        }
    }

    public static v.a a() {
        return new b(null);
    }
}
