package T4;

import Ca.l;
import Ca.m;
import T4.b;
import android.content.Context;
import c5.c;
import e5.h;
import j5.i;
import j5.o;
import j5.s;
import kotlin.jvm.internal.u;
import okhttp3.OkHttpClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface d {

    public static final class a {
        public final Context a;
        public e5.c b = i.b();
        public l c = null;
        public l d = null;
        public l e = null;
        public b.c f = null;
        public T4.a g = null;
        public o h = new o(false, false, false, 0, null, 31, null);

        public static final class a extends u implements Qa.a {
            public a() {
                super(0);
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c5.c invoke() {
                return new c.a(a.a(a.this)).a();
            }
        }

        public static final class b extends u implements Qa.a {
            public b() {
                super(0);
            }

            public final W4.a invoke() {
                return s.a.a(a.a(a.this));
            }
        }

        public static final class c extends u implements Qa.a {
            public static final c a = new c();

            public c() {
                super(0);
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient invoke() {
                return new OkHttpClient();
            }
        }

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        public static final /* synthetic */ Context a(a aVar) {
            return aVar.a;
        }

        public final d b() {
            Context context = this.a;
            e5.c cVar = this.b;
            l lVar = this.c;
            if (lVar == null) {
                lVar = m.b(new a());
            }
            l lVar2 = lVar;
            l lVar3 = this.d;
            if (lVar3 == null) {
                lVar3 = m.b(new b());
            }
            l lVar4 = lVar3;
            l lVar5 = this.e;
            if (lVar5 == null) {
                lVar5 = m.b(c.a);
            }
            l lVar6 = lVar5;
            b.c cVar2 = this.f;
            if (cVar2 == null) {
                cVar2 = b.c.b;
            }
            b.c cVar3 = cVar2;
            T4.a aVar = this.g;
            if (aVar == null) {
                aVar = new T4.a();
            }
            return new e(context, cVar, lVar2, lVar4, lVar6, cVar3, aVar, this.h, null);
        }

        public final a c(T4.a aVar) {
            this.g = aVar;
            return this;
        }

        public final a d(Qa.a aVar) {
            this.d = m.b(aVar);
            return this;
        }
    }

    e5.c a();

    Object b(h hVar, Ga.e eVar);

    e5.e c(h hVar);

    c5.c d();

    T4.a getComponents();
}
