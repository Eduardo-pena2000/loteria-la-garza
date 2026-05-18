package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a0;
import androidx.lifecycle.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class r extends Dialog implements androidx.lifecycle.r, K, j4.i {
    public androidx.lifecycle.t a;
    public final j4.h b;
    public final H c;

    public /* synthetic */ r(Context context, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void a(r rVar) {
        e(rVar);
    }

    public static final void e(r rVar) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.t.g(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.t b() {
        androidx.lifecycle.t tVar = this.a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.a = tVar2;
        return tVar2;
    }

    public void c() {
        Window window = getWindow();
        kotlin.jvm.internal.t.d(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.t.f(decorView, "window!!.decorView");
        a0.b(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.t.d(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.t.f(decorView2, "window!!.decorView");
        O.b(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.t.d(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.t.f(decorView3, "window!!.decorView");
        j4.m.b(decorView3, this);
    }

    public androidx.lifecycle.k getLifecycle() {
        return b();
    }

    public final H getOnBackPressedDispatcher() {
        return this.c;
    }

    public j4.f getSavedStateRegistry() {
        return this.b.b();
    }

    public void onBackPressed() {
        this.c.l();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            H h = this.c;
            OnBackInvokedDispatcher a = p.a(this);
            kotlin.jvm.internal.t.f(a, "onBackInvokedDispatcher");
            h.o(a);
        }
        this.b.d(bundle);
        b().g(k.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.t.f(onSaveInstanceState, "super.onSaveInstanceState()");
        this.b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        b().g(k.a.ON_RESUME);
    }

    public void onStop() {
        b().g(k.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i) {
        super(context, i);
        kotlin.jvm.internal.t.g(context, "context");
        this.b = j4.h.c.b(this);
        this.c = new H(new q(this));
    }

    public void setContentView(View view) {
        kotlin.jvm.internal.t.g(view, "view");
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.t.g(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
