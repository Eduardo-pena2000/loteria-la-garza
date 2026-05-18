package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.a.a.i.c;
import com.amazon.a.a.i.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends h implements com.amazon.a.a.k.d {
    public static final long b = 31536000;
    private static final com.amazon.a.a.o.c e = new com.amazon.a.a.o.c("ShutdownPrompt");
    private static final String f = "https://www.amazon.com/appstore-error-help";
    private static final String g = "badcert";
    private static final String h = "1.1";

    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a i;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c j;

    public static class a extends AsyncTask {
        private final com.amazon.a.a.a.a a;

        public /* synthetic */ a(com.amazon.a.a.a.a aVar, 1 r2) {
            this(aVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        private a(com.amazon.a.a.a.a aVar) {
            this.a = aVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            g.a(this.a);
        }
    }

    public static class b extends AsyncTask {
        private final Context a;
        private final com.amazon.a.a.a.a b;

        public /* synthetic */ b(Context context, com.amazon.a.a.a.a aVar, 1 r3) {
            this(context, aVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Intent... intentArr) {
            this.a.startActivity(intentArr[0]);
            return null;
        }

        private b(Context context, com.amazon.a.a.a.a aVar) {
            this.a = context;
            this.b = aVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            g.a(this.b);
        }
    }

    public g(c cVar) {
        super(cVar, h.a.b);
        e.a("new ShutdownPrompt called!");
    }

    public static /* synthetic */ void a(com.amazon.a.a.a.a aVar) {
        b(aVar);
    }

    private String n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    public void b() {
        this.i.g();
    }

    public long h() {
        return 31536000L;
    }

    public void i() {
        a(0);
    }

    public void m() {
        com.amazon.a.a.o.c cVar = e;
        cVar.a("Store contains " + this.j.toString());
        if (!((h) this).c.i()) {
            cVar.a("Should not show fixup");
            new a(this.i, null).execute(new Void[0]);
        } else {
            cVar.a("Should show fixup");
            Activity a2 = this.i.a();
            a((Context) a2, a((Context) a2));
            cVar.a("Attempted to start browser.");
        }
    }

    public String toString() {
        return "ShutdownPrompt";
    }

    private static void b(com.amazon.a.a.a.a aVar) {
        com.amazon.a.a.o.c cVar = e;
        cVar.a("doShutdown()");
        cVar.c("Killing application");
        System.exit(0);
    }

    public void a(int i) {
        com.amazon.a.a.o.c cVar = e;
        cVar.a("doAction(" + i + ")");
        c.a[] c = ((h) this).c.c();
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = i < c.length ? c[i] : aVar;
        if (aVar2 == c.a.HELP) {
            cVar.a("doAction() help");
            m();
        } else if (aVar2 == c.a.DEEPLINK) {
            cVar.a("doAction() deeplink");
            a("badcert");
        } else if (aVar2 == aVar) {
            b(this.i);
        }
    }

    private String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            e.a("tm was null!");
            return null;
        }
        com.amazon.a.a.o.c cVar = e;
        cVar.a("tm was not null.");
        int simState = telephonyManager.getSimState();
        if (simState != 5) {
            cVar.a("SIM not ready, returning null.  State was " + simState);
            return null;
        }
        return telephonyManager.getSimOperator();
    }

    private boolean b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final Intent a(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder("https://www.amazon.com/appstore-error-help");
        PackageManager packageManager = context.getPackageManager();
        a(sb, "?k=", "1.1");
        a(sb, "&m=", ((h) this).c.e());
        a(sb, "&ec=", String.valueOf(((h) this).c.g()));
        String str = (String) this.j.a("PACKAGE");
        if (str != null) {
            a(sb, "&t=", str);
            a(sb, "&tv=", str, packageManager);
        }
        String str2 = (String) this.j.a("COMMAND");
        if (str2 != null) {
            a(sb, "&c=", str2);
        }
        String str3 = (String) this.j.a("LICENSE_FAILURE_RAW_EXCEPTION");
        if (str3 != null) {
            a(sb, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            a(sb, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            a(sb, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            a(sb, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            a(sb, "&bn=", str7);
        }
        a(sb, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        a(sb, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        a(sb, "&p=", packageName);
        a(sb, "&pv=", packageName, packageManager);
        a(sb, "&l=", n());
        String b2 = b(context);
        if (!TextUtils.isEmpty(b2)) {
            a(sb, "&mc=", b2);
        }
        String sb2 = sb.toString();
        e.a("Starting browser for uri " + sb2);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb2));
    }

    private final void a(StringBuilder sb, String str, String str2, PackageManager packageManager) {
        try {
            a(sb, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            e.b("Could not find information for package " + str2);
        }
    }

    private final void a(StringBuilder sb, String str, String str2) {
        try {
            String encode = URLEncoder.encode(str2, "UTF-8");
            sb.append(str);
            sb.append(encode);
        } catch (UnsupportedEncodingException e2) {
            e.b("Failed to URL-encode argument", e2);
        }
    }

    private void a(String str) {
        e.a("Attempting to deep link to appstore.");
        Activity a2 = this.i.a();
        a((Context) a2, a((Context) a2, str));
    }

    private Intent a(Context context, String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + context.getPackageName() + "&ref=" + str));
    }

    private void a(Context context, Intent intent) {
        if (!b(context, intent)) {
            e.b("Could not start activity, nothing resolves for the given data.");
            b(this.i);
        } else {
            new b(context, this.i, null).execute(new Intent[]{intent});
        }
    }

    public boolean a(c.a aVar) {
        Intent a2;
        if (aVar == c.a.DEFAULT) {
            return true;
        }
        Activity a3 = this.i.a();
        if (aVar == c.a.DEEPLINK) {
            a2 = a((Context) a3, "badcert");
        } else {
            a2 = aVar == c.a.HELP ? a((Context) a3) : null;
        }
        if (a2 == null) {
            e.b("Unexpected action " + aVar + ", could not create intent.");
            return false;
        }
        return b(a3, a2);
    }
}
