package zb;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum h {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    public final String a;

    h(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.a = str;
    }

    public String b() {
        return this.a;
    }
}
