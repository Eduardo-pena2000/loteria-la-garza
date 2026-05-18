package M2;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class z extends IOException {
    public final boolean a;
    public final int b;

    public z(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static z a(String str, Throwable th) {
        return new z(str, th, true, 1);
    }

    public static z b(String str, Throwable th) {
        return new z(str, th, true, 0);
    }

    public static z c(String str, Throwable th) {
        return new z(str, th, true, 4);
    }

    public static z d(String str) {
        return new z(str, null, false, 1);
    }

    public String getMessage() {
        return super/*java.lang.Throwable*/.getMessage() + "{contentIsMalformed=" + this.a + ", dataType=" + this.b + "}";
    }
}
