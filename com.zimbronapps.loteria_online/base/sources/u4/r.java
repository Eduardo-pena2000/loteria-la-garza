package u4;

import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final Set c = new HashSet();
    public final String a;
    public final String b;

    public static class a extends r {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends r {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public r(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }
}
