package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements Serializable {
    private static final String A = "deviceDisplay";
    private static final String B = "deviceBrand";
    private static final String C = "deviceBoard";
    private static final String D = "androidVersion";
    private static final String E = "deviceModel";
    private static final String F = "packageFilePath";
    private static final String G = "packageName";
    private static final String H = "packageVersionName";
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("CrashReport");
    private static final long b = 1;
    private static final String c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";
    private static final String d = "SHA1";
    private static final String e = "crashTime";
    private static final String f = "UTF-8";
    private static final String g = "crashId";
    private static final String h = "threadDump";
    private static final String i = "stackTrace";
    private static final String j = "threadAllocSize";
    private static final String k = "threadAllocCount";
    private static final String l = "nativeHeapFreeSize";
    private static final String m = "nativeHeapSize";
    private static final String n = "memLowThreshold";
    private static final String o = "memLowFlag";
    private static final String p = "availableInternalMemorySize";
    private static final String q = "totalInternalMemorySize";
    private static final String r = "deviceUser";
    private static final String s = "deviceType";
    private static final String t = "deviceTime";
    private static final String u = "deviceTags";
    private static final String v = "deviceProduct";
    private static final String w = "deviceManufacturer";
    private static final String x = "deviceId";
    private static final String y = "deviceHost";
    private static final String z = "deviceFingerPrint";
    private final HashMap I = new LinkedHashMap();

    public c(Application application, Throwable th) {
        try {
            a(application, th);
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Error collection crash report details", th2);
            }
        }
    }

    private void a(Application application, Throwable th) {
        b();
        a(application);
        c(application);
        a(th);
        e();
        f();
    }

    private void b() {
        this.I.put("crashTime", new Date().toString());
    }

    private void c(Application application) {
        this.I.put("deviceModel", Build.MODEL);
        this.I.put("androidVersion", Build.VERSION.RELEASE);
        this.I.put("deviceBoard", Build.BOARD);
        this.I.put("deviceBrand", Build.BRAND);
        this.I.put("deviceDisplay", Build.DISPLAY);
        this.I.put("deviceFingerPrint", Build.FINGERPRINT);
        this.I.put("deviceHost", Build.HOST);
        this.I.put("deviceId", Build.ID);
        this.I.put("deviceManufacturer", Build.MANUFACTURER);
        this.I.put("deviceProduct", Build.PRODUCT);
        this.I.put("deviceTags", Build.TAGS);
        this.I.put("deviceTime", Long.toString(Build.TIME));
        this.I.put("deviceType", Build.TYPE);
        this.I.put("deviceUser", Build.USER);
        this.I.put("totalInternalMemorySize", Long.toString(d()));
        this.I.put("availableInternalMemorySize", Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.I.put("memLowFlag", Boolean.toString(memoryInfo.lowMemory));
            this.I.put("memLowThreshold", Long.toString(memoryInfo.threshold));
        }
        this.I.put("nativeHeapSize", Long.toString(Debug.getNativeHeapSize()));
        this.I.put("nativeHeapFreeSize", Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.I.put("threadAllocCount", Long.toString(Debug.getThreadAllocCount()));
        this.I.put("threadAllocSize", Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    private void e() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : Thread.getAllStackTraces().entrySet()) {
            Thread thread = (Thread) entry.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            sb.append("Thread : " + thread.getId());
            if (!e.a(thread.getName())) {
                sb.append("/" + thread.getName());
            }
            sb.append("\n");
            sb.append("isAlive : " + thread.isAlive() + "\n");
            sb.append("isInterrupted : " + thread.isInterrupted() + "\n");
            sb.append("isDaemon : " + thread.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb.append("\tat " + stackTraceElement + "\n");
            }
            sb.append("\n\n");
        }
        this.I.put("threadDump", sb.toString());
    }

    private void f() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.I.get("packageName"));
            sb.append((String) this.I.get("packageVersionName"));
            sb.append((String) this.I.get("androidVersion"));
            String str = (String) this.I.get("stackTrace");
            if (str != null) {
                Matcher matcher = Pattern.compile("([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))").matcher(str);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
            }
            this.I.put("crashId", new BigInteger(MessageDigest.getInstance("SHA1").digest(sb.toString().getBytes("UTF-8"))).abs().toString(16));
        } catch (Exception e2) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Error capturing crash id", e2);
            }
        }
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (!com.amazon.a.a.o.c.b) {
                return null;
            }
            a.b("Unable to fetch package info", e2);
            return null;
        }
    }

    private void a(Application application) {
        PackageInfo b2 = b(application);
        if (b2 == null) {
            return;
        }
        this.I.put("packageVersionName", b2.versionName);
        this.I.put("packageName", b2.packageName);
        this.I.put("packageFilePath", application.getFilesDir().getAbsolutePath());
    }

    private void a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb.append(stringWriter.toString());
        sb.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb.append(stringWriter.toString());
            cause = cause.getCause();
            sb.append("\n\n");
        }
        printWriter.close();
        this.I.put("stackTrace", sb.toString());
    }

    public Map a() {
        return this.I;
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
