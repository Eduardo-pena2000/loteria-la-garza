package G1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public static final Object c = new Object();
    public static Set d = new HashSet();
    public static final Object e = new Object();
    public final Context a;
    public final NotificationManager b;

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public p(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static p b(Context context) {
        return new p(context);
    }

    public boolean a() {
        return a.a(this.b);
    }
}
