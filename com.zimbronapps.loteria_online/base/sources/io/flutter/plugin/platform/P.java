package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class p implements View.OnFocusChangeListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ int b;

    public /* synthetic */ p(u uVar, int i) {
        this.a = uVar;
        this.b = i;
    }

    public final void onFocusChange(View view, boolean z) {
        u.d(this.a, this.b, view, z);
    }
}
