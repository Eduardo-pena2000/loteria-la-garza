package Pb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c extends Ub.a {
    public final Sb.b a = new Sb.b();

    public static class a extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            int e = hVar.e();
            if (!c.j(hVar, e)) {
                return Ub.f.c();
            }
            int b = hVar.b() + hVar.d();
            int i = b + 1;
            if (Rb.f.j(hVar.c().a(), e + 1)) {
                i = b + 2;
            }
            return Ub.f.d(new c()).a(i);
        }
    }

    public static /* synthetic */ boolean j(Ub.h hVar, int i) {
        return l(hVar, i);
    }

    public static boolean l(Ub.h hVar, int i) {
        CharSequence a2 = hVar.c().a();
        return hVar.d() < Rb.f.a && i < a2.length() && a2.charAt(i) == '>';
    }

    public boolean a(Sb.a aVar) {
        return true;
    }

    public boolean b() {
        return true;
    }

    public Ub.c c(Ub.h hVar) {
        int e = hVar.e();
        if (!l(hVar, e)) {
            return Ub.c.d();
        }
        int b = hVar.b() + hVar.d();
        int i = b + 1;
        if (Rb.f.j(hVar.c().a(), e + 1)) {
            i = b + 2;
        }
        return Ub.c.a(i);
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Sb.b f() {
        return this.a;
    }
}
