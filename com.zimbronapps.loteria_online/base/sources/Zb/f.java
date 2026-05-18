package zb;

import java.util.function.Supplier;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class f extends ThreadLocal {
    public final /* synthetic */ Supplier a;

    public /* synthetic */ f(Supplier supplier) {
        this.a = supplier;
    }

    public /* synthetic */ Object initialValue() {
        return this.a.get();
    }
}
