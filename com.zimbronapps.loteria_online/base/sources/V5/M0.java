package V5;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcev;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m0 {
    public final View a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ViewTreeObserver.OnGlobalLayoutListener f;

    public m0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
    }

    public static ViewTreeObserver h(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void a(Activity activity) {
        this.b = activity;
    }

    public final void b() {
        this.e = true;
        if (this.d) {
            f();
        }
    }

    public final void c() {
        this.e = false;
        g();
    }

    public final void d() {
        this.d = true;
        if (this.e) {
            f();
        }
    }

    public final void e() {
        this.d = false;
        g();
    }

    public final void f() {
        if (this.c) {
            return;
        }
        Activity activity = this.b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver h = h(activity);
            if (h != null) {
                h.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f;
        R5.t.c();
        zzcev.zza(view, onGlobalLayoutListener2);
        this.c = true;
    }

    public final void g() {
        Activity activity = this.b;
        if (activity != null && this.c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver h = h(activity);
            if (h != null) {
                h.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.c = false;
        }
    }
}
