package S5;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z1 extends zzbqm {
    public final /* synthetic */ A1 a;

    public /* synthetic */ z1(A1 a1, byte[] bArr) {
        Objects.requireNonNull(a1);
        this.a = a1;
    }

    public final void zzb(List list) {
        int i;
        ArrayList arrayList;
        A1 a1 = this.a;
        synchronized (a1.A()) {
            a1.C(false);
            a1.D(true);
            arrayList = new ArrayList(a1.B());
            a1.B().clear();
        }
        InitializationStatus z = A1.z(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(z);
        }
    }
}
