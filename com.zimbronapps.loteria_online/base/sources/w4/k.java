package w4;

import Ca.m;
import Za.E;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements Comparable {
    public static final a f = new a(null);
    public static final k g = new k(0, 0, 0, "");
    public static final k h = new k(0, 1, 0, "");
    public static final k i;
    public static final k j;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final Ca.l e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k a() {
            return k.a();
        }

        public final k b(String str) {
            String group;
            if (str != null && !E.h0(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                            t.f(group4, "description");
                            return new k(parseInt, parseInt2, parseInt3, group4, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    public static final class b extends u implements Qa.a {
        public b() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(k.this.d()).shiftLeft(32).or(BigInteger.valueOf(k.this.e())).shiftLeft(32).or(BigInteger.valueOf(k.this.f()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        i = kVar;
        j = kVar;
    }

    public /* synthetic */ k(int i2, int i3, int i4, String str, kotlin.jvm.internal.k kVar) {
        this(i2, i3, i4, str);
    }

    public static final /* synthetic */ k a() {
        return h;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        t.g(kVar, "other");
        return c().compareTo(kVar.c());
    }

    public final BigInteger c() {
        Object value = this.e.getValue();
        t.f(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        String str;
        if (E.h0(this.d)) {
            str = "";
        } else {
            str = '-' + this.d;
        }
        return this.a + '.' + this.b + '.' + this.c + str;
    }

    public k(int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
        this.e = m.b(new b());
    }
}
