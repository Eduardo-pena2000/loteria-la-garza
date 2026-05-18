package gb;

import Ga.i;
import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class x {
    public static /* synthetic */ int a(u uVar, int i, i.b bVar) {
        return c(uVar, i, bVar);
    }

    public static final void b(u uVar, Ga.i iVar) {
        if (((Number) iVar.fold(0, new w(uVar))).intValue() == uVar.c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + uVar.b + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int c(u uVar, int i, i.b bVar) {
        i.c key = bVar.getKey();
        i.b bVar2 = uVar.b.get(key);
        if (key != B0.P8) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        B0 b0 = (B0) bVar2;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        B0 d = d((B0) bVar, b0);
        if (d == b0) {
            return b0 == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d + ", expected child of " + b0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final B0 d(B0 b0, B0 b02) {
        while (b0 != null) {
            if (b0 == b02) {
                return b0;
            }
            if (!(b0 instanceof hb.z)) {
                return b0;
            }
            b0 = ((hb.z) b0).getParent();
        }
        return null;
    }
}
