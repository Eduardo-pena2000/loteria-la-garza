package S9;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c {
    public static volatile c b;
    public final Map a = new HashMap();

    public static c b() {
        if (b == null) {
            synchronized (c.class) {
                try {
                    if (b == null) {
                        b = new c();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public io.flutter.embedding.engine.b a(String str) {
        return (io.flutter.embedding.engine.b) this.a.get(str);
    }
}
