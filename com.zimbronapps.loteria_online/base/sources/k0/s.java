package k0;

import b0.H;
import b0.b1;
import java.util.Map;
import w.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static final b1 a = H.j(new r());

    public static /* synthetic */ p a() {
        return b();
    }

    public static final p b() {
        return null;
    }

    public static final p c(Map map, Qa.l lVar) {
        return new q(map, lVar);
    }

    public static final /* synthetic */ boolean d(CharSequence charSequence) {
        return f(charSequence);
    }

    public static final /* synthetic */ P e(Map map) {
        return h(map);
    }

    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Za.a.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final b1 g() {
        return a;
    }

    public static final P h(Map map) {
        P p = new P(map.size());
        p.s(map);
        return p;
    }
}
