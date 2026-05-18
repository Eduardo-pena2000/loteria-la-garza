package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public io.flutter.view.j a;

    public boolean a(MotionEvent motionEvent, boolean z) {
        io.flutter.view.j jVar = this.a;
        if (jVar == null) {
            return false;
        }
        return jVar.P(motionEvent, z);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.j jVar = this.a;
        if (jVar == null) {
            return false;
        }
        return jVar.x(view, view2, accessibilityEvent);
    }

    public void c(io.flutter.view.j jVar) {
        this.a = jVar;
    }
}
