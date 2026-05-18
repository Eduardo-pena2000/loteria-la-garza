package s7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q {
    public final d a;
    public final boolean b;
    public final c c;
    public final int d;

    public class a implements c {
        public final /* synthetic */ d a;

        public class a extends b {
            public a(q qVar, CharSequence charSequence) {
                super(qVar, charSequence);
            }

            public int e(int i) {
                return i + 1;
            }

            public int f(int i) {
                return a.this.a.c(this.c, i);
            }
        }

        public a(d dVar) {
            this.a = dVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(q qVar, CharSequence charSequence) {
            return new a(qVar, charSequence);
        }
    }

    public static abstract class b extends s7.b {
        public final CharSequence c;
        public final d d;
        public final boolean e;
        public int f = 0;
        public int g;

        public b(q qVar, CharSequence charSequence) {
            this.d = q.a(qVar);
            this.e = q.b(qVar);
            this.g = q.c(qVar);
            this.c = charSequence;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int f;
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 == -1) {
                    return (String) b();
                }
                f = f(i2);
                if (f == -1) {
                    f = this.c.length();
                    this.f = -1;
                } else {
                    this.f = e(f);
                }
                int i3 = this.f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f = i4;
                    if (i4 > this.c.length()) {
                        this.f = -1;
                    }
                } else {
                    while (i < f && this.d.e(this.c.charAt(i))) {
                        i++;
                    }
                    while (f > i && this.d.e(this.c.charAt(f - 1))) {
                        f--;
                    }
                    if (!this.e || i != f) {
                        break;
                    }
                    i = this.f;
                }
            }
            int i5 = this.g;
            if (i5 == 1) {
                f = this.c.length();
                this.f = -1;
                while (f > i && this.d.e(this.c.charAt(f - 1))) {
                    f--;
                }
            } else {
                this.g = i5 - 1;
            }
            return this.c.subSequence(i, f).toString();
        }

        public abstract int e(int i);

        public abstract int f(int i);
    }

    public interface c {
        Iterator a(q qVar, CharSequence charSequence);
    }

    public q(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    public static /* synthetic */ d a(q qVar) {
        return qVar.a;
    }

    public static /* synthetic */ boolean b(q qVar) {
        return qVar.b;
    }

    public static /* synthetic */ int c(q qVar) {
        return qVar.d;
    }

    public static q d(char c2) {
        return e(d.d(c2));
    }

    public static q e(d dVar) {
        m.j(dVar);
        return new q(new a(dVar));
    }

    public List f(CharSequence charSequence) {
        m.j(charSequence);
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public q(c cVar, boolean z, d dVar, int i) {
        this.c = cVar;
        this.b = z;
        this.a = dVar;
        this.d = i;
    }
}
