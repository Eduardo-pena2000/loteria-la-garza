package n9;

import Ca.I;
import Ca.t;
import Da.D;
import Da.u;
import Da.v;
import Ia.l;
import Qa.p;
import Za.B;
import Za.E;
import Za.G;
import Za.o;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import cb.O;
import cb.P;
import cb.Q;
import cb.e0;
import da.j;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import n9.a;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f {
    public static final f a = new f();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class b extends l implements p {
        public int a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ c c;
        public final /* synthetic */ Activity d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, c cVar, Activity activity, int i, boolean z, String str, Ga.e eVar) {
            super(2, eVar);
            this.b = intent;
            this.c = cVar;
            this.d = activity;
            this.e = i;
            this.f = z;
            this.g = str;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, this.g, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (this.b == null) {
                this.c.g("unknown_activity", "Unknown activity error, please fill an issue.");
                return I.a;
            }
            ArrayList arrayList = new ArrayList();
            if (this.b.getClipData() != null) {
                ClipData clipData = this.b.getClipData();
                kotlin.jvm.internal.t.d(clipData);
                int itemCount = clipData.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    ClipData clipData2 = this.b.getClipData();
                    kotlin.jvm.internal.t.d(clipData2);
                    Uri uri = clipData2.getItemAt(i).getUri();
                    f fVar = f.a;
                    Activity activity = this.d;
                    kotlin.jvm.internal.t.d(uri);
                    f.a(fVar, this.d, f.d(fVar, activity, uri, this.e), this.f, arrayList);
                }
                this.c.h(arrayList);
            } else if (this.b.getData() != null) {
                f fVar2 = f.a;
                Activity activity2 = this.d;
                Uri data = this.b.getData();
                kotlin.jvm.internal.t.d(data);
                Uri d = f.d(fVar2, activity2, data, this.e);
                if (kotlin.jvm.internal.t.c(this.g, "dir")) {
                    String o = f.o(DocumentsContract.buildDocumentUriUsingTree(d, DocumentsContract.getTreeDocumentId(d)), this.d);
                    if (o != null) {
                        this.c.h(o);
                    } else {
                        this.c.g("unknown_path", "Failed to retrieve directory path.");
                    }
                } else {
                    f.a(fVar2, this.d, d, this.f, arrayList);
                    f.c(fVar2, this.c, arrayList);
                }
            } else {
                Bundle extras = this.b.getExtras();
                if (extras == null || !extras.containsKey("selectedItems")) {
                    this.c.g("unknown_activity", "Unknown activity error, please fill an issue.");
                } else {
                    f fVar3 = f.a;
                    Bundle extras2 = this.b.getExtras();
                    kotlin.jvm.internal.t.d(extras2);
                    ArrayList b = f.b(fVar3, extras2);
                    if (b != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : b) {
                            if (obj2 instanceof Uri) {
                                arrayList2.add(obj2);
                            }
                        }
                        Activity activity3 = this.d;
                        boolean z = this.f;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            f.a(f.a, activity3, (Uri) it.next(), z, arrayList);
                        }
                    }
                    this.c.h(arrayList);
                }
            }
            return I.a;
        }
    }

    public static final /* synthetic */ void a(f fVar, Activity activity, Uri uri, boolean z, List list) {
        fVar.e(activity, uri, z, list);
    }

    public static final /* synthetic */ ArrayList b(f fVar, Bundle bundle) {
        return fVar.s(bundle);
    }

    public static final /* synthetic */ void c(f fVar, c cVar, List list) {
        fVar.t(cVar, list);
    }

    public static final /* synthetic */ Uri d(f fVar, Activity activity, Uri uri, int i) {
        return fVar.z(activity, uri, i);
    }

    public static final boolean f(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        try {
            a.A(new File(context.getCacheDir() + "/file_picker/"));
            return true;
        } catch (Exception e) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e);
            return false;
        }
    }

    public static final Uri g(Uri uri, int i, Context context) {
        kotlin.jvm.internal.t.g(uri, "originalImageUri");
        kotlin.jvm.internal.t.g(context, "context");
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                f fVar = a;
                Bitmap.CompressFormat i2 = fVar.i(context, uri);
                File h = fVar.h(context, i2);
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(h);
                decodeStream.compress(i2, i, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri fromFile = Uri.fromFile(h);
                I i3 = I.a;
                Na.c.a(openInputStream, (Throwable) null);
                return fromFile;
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String n(android.net.Uri r9, android.content.Context r10) {
        /*
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.t.g(r9, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.t.g(r10, r1)
            r1 = 0
            java.lang.String r2 = r9.getScheme()     // Catch: java.lang.Exception -> L4e
            java.lang.String r3 = "content"
            boolean r2 = kotlin.jvm.internal.t.c(r2, r3)     // Catch: java.lang.Exception -> L4e
            if (r2 == 0) goto L50
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Exception -> L4e
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L4e
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r9
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4e
            if (r10 == 0) goto L3c
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3c
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r10.getString(r0)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r9 = move-exception
            goto L48
        L3c:
            r0 = r1
        L3d:
            Ca.I r2 = Ca.I.a     // Catch: java.lang.Throwable -> L46
            Na.c.a(r10, r1)     // Catch: java.lang.Exception -> L43
            goto L51
        L43:
            r9 = move-exception
            r1 = r0
            goto L62
        L46:
            r9 = move-exception
            r1 = r0
        L48:
            throw r9     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            Na.c.a(r10, r9)     // Catch: java.lang.Exception -> L4e
            throw r0     // Catch: java.lang.Exception -> L4e
        L4e:
            r9 = move-exception
            goto L62
        L50:
            r0 = r1
        L51:
            if (r0 != 0) goto L79
            java.lang.String r9 = r9.getPath()     // Catch: java.lang.Exception -> L43
            if (r9 == 0) goto L60
            r10 = 47
            r2 = 2
            java.lang.String r1 = Za.E.Y0(r9, r10, r1, r2, r1)     // Catch: java.lang.Exception -> L43
        L60:
            r0 = r1
            goto L79
        L62:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Failed to handle file name: "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "FilePickerUtils"
            android.util.Log.e(r10, r9)
            goto L60
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.f.n(android.net.Uri, android.content.Context):java.lang.String");
    }

    public static final String o(Uri uri, Context context) {
        List n;
        kotlin.jvm.internal.t.g(context, "context");
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !a.u(uri)) {
            f fVar = a;
            String r = fVar.r(uri);
            String str = File.separator;
            kotlin.jvm.internal.t.f(str, "separator");
            if (B.y(r, str, false, 2, (Object) null)) {
                r = G.m1(r, 1);
            }
            String k = fVar.k(uri);
            kotlin.jvm.internal.t.f(str, "separator");
            if (B.y(k, str, false, 2, (Object) null)) {
                k = G.m1(k, 1);
            }
            if (k.length() <= 0 || B.y(r, k, false, 2, (Object) null)) {
                return r;
            }
            kotlin.jvm.internal.t.f(str, "separator");
            if (B.N(k, str, false, 2, (Object) null)) {
                return r + k;
            }
            return r + str + k;
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        if (kotlin.jvm.internal.t.c(documentId, "downloads")) {
            return path;
        }
        kotlin.jvm.internal.t.d(documentId);
        if (new o("^ms[df]:.*").h(documentId)) {
            return path + "/" + n(uri, context);
        }
        if (!B.N(documentId, "raw:", false, 2, (Object) null)) {
            return null;
        }
        List k2 = new o(":").k(documentId, 0);
        if (k2.isEmpty()) {
            n = v.n();
        } else {
            ListIterator listIterator = k2.listIterator(k2.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    n = D.D0(k2, listIterator.nextIndex() + 1);
                    break;
                }
            }
            n = v.n();
        }
        return ((String[]) n.toArray(new String[0]))[1];
    }

    public static final boolean v(Context context, Uri uri) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(uri, "uri");
        String l = a.l(context, uri);
        if (l == null) {
            return false;
        }
        return l.contentEquals("jpg") || l.contentEquals("jpeg") || l.contentEquals("png") || l.contentEquals("webp") || l.contentEquals("heic") || l.contentEquals("heif");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0122 A[Catch: IOException -> 0x011e, TryCatch #8 {IOException -> 0x011e, blocks: (B:65:0x0114, B:67:0x011a, B:56:0x0122, B:58:0x0127), top: B:64:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127 A[Catch: IOException -> 0x011e, TRY_LEAVE, TryCatch #8 {IOException -> 0x011e, blocks: (B:65:0x0114, B:67:0x011a, B:56:0x0122, B:58:0x0127), top: B:64:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final n9.a x(android.content.Context r13, android.net.Uri r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.f.x(android.content.Context, android.net.Uri, boolean):n9.a");
    }

    public final void A(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.listFiles() != null && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file2 : listFiles) {
                A(file2);
            }
        }
        file.delete();
    }

    public final void B(c cVar, String str, String str2, String str3, byte[] bArr, j.d dVar) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        kotlin.jvm.internal.t.g(dVar, "result");
        if (!cVar.v(dVar)) {
            c.j.a(dVar);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null && str.length() != 0) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        cVar.q(bArr);
        if (!kotlin.jvm.internal.t.c("dir", str2)) {
            try {
                intent.setType(p(str, bArr));
            } catch (Throwable th) {
                intent.setType("*/*");
                Log.e("FilePickerDelegate", "Failed to detect mime type. " + th);
            }
        }
        if (str3 != null && str3.length() != 0 && Build.VERSION.SDK_INT >= 26) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str3));
        }
        if (intent.resolveActivity(cVar.i().getPackageManager()) != null) {
            cVar.i().startActivityForResult(intent, c.j.c());
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            cVar.g("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public final void C(c cVar) {
        Intent intent;
        List M0;
        kotlin.jvm.internal.t.g(cVar, "<this>");
        if (cVar.k() == null) {
            return;
        }
        if (kotlin.jvm.internal.t.c(cVar.k(), "dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else if (kotlin.jvm.internal.t.c(cVar.k(), "image/*")) {
            intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), cVar.k());
            intent.setType(cVar.k());
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.n());
            intent.putExtra("multi-pick", cVar.n());
            CharSequence k = cVar.k();
            if (k != null) {
                CharSequence charSequence = E.T(k, ",", false, 2, (Object) null) ? k : null;
                if (charSequence != null && (M0 = E.M0(charSequence, new String[]{","}, false, 0, 6, (Object) null)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : M0) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    cVar.p(new ArrayList(arrayList));
                }
            }
            if (cVar.j() != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", cVar.j());
            }
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(cVar.k());
            ArrayList j = cVar.j();
            if (j == null || j.isEmpty()) {
                intent.putExtra("android.intent.extra.MIME_TYPES", intent.getType());
            } else {
                ArrayList j2 = cVar.j();
                kotlin.jvm.internal.t.d(j2);
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) j2.toArray(new String[0]));
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.n());
            intent.putExtra("multi-pick", cVar.n());
        }
        if (intent.resolveActivity(cVar.i().getPackageManager()) != null) {
            cVar.i().startActivityForResult(intent, c.j.b());
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            cVar.g("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public final void D(c cVar, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, j.d dVar) {
        kotlin.jvm.internal.t.g(arrayList, "allowedExtensions");
        kotlin.jvm.internal.t.g(dVar, "result");
        if (cVar != null && !cVar.v(dVar)) {
            c.j.a(dVar);
            return;
        }
        if (cVar != null) {
            cVar.w(str);
        }
        if (bool != null && cVar != null) {
            cVar.u(bool.booleanValue());
        }
        if (bool2 != null && cVar != null) {
            cVar.t(bool2.booleanValue());
        }
        if (cVar != null) {
            cVar.p(arrayList);
        }
        if (num != null && cVar != null) {
            cVar.r(num.intValue());
        }
        if (cVar != null) {
            C(cVar);
        }
    }

    public final Uri E(Context context, Uri uri, byte[] bArr) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(uri, "uri");
        OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri);
        if (openOutputStream != null) {
            if (bArr != null) {
                try {
                    openOutputStream.write(bArr);
                    I i = I.a;
                } finally {
                }
            }
            Na.c.a(openOutputStream, (Throwable) null);
        }
        return uri;
    }

    public final void e(Activity activity, Uri uri, boolean z, List list) {
        n9.a x = x(activity, uri, z);
        if (x != null) {
            list.add(x);
        }
    }

    public final File h(Context context, Bitmap.CompressFormat compressFormat) {
        File createTempFile = File.createTempFile("IMAGE_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + "_", "." + j(compressFormat), context.getCacheDir());
        kotlin.jvm.internal.t.f(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    public final Bitmap.CompressFormat i(Context context, Uri uri) {
        String l = l(context, uri);
        kotlin.jvm.internal.t.d(l);
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.t.f(locale, "getDefault(...)");
        String upperCase = l.toUpperCase(locale);
        kotlin.jvm.internal.t.f(upperCase, "toUpperCase(...)");
        return kotlin.jvm.internal.t.c(upperCase, "PNG") ? Bitmap.CompressFormat.PNG : kotlin.jvm.internal.t.c(upperCase, "WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    public final String j(Bitmap.CompressFormat compressFormat) {
        int i = a.a[compressFormat.ordinal()];
        return i != 1 ? i != 2 ? "jpeg" : "webp" : "png";
    }

    public final String k(Uri uri) {
        List n;
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        kotlin.jvm.internal.t.d(treeDocumentId);
        List k = new o(":").k(treeDocumentId, 0);
        if (k.isEmpty()) {
            n = v.n();
        } else {
            ListIterator listIterator = k.listIterator(k.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    n = D.D0(k, listIterator.nextIndex() + 1);
                    break;
                }
            }
            n = v.n();
        }
        String[] strArr = (String[]) n.toArray(new String[0]);
        if (strArr.length >= 2) {
            return strArr[1];
        }
        String str = File.separator;
        kotlin.jvm.internal.t.f(str, "separator");
        return str;
    }

    public final String l(Context context, Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
    }

    public final String m(byte[] bArr) {
        String detect = new Tika().detect(bArr);
        kotlin.jvm.internal.t.d(detect);
        return E.V0(detect, "/", (String) null, 2, (Object) null);
    }

    public final String p(String str, byte[] bArr) {
        String detect;
        Tika tika = new Tika();
        if (str == null || str.length() == 0) {
            detect = tika.detect(bArr);
        } else {
            Detector detector = tika.getDetector();
            TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
            Metadata metadata = new Metadata();
            metadata.set("resourceName", str);
            detect = detector.detect(tikaInputStream, metadata).toString();
        }
        if (kotlin.jvm.internal.t.c(detect, "text/plain")) {
            return "*/*";
        }
        kotlin.jvm.internal.t.d(detect);
        return detect;
    }

    public final ArrayList q(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return new ArrayList(u.e("*/*"));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type '" + arrayList.get(i) + "' is unsupported and will not be filtered.");
                return new ArrayList(u.e("*/*"));
            }
            arrayList2.add(mimeTypeFromExtension);
            if (kotlin.jvm.internal.t.c(arrayList.get(i), "csv")) {
                arrayList2.add("text/csv");
            }
        }
        Log.d("FilePickerUtils", "Custom file types are " + arrayList + ". The mime types were detected as " + arrayList2 + ".");
        return arrayList2;
    }

    public final String r(Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        kotlin.jvm.internal.t.d(treeDocumentId);
        List M0 = E.M0(treeDocumentId, new String[]{":"}, false, 0, 6, (Object) null);
        if (M0.size() <= 1) {
            return Environment.getExternalStorageDirectory() + "/" + D.p0(M0);
        }
        String str = (String) M0.get(0);
        String str2 = (String) M0.get(1);
        if (B.z("primary", str, true)) {
            return Environment.getExternalStorageDirectory() + "/" + str2;
        }
        return "/storage/" + str + "/" + str2;
    }

    public final ArrayList s(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? e.a(bundle, "selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    public final void t(c cVar, List list) {
        if (list.isEmpty()) {
            cVar.g("unknown_path", "Failed to retrieve path.");
        } else {
            cVar.h(list);
        }
    }

    public final boolean u(Uri uri) {
        return kotlin.jvm.internal.t.c(uri.getAuthority(), "com.android.providers.downloads.documents");
    }

    public final void w(File file, a.a aVar) {
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e) {
                Log.e("FilePickerUtils", "File not found: " + e.getMessage(), (Throwable) null);
            } catch (IOException e2) {
                Log.e("FilePickerUtils", "Failed to close file streams: " + e2.getMessage(), (Throwable) null);
            }
            aVar.b(bArr);
        } catch (Exception e3) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e3 + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    public final void y(c cVar, Activity activity, Intent intent, int i, boolean z, String str) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        kotlin.jvm.internal.t.g(activity, "activity");
        kotlin.jvm.internal.t.g(str, "type");
        cb.i.d(P.a(e0.b()), (Ga.i) null, (Q) null, new b(intent, cVar, activity, i, z, str, null), 3, (Object) null);
    }

    public final Uri z(Activity activity, Uri uri, int i) {
        if (i <= 0) {
            return uri;
        }
        Context applicationContext = activity.getApplicationContext();
        kotlin.jvm.internal.t.f(applicationContext, "getApplicationContext(...)");
        if (!v(applicationContext, uri)) {
            return uri;
        }
        Context applicationContext2 = activity.getApplicationContext();
        kotlin.jvm.internal.t.f(applicationContext2, "getApplicationContext(...)");
        return g(uri, i, applicationContext2);
    }
}
