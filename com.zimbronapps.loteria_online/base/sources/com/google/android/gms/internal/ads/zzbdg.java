package com.google.android.gms.internal.ads;

import V5.F0;
import V5.X;
import V5.o0;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbdg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) S5.D.c().zzd(zzbhe.zzbT)).longValue();
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzbds zzj;
    private final X zzk = new X(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzbdg(Context context, View view) {
        Application applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.zze = applicationContext;
            this.zzj = new zzbds(applicationContext, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void zzh() {
        F0.l.post(new zzbdf(this));
    }

    private final void zzi(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.zzb;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzm = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x015a, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(int r35) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdg.zzj(int):void");
    }

    private final int zzk(int i) {
        return (int) (i / this.zzo.density);
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzbdc(this);
            R5.t.a().b(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e) {
                int i = o0.b;
                W5.p.d("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e) {
            int i = o0.b;
            W5.p.d("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            int i2 = o0.b;
            W5.p.d("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zza != null) {
            try {
                R5.t.a().c(this.zzd, this.zza);
            } catch (Exception e3) {
                R5.t.l().zzg(e3, "ActiveViewUnit.stopScreenStatusMonitoring");
            } catch (IllegalStateException e4) {
                int i3 = o0.b;
                W5.p.d("Failed trying to unregister the receiver", e4);
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e5) {
                int i4 = o0.b;
                W5.p.d("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzh();
    }

    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzh();
    }

    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzh();
    }

    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzh();
    }

    public final void onGlobalLayout() {
        zzj(2);
        zzh();
    }

    public final void onScrollChanged() {
        zzj(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzh();
        zzm(view);
    }

    public final void zza(zzbde zzbdeVar) {
        this.zzn.add(zzbdeVar);
        zzj(3);
    }

    public final void zzb(zzbde zzbdeVar) {
        this.zzn.remove(zzbdeVar);
    }

    public final Rect zzc(Rect rect) {
        return new Rect(zzk(rect.left), zzk(rect.top), zzk(rect.right), zzk(rect.bottom));
    }

    public final void zzd(long j) {
        this.zzk.b(j);
    }

    public final void zze() {
        this.zzk.b(zzc);
    }

    public final /* synthetic */ void zzf() {
        zzj(3);
    }

    public final /* synthetic */ void zzg(int i) {
        zzj(3);
    }
}
