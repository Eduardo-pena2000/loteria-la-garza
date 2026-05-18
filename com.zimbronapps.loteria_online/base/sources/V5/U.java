package V5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzebb;
import com.google.android.gms.internal.ads.zzebf;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u {
    public final Context a;
    public final zzebf b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public PointF i;
    public PointF j;
    public Handler k;
    public Runnable l;

    public u(Context context) {
        this.g = 0;
        this.l = new t(this);
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        R5.t.w().a();
        this.k = R5.t.w().b();
        this.b = R5.t.s().b();
    }

    public static final int u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.k.postDelayed(this.l, ((Long) S5.D.c().zzd(zzbhe.zzfQ)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !s(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (s(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            this.k.removeCallbacks(this.l);
        }
    }

    public final void b() {
        try {
            Context context = this.a;
            if (!(context instanceof Activity)) {
                int i = o0.b;
                W5.p.e("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(R5.t.s().i())) {
                str = "Creative preview";
            }
            String str2 = true != R5.t.s().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            int u = u(arrayList, "Ad information", true);
            int u2 = u(arrayList, str, true);
            int u3 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue();
            int u4 = u(arrayList, "Open ad inspector", booleanValue);
            int u5 = u(arrayList, "Ad inspector settings", booleanValue);
            R5.t.g();
            AlertDialog.Builder p = F0.p(context);
            p.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new e(this, u, u2, u3, u4, u5));
            p.create().show();
        } catch (WindowManager.BadTokenException e) {
            o0.l("", e);
        }
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final void e(String str) {
        this.c = str;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final /* synthetic */ void g() {
        this.g = 4;
        b();
    }

    public final /* synthetic */ void h(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                int i7 = o0.b;
                W5.p.a("Debug mode [Creative Preview] selected.");
                zzcei.zza.execute(new g(this));
                return;
            }
            if (i6 == i3) {
                int i8 = o0.b;
                W5.p.a("Debug mode [Troubleshooting] selected.");
                zzcei.zza.execute(new h(this));
                return;
            }
            if (i6 == i4) {
                zzebf zzebfVar = this.b;
                zzgzy zzgzyVar = zzcei.zzf;
                zzgzy zzgzyVar2 = zzcei.zza;
                if (zzebfVar.zzs()) {
                    zzgzyVar.execute(new r(this));
                    return;
                } else {
                    zzgzyVar2.execute(new q(this, zzgzyVar));
                    return;
                }
            }
            if (i6 == i5) {
                zzebf zzebfVar2 = this.b;
                zzgzy zzgzyVar3 = zzcei.zzf;
                zzgzy zzgzyVar4 = zzcei.zza;
                if (zzebfVar2.zzs()) {
                    zzgzyVar3.execute(new f(this));
                    return;
                } else {
                    zzgzyVar4.execute(new s(this, zzgzyVar3));
                    return;
                }
            }
            return;
        }
        Context context = this.a;
        if (!(context instanceof Activity)) {
            int i9 = o0.b;
            W5.p.e("Can not create dialog without Activity Context");
            return;
        }
        String str = this.c;
        CharSequence charSequence = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            R5.t.g();
            Map v = F0.v(build);
            for (String str2 : v.keySet()) {
                sb.append(str2);
                sb.append(" = ");
                sb.append((String) v.get(str2));
                sb.append("\n\n");
            }
            CharSequence trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                charSequence = trim;
            }
        }
        R5.t.g();
        AlertDialog.Builder p = F0.p(context);
        p.setMessage(charSequence);
        p.setTitle("Ad Information");
        p.setPositiveButton("Share", new o(this, charSequence));
        p.setNegativeButton("Close", p.a);
        p.create().show();
    }

    public final /* synthetic */ void i(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.b.zze(zzebb.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.b.zze(zzebb.FLICK);
            } else {
                this.b.zze(zzebb.NONE);
            }
        }
        b();
    }

    public final /* synthetic */ void j(String str, DialogInterface dialogInterface, int i) {
        R5.t.g();
        F0.B(this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void k(zzgzy zzgzyVar) {
        y s = R5.t.s();
        Context context = this.a;
        if (s.e(context, this.d, this.e)) {
            zzgzyVar.execute(new j(this));
        } else {
            R5.t.s().f(context, this.d, this.e);
        }
    }

    public final /* synthetic */ void l() {
        R5.t.s().c(this.a);
    }

    public final /* synthetic */ void m(zzgzy zzgzyVar) {
        y s = R5.t.s();
        Context context = this.a;
        if (s.e(context, this.d, this.e)) {
            zzgzyVar.execute(new i(this));
        } else {
            R5.t.s().f(context, this.d, this.e);
        }
    }

    public final /* synthetic */ void n() {
        t(this.a);
    }

    public final /* synthetic */ void o() {
        y s = R5.t.s();
        Context context = this.a;
        String str = this.d;
        String str2 = this.e;
        if (!s.d(context, str, str2)) {
            s.n(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        String str3 = s.f;
        if ("2".equals(str3)) {
            int i = o0.b;
            W5.p.a("Creative is not pushed for this device.");
            s.n(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(str3)) {
            int i2 = o0.b;
            W5.p.a("The app is not linked for creative preview.");
            s.f(context, str, str2);
        } else if ("0".equals(str3)) {
            int i3 = o0.b;
            W5.p.a("Device is linked for in app preview.");
            s.n(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final /* synthetic */ void p() {
        y s = R5.t.s();
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        boolean m = s.m();
        Context context = this.a;
        s.l(s.e(context, str, str2));
        if (!s.m()) {
            s.f(context, str, str2);
            return;
        }
        if (!m && !TextUtils.isEmpty(str3)) {
            s.h(context, str2, str3, str);
        }
        int i = o0.b;
        W5.p.a("Device is linked for debug signals.");
        s.n(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void q() {
        t(this.a);
    }

    public final /* synthetic */ void r() {
        R5.t.s().c(this.a);
    }

    public final boolean s(float f, float f2, float f3, float f4) {
        return Math.abs(this.i.x - f) < ((float) this.h) && Math.abs(this.i.y - f2) < ((float) this.h) && Math.abs(this.j.x - f3) < ((float) this.h) && Math.abs(this.j.y - f4) < ((float) this.h);
    }

    public final void t(Context context) {
        ArrayList arrayList = new ArrayList();
        int u = u(arrayList, "None", true);
        int u2 = u(arrayList, "Shake", true);
        int u3 = u(arrayList, "Flick", true);
        int ordinal = this.b.zzf().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? u : u3 : u2;
        R5.t.g();
        AlertDialog.Builder p = F0.p(context);
        AtomicInteger atomicInteger = new AtomicInteger(i);
        p.setTitle("Setup gesture");
        p.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new k(atomicInteger));
        p.setNegativeButton("Dismiss", new l(this));
        p.setPositiveButton("Save", new m(this, atomicInteger, i, u2, u3));
        p.setOnCancelListener(new n(this));
        p.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public u(Context context, String str) {
        this(context);
        this.c = str;
    }
}
