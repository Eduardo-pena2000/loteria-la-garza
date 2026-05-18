package D4;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.window.layout.adapter.sidecar.SidecarCompat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class b implements S1.b {
    public final /* synthetic */ SidecarCompat a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ b(SidecarCompat sidecarCompat, Activity activity) {
        this.a = sidecarCompat;
        this.b = activity;
    }

    public final void accept(Object obj) {
        SidecarCompat.d(this.a, this.b, (Configuration) obj);
    }
}
