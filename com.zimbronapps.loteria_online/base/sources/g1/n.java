package G1;

import G1.m;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class n implements l {
    public final Context a;
    public final Notification.Builder b;
    public final m.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static String e(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    public static class f {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }
    }

    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public n(m.e eVar) {
        int i;
        this.c = eVar;
        Context context = eVar.a;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = e.a(context, eVar.K);
        } else {
            this.b = new Notification.Builder(eVar.a);
        }
        Notification notification = eVar.R;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.k).setContentIntent(eVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.h, (notification.flags & 128) != 0).setNumber(eVar.l).setProgress(eVar.t, eVar.u, eVar.v);
        Notification.Builder builder = this.b;
        IconCompat iconCompat = eVar.j;
        c.b(builder, iconCompat == null ? null : iconCompat.o(context));
        this.b.setSubText(eVar.q).setUsesChronometer(eVar.o).setPriority(eVar.m);
        Iterator it = eVar.b.iterator();
        while (it.hasNext()) {
            b((m.a) it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.d = eVar.H;
        this.e = eVar.I;
        this.b.setShowWhen(eVar.n);
        a.h(this.b, eVar.z);
        a.f(this.b, eVar.w);
        a.i(this.b, eVar.y);
        a.g(this.b, eVar.x);
        this.h = eVar.O;
        b.b(this.b, eVar.C);
        b.c(this.b, eVar.E);
        b.f(this.b, eVar.F);
        b.d(this.b, eVar.G);
        b.e(this.b, notification.sound, notification.audioAttributes);
        List e2 = i2 < 28 ? e(g(eVar.c), eVar.U) : eVar.U;
        if (e2 != null && !e2.isEmpty()) {
            Iterator it2 = e2.iterator();
            while (it2.hasNext()) {
                b.a(this.b, (String) it2.next());
            }
        }
        this.i = eVar.J;
        if (eVar.d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < eVar.d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), o.a((m.a) eVar.d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            c.c(this.b, obj);
        }
        this.b.setExtras(eVar.D);
        d.e(this.b, eVar.s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            d.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            d.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            d.d(this.b, remoteViews3);
        }
        if (i4 >= 26) {
            e.b(this.b, eVar.L);
            e.e(this.b, eVar.r);
            e.f(this.b, eVar.M);
            e.g(this.b, eVar.N);
            e.d(this.b, eVar.O);
            if (eVar.B) {
                e.c(this.b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator it3 = eVar.c.iterator();
            if (it3.hasNext()) {
                android.support.v4.media.session.b.a(it3.next());
                throw null;
            }
        }
        if (i4 >= 29) {
            g.a(this.b, eVar.Q);
            g.b(this.b, m.d.a(null));
        }
        if (i4 >= 31 && (i = eVar.P) != 0) {
            h.b(this.b, i);
        }
        if (eVar.S) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate((long[]) null);
            this.b.setSound((Uri) null);
            int i5 = notification.defaults & (-4);
            notification.defaults = i5;
            this.b.setDefaults(i5);
            if (i4 >= 26) {
                if (TextUtils.isEmpty(this.c.w)) {
                    a.f(this.b, "silent");
                }
                e.d(this.b, this.h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        w.b bVar = new w.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public Notification.Builder a() {
        return this.b;
    }

    public final void b(m.a aVar) {
        IconCompat d2 = aVar.d();
        Notification.Action.Builder a2 = c.a(d2 != null ? d2.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : u.b(aVar.e())) {
                a.c(a2, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i = Build.VERSION.SDK_INT;
        d.a(a2, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i >= 28) {
            f.a(a2, aVar.f());
        }
        if (i >= 29) {
            g.c(a2, aVar.j());
        }
        if (i >= 31) {
            h.a(a2, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a2, bundle);
        a.a(this.b, a.d(a2));
    }

    public Notification c() {
        Bundle a2;
        RemoteViews f2;
        RemoteViews d2;
        m.f fVar = this.c.p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e2 = fVar != null ? fVar.e(this) : null;
        Notification d3 = d();
        if (e2 != null) {
            d3.contentView = e2;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (fVar != null && (d2 = fVar.d(this)) != null) {
            d3.bigContentView = d2;
        }
        if (fVar != null && (f2 = this.c.p.f(this)) != null) {
            d3.headsUpContentView = f2;
        }
        if (fVar != null && (a2 = m.a(d3)) != null) {
            fVar.a(a2);
        }
        return d3;
    }

    public Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.build();
        }
        Notification build = this.b.build();
        if (this.h != 0) {
            if (a.e(build) != null && (build.flags & 512) != 0 && this.h == 2) {
                h(build);
            }
            if (a.e(build) != null && (build.flags & 512) == 0 && this.h == 1) {
                h(build);
            }
        }
        return build;
    }

    public Context f() {
        return this.a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
