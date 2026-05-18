package Pb;

import Sb.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class o {
    public StringBuilder e;
    public String f;
    public char g;
    public StringBuilder h;
    public b a = b.START_DEFINITION;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public boolean i = false;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public void a(x xVar) {
        this.d.add(xVar);
    }

    public final boolean b(Qb.m mVar) {
        mVar.r();
        Qb.l o = mVar.o();
        if (!Rb.e.a(mVar)) {
            return false;
        }
        String c = mVar.d(o, mVar.o()).c();
        if (c.startsWith("<")) {
            c = c.substring(1, c.length() - 1);
        }
        this.f = c;
        int r = mVar.r();
        if (!mVar.e()) {
            this.i = true;
            this.b.clear();
        } else if (r == 0) {
            return false;
        }
        this.a = b.START_TITLE;
        return true;
    }

    public final void c() {
        if (this.i) {
            String d = Rb.c.d(this.f);
            StringBuilder sb = this.h;
            Sb.p pVar = new Sb.p(this.e.toString(), d, sb != null ? Rb.c.d(sb.toString()) : null);
            pVar.k(this.d);
            this.d.clear();
            this.c.add(pVar);
            this.e = null;
            this.i = false;
            this.f = null;
            this.h = null;
        }
    }

    public List d() {
        c();
        return this.c;
    }

    public Tb.g e() {
        return Tb.g.h(this.b);
    }

    public List f() {
        return this.d;
    }

    public final boolean g(Qb.m mVar) {
        Qb.l o = mVar.o();
        if (!Rb.e.c(mVar)) {
            return false;
        }
        this.e.append(mVar.d(o, mVar.o()).c());
        if (!mVar.e()) {
            this.e.append('\n');
            return true;
        }
        if (!mVar.i(']') || !mVar.i(':') || this.e.length() > 999 || Rb.c.b(this.e.toString()).isEmpty()) {
            return false;
        }
        this.a = b.DESTINATION;
        mVar.r();
        return true;
    }

    public void h(Tb.f fVar) {
        boolean i;
        this.b.add(fVar);
        if (this.a == b.PARAGRAPH) {
            return;
        }
        Qb.m k = Qb.m.k(Tb.g.g(fVar));
        while (k.e()) {
            int i2 = a.a[this.a.ordinal()];
            if (i2 == 1) {
                i = i(k);
            } else if (i2 == 2) {
                i = g(k);
            } else if (i2 == 3) {
                i = b(k);
            } else if (i2 == 4) {
                i = j(k);
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("Unknown parsing state: " + this.a);
                }
                i = k(k);
            }
            if (!i) {
                this.a = b.PARAGRAPH;
                return;
            }
        }
    }

    public final boolean i(Qb.m mVar) {
        mVar.r();
        if (!mVar.i('[')) {
            return false;
        }
        this.a = b.LABEL;
        this.e = new StringBuilder();
        if (mVar.e()) {
            return true;
        }
        this.e.append('\n');
        return true;
    }

    public final boolean j(Qb.m mVar) {
        mVar.r();
        if (!mVar.e()) {
            this.a = b.START_DEFINITION;
            return true;
        }
        this.g = (char) 0;
        char l = mVar.l();
        if (l == '\"' || l == '\'') {
            this.g = l;
        } else if (l == '(') {
            this.g = ')';
        }
        if (this.g != 0) {
            this.a = b.TITLE;
            this.h = new StringBuilder();
            mVar.h();
            if (!mVar.e()) {
                this.h.append('\n');
            }
        } else {
            c();
            this.a = b.START_DEFINITION;
        }
        return true;
    }

    public final boolean k(Qb.m mVar) {
        Qb.l o = mVar.o();
        if (!Rb.e.e(mVar, this.g)) {
            return false;
        }
        this.h.append(mVar.d(o, mVar.o()).c());
        if (!mVar.e()) {
            this.h.append('\n');
            return true;
        }
        mVar.h();
        mVar.r();
        if (mVar.e()) {
            return false;
        }
        this.i = true;
        c();
        this.b.clear();
        this.a = b.START_DEFINITION;
        return true;
    }
}
