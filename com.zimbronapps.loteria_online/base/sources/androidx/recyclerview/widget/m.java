package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import w.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class m {
    public final w.a a = new w.a();
    public final x b = new x();

    public static class a {
        public static S1.e d = new S1.f(20);
        public int a;
        public RecyclerView.l.b b;
        public RecyclerView.l.b c;

        public static void a() {
            while (d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.B b, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void b(RecyclerView.B b);

        void c(RecyclerView.B b, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.B b, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    public void a(RecyclerView.B b2, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(b2);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(b2, aVar);
        }
        aVar.a |= 2;
        aVar.b = bVar;
    }

    public void b(RecyclerView.B b2) {
        a aVar = (a) this.a.get(b2);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(b2, aVar);
        }
        aVar.a |= 1;
    }

    public void c(long j, RecyclerView.B b2) {
        this.b.h(j, b2);
    }

    public void d(RecyclerView.B b2, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(b2);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(b2, aVar);
        }
        aVar.c = bVar;
        aVar.a |= 8;
    }

    public void e(RecyclerView.B b2, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(b2);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(b2, aVar);
        }
        aVar.b = bVar;
        aVar.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.a();
    }

    public RecyclerView.B g(long j) {
        return (RecyclerView.B) this.b.d(j);
    }

    public boolean h(RecyclerView.B b2) {
        a aVar = (a) this.a.get(b2);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.B b2) {
        a aVar = (a) this.a.get(b2);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.B b2) {
        p(b2);
    }

    public final RecyclerView.l.b l(RecyclerView.B b2, int i) {
        a aVar;
        RecyclerView.l.b bVar;
        int f = this.a.f(b2);
        if (f >= 0 && (aVar = (a) this.a.n(f)) != null) {
            int i2 = aVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.a = i3;
                if (i == 4) {
                    bVar = aVar.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.k(f);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    public RecyclerView.l.b m(RecyclerView.B b2) {
        return l(b2, 8);
    }

    public RecyclerView.l.b n(RecyclerView.B b2) {
        return l(b2, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.B b2 = (RecyclerView.B) this.a.h(size);
            a aVar = (a) this.a.k(size);
            int i = aVar.a;
            if ((i & 3) == 3) {
                bVar.b(b2);
            } else if ((i & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.b;
                if (bVar2 == null) {
                    bVar.b(b2);
                } else {
                    bVar.c(b2, bVar2, aVar.c);
                }
            } else if ((i & 14) == 14) {
                bVar.a(b2, aVar.b, aVar.c);
            } else if ((i & 12) == 12) {
                bVar.d(b2, aVar.b, aVar.c);
            } else if ((i & 4) != 0) {
                bVar.c(b2, aVar.b, null);
            } else if ((i & 8) != 0) {
                bVar.a(b2, aVar.b, aVar.c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.B b2) {
        a aVar = (a) this.a.get(b2);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.B b2) {
        int k = this.b.k() - 1;
        while (true) {
            if (k < 0) {
                break;
            }
            if (b2 == this.b.l(k)) {
                this.b.j(k);
                break;
            }
            k--;
        }
        a aVar = (a) this.a.remove(b2);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
