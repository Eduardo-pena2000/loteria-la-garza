package Fa;

import java.util.Comparator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d implements Comparator {
    public static final d a = new d();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a2, Comparable b) {
        t.g(a2, "a");
        t.g(b, "b");
        return a2.compareTo(b);
    }

    public final Comparator reversed() {
        return e.a;
    }
}
