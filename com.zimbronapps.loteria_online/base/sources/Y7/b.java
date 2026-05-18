package y7;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b {
    public static final Logger a = Logger.getLogger(b.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        public enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            public boolean a() {
                return !b.c();
            }
        }

        public enum b extends b {
            public b(String str, int i) {
                super(str, i, null);
            }

            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            a = aVar;
            b bVar = new b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b = bVar;
            c = new b[]{aVar, bVar};
        }

        public b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        public abstract boolean a();

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return y7.a.a() || b.get();
    }
}
