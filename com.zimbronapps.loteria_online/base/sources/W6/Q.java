package W6;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.games_v2.zzae;
import com.google.android.gms.internal.games_v2.zzfg;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, u {
    public final k a;
    public final zzae b;
    public WeakReference c;
    public boolean d = false;

    public q(k kVar, int i) {
        this.a = kVar;
        this.b = new zzae(i, (IBinder) null);
    }

    public static q d(k kVar, int i) {
        return new q(kVar, i);
    }

    public final void a(Activity activity) {
        View view;
        try {
            view = activity.findViewById(16908290);
        } catch (IllegalStateException unused) {
            view = null;
        }
        if (view == null && (view = activity.getWindow().getDecorView()) == null) {
            zzfg.zzg("PopupManager", "Failed to bind to: ".concat(String.valueOf(activity)));
        } else {
            zzfg.zzf("PopupManager", "Binding to: ".concat(String.valueOf(activity)));
            f(view);
        }
    }

    public final Bundle b() {
        return this.b.zza();
    }

    public final IBinder c() {
        return this.b.zza;
    }

    public final zzae e() {
        return this.b;
    }

    public final void f(View view) {
        this.a.C();
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            Activity context = this.a.getContext();
            if (view2 == null && (context instanceof Activity)) {
                view2 = context.getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (E6.q.b()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.c = null;
        Activity context2 = this.a.getContext();
        if (view == null && (context2 instanceof Activity)) {
            Activity activity = context2;
            try {
                view = activity.findViewById(16908290);
            } catch (IllegalStateException unused) {
            }
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            zzfg.zzg("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view == null) {
            zzfg.zzc("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        h(view);
        this.c = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void g() {
        boolean z;
        zzae zzaeVar = this.b;
        IBinder iBinder = zzaeVar.zza;
        if (iBinder != null) {
            this.a.u(iBinder, zzaeVar.zza());
            z = false;
        } else {
            z = true;
        }
        this.d = z;
    }

    public final void h(View view) {
        Display display;
        int i = -1;
        if (E6.q.c() && (display = view.getDisplay()) != null) {
            i = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        zzae zzaeVar = this.b;
        zzaeVar.zzc = i;
        zzaeVar.zza = windowToken;
        int i2 = iArr[0];
        zzaeVar.zzd = i2;
        int i3 = iArr[1];
        zzaeVar.zze = i3;
        zzaeVar.zzf = i2 + width;
        zzaeVar.zzg = i3 + height;
        if (this.d) {
            g();
        }
    }

    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.c;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        h(view);
    }

    public final void onViewAttachedToWindow(View view) {
        h(view);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a.C();
        view.removeOnAttachStateChangeListener(this);
    }
}
