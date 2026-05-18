package Q1;

import Q1.l;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import w.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final z a = new z(2);
    public static final Comparator b = new Q1.c();

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {
        public final ContentProviderClient a;

        public b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static class c {
        public String a;
        public String b;
        public List c;

        public c(String str, String str2, List list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.a, cVar.a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        return g(bArr, bArr2);
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : J1.e.c(resources, eVar.c());
    }

    public static l.a e(Context context, List list, CancellationSignal cancellationSignal) {
        p4.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                e eVar = (e) list.get(i);
                ProviderInfo f = f(context.getPackageManager(), eVar, context.getResources());
                if (f == null) {
                    return l.a.b(1, null);
                }
                arrayList.add(h(context, eVar, f.authority, cancellationSignal));
            }
            return l.a.a(0, arrayList);
        } finally {
            p4.a.f();
        }
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        p4.a.c("FontProvider.getProvider");
        try {
            List d = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), d);
            ProviderInfo providerInfo = (ProviderInfo) a.get(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String e = eVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
            }
            if (!resolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + eVar.f());
            }
            List b2 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b2, b);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) d.get(i));
                Collections.sort(arrayList, b);
                if (c(b2, arrayList)) {
                    a.put(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            p4.a.f();
            return null;
        } finally {
            p4.a.f();
        }
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Q1.l.b[] h(android.content.Context r16, Q1.e r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.d.h(android.content.Context, Q1.e, java.lang.String, android.os.CancellationSignal):Q1.l$b[]");
    }
}
