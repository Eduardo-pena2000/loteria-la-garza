package va;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import g.i;
import h.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import va.c;
import va.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class m implements da.l, da.n {
    public final String a;
    public final Activity b;
    public final q c;
    public final va.c d;
    public final h e;
    public final d f;
    public final va.b g;
    public final ExecutorService h;
    public c i;
    public Uri j;
    public g k;
    public final Object l;

    public class a implements h {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        public void a(String str, int i) {
            G1.b.e(this.a, new String[]{str}, i);
        }

        public boolean b() {
            return p.e(this.a);
        }

        public boolean c(String str) {
            return H1.a.checkSelfPermission(this.a, str) == 0;
        }
    }

    public class b implements d {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        public static /* synthetic */ void c(f fVar, String str, Uri uri) {
            d(fVar, str, uri);
        }

        public static /* synthetic */ void d(f fVar, String str, Uri uri) {
            fVar.a(str);
        }

        public void a(Uri uri, f fVar) {
            MediaScannerConnection.scanFile(this.a, new String[]{uri != null ? uri.getPath() : ""}, (String[]) null, new n(fVar));
        }

        public Uri b(String str, File file) {
            return H1.b.h(this.a, str, file);
        }
    }

    public enum c {
        REAR,
        FRONT
    }

    public interface d {
        void a(Uri uri, f fVar);

        Uri b(String str, File file);
    }

    public class e {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public interface f {
        void a(String str);
    }

    public static class g {
        public final r.g a;
        public final r.n b;
        public final r.j c;

        public g(r.g gVar, r.n nVar, r.j jVar) {
            this.a = gVar;
            this.b = nVar;
            this.c = jVar;
        }
    }

    public interface h {
        void a(String str, int i);

        boolean b();

        boolean c(String str);
    }

    public m(Activity activity, q qVar, va.c cVar) {
        this(activity, qVar, null, null, null, cVar, new a(activity), new b(activity), new va.b(), Executors.newSingleThreadExecutor());
    }

    public static List Y(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentActivities(intent, 65536);
    }

    public static /* synthetic */ void a(m mVar, String str) {
        mVar.I(str);
    }

    public static /* synthetic */ void c(m mVar, int i) {
        mVar.P(i);
    }

    public static /* synthetic */ void d(m mVar, int i, Intent intent) {
        mVar.N(i, intent);
    }

    public static /* synthetic */ void e(m mVar, int i, Intent intent) {
        mVar.O(i, intent);
    }

    public static /* synthetic */ void f(m mVar, int i, Intent intent) {
        mVar.L(i, intent);
    }

    public static /* synthetic */ void g(m mVar, int i, Intent intent) {
        mVar.K(i, intent);
    }

    public static /* synthetic */ void h(m mVar, int i) {
        mVar.M(i);
    }

    public static /* synthetic */ void i(m mVar, int i, Intent intent) {
        mVar.J(i, intent);
    }

    public static /* synthetic */ void j(m mVar, String str) {
        mVar.v(str);
    }

    private void t(String str, String str2) {
        r.j jVar;
        synchronized (this.l) {
            try {
                g gVar = this.k;
                jVar = gVar != null ? gVar.c : null;
                this.k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar == null) {
            this.d.f(null, str, str2);
        } else {
            jVar.b(new r.d(str, str2, null));
        }
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void P(int i) {
        if (i != -1) {
            v(null);
            return;
        }
        Uri uri = this.j;
        d dVar = this.f;
        if (uri == null) {
            uri = Uri.parse(this.d.c());
        }
        dVar.a(uri, new l(this));
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void J(int i, Intent intent) {
        if (i != -1 || intent == null) {
            v(null);
            return;
        }
        ArrayList w = w(intent, false);
        if (w == null) {
            t("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            H(w);
        }
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void N(int i, Intent intent) {
        if (i != -1 || intent == null) {
            v(null);
            return;
        }
        ArrayList w = w(intent, true);
        if (w == null) {
            t("no_valid_media_uri", "Cannot find the selected media.");
        } else {
            H(w);
        }
    }

    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void K(int i, Intent intent) {
        if (i != -1 || intent == null) {
            v(null);
            return;
        }
        ArrayList w = w(intent, false);
        if (w == null) {
            t("missing_valid_image_uri", "Cannot find at least one of the selected images.");
        } else {
            H(w);
        }
    }

    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void L(int i, Intent intent) {
        if (i != -1 || intent == null) {
            v(null);
            return;
        }
        ArrayList w = w(intent, false);
        if (w == null) {
            t("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
        } else {
            H(w);
        }
    }

    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void O(int i, Intent intent) {
        if (i != -1 || intent == null) {
            v(null);
            return;
        }
        ArrayList w = w(intent, false);
        if (w == null || w.size() < 1) {
            t("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            v(((e) w.get(0)).a);
        }
    }

    public void G(String str, boolean z) {
        r.g gVar;
        synchronized (this.l) {
            try {
                g gVar2 = this.k;
                gVar = gVar2 != null ? gVar2.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gVar == null) {
            v(str);
            return;
        }
        String x = x(str, gVar);
        if (x != null && !x.equals(str) && z) {
            new File(str).delete();
        }
        v(x);
    }

    public final void H(ArrayList arrayList) {
        r.g gVar;
        synchronized (this.l) {
            try {
                g gVar2 = this.k;
                gVar = gVar2 != null ? gVar2.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (gVar == null) {
            while (i < arrayList.size()) {
                arrayList2.add(((e) arrayList.get(i)).a);
                i++;
            }
            u(arrayList2);
            return;
        }
        while (i < arrayList.size()) {
            e eVar = (e) arrayList.get(i);
            String str = eVar.a;
            String str2 = eVar.b;
            if (str2 == null || !str2.startsWith("video/")) {
                str = x(eVar.a, gVar);
            }
            arrayList2.add(str);
            i++;
        }
        u(arrayList2);
    }

    public final /* synthetic */ void I(String str) {
        G(str, true);
    }

    public final void Q(Boolean bool, int i) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new h.d(i).a(this.b, new i.a().b(f.d.a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.b.startActivityForResult(intent, 2346);
    }

    public final void R(Boolean bool, int i) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new h.d(i).a(this.b, new i.a().b(f.e.a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.b.startActivityForResult(intent, 2348);
    }

    public final void S(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new h.f().a(this.b, new i.a().b(f.d.a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.b.startActivityForResult(intent, 2342);
    }

    public final void T(r.e eVar) {
        Intent intent;
        if (eVar.d().booleanValue()) {
            intent = eVar.b().booleanValue() ? new h.d(p.a(eVar)).a(this.b, new i.a().b(f.c.a).a()) : new h.f().a(this.b, new i.a().b(f.c.a).a());
        } else {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("*/*");
            intent2.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", eVar.b());
            intent = intent2;
        }
        this.b.startActivityForResult(intent, 2347);
    }

    public final void U(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new h.f().a(this.b, new i.a().b(f.e.a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.b.startActivityForResult(intent, 2352);
    }

    public final void V() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.i == c.FRONT) {
            f0(intent);
        }
        File q = q();
        this.j = Uri.parse("file:" + q.getAbsolutePath());
        Uri b2 = this.f.b(this.a, q);
        intent.putExtra("output", b2);
        y(intent, b2);
        try {
            try {
                this.b.startActivityForResult(intent, 2343);
            } catch (ActivityNotFoundException unused) {
                q.delete();
                t("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e2) {
            e2.printStackTrace();
            t("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    public final void W() {
        r.n nVar;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.l) {
            try {
                g gVar = this.k;
                nVar = gVar != null ? gVar.b : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nVar != null && nVar.b() != null) {
            intent.putExtra("android.intent.extra.durationLimit", nVar.b().intValue());
        }
        if (this.i == c.FRONT) {
            f0(intent);
        }
        File r = r();
        this.j = Uri.parse("file:" + r.getAbsolutePath());
        Uri b2 = this.f.b(this.a, r);
        intent.putExtra("output", b2);
        y(intent, b2);
        try {
            try {
                this.b.startActivityForResult(intent, 2353);
            } catch (ActivityNotFoundException unused) {
                r.delete();
                t("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e2) {
            e2.printStackTrace();
            t("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    public final boolean X() {
        h hVar = this.e;
        if (hVar == null) {
            return false;
        }
        return hVar.b();
    }

    public r.b Z() {
        Map b2 = this.d.b();
        if (b2.isEmpty()) {
            return null;
        }
        r.b.a aVar = new r.b.a();
        r.c cVar = (r.c) b2.get("type");
        if (cVar != null) {
            aVar.d(cVar);
        }
        aVar.b((r.a) b2.get("error"));
        ArrayList arrayList = (ArrayList) b2.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Double d2 = (Double) b2.get("maxWidth");
                Double d3 = (Double) b2.get("maxHeight");
                Integer num = (Integer) b2.get("imageQuality");
                arrayList2.add(this.c.j(str, d2, d3, num == null ? 100 : num.intValue()));
            }
            aVar.c(arrayList2);
        }
        this.d.a();
        return aVar.a();
    }

    public void a0() {
        synchronized (this.l) {
            try {
                g gVar = this.k;
                if (gVar == null) {
                    return;
                }
                r.g gVar2 = gVar.a;
                this.d.g(gVar2 != null ? c.b.IMAGE : c.b.VIDEO);
                if (gVar2 != null) {
                    this.d.d(gVar2);
                }
                Uri uri = this.j;
                if (uri != null) {
                    this.d.e(uri);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(int i, String[] strArr, int[] iArr) {
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (i != 2345) {
            if (i != 2355) {
                return false;
            }
            if (z) {
                W();
            }
        } else if (z) {
            V();
        }
        if (!z && (i == 2345 || i == 2355)) {
            t("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    public void b0(c cVar) {
        this.i = cVar;
    }

    public final boolean c0(r.g gVar, r.n nVar, r.j jVar) {
        synchronized (this.l) {
            try {
                if (this.k != null) {
                    return false;
                }
                this.k = new g(gVar, nVar, jVar);
                this.d.a();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d0(r.g gVar, r.j jVar) {
        if (!c0(gVar, null, jVar)) {
            s(jVar);
        } else if (!X() || this.e.c("android.permission.CAMERA")) {
            V();
        } else {
            this.e.a("android.permission.CAMERA", 2345);
        }
    }

    public void e0(r.n nVar, r.j jVar) {
        if (!c0(null, nVar, jVar)) {
            s(jVar);
        } else if (!X() || this.e.c("android.permission.CAMERA")) {
            W();
        } else {
            this.e.a("android.permission.CAMERA", 2355);
        }
    }

    public final void f0(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    public void k(r.g gVar, boolean z, r.j jVar) {
        if (c0(gVar, null, jVar)) {
            S(Boolean.valueOf(z));
        } else {
            s(jVar);
        }
    }

    public void l(r.h hVar, r.e eVar, r.j jVar) {
        if (c0(hVar.b(), null, jVar)) {
            T(eVar);
        } else {
            s(jVar);
        }
    }

    public void m(r.g gVar, boolean z, int i, r.j jVar) {
        if (c0(gVar, null, jVar)) {
            Q(Boolean.valueOf(z), i);
        } else {
            s(jVar);
        }
    }

    public void n(r.n nVar, boolean z, int i, r.j jVar) {
        if (c0(null, nVar, jVar)) {
            R(Boolean.valueOf(z), i);
        } else {
            s(jVar);
        }
    }

    public void o(r.n nVar, boolean z, r.j jVar) {
        if (c0(null, nVar, jVar)) {
            U(Boolean.valueOf(z));
        } else {
            s(jVar);
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        Runnable dVar;
        if (i == 2342) {
            dVar = new va.d(this, i2, intent);
        } else if (i == 2343) {
            dVar = new va.g(this, i2);
        } else if (i == 2352) {
            dVar = new i(this, i2, intent);
        } else if (i != 2353) {
            switch (i) {
                case 2346:
                    dVar = new va.e(this, i2, intent);
                    break;
                case 2347:
                    dVar = new va.h(this, i2, intent);
                    break;
                case 2348:
                    dVar = new va.f(this, i2, intent);
                    break;
                default:
                    return false;
            }
        } else {
            dVar = new j(this, i2);
        }
        this.h.execute(dVar);
        return true;
    }

    public final File p(String str) {
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.b.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(uuid, str, cacheDir);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final File q() {
        return p(".jpg");
    }

    public final File r() {
        return p(".mp4");
    }

    public final void s(r.j jVar) {
        jVar.b(new r.d("already_active", "Image picker is already active", null));
    }

    public final void u(ArrayList arrayList) {
        r.j jVar;
        synchronized (this.l) {
            try {
                g gVar = this.k;
                jVar = gVar != null ? gVar.c : null;
                this.k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar == null) {
            this.d.f(arrayList, null, null);
        } else {
            jVar.a(arrayList);
        }
    }

    public final void v(String str) {
        r.j jVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.l) {
            try {
                g gVar = this.k;
                jVar = gVar != null ? gVar.c : null;
                this.k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.a(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.d.f(arrayList, null, null);
        }
    }

    public final ArrayList w(Intent intent, boolean z) {
        String e2;
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        if (data != null) {
            String e3 = this.g.e(this.b, data);
            if (e3 == null) {
                return null;
            }
            arrayList.add(new e(e3, null));
        } else {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int i = 0; i < intent.getClipData().getItemCount(); i++) {
                Uri uri = intent.getClipData().getItemAt(i).getUri();
                if (uri == null || (e2 = this.g.e(this.b, uri)) == null) {
                    return null;
                }
                arrayList.add(new e(e2, z ? this.b.getContentResolver().getType(uri) : null));
            }
        }
        return arrayList;
    }

    public final String x(String str, r.g gVar) {
        return this.c.j(str, gVar.c(), gVar.b(), gVar.d().intValue());
    }

    public final void y(Intent intent, Uri uri) {
        PackageManager packageManager = this.b.getPackageManager();
        Iterator it = (Build.VERSION.SDK_INT >= 33 ? ga.b.a(packageManager, intent, ga.a.a(65536L)) : Y(packageManager, intent)).iterator();
        while (it.hasNext()) {
            this.b.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uri, 3);
        }
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void M(int i) {
        if (i != -1) {
            v(null);
            return;
        }
        Uri uri = this.j;
        d dVar = this.f;
        if (uri == null) {
            uri = Uri.parse(this.d.c());
        }
        dVar.a(uri, new k(this));
    }

    public m(Activity activity, q qVar, r.g gVar, r.n nVar, r.j jVar, va.c cVar, h hVar, d dVar, va.b bVar, ExecutorService executorService) {
        this.l = new Object();
        this.b = activity;
        this.c = qVar;
        this.a = activity.getPackageName() + ".flutter.image_provider";
        if (jVar != null) {
            this.k = new g(gVar, nVar, jVar);
        }
        this.e = hVar;
        this.f = dVar;
        this.g = bVar;
        this.d = cVar;
        this.h = executorService;
    }
}
