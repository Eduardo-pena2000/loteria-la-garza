package D7;

import C7.c;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a {
    public final Map a = new HashMap();
    public final Context b;
    public final l8.b c;

    public a(Context context, l8.b bVar) {
        this.b = context;
        this.c = bVar;
    }

    public c a(String str) {
        return new c(this.b, this.c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (c) this.a.get(str);
    }
}
