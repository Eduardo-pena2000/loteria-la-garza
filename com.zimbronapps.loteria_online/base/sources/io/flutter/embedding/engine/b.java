package io.flutter.embedding.engine;

import T9.a;
import W9.f;
import android.content.Context;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b {
    public final List a = new ArrayList();

    public class a implements a.b {
        public final /* synthetic */ io.flutter.embedding.engine.a a;

        public a(io.flutter.embedding.engine.a aVar) {
            this.a = aVar;
        }

        public void a() {
        }

        public void b() {
            b.this.a.remove(this.a);
        }
    }

    public static class b {
        public Context a;
        public a.c b;
        public String c;
        public List d;
        public u e;
        public boolean f = true;
        public boolean g = false;

        public b(Context context) {
            this.a = context;
        }

        public boolean a() {
            return this.f;
        }

        public Context b() {
            return this.a;
        }

        public a.c c() {
            return this.b;
        }

        public List d() {
            return this.d;
        }

        public String e() {
            return this.c;
        }

        public u f() {
            return this.e;
        }

        public boolean g() {
            return this.g;
        }

        public b h(boolean z) {
            this.f = z;
            return this;
        }

        public b i(a.c cVar) {
            this.b = cVar;
            return this;
        }

        public b j(List list) {
            this.d = list;
            return this;
        }

        public b k(String str) {
            this.c = str;
            return this;
        }

        public b l(boolean z) {
            this.g = z;
            return this;
        }
    }

    public b(Context context, String[] strArr) {
        f c = Q9.a.e().c();
        if (c.p()) {
            return;
        }
        c.t(context.getApplicationContext());
        c.h(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(b bVar) {
        io.flutter.embedding.engine.a E;
        Context b2 = bVar.b();
        a.c c = bVar.c();
        String e = bVar.e();
        List d = bVar.d();
        u f = bVar.f();
        if (f == null) {
            f = new u();
        }
        u uVar = f;
        boolean a2 = bVar.a();
        boolean g = bVar.g();
        a.c a3 = c == null ? a.c.a() : c;
        if (this.a.size() == 0) {
            E = b(b2, uVar, a2, g);
            if (e != null) {
                E.o().c(e);
            }
            E.k().j(a3, d);
        } else {
            E = ((io.flutter.embedding.engine.a) this.a.get(0)).E(b2, a3, e, d, uVar, a2, g);
        }
        this.a.add(E);
        E.f(new a(E));
        return E;
    }

    public io.flutter.embedding.engine.a b(Context context, u uVar, boolean z, boolean z2) {
        return new io.flutter.embedding.engine.a(context, null, null, uVar, null, z, z2, this);
    }
}
