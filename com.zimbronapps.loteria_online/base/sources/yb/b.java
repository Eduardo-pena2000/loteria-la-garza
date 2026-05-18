package Yb;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b implements Zb.a {
    public final p a = new p();
    public final InheritableThreadLocal b = new a();

    public class a extends InheritableThreadLocal {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
