package l1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public static final a b = new a(null);
    public static final k c = new k(0);
    public static final k d = new k(1);
    public static final k e = new k(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k a(List list) {
            Integer num = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | ((k) list.get(i)).e());
            }
            return new k(num.intValue());
        }

        public final k b() {
            return k.a();
        }

        public final k c() {
            return k.b();
        }

        public final k d() {
            return k.c();
        }

        public a() {
        }
    }

    public k(int i) {
        this.a = i;
    }

    public static final /* synthetic */ k a() {
        return e;
    }

    public static final /* synthetic */ k b() {
        return c;
    }

    public static final /* synthetic */ k c() {
        return d;
    }

    public final boolean d(k kVar) {
        int i = this.a;
        return (kVar.a | i) == i;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.a & d.a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.a & e.a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + p1.a.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
