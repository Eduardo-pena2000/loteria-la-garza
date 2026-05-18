package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements p {
    public static final q a = new q("Active", 0);
    public static final q b = new q("ActiveParent", 1);
    public static final q c = new q("Captured", 2);
    public static final q d = new q("Inactive", 3);
    public static final /* synthetic */ q[] e;
    public static final /* synthetic */ Ja.a f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    static {
        q[] c2 = c();
        e = c2;
        f = Ja.b.a(c2);
    }

    public q(String str, int i) {
    }

    public static final /* synthetic */ q[] c() {
        return new q[]{a, b, c, d};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) e.clone();
    }

    public boolean a() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new Ca.o();
    }

    public boolean b() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new Ca.o();
    }
}
