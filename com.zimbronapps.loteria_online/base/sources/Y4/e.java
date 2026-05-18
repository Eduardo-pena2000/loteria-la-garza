package Y4;

import V4.q;
import Y4.i;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import f5.c;
import java.io.FileInputStream;
import java.util.List;
import kotlin.jvm.internal.t;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements i {
    public final Uri a;
    public final e5.m b;

    public static final class a implements i.a {
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, e5.m mVar, T4.d dVar) {
            if (c(uri)) {
                return new e(uri, mVar);
            }
            return null;
        }

        public final boolean c(Uri uri) {
            return t.c(uri.getScheme(), "content");
        }
    }

    public e(Uri uri, e5.m mVar) {
        this.a = uri;
        this.b = mVar;
    }

    public Object a(Ga.e eVar) {
        FileInputStream openInputStream;
        ContentResolver contentResolver = this.b.g().getContentResolver();
        if (b(this.a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.a, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.a)) {
            openInputStream = contentResolver.openInputStream(this.a);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.a + "'.").toString());
            }
        } else {
            AssetFileDescriptor a2 = d.a(contentResolver, this.a, "image/*", d(), null);
            openInputStream = a2 != null ? a2.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.a + "'.").toString());
            }
        }
        return new m(q.b(x.d(x.k(openInputStream)), this.b.g(), new V4.e(this.a)), contentResolver.getType(this.a), V4.f.c);
    }

    public final boolean b(Uri uri) {
        return t.c(uri.getAuthority(), "com.android.contacts") && t.c(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean c(Uri uri) {
        List pathSegments;
        int size;
        return t.c(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && t.c(pathSegments.get(size + (-3)), "audio") && t.c(pathSegments.get(size + (-2)), "albums");
    }

    public final Bundle d() {
        f5.c b = this.b.n().b();
        c.a aVar = b instanceof c.a ? (c.a) b : null;
        if (aVar == null) {
            return null;
        }
        int i = aVar.a;
        f5.c a2 = this.b.n().a();
        c.a aVar2 = a2 instanceof c.a ? (c.a) a2 : null;
        if (aVar2 == null) {
            return null;
        }
        int i2 = aVar2.a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
        return bundle;
    }
}
