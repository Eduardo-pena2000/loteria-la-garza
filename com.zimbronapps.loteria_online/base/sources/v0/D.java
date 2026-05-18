package V0;

import android.os.CancellationSignal;
import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class d implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ B0 a;

    public /* synthetic */ d(B0 b0) {
        this.a = b0;
    }

    public final void onCancel() {
        e.a(this.a);
    }
}
