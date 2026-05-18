package com.amazon.a.a.b;

import android.app.Application;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements a, d, Thread.UncaughtExceptionHandler {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("CrashManagerImpl");
    private static final String b = "s-";
    private static final String c = ".amzst";
    private static final int d = 99999;
    private static final int e = 5;

    @com.amazon.a.a.k.a
    private f f;

    @com.amazon.a.a.k.a
    private Application g;
    private Thread.UncaughtExceptionHandler h;
    private Map i = new HashMap();

    public class 1 implements FilenameFilter {
        public 1() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".amzst") && !b.a(b.this).containsValue(str);
        }
    }

    public static /* synthetic */ Map a(b bVar) {
        return bVar.i;
    }

    private void b() {
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof a) {
            return;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Registering Crash Handler");
        }
        this.h = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private boolean c() {
        return this.i.size() >= 5;
    }

    private String[] d() {
        return new File(this.g.getFilesDir().getAbsolutePath() + "/").list(new 1());
    }

    public void e() {
        com.amazon.a.a.o.a.a.a();
        b();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Crash detected", th);
        }
        try {
            a(th);
            this.f.a(new com.amazon.a.a.b.a.a());
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.a) {
                a.a("Error occured while handling exception", th2);
            }
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Calling previous handler");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private void a(Throwable th) {
        try {
            a(a(new c(this.g, th)));
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Could not handle uncaught exception", th2);
            }
        }
    }

    private String c(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        Reader reader = null;
        try {
            Reader bufferedReader = new BufferedReader(new FileReader(str));
            while (bufferedReader.ready()) {
                try {
                    sb.append(bufferedReader.readLine());
                } catch (Throwable th) {
                    th = th;
                    reader = bufferedReader;
                    com.amazon.a.a.o.a.a(reader);
                    throw th;
                }
            }
            com.amazon.a.a.o.a.a(bufferedReader);
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String e(String str) {
        return this.g.getFilesDir().getAbsolutePath() + "/" + str;
    }

    private void d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e2) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Cannot delete file: " + str, e2);
            }
        }
    }

    private c b(String str) {
        try {
            return (c) com.amazon.a.a.o.c.a.a(c(str));
        } catch (Exception unused) {
            if (!com.amazon.a.a.o.c.b) {
                return null;
            }
            a.b("Failed to load crash report: " + str);
            return null;
        }
    }

    private String a(c cVar) {
        return com.amazon.a.a.o.c.a.a(cVar);
    }

    private synchronized void a(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.g.openFileOutput("s-" + new Random().nextInt(99999) + ".amzst", 0);
                fileOutputStream.write(str.getBytes());
            } catch (Exception e2) {
                if (com.amazon.a.a.o.c.b) {
                    a.b("Coud not save crash report to file", e2);
                }
            }
        } finally {
            com.amazon.a.a.o.a.a((OutputStream) fileOutputStream);
        }
    }

    public List a() {
        if (c()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] d2 = d();
        for (int i = 0; i < d2.length && !c(); i++) {
            String e2 = e(d2[i]);
            c b2 = b(e2);
            if (b2 != null) {
                this.i.put(b2, e2);
                arrayList.add(b2);
            } else {
                d(e2);
            }
        }
        return arrayList;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            d((String) this.i.get(cVar));
            this.i.remove(cVar);
        }
    }
}
