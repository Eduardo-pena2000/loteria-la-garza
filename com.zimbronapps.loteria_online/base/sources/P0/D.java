package P0;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements c {
    public static final a b = new a(null);
    public static final int c = 8;
    public final AccessibilityManager a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public d(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long a(long j, boolean z, boolean z2, boolean z3) {
        int i = z;
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            i = (z ? 1 : 0) | 2;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a2 = X.a.a(this.a, (int) j, i);
            if (a2 != Integer.MAX_VALUE) {
                return a2;
            }
        } else if (!z3 || !this.a.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
