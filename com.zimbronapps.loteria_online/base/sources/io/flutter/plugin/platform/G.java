package io.flutter.plugin.platform;

import T1.b1;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import ca.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g {
    public final Activity a;
    public final ca.k b;
    public final d c;
    public k.i d;
    public int e;
    public final k.g f;

    public class a implements k.g {
        public a() {
        }

        public void d() {
            g.o(g.this);
        }

        public void g(boolean z) {
            g.n(g.this, z);
        }

        public void h(List list) {
            g.i(g.this, list);
        }

        public void i(k.f fVar) {
            g.this.F(fVar);
        }

        public void j(k.i iVar) {
            g.m(g.this, iVar);
        }

        public void k(k.j jVar) {
            g.j(g.this, jVar);
        }

        public void l() {
            g.k(g.this);
        }

        public boolean m() {
            return g.e(g.this);
        }

        public CharSequence n(k.d dVar) {
            return g.c(g.this, dVar);
        }

        public void o(k.b bVar) {
            g.h(g.this, bVar);
        }

        public void p(k.h hVar) {
            g.a(g.this, hVar);
        }

        public void q(String str) {
            g.d(g.this, str);
        }

        public void r(String str) {
            g.f(g.this, str);
        }

        public void s() {
            g.l(g.this);
        }

        public void t(int i) {
            g.b(g.this, i);
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        public static /* synthetic */ void a(b bVar, int i) {
            bVar.b(i);
        }

        public final /* synthetic */ void b(int i) {
            if ((i & 4) == 0) {
                g.g(g.this).m(true);
            } else {
                g.g(g.this).m(false);
            }
        }

        public void onSystemUiVisibilityChange(int i) {
            this.a.post(new h(this, i));
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[k.c.values().length];
            c = iArr;
            try {
                iArr[k.c.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[k.c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[k.k.values().length];
            b = iArr2;
            try {
                iArr2[k.k.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[k.k.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[k.f.values().length];
            a = iArr3;
            try {
                iArr3[k.f.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.f.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.f.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[k.f.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[k.f.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.f.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.f.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[k.f.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public interface d {
        boolean d();

        void g(boolean z);
    }

    public g(Activity activity, ca.k kVar, d dVar) {
        a aVar = new a();
        this.f = aVar;
        this.a = activity;
        this.b = kVar;
        kVar.l(aVar);
        this.c = dVar;
        this.e = 1280;
    }

    public static /* synthetic */ void a(g gVar, k.h hVar) {
        gVar.s(hVar);
    }

    public static /* synthetic */ void b(g gVar, int i) {
        gVar.B(i);
    }

    public static /* synthetic */ CharSequence c(g gVar, k.d dVar) {
        return gVar.r(dVar);
    }

    public static /* synthetic */ void d(g gVar, String str) {
        gVar.v(str);
    }

    public static /* synthetic */ boolean e(g gVar) {
        return gVar.p();
    }

    public static /* synthetic */ void f(g gVar, String str) {
        gVar.D(str);
    }

    public static /* synthetic */ ca.k g(g gVar) {
        return gVar.b;
    }

    public static /* synthetic */ void h(g gVar, k.b bVar) {
        gVar.x(bVar);
    }

    public static /* synthetic */ void i(g gVar, List list) {
        gVar.A(list);
    }

    public static /* synthetic */ void j(g gVar, k.j jVar) {
        gVar.z(jVar);
    }

    public static /* synthetic */ void k(g gVar) {
        gVar.y();
    }

    public static /* synthetic */ void l(g gVar) {
        gVar.u();
    }

    public static /* synthetic */ void m(g gVar, k.i iVar) {
        gVar.C(iVar);
    }

    public static /* synthetic */ void n(g gVar, boolean z) {
        gVar.w(z);
    }

    public static /* synthetic */ void o(g gVar) {
        gVar.t();
    }

    public final void A(List list) {
        int i = list.isEmpty() ? 5894 : 1798;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = c.b[((k.k) list.get(i2)).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i &= -515;
            }
        }
        this.e = i;
        E();
    }

    public final void B(int i) {
        this.a.setRequestedOrientation(i);
    }

    public final void C(k.i iVar) {
        Window window = this.a.getWindow();
        b1 b1Var = new b1(window, window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        k.c cVar = iVar.b;
        if (cVar != null) {
            int i2 = c.c[cVar.ordinal()];
            if (i2 == 1) {
                b1Var.b(true);
            } else if (i2 == 2) {
                b1Var.b(false);
            }
        }
        Integer num = iVar.a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = iVar.c;
        if (bool != null && i >= 29) {
            d.x.a(window, bool.booleanValue());
        }
        if (i >= 26) {
            k.c cVar2 = iVar.e;
            if (cVar2 != null) {
                int i3 = c.c[cVar2.ordinal()];
                if (i3 == 1) {
                    b1Var.a(true);
                } else if (i3 == 2) {
                    b1Var.a(false);
                }
            }
            Integer num2 = iVar.d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = iVar.f;
        if (num3 != null && i >= 28) {
            io.flutter.plugin.platform.d.a(window, num3.intValue());
        }
        Boolean bool2 = iVar.g;
        if (bool2 != null && i >= 29) {
            d.y.a(window, bool2.booleanValue());
        }
        this.d = iVar;
    }

    public final void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.a.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public void E() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.e);
        k.i iVar = this.d;
        if (iVar != null) {
            C(iVar);
        }
    }

    public void F(k.f fVar) {
        View decorView = this.a.getWindow().getDecorView();
        switch (c.a[fVar.ordinal()]) {
            case 1:
                decorView.performHapticFeedback(0);
                break;
            case 2:
                decorView.performHapticFeedback(1);
                break;
            case 3:
                decorView.performHapticFeedback(3);
                break;
            case 4:
                decorView.performHapticFeedback(6);
                break;
            case 5:
                decorView.performHapticFeedback(4);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 8:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public final boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void q() {
        this.b.l(null);
    }

    public final CharSequence r(k.d dVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (dVar != null && dVar != k.d.b) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            Q9.b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            Q9.b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        AssetFileDescriptor openTypedAssetFileDescriptor = this.a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", (Bundle) null);
                        text = itemAt.coerceToText(this.a);
                        if (openTypedAssetFileDescriptor != null) {
                            openTypedAssetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        e = e;
                        charSequence = text;
                        Q9.b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                }
                return text;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (SecurityException e3) {
            Q9.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e3);
            return null;
        } catch (FileNotFoundException unused) {
            Q9.b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        }
    }

    public final void s(k.h hVar) {
        if (hVar == k.h.b) {
            this.a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    public final void t() {
        d dVar = this.c;
        if (dVar == null || !dVar.d()) {
            d.K k = this.a;
            if (k instanceof d.K) {
                k.getOnBackPressedDispatcher().l();
            } else {
                k.finish();
            }
        }
    }

    public final void u() {
        E();
    }

    public final void v(String str) {
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public final void w(boolean z) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.g(z);
        }
    }

    public final void x(k.b bVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a.setTaskDescription(new ActivityManager.TaskDescription(bVar.b, (Bitmap) null, bVar.a));
            return;
        }
        f.a();
        this.a.setTaskDescription(e.a(bVar.b, 0, bVar.a));
    }

    public final void y() {
        View decorView = this.a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    public final void z(k.j jVar) {
        int i;
        if (jVar == k.j.b) {
            i = 1798;
        } else if (jVar == k.j.c) {
            i = 3846;
        } else if (jVar == k.j.d) {
            i = 5894;
        } else if (jVar != k.j.e || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i = 1792;
        }
        this.e = i;
        E();
    }
}
