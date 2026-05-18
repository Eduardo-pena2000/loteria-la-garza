package h7;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class W implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        com.google.android.gms.common.internal.t.l(cVar);
        com.google.android.gms.common.internal.t.l(cVar2);
        int M1 = cVar.M1();
        int M12 = cVar2.M1();
        if (M1 != M12) {
            return M1 >= M12 ? 1 : -1;
        }
        int N1 = cVar.N1();
        int N12 = cVar2.N1();
        if (N1 == N12) {
            return 0;
        }
        return N1 < N12 ? -1 : 1;
    }
}
