package v6;

import G1.m;
import V5.J0;
import V5.M0;
import V5.N0;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.S;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g extends h {
    public String c;
    public static final Object e = new Object();
    public static final g f = new g();
    public static final int d = h.a;

    public static g o() {
        return f;
    }

    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    public final String e(int i) {
        return super.e(i);
    }

    public int g(Context context) {
        return super.g(context);
    }

    public int h(Context context, int i) {
        return super.h(context, i);
    }

    public final boolean j(int i) {
        return super.j(i);
    }

    public Dialog l(Activity activity, int i, int i2) {
        return m(activity, i, i2, null);
    }

    public Dialog m(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return r(activity, i, com.google.android.gms.common.internal.I.b(activity, b(activity, i, "d"), i2), onCancelListener, null);
    }

    public PendingIntent n(Context context, b bVar) {
        return bVar.Q1() ? bVar.P1() : c(context, bVar.N1(), 0);
    }

    public boolean p(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m = m(activity, i, i2, onCancelListener);
        if (m == null) {
            return false;
        }
        u(activity, m, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void q(Context context, int i) {
        v(context, i, null, d(context, i, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog r(Context context, int i, com.google.android.gms.common.internal.I i2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.F.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = com.google.android.gms.common.internal.F.b(context, i);
        if (b != null) {
            if (i2 == null) {
                i2 = onClickListener;
            }
            builder.setPositiveButton(b, i2);
        }
        String f2 = com.google.android.gms.common.internal.F.f(context, i);
        if (f2 != null) {
            builder.setTitle(f2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog s(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.F.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        u(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final T t(Context context, S s) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        T t = new T(s);
        zao.zaa(context, t, intentFilter);
        t.a(context);
        if (i(context, "com.google.android.gms")) {
            return t;
        }
        s.a();
        t.b();
        return null;
    }

    public final void u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.u) {
                o.c0(dialog, onCancelListener).b0(((androidx.fragment.app.u) activity).b0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void v(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = com.google.android.gms.common.internal.F.e(context, i);
        String d2 = com.google.android.gms.common.internal.F.d(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) com.google.android.gms.common.internal.t.l(context.getSystemService("notification"));
        m.e v = new m.e(context).p(true).e(true).j(e2).v(new m.c().h(d2));
        if (E6.j.f(context)) {
            com.google.android.gms.common.internal.t.o(E6.q.d());
            v.t(context.getApplicationInfo().icon).r(2);
            if (E6.j.g(context)) {
                v.a(t6.a.a, resources.getString(t6.b.o), pendingIntent);
            } else {
                v.h(pendingIntent);
            }
        } else {
            v.t(17301642).w(resources.getString(t6.b.h)).z(System.currentTimeMillis()).h(pendingIntent).i(d2);
        }
        if (E6.q.g()) {
            com.google.android.gms.common.internal.t.o(E6.q.g());
            synchronized (e) {
                str2 = this.c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel a = J0.a(notificationManager, "com.google.android.gms.availability");
                String string = context.getResources().getString(t6.b.g);
                if (a == null) {
                    M0.a(notificationManager, N0.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(e.a(a))) {
                    f.a(a, string);
                    M0.a(notificationManager, a);
                }
            }
            v.f(str2);
        }
        Notification b = v.b();
        if (i == 1 || i == 2 || i == 3) {
            l.b.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b);
    }

    public final void w(Context context) {
        new q(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean x(Activity activity, com.google.android.gms.common.api.internal.k kVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog r = r(activity, i, com.google.android.gms.common.internal.I.c(kVar, b(activity, i, "d"), 2), onCancelListener, null);
        if (r == null) {
            return false;
        }
        u(activity, r, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(Context context, b bVar, int i) {
        PendingIntent n;
        if (G6.b.a(context) || (n = n(context, bVar)) == null) {
            return false;
        }
        v(context, bVar.N1(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, n, i, true), zap.zaa | 134217728));
        return true;
    }
}
