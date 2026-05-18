package O9;

import Ca.l;
import Ca.m;
import Da.D;
import Da.v;
import Na.n;
import Za.B;
import Za.E;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d {
    public final Context a;
    public Activity b;
    public final dev.fluttercommunity.plus.share.a c;
    public final l d;
    public final l e;

    public d(Context context, Activity activity, dev.fluttercommunity.plus.share.a manager) {
        t.g(context, "context");
        t.g(manager, "manager");
        this.a = context;
        this.b = activity;
        this.c = manager;
        this.d = m.b(new b(this));
        this.e = m.b(new c());
    }

    public static /* synthetic */ String a(d dVar) {
        return m(dVar);
    }

    public static /* synthetic */ int b() {
        return l();
    }

    public static final int l() {
        return 33554432;
    }

    public static final String m(d dVar) {
        return dVar.f().getPackageName() + ".flutter.share_provider";
    }

    public final void c() {
        File j = j();
        File[] listFiles = j.listFiles();
        if (!j.exists() || listFiles == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            file.delete();
        }
        j.delete();
    }

    public final File d(File file) {
        File j = j();
        if (!j.exists()) {
            j.mkdirs();
        }
        File file2 = new File(j, file.getName());
        n.t(file, file2, true, 0, 4, null);
        return file2;
    }

    public final boolean e(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            t.d(canonicalPath);
            String canonicalPath2 = j().getCanonicalPath();
            t.f(canonicalPath2, "getCanonicalPath(...)");
            return B.N(canonicalPath, canonicalPath2, false, 2, null);
        } catch (IOException unused) {
            return false;
        }
    }

    public final Context f() {
        Activity activity = this.b;
        if (activity == null) {
            return this.a;
        }
        t.d(activity);
        return activity;
    }

    public final int g() {
        return ((Number) this.e.getValue()).intValue();
    }

    public final String h(String str) {
        if (str == null || !E.T(str, "/", false, 2, null)) {
            return "*";
        }
        String substring = str.substring(0, E.f0(str, "/", 0, false, 6, null));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String i() {
        return (String) this.d.getValue();
    }

    public final File j() {
        return new File(f().getCacheDir(), "share_plus");
    }

    public final ArrayList k(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (e(file)) {
                throw new IOException("Shared file can not be located in '" + j().getCanonicalPath() + "'");
            }
            arrayList.add(H1.b.h(f(), i(), d(file)));
        }
        return arrayList;
    }

    public final String n(List list) {
        if (list == null || list.isEmpty()) {
            return "*/*";
        }
        int i = 1;
        if (list.size() == 1) {
            return (String) D.f0(list);
        }
        String str = (String) D.f0(list);
        int p = v.p(list);
        if (1 <= p) {
            while (true) {
                if (!t.c(str, list.get(i))) {
                    if (!t.c(h(str), h((String) list.get(i)))) {
                        return "*/*";
                    }
                    str = h((String) list.get(i)) + "/*";
                }
                if (i == p) {
                    break;
                }
                i++;
            }
        }
        return str;
    }

    public final void o(Activity activity) {
        this.b = activity;
    }

    public final void p(Map arguments, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        t.g(arguments, "arguments");
        c();
        String str = (String) arguments.get("text");
        String str2 = (String) arguments.get("uri");
        String str3 = (String) arguments.get("subject");
        String str4 = (String) arguments.get("title");
        List list = (List) arguments.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) arguments.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        ArrayList k = arrayList != null ? k(arrayList) : null;
        Intent intent = new Intent();
        if (k == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            if (str2 != null) {
                str = str2;
            }
            intent.putExtra("android.intent.extra.TEXT", str);
            if (str3 != null && !E.h0(str3)) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            if (str4 != null && !E.h0(str4)) {
                intent.putExtra("android.intent.extra.TITLE", str4);
            }
        } else {
            if (k.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            if (k.size() == 1) {
                String str5 = (arrayList2 == null || arrayList2.isEmpty()) ? "*/*" : (String) D.f0(arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str5);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) D.f0(k));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.setType(n(arrayList2));
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", k);
            }
            if (str != null && !E.h0(str)) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (str3 != null && !E.h0(str3)) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            if (str4 != null && !E.h0(str4)) {
                intent.putExtra("android.intent.extra.TITLE", str4);
            }
            intent.addFlags(1);
        }
        Intent createChooser = z ? Intent.createChooser(intent, str4, PendingIntent.getBroadcast(this.a, 0, new Intent(this.a, SharePlusPendingIntent.class), 134217728 | g()).getIntentSender()) : Intent.createChooser(intent, str4);
        if (k != null) {
            List queryIntentActivities = f().getPackageManager().queryIntentActivities(createChooser, 65536);
            t.f(queryIntentActivities, "queryIntentActivities(...)");
            Iterator it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                String str6 = ((ResolveInfo) it.next()).activityInfo.packageName;
                Iterator it2 = k.iterator();
                while (it2.hasNext()) {
                    f().grantUriPermission(str6, (Uri) it2.next(), 3);
                }
            }
        }
        t.d(createChooser);
        q(createChooser, z);
    }

    public final void q(Intent intent, boolean z) {
        Activity activity = this.b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z) {
                this.c.d();
            }
            this.a.startActivity(intent);
            return;
        }
        if (z) {
            t.d(activity);
            activity.startActivityForResult(intent, 22643);
        } else {
            t.d(activity);
            activity.startActivity(intent);
        }
    }
}
