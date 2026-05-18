package z6;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b implements r {
    public final /* synthetic */ x a;

    public /* synthetic */ b(x xVar) {
        this.a = xVar;
    }

    public final void accept(Object obj, Object obj2) {
        a.g gVar = d.a;
        ((a) ((e) obj).getService()).q1(this.a);
        ((TaskCompletionSource) obj2).setResult((Object) null);
    }
}
