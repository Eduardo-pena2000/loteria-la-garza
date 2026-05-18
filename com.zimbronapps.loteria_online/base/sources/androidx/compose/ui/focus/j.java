package androidx.compose.ui.focus;

import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final a b = new a(null);
    public static final j c = new j();
    public static final j d = new j();
    public static final j e = new j();
    public final d0.c a = new d0.c(new t0.n[16], 0);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final j a() {
            return j.a();
        }

        public final j b() {
            return j.b();
        }

        public final j c() {
            return j.c();
        }

        public a() {
        }
    }

    public static final class b extends u implements Qa.l {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.a = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.q(this.a));
        }
    }

    public static final /* synthetic */ j a() {
        return d;
    }

    public static final /* synthetic */ j b() {
        return c;
    }

    public static final /* synthetic */ j c() {
        return e;
    }

    public static /* synthetic */ boolean h(j jVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c.b.b();
        }
        return jVar.g(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0069, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(Qa.l r18) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.j.d(Qa.l):boolean");
    }

    public final d0.c e() {
        return this.a;
    }

    public final /* synthetic */ void f() {
        g(c.b.b());
    }

    public final boolean g(int i) {
        return d(new b(i));
    }
}
