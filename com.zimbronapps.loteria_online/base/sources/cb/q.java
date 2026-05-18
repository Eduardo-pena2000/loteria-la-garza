package cb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Q {
    public static final Q a = new Q("DEFAULT", 0);
    public static final Q b = new Q("LAZY", 1);
    public static final Q c = new Q("ATOMIC", 2);
    public static final Q d = new Q("UNDISPATCHED", 3);
    public static final /* synthetic */ Q[] e;
    public static final /* synthetic */ Ja.a f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Q.values().length];
            try {
                iArr[Q.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Q.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    static {
        Q[] a2 = a();
        e = a2;
        f = Ja.b.a(a2);
    }

    public Q(String str, int i) {
    }

    public static final /* synthetic */ Q[] a() {
        return new Q[]{a, b, c, d};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) e.clone();
    }

    public final void b(Qa.p pVar, Object obj, Ga.e eVar) {
        int i = a.a[ordinal()];
        if (i == 1) {
            ib.a.c(pVar, obj, eVar);
            return;
        }
        if (i == 2) {
            Ga.g.b(pVar, obj, eVar);
        } else if (i == 3) {
            ib.b.a(pVar, obj, eVar);
        } else if (i != 4) {
            throw new Ca.o();
        }
    }

    public final boolean c() {
        return this == b;
    }
}
