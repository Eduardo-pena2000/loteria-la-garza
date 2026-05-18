package Pb;

import Sb.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class l extends Ub.a {
    public final Sb.n a = new Sb.n();
    public final List b = new ArrayList();

    public static class a extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            return (hVar.d() < Rb.f.a || hVar.a() || (hVar.f().f() instanceof v)) ? Ub.f.c() : Ub.f.d(new l()).a(hVar.b() + Rb.f.a);
        }
    }

    public Ub.c c(Ub.h hVar) {
        return hVar.d() >= Rb.f.a ? Ub.c.a(hVar.b() + Rb.f.a) : hVar.a() ? Ub.c.b(hVar.e()) : Ub.c.d();
    }

    public Sb.a f() {
        return this.a;
    }

    public void g() {
        int size = this.b.size() - 1;
        while (size >= 0 && Rb.f.f((CharSequence) this.b.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size + 1; i++) {
            sb.append((CharSequence) this.b.get(i));
            sb.append('\n');
        }
        this.a.o(sb.toString());
    }

    public void h(Tb.f fVar) {
        this.b.add(fVar.a());
    }
}
