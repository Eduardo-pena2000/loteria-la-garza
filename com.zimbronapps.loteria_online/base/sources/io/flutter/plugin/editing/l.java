package io.flutter.plugin.editing;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class l implements s.b {
    public final s a;
    public final InputMethodManager b;
    public View c;

    public l(View view, InputMethodManager inputMethodManager, s sVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            j.a(view, false);
        }
        this.c = view;
        this.b = inputMethodManager;
        this.a = sVar;
        sVar.g(this);
    }

    public boolean a() {
        return k.a(this.b);
    }

    public boolean b() {
        return Build.VERSION.SDK_INT >= 34 && a();
    }

    public void d() {
        Q.d.a(this.b, this.c);
    }
}
