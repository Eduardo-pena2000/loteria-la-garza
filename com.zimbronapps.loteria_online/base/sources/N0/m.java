package n0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends RuntimeException {
    public final List a;

    public m(List list) {
        this.a = list;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Composition stack when thrown:");
        kotlin.jvm.internal.t.f(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.t.f(sb, "append(...)");
        d.a(sb, this.a);
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }
}
