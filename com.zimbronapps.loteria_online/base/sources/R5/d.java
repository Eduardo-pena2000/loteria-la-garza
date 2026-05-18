package r5;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import r5.c;
import s5.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d {
    public final Set a;
    public final c.b b;
    public final c.a c;
    public boolean d;
    public boolean e;
    public c.d f;

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(Context context, String str, String str2, c.c cVar) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                r0 = 0
                r5.d r1 = r5.d.this     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.a     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.b     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.c     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                r5.d.a(r1, r2, r3, r4)     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.d.a.run():void");
        }
    }

    public class b implements FilenameFilter {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.a);
        }
    }

    public d() {
        this(new e(), new r5.a());
    }

    public static /* synthetic */ void a(d dVar, Context context, String str, String str2) {
        dVar.g(context, str, str2);
    }

    public void b(Context context, String str, String str2) {
        File c = c(context);
        File d = d(context, str, str2);
        File[] listFiles = c.listFiles(new b(this.b.b(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.d || !file.getAbsolutePath().equals(d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String b2 = this.b.b(str);
        if (f.a(str2)) {
            return new File(c(context), b2);
        }
        return new File(c(context), b2 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        j("Beginning load of %s...", str);
        if (cVar == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    public final void g(Context context, String str, String str2) {
        i iVar;
        if (this.a.contains(str) && !this.d) {
            j("%s already loaded previously!", str);
            return;
        }
        try {
            this.b.a(str);
            this.a.add(str);
            j("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            j("Loading the library normally failed: %s", Log.getStackTraceString(e));
            j("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d = d(context, str, str2);
            if (!d.exists() || this.d) {
                if (this.d) {
                    j("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.c.a(context, this.b.d(), this.b.b(str), d, this);
            }
            try {
                if (this.e) {
                    i iVar2 = null;
                    try {
                        iVar = new i(d);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        List c = iVar.c();
                        iVar.close();
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            e(context, this.b.c((String) it.next()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iVar2 = iVar;
                        if (iVar2 != null) {
                            iVar2.close();
                        }
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.b.e(d.getAbsolutePath());
            this.a.add(str);
            j("%s (%s) was re-linked!", str, str2);
        }
    }

    public d h(c.d dVar) {
        this.f = dVar;
        return this;
    }

    public void i(String str) {
        c.d dVar = this.f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void j(String str, Object... objArr) {
        i(String.format(Locale.US, str, objArr));
    }

    public d(c.b bVar, c.a aVar) {
        this.a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.b = bVar;
        this.c = aVar;
    }
}
