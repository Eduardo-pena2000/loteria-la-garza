package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d2;
import com.applovin.impl.d4;
import com.applovin.impl.d6;
import com.applovin.impl.g2;
import com.applovin.impl.h2;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m {
    private final k b;
    private final o c;
    private final boolean f;
    private final String a = "FileManager";
    private final Object d = new Object();
    private final Set e = new HashSet();
    private final g2 g = a();

    public m(k kVar) {
        this.b = kVar;
        this.c = kVar.O();
        this.f = ((Boolean) kVar.a(x4.U0)).booleanValue();
    }

    public static /* synthetic */ void a(m mVar, com.applovin.impl.sdk.ad.b bVar, Context context) {
        mVar.b(bVar, context);
    }

    public static /* synthetic */ void b(m mVar, com.applovin.impl.sdk.ad.b bVar, Context context) {
        mVar.a(bVar, context);
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            try {
                if (this.e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g(File file) {
        if (o.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean delete = file.delete();
            if (!delete) {
                Map hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                hashMap.put("details", b(file));
                this.b.D().a(d2.Q0, "removeFile", hashMap);
            }
            h(file);
            return delete;
        } catch (Throwable th) {
            try {
                if (o.a()) {
                    this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.b.D().a("FileManager", "removeFile", th);
                h(file);
                return false;
            } catch (Throwable th2) {
                h(file);
                throw th2;
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            try {
                if (!this.e.remove(absolutePath)) {
                    this.b.D().a(d2.Q0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.b.q0().a((i5) new r6(this.b, false, "removeCachedResourcesForAd", new J0(this, bVar, context)), d6.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.b.q0().a((i5) new r6(this.b, false, "removeCachedVideoResourceForAd", new K0(this, bVar, context)), d6.b.CACHING);
    }

    public String f(File file) {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z = true;
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String a = a((InputStream) fileInputStream);
                            boolean z2 = a == null;
                            fileInputStream.close();
                            if (z2 && ((Boolean) this.b.a(x4.M0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return a;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e) {
                        if (o.a()) {
                            this.c.d("FileManager", "File not found. " + e);
                        }
                        this.c.a("FileManager", e);
                        this.b.D().a("FileManager", "readFileNotFound", e);
                        if (0 != 0 && ((Boolean) this.b.a(x4.M0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (IOException e2) {
                    if (o.a()) {
                        this.c.a("FileManager", "Failed to read file: " + file.getName() + e2);
                    }
                    this.c.a("FileManager", e2);
                    this.b.D().a("FileManager", "readFileIO", e2);
                    if (((Boolean) this.b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                } catch (Throwable th3) {
                    if (o.a()) {
                        this.c.a("FileManager", "Unknown failure to read file.", th3);
                    }
                    this.c.a("FileManager", th3);
                    this.b.D().a("FileManager", "readFile", th3);
                    if (((Boolean) this.b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
                if (z && ((Boolean) this.b.a(x4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private g2 a() {
        if (com.applovin.impl.o0.d() && ((Boolean) this.b.a(x4.s3)).booleanValue()) {
            try {
                return new d4(this.b);
            } catch (Throwable th) {
                if (o.a()) {
                    this.c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.b.D().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new h2(this.b);
    }

    private boolean c(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            contains = this.e.contains(absolutePath);
        }
        return contains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean add = this.e.add(absolutePath);
            while (!add) {
                try {
                    this.d.wait();
                    add = this.e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (o.a()) {
                        this.c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.b.E0()) {
            if (o.a()) {
                this.c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    private /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.l0() == null) {
            return;
        }
        g(a(bVar.l0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] listFiles;
        File d = d(context);
        if (d.isDirectory() && (listFiles = d.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (o.a()) {
                this.c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.c.b("FileManager", "Failed to create .nomedia file");
            }
            this.b.D().a(d2.Q0, "createNoMediaFile");
        } catch (IOException e) {
            if (o.a()) {
                this.c.a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    private File a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            this.c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File d = d(context);
        File file = new File(d, str);
        if (z) {
            try {
                d.mkdirs();
            } catch (Throwable th) {
                if (o.a()) {
                    this.c.a("FileManager", "Unable to make cache directory at " + d, th);
                }
                this.b.D().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    private String b(File file) {
        try {
            boolean exists = file.exists();
            boolean isDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z = false;
            boolean z2 = isDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z3 = parentFile != null && parentFile.exists();
            if (z3 && parentFile.canWrite()) {
                z = true;
            }
            return "fileExists: " + exists + "\nisDirectory: " + isDirectory + "\nisEmptyDirectory: " + z2 + "\nparentDirectoryExists: " + z3 + "\nisParentDirectoryWritable: " + z;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean c(String str, Context context) {
        if (this.f) {
            return b(str, context);
        }
        boolean z = false;
        File a = a(str, false, context);
        if (!e(a)) {
            return false;
        }
        if (a.exists() && !a.isDirectory()) {
            z = true;
        }
        h(a);
        return z;
    }

    private long b() {
        long longValue = ((Long) this.b.a(x4.B0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.c.a("FileManager", th);
            this.b.D().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean a(InputStream inputStream, File file, boolean z) {
        return a(inputStream, file, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0315 A[Catch: all -> 0x031b, TRY_LEAVE, TryCatch #19 {all -> 0x031b, blocks: (B:207:0x030f, B:209:0x0315), top: B:206:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02d0 A[EDGE_INSN: B:254:0x02d0->B:255:0x02d0 BREAK  A[LOOP:1: B:172:0x026e->B:177:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151 A[Catch: all -> 0x0157, TryCatch #17 {all -> 0x0157, blocks: (B:60:0x014b, B:62:0x0151, B:63:0x015a), top: B:59:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.io.InputStream r19, java.io.File r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i, String str2, Map map) {
        return a(file, str, list, true, i, str2, map);
    }

    private boolean a(File file, String str, List list, boolean z, int i, String str2, Map map) {
        Map hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        this.b.g().d(d2.L, hashMap);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 1; i2 <= i; i2++) {
            if (a(file, str, list, z, str2, map)) {
                a(true, str, i2, elapsedRealtime, map);
                return true;
            }
        }
        a(false, str, i, elapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z, String str2, Map map) {
        Boolean bool = (Boolean) this.b.a(x4.V0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                this.c.a("FileManager", "File exists for " + str);
            }
            Map hashMap = CollectionUtils.hashMap("url", str);
            hashMap.putAll(map);
            this.b.g().d(d2.M, hashMap);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream a = a(str, list, z, map);
            try {
                if (o.a()) {
                    this.c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean a2 = a(a, file, false, bool.booleanValue());
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (a2) {
                    if (o.a()) {
                        this.c.a("FileManager", "Caching completed for " + file);
                    }
                    double d = n7.d(elapsedRealtime2);
                    double c = n7.c(file.length());
                    long j = (long) (c / d);
                    Map a3 = a(file, str, elapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j), a3);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(c), a3);
                    this.b.g().d(d2.R, a3);
                    this.b.d0().b(j, str, str2);
                } else {
                    if (o.a()) {
                        this.c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.b.g().d(d2.S, a(file, str, elapsedRealtime2, map));
                }
                if (a != null) {
                    a.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return a2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.c.a("FileManager", th);
                this.b.D().a("FileManager", "loadAndCacheResource", th);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j, Map map) {
        HashMap hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, hashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j), hashMap);
        hashMap.putAll(map);
        return hashMap;
    }

    private void a(boolean z, String str, int i, long j, Map map) {
        d2 d2Var = z ? d2.N : d2.O;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        Map hashMap = new HashMap(3);
        hashMap.put("attempt_number", Integer.toString(i));
        hashMap.put("url", str);
        hashMap.put("duration_ms", String.valueOf(elapsedRealtime));
        hashMap.putAll(map);
        this.b.g().d(d2Var, hashMap);
    }

    public InputStream a(String str, List list, boolean z, Map map) {
        if (z && !n7.a(str, list)) {
            if (o.a()) {
                this.c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.c.a("FileManager", "Loading " + httpsString + "...");
        }
        Map hashMap = CollectionUtils.hashMap("url", httpsString);
        hashMap.putAll(map);
        this.b.g().d(d2.P, hashMap);
        try {
            return this.g.a(httpsString, map);
        } catch (Throwable th) {
            if (o.a()) {
                this.c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.b.D().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List T = bVar.T();
        if (bVar.M0() || T.contains(str)) {
            return bVar.B();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z, int i, String str3, Map map) {
        return a(context, str, str2, list, z, false, i, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z, boolean z2, int i, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.b.D().a(d2.Q0, "cacheResource");
            return null;
        }
        String a = n7.a(Uri.parse(str), str2, this.b);
        File a2 = a(a, context);
        if (!a(a2, str, list, z, i, str3, map)) {
            return null;
        }
        if (o.a()) {
            this.c.a("FileManager", "Caching succeeded for file " + a);
        }
        return z2 ? Uri.fromFile(a2).toString() : a;
    }

    private long a(Context context) {
        boolean z;
        long b = b();
        boolean z2 = b != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c = this.b.c(x4.G0);
        long j = 0;
        for (File file : c(context)) {
            if (!z2 || c.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= b) {
                z = false;
            } else {
                if (o.a()) {
                    this.c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z = g(file);
            }
            if (!z) {
                j += file.length();
            }
        }
        return j;
    }

    private void a(long j, Context context) {
        long intValue = ((Integer) this.b.a(x4.C0)).intValue();
        if (intValue == -1) {
            if (o.a()) {
                this.c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j) > intValue) {
                if (o.a()) {
                    this.c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (o.a()) {
                this.c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    private /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.l().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri l0 = bVar.l0();
        if (l0 != null) {
            g(a(l0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            Map hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            hashMap.put("details", b(file));
            this.b.D().a(d2.Q0, str, hashMap);
        } catch (Throwable th) {
            if (o.a()) {
                this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.b.D().a("FileManager", str, th);
        }
    }

    private long a(long j) {
        return j / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
