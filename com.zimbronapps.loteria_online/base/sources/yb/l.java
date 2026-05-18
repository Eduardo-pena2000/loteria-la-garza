package Yb;

import java.io.PrintStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class l {
    public static final String[] a = {"System.out", "stdout", "sysout"};
    public static final b b = e();
    public static final a c = g();

    public enum a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);

        public int a;

        a(int i) {
            this.a = i;
        }
    }

    public enum b {
        Stderr,
        Stdout
    }

    public static void a(String str) {
        if (h(a.DEBUG)) {
            d().println("SLF4J(D): " + str);
        }
    }

    public static final void b(String str) {
        d().println("SLF4J(E): " + str);
    }

    public static final void c(String str, Throwable th) {
        d().println("SLF4J(E): " + str);
        d().println("SLF4J(E): Reported exception:");
        th.printStackTrace(d());
    }

    public static PrintStream d() {
        return b.ordinal() != 1 ? System.err : System.out;
    }

    public static b e() {
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return b.Stderr;
        }
        for (String str : a) {
            if (str.equalsIgnoreCase(property)) {
                return b.Stdout;
            }
        }
        return b.Stderr;
    }

    public static void f(String str) {
        if (h(a.INFO)) {
            d().println("SLF4J(I): " + str);
        }
    }

    public static a g() {
        String property = System.getProperty("slf4j.internal.verbosity");
        return (property == null || property.isEmpty()) ? a.INFO : property.equalsIgnoreCase("DEBUG") ? a.DEBUG : property.equalsIgnoreCase("ERROR") ? a.ERROR : property.equalsIgnoreCase("WARN") ? a.WARN : a.INFO;
    }

    public static boolean h(a aVar) {
        return aVar.a >= c.a;
    }

    public static final void i(String str) {
        if (h(a.WARN)) {
            d().println("SLF4J(W): " + str);
        }
    }
}
