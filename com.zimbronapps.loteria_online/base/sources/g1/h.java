package G1;

import T1.t;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.H;
import androidx.lifecycle.k;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h extends Activity implements androidx.lifecycle.r, t.a {
    private final i0 extraDataMap = new i0(0, 1, null);
    private final androidx.lifecycle.t lifecycleRegistry = new androidx.lifecycle.t(this);

    public static class a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.t.g(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.t.f(decorView, "window.decorView");
        if (T1.t.d(decorView, keyEvent)) {
            return true;
        }
        return T1.t.e(this, decorView, this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.t.g(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.t.f(decorView, "window.decorView");
        if (T1.t.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Ca.e
    public a getExtraData(Class cls) {
        kotlin.jvm.internal.t.g(cls, "extraDataClass");
        android.support.v4.media.session.b.a(this.extraDataMap.get(cls));
        return null;
    }

    public androidx.lifecycle.k getLifecycle() {
        return this.lifecycleRegistry;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H.b.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.t.g(bundle, "outState");
        this.lifecycleRegistry.l(k.b.c);
        super.onSaveInstanceState(bundle);
    }

    @Ca.e
    public void putExtraData(a aVar) {
        kotlin.jvm.internal.t.g(aVar, "extraData");
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !z(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.t.g(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean z(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }
}
