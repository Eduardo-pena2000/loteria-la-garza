package R2;

import P2.K;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v extends b {
    public final Context e;
    public j f;
    public AssetFileDescriptor g;
    public InputStream h;
    public long i;
    public boolean j;

    public static class a extends g {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public v(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public static AssetFileDescriptor u(Context context, j jVar) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = jVar.a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = v((String) pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String str = (String) P2.a.e(normalizeScheme.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (str.matches("\\d+")) {
                identifier = v(str);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + str, "raw", (String) null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new a("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new a(null, e2, 2005);
        }
    }

    public static int v(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    public void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(null, e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        r();
                    }
                }
            } catch (IOException e2) {
                throw new a(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        r();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(null, e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    r();
                }
            }
        }
    }

    public long g(j jVar) {
        this.f = jVar;
        s(jVar);
        AssetFileDescriptor u = u(this.e, jVar);
        this.g = u;
        long length = u.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
        this.h = fileInputStream;
        if (length != -1) {
            try {
                if (jVar.g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e) {
                throw e;
            } catch (IOException e2) {
                throw new a(null, e2, 2000);
            }
        }
        long startOffset = this.g.getStartOffset();
        long skip = fileInputStream.skip(jVar.g + startOffset) - startOffset;
        if (skip != jVar.g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j = length - skip;
            this.i = j;
            if (j < 0) {
                throw new g(2008);
            }
        }
        long j2 = jVar.h;
        if (j2 != -1) {
            long j3 = this.i;
            if (j3 != -1) {
                j2 = Math.min(j3, j2);
            }
            this.i = j2;
        }
        this.j = true;
        t(jVar);
        long j4 = jVar.h;
        return j4 != -1 ? j4 : this.i;
    }

    public Uri o() {
        j jVar = this.f;
        if (jVar != null) {
            return jVar.a;
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(null, e, 2000);
            }
        }
        int read = ((InputStream) K.i(this.h)).read(bArr, i, i2);
        if (read == -1) {
            if (this.i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        q(read);
        return read;
    }
}
