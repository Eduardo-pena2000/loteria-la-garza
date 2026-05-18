package Z0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements CharSequence {
    public static final c e = new c(null);
    public static final k0.v f = A0.L0();
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public interface a {
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
            this();
        }

        public c() {
        }
    }

    public static final class e implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return Fa.b.d(Integer.valueOf(((d) obj).h()), Integer.valueOf(((d) obj2).h()));
        }
    }

    public e(List list, String str) {
        ArrayList arrayList;
        List list2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            list2 = null;
            for (int i = 0; i < size; i++) {
                d dVar = (d) list.get(i);
                if (dVar.g() instanceof I0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(dVar);
                } else if (dVar.g() instanceof B) {
                    list2 = list2 == null ? new ArrayList() : list2;
                    kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    list2.add(dVar);
                }
            }
        } else {
            arrayList = null;
            list2 = null;
        }
        this.c = arrayList;
        this.d = list2;
        List C0 = list2 != null ? Da.D.C0(list2, new e()) : null;
        if (C0 == null || C0.isEmpty()) {
            return;
        }
        w.E b2 = w.n.b(((d) Da.D.f0(C0)).f());
        int size2 = C0.size();
        for (int i2 = 1; i2 < size2; i2++) {
            d dVar2 = (d) C0.get(i2);
            while (true) {
                if (b2.b == 0) {
                    break;
                }
                int f2 = b2.f();
                if (dVar2.h() >= f2) {
                    b2.l(b2.b - 1);
                } else if (!(dVar2.f() <= f2)) {
                    g1.a.a("Paragraph overlap not allowed, end " + dVar2.f() + " should be less than or equal to " + f2);
                }
            }
            b2.h(dVar2.f());
        }
    }

    public char a(int i) {
        return this.b.charAt(i);
    }

    public final List b() {
        return this.a;
    }

    public int c() {
        return this.b.length();
    }

    public final /* bridge */ char charAt(int i) {
        return a(i);
    }

    public final List d(int i, int i2) {
        ArrayList n;
        List list = this.a;
        if (list != null) {
            n = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                d dVar = (d) obj;
                if ((dVar.g() instanceof j) && g.j(i, i2, dVar.h(), dVar.f())) {
                    n.add(obj);
                }
            }
        } else {
            n = Da.v.n();
        }
        kotlin.jvm.internal.t.e(n, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return n;
    }

    public final List e() {
        List list = this.d;
        return list == null ? Da.v.n() : list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.t.c(this.b, eVar.b) && kotlin.jvm.internal.t.c(this.a, eVar.a);
    }

    public final List f() {
        return this.d;
    }

    public final List g() {
        List list = this.c;
        return list == null ? Da.v.n() : list;
    }

    public final List h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final List i(String str, int i, int i2) {
        List list = this.a;
        if (list == null) {
            return Da.v.n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) list.get(i3);
            if ((dVar.g() instanceof L0) && kotlin.jvm.internal.t.c(str, dVar.i()) && g.j(i, i2, dVar.h(), dVar.f())) {
                arrayList.add(M0.a(dVar));
            }
        }
        return arrayList;
    }

    public final String j() {
        return this.b;
    }

    public final List k(int i, int i2) {
        ArrayList n;
        List list = this.a;
        if (list != null) {
            n = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                d dVar = (d) obj;
                if ((dVar.g() instanceof a1) && g.j(i, i2, dVar.h(), dVar.f())) {
                    n.add(obj);
                }
            }
        } else {
            n = Da.v.n();
        }
        kotlin.jvm.internal.t.e(n, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return n;
    }

    public final List l(int i, int i2) {
        ArrayList n;
        List list = this.a;
        if (list != null) {
            n = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                d dVar = (d) obj;
                if ((dVar.g() instanceof b1) && g.j(i, i2, dVar.h(), dVar.f())) {
                    n.add(obj);
                }
            }
        } else {
            n = Da.v.n();
        }
        kotlin.jvm.internal.t.e(n, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return n;
    }

    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(e eVar) {
        return kotlin.jvm.internal.t.c(this.a, eVar.a);
    }

    public final boolean n(int i, int i2) {
        List list = this.a;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) list.get(i3);
            if ((dVar.g() instanceof j) && g.j(i, i2, dVar.h(), dVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(String str, int i, int i2) {
        List list = this.a;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) list.get(i3);
            if ((dVar.g() instanceof L0) && kotlin.jvm.internal.t.c(str, dVar.i()) && g.j(i, i2, dVar.h(), dVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final e p(e eVar) {
        b bVar = new b(this);
        bVar.e(eVar);
        return bVar.l();
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public e subSequence(int i, int i2) {
        if (!(i <= i2)) {
            g1.a.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String substring = this.b.substring(i, i2);
        kotlin.jvm.internal.t.f(substring, "substring(...)");
        return new e(g.c(this.a, i, i2), substring);
    }

    public final e r(long j) {
        return subSequence(W0.l(j), W0.k(j));
    }

    public String toString() {
        return this.b;
    }

    public static final class d {
        public final Object a;
        public final int b;
        public final int c;
        public final String d;

        public d(Object obj, int i, int i2, String str) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            g1.a.a("Reversed range is not supported");
        }

        public static /* synthetic */ d e(d dVar, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = dVar.a;
            }
            if ((i3 & 2) != 0) {
                i = dVar.b;
            }
            if ((i3 & 4) != 0) {
                i2 = dVar.c;
            }
            if ((i3 & 8) != 0) {
                str = dVar.d;
            }
            return dVar.d(obj, i, i2, str);
        }

        public final Object a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final d d(Object obj, int i, int i2, String str) {
            return new d(obj, i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.t.c(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && kotlin.jvm.internal.t.c(this.d, dVar.d);
        }

        public final int f() {
            return this.c;
        }

        public final Object g() {
            return this.a;
        }

        public final int h() {
            return this.b;
        }

        public int hashCode() {
            Object obj = this.a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
        }

        public final String i() {
            return this.d;
        }

        public String toString() {
            return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
        }

        public d(Object obj, int i, int i2) {
            this(obj, i, i2, "");
        }
    }

    public static final class b implements Appendable {
        public final StringBuilder a;
        public final List b;
        public final List c;
        public final a d;

        public static final class a {
            public final b a;
            public final List b = new ArrayList();

            public a(b bVar) {
                this.a = bVar;
            }
        }

        public b(int i) {
            this.a = new StringBuilder(i);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new a(this);
        }

        public final void a(I0 i0, int i, int i2) {
            this.c.add(new b(i0, i, i2, null, 8, null));
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b append(char c) {
            this.a.append(c);
            return this;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence charSequence) {
            if (charSequence instanceof e) {
                e((e) charSequence);
            } else {
                this.a.append(charSequence);
            }
            return this;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof e) {
                f((e) charSequence, i, i2);
            } else {
                this.a.append(charSequence, i, i2);
            }
            return this;
        }

        public final void e(e eVar) {
            int length = this.a.length();
            this.a.append(eVar.j());
            List b2 = eVar.b();
            if (b2 != null) {
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    d dVar = (d) b2.get(i);
                    this.c.add(new b(dVar.g(), dVar.h() + length, dVar.f() + length, dVar.i()));
                }
            }
        }

        public final void f(e eVar, int i, int i2) {
            int length = this.a.length();
            this.a.append(eVar.j(), i, i2);
            List i3 = g.i(eVar, i, i2, null, 4, null);
            if (i3 != null) {
                int size = i3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    d dVar = (d) i3.get(i4);
                    this.c.add(new b(dVar.g(), dVar.h() + length, dVar.f() + length, dVar.i()));
                }
            }
        }

        public final void g(String str) {
            this.a.append(str);
        }

        public final void h() {
            if (this.b.isEmpty()) {
                g1.a.c("Nothing to pop.");
            }
            ((b) this.b.remove(r0.size() - 1)).a(this.a.length());
        }

        public final void i(int i) {
            if (!(i < this.b.size())) {
                g1.a.c(i + " should be less than " + this.b.size());
            }
            while (this.b.size() - 1 >= i) {
                h();
            }
        }

        public final int j(j jVar) {
            b bVar = new b(jVar, this.a.length(), 0, null, 12, null);
            this.b.add(bVar);
            this.c.add(bVar);
            return this.b.size() - 1;
        }

        public final int k(I0 i0) {
            b bVar = new b(i0, this.a.length(), 0, null, 12, null);
            this.b.add(bVar);
            this.c.add(bVar);
            return this.b.size() - 1;
        }

        public final e l() {
            String sb = this.a.toString();
            List list = this.c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((b) list.get(i)).b(this.a.length()));
            }
            return new e(sb, (List) arrayList);
        }

        public static final class b {
            public static final a e = new a(null);
            public final Object a;
            public final int b;
            public int c;
            public final String d;

            public static final class a {
                public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                    this();
                }

                public a() {
                }
            }

            public b(Object obj, int i, int i2, String str) {
                this.a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }

            public final void a(int i) {
                this.c = i;
            }

            public final d b(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    g1.a.c("Item.end should be set first");
                }
                return new d(this.a, this.b, i, this.d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.t.c(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && kotlin.jvm.internal.t.c(this.d, bVar.d);
            }

            public int hashCode() {
                Object obj = this.a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
            }

            public /* synthetic */ b(Object obj, int i, int i2, String str, int i3, kotlin.jvm.internal.k kVar) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ b(int i, int i2, kotlin.jvm.internal.k kVar) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        public b(e eVar) {
            this(0, 1, null);
            e(eVar);
        }
    }

    public /* synthetic */ e(String str, List list, List list2, int i, kotlin.jvm.internal.k kVar) {
        this(str, (i & 2) != 0 ? Da.v.n() : list, (i & 4) != 0 ? Da.v.n() : list2);
    }

    public e(String str, List list, List list2) {
        this(g.b(list, list2), str);
    }

    public /* synthetic */ e(String str, List list, int i, kotlin.jvm.internal.k kVar) {
        this(str, (i & 2) != 0 ? Da.v.n() : list);
    }

    public e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
