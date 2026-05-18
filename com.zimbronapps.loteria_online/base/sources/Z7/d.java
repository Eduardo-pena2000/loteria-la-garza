package z7;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z7.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d {
    public static final d b = new d(new e.a());
    public static final d c = new d(new e.e());
    public static final d d = new d(new e.g());
    public static final d e = new d(new e.f());
    public static final d f = new d(new e.b());
    public static final d g = new d(new e.d());
    public static final d h = new d(new e.c());
    public final e a;

    public static class b implements e {
        public final z7.e a;

        public /* synthetic */ b(z7.e eVar, a aVar) {
            this(eVar);
        }

        public Object a(String str) {
            Iterator it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            return this.a.a(str, null);
        }

        public b(z7.e eVar) {
            this.a = eVar;
        }
    }

    public static class c implements e {
        public final z7.e a;

        public /* synthetic */ c(z7.e eVar, a aVar) {
            this(eVar);
        }

        public Object a(String str) {
            return this.a.a(str, null);
        }

        public c(z7.e eVar) {
            this.a = eVar;
        }
    }

    public static class d implements e {
        public final z7.e a;

        public /* synthetic */ d(z7.e eVar, a aVar) {
            this(eVar);
        }

        public Object a(String str) {
            Iterator it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Throwable th = null;
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception e) {
                    if (th == null) {
                        th = e;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", th);
        }

        public d(z7.e eVar) {
            this.a = eVar;
        }
    }

    public interface e {
        Object a(String str);
    }

    public d(z7.e eVar) {
        if (y7.b.c()) {
            this.a = new d(eVar, null);
        } else if (h.a()) {
            this.a = new b(eVar, null);
        } else {
            this.a = new c(eVar, null);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.a.a(str);
    }
}
