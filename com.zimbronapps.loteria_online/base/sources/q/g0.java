package Q;

import android.os.CancellationSignal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class g0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ T.F a;

    public /* synthetic */ g0(T.F f) {
        this.a = f;
    }

    public final void onCancel() {
        i0.a(this.a);
    }
}
