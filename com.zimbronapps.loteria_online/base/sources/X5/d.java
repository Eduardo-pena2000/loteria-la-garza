package x5;

import A5.f;
import A5.g;
import A5.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import y5.n;
import y5.o;
import y5.p;
import y5.q;
import y5.r;
import y5.s;
import y5.t;
import y5.u;
import y5.v;
import y5.w;
import y5.x;
import z5.h;
import z5.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements m {
    public final e8.a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final J5.a e;
    public final J5.a f;
    public final int g;

    public static final class a {
        public final URL a;
        public final n b;
        public final String c;

        public a(URL url, n nVar, String str) {
            this.a = url;
            this.b = nVar;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public d(Context context, J5.a aVar, J5.a aVar2, int i) {
        this.a = n.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = o(x5.a.c);
        this.e = aVar2;
        this.f = aVar;
        this.g = i;
    }

    public static /* synthetic */ b c(d dVar, a aVar) {
        return dVar.e(aVar);
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        return m(aVar, bVar);
    }

    public static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.b.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.v.b();
        }
        if (w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.t.b() : networkInfo.getType();
    }

    public static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            D5.a.d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        D5.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    public static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.c)).c("application_build", Integer.toString(i(this.c))).d();
    }

    public g b(f fVar) {
        n j = j(fVar);
        URL url = this.d;
        if (fVar.c() != null) {
            try {
                x5.a c = x5.a.c(fVar.c());
                r3 = c.d() != null ? c.d() : null;
                if (c.e() != null) {
                    url = o(c.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) E5.b.a(5, new a(url, j, r3), new x5.b(this), new c());
            int i = bVar.a;
            if (i == 200) {
                return g.e(bVar.c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e) {
            D5.a.d("CctTransportBackend", "Could not make request to the backend", e);
            return g.f();
        }
    }

    public final b e(a aVar) {
        D5.a.f("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection openConnection = aVar.a.openConnection();
        openConnection.setConnectTimeout(30000);
        openConnection.setReadTimeout(this.g);
        openConnection.setDoOutput(true);
        openConnection.setInstanceFollowRedirects(false);
        openConnection.setRequestMethod("POST");
        openConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.3.0"}));
        openConnection.setRequestProperty("Content-Encoding", "gzip");
        openConnection.setRequestProperty("Content-Type", "application/json");
        openConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            openConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = openConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = openConnection.getResponseCode();
                    D5.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    D5.a.b("CctTransportBackend", "Content-Type: %s", openConnection.getHeaderField("Content-Type"));
                    D5.a.b("CctTransportBackend", "Content-Encoding: %s", openConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(openConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = openConnection.getInputStream();
                    try {
                        InputStream n = n(inputStream, openConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(n))).c());
                            if (n != null) {
                                n.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (e8.c e) {
            e = e;
            D5.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            D5.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            D5.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            D5.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final n j(f fVar) {
        t.a l;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String n = iVar.n();
            if (hashMap.containsKey(n)) {
                ((List) hashMap.get(n)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(n, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a b2 = u.a().f(x.b).g(this.f.a()).h(this.e.a()).b(o.a().c(o.b.c).b(y5.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e = iVar3.e();
                w5.c b3 = e.b();
                if (b3.equals(w5.c.b("proto"))) {
                    l = t.l(e.a());
                } else if (b3.equals(w5.c.b("json"))) {
                    l = t.k(new String(e.a(), Charset.forName("UTF-8")));
                } else {
                    D5.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                l.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.a(iVar3.i("net-type"))).b(w.b.a(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    l.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    l.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.c).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a a2 = q.a();
                    if (iVar3.g() != null) {
                        a2.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        a2.c(iVar3.h());
                    }
                    l.f(a2.a());
                }
                arrayList3.add(l.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return n.a(arrayList2);
    }

    public d(Context context, J5.a aVar, J5.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
