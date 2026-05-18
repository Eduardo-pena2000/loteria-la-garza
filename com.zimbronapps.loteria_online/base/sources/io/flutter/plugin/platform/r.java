package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class r implements View.OnFocusChangeListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ ca.l b;

    public /* synthetic */ r(u uVar, ca.l lVar) {
        this.a = uVar;
        this.b = lVar;
    }

    public final void onFocusChange(View view, boolean z) {
        u.a(this.a, this.b, view, z);
    }
}
