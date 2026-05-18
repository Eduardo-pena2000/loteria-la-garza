package G1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {

    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final u[] c;
        public final u[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        public int i;
        public CharSequence j;
        public PendingIntent k;
        public boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.e(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.e(null, "", i);
            }
            return this.b;
        }

        public u[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, u[] uVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.i = iconCompat.g();
            }
            this.j = e.d(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = uVarArr;
            this.d = uVarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    public static class b extends f {
        public IconCompat e;
        public IconCompat f;
        public boolean g;
        public CharSequence h;
        public boolean i;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public void b(l lVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(lVar.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.e.o(lVar instanceof n ? ((n) lVar).f() : null));
                } else if (iconCompat.i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.e.f());
                }
            }
            if (this.g) {
                if (this.f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f.o(lVar instanceof n ? ((n) lVar).f() : null));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.i);
                b.b(bigContentTitle, this.h);
            }
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f = bitmap == null ? null : IconCompat.d(bitmap);
            this.g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.e = bitmap == null ? null : IconCompat.d(bitmap);
            return this;
        }
    }

    public static class c extends f {
        public CharSequence e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(l lVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(lVar.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static abstract class f {
        public e a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        public abstract void b(l lVar);

        public abstract String c();

        public RemoteViews d(l lVar) {
            return null;
        }

        public RemoteViews e(l lVar) {
            return null;
        }

        public RemoteViews f(l lVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.v(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(F1.b.b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(F1.b.a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class e {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public long N;
        public int O;
        public int P;
        public boolean Q;
        public Notification R;
        public boolean S;
        public Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b;
        public ArrayList c;
        public ArrayList d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public IconCompat j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public f p;
        public CharSequence q;
        public CharSequence r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        public e(Context context, String str) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new n(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e e(boolean z) {
            m(16, z);
            return this;
        }

        public e f(String str) {
            this.K = str;
            return this;
        }

        public e g(int i) {
            this.E = i;
            return this;
        }

        public e h(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f = d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public e k(int i) {
            Notification notification = this.R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public final void m(int i, boolean z) {
            if (z) {
                Notification notification = this.R;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public e n(Bitmap bitmap) {
            this.j = bitmap == null ? null : IconCompat.d(m.b(this.a, bitmap));
            return this;
        }

        public e o(int i, int i2, int i3) {
            Notification notification = this.R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e p(boolean z) {
            this.z = z;
            return this;
        }

        public e q(int i) {
            this.l = i;
            return this;
        }

        public e r(int i) {
            this.m = i;
            return this;
        }

        public e s(boolean z) {
            this.n = z;
            return this;
        }

        public e t(int i) {
            this.R.icon = i;
            return this;
        }

        public e u(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d = a.d(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(d);
            return this;
        }

        public e v(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e w(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public e x(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e y(int i) {
            this.F = i;
            return this;
        }

        public e z(long j) {
            this.R.when = j;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
