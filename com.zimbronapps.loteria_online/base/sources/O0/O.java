package O0;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {
    public static final Comparator a = new a();

    public static final class a implements Comparator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(J j, J j2) {
            int h = kotlin.jvm.internal.t.h(j.S(), j2.S());
            return h != 0 ? h : kotlin.jvm.internal.t.h(j.hashCode(), j2.hashCode());
        }
    }

    public static final /* synthetic */ Comparator a() {
        return a;
    }
}
