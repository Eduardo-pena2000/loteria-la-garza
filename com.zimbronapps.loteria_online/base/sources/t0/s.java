package t0;

import O0.J;
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements Comparator {
    public static final s a = new s();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i = 0;
        if (!androidx.compose.ui.focus.p.g(focusTargetNode) || !androidx.compose.ui.focus.p.g(focusTargetNode2)) {
            if (androidx.compose.ui.focus.p.g(focusTargetNode)) {
                return -1;
            }
            return androidx.compose.ui.focus.p.g(focusTargetNode2) ? 1 : 0;
        }
        J n = O0.k.n(focusTargetNode);
        J n2 = O0.k.n(focusTargetNode2);
        if (kotlin.jvm.internal.t.c(n, n2)) {
            return 0;
        }
        d0.c b = b(n);
        d0.c b2 = b(n2);
        int min = Math.min(b.m() - 1, b2.m() - 1);
        if (min >= 0) {
            while (kotlin.jvm.internal.t.c(b.a[i], b2.a[i])) {
                if (i != min) {
                    i++;
                }
            }
            return kotlin.jvm.internal.t.h(((J) b.a[i]).A0(), ((J) b2.a[i]).A0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }

    public final d0.c b(J j) {
        d0.c cVar = new d0.c(new J[16], 0);
        while (j != null) {
            cVar.a(0, j);
            j = j.z0();
        }
        return cVar;
    }
}
