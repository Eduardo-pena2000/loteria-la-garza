package Tb;

import Pb.h;
import Pb.m;
import Pb.n;
import Pb.p;
import Sb.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e {
    public final List a;
    public final List b;
    public final d c;
    public final List d;
    public final Tb.a e;

    public static class b {
        public d e;
        public final List a = new ArrayList();
        public final List b = new ArrayList();
        public final List c = new ArrayList();
        public Set d = h.t();
        public Tb.a f = Tb.a.NONE;

        public class a implements d {
            public a() {
            }

            public Tb.b a(Tb.c cVar) {
                return new n(cVar);
            }
        }

        public static /* synthetic */ List a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ Set b(b bVar) {
            return bVar.d;
        }

        public static /* synthetic */ d c(b bVar) {
            return bVar.j();
        }

        public static /* synthetic */ List d(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ List e(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ Tb.a f(b bVar) {
            return bVar.f;
        }

        public e g() {
            return new e(this, null);
        }

        public b h(Vb.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.b.add(aVar);
            return this;
        }

        public b i(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Mb.a aVar = (Mb.a) it.next();
                if (aVar instanceof c) {
                    ((c) aVar).a(this);
                }
            }
            return this;
        }

        public final d j() {
            d dVar = this.e;
            return dVar != null ? dVar : new a();
        }
    }

    public interface c extends Mb.a {
        void a(b bVar);
    }

    public /* synthetic */ e(b bVar, a aVar) {
        this(bVar);
    }

    public static b a() {
        return new b();
    }

    public final h b() {
        return new h(this.a, this.c, this.b, this.e);
    }

    public s c(String str) {
        if (str != null) {
            return d(b().u(str));
        }
        throw new NullPointerException("input must not be null");
    }

    public final s d(s sVar) {
        Iterator it = this.d.iterator();
        if (!it.hasNext()) {
            return sVar;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public e(b bVar) {
        this.a = h.m(b.a(bVar), b.b(bVar));
        d c2 = b.c(bVar);
        this.c = c2;
        this.d = b.d(bVar);
        List e = b.e(bVar);
        this.b = e;
        this.e = b.f(bVar);
        c2.a(new m(e, new p()));
    }
}
