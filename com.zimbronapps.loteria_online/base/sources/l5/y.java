package L5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class y {
    public static final List f = Arrays.asList(new String[]{"MA", "T", "PG", "G"});
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final b e;

    public static class a {
        public int a = -1;
        public int b = -1;
        public String c = null;
        public final List d = new ArrayList();
        public b e = b.DEFAULT;

        public y a() {
            return new y(this.a, this.b, this.c, this.d, this.e, null);
        }

        public a b(String str) {
            if (str != null && !"".equals(str)) {
                if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                    W5.p.f("Invalid value passed to setMaxAdContentRating: ".concat(str));
                }
                return this;
            }
            str = null;
            this.c = str;
            return this;
        }

        public a c(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.a = i;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                W5.p.f(sb.toString());
            }
            return this;
        }

        public a d(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.b = i;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 52);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                W5.p.f(sb.toString());
            }
            return this;
        }

        public a e(List list) {
            List list2 = this.d;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        public final int a;

        b(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public /* synthetic */ y(int i, int i2, String str, List list, b bVar, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = bVar;
    }

    public String a() {
        String str = this.c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.e;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public List e() {
        return new ArrayList(this.d);
    }

    public a f() {
        a aVar = new a();
        aVar.c(this.a);
        aVar.d(this.b);
        aVar.b(this.c);
        aVar.e(this.d);
        return aVar;
    }
}
