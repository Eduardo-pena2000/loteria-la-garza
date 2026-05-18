package W0;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements Comparator {
    public static final i a = new i();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(t tVar, t tVar2) {
        u0.h l = tVar.l();
        u0.h l2 = tVar2.l();
        int compare = Float.compare(l2.j(), l.j());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(l.l(), l2.l());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(l.e(), l2.e());
        return compare3 != 0 ? compare3 : Float.compare(l2.i(), l.i());
    }
}
