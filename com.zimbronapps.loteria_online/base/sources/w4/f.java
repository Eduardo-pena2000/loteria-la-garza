package w4;

import Ca.o;
import Da.r;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends h {
    public final Object b;
    public final String c;
    public final String d;
    public final g e;
    public final j f;
    public final l g;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public f(Object obj, String str, String str2, g gVar, j jVar) {
        t.g(obj, "value");
        t.g(str, "tag");
        t.g(str2, "message");
        t.g(gVar, "logger");
        t.g(jVar, "verificationMode");
        this.b = obj;
        this.c = str;
        this.d = str2;
        this.e = gVar;
        this.f = jVar;
        l lVar = new l(b(obj, str2));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        t.f(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) r.Q(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.g = lVar;
    }

    public Object a() {
        int i = a.a[this.f.ordinal()];
        if (i == 1) {
            throw this.g;
        }
        if (i == 2) {
            this.e.a(this.c, b(this.b, this.d));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new o();
    }

    public h c(String str, Qa.l lVar) {
        t.g(str, "message");
        t.g(lVar, "condition");
        return this;
    }
}
