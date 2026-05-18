package pa;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class n {
    public final L5.h a;
    public final int b;
    public final int c;

    public static class a {
        public L5.h a(Context context, int i) {
            return L5.h.a(context, i);
        }

        public L5.h b(Context context, int i) {
            return L5.h.b(context, i);
        }

        public L5.h c(int i, int i2) {
            return L5.h.e(i, i2);
        }

        public L5.h d(Context context, int i) {
            return L5.h.f(context, i);
        }

        public L5.h e(Context context, int i) {
            return L5.h.g(context, i);
        }

        public L5.h f(Context context, int i) {
            return L5.h.h(context, i);
        }

        public L5.h g(Context context, int i) {
            return L5.h.i(context, i);
        }
    }

    public static class b extends n {
        public final String d;

        public b(Context context, a aVar, String str, int i) {
            super(b(context, aVar, str, i));
            this.d = str;
        }

        public static L5.h b(Context context, a aVar, String str, int i) {
            if (str == null) {
                return aVar.a(context, i);
            }
            if (str.equals("portrait")) {
                return aVar.f(context, i);
            }
            if (str.equals("landscape")) {
                return aVar.d(context, i);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    public static class c extends n {
        public c() {
            super(L5.h.p);
        }
    }

    public static class d extends n {
        public final Integer d;
        public final Integer e;

        public d(a aVar, Context context, int i, Integer num, Integer num2) {
            super(b(aVar, context, i, num, num2));
            this.d = num;
            this.e = num2;
        }

        public static L5.h b(a aVar, Context context, int i, Integer num, Integer num2) {
            return num != null ? num.intValue() == 0 ? aVar.g(context, i) : aVar.e(context, i) : num2 != null ? aVar.c(i, num2.intValue()) : aVar.b(context, i);
        }
    }

    public static class e extends n {
        public e() {
            super(L5.h.o);
        }
    }

    public n(int i, int i2) {
        this(new L5.h(i, i2));
    }

    public L5.h a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b == nVar.b && this.c == nVar.c;
    }

    public int hashCode() {
        return (this.b * 31) + this.c;
    }

    public n(L5.h hVar) {
        this.a = hVar;
        this.b = hVar.j();
        this.c = hVar.c();
    }
}
