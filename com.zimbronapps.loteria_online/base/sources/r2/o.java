package R2;

import P2.K;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends R2.b {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public static final class a {
        public static /* synthetic */ boolean a(Throwable th) {
            return b(th);
        }

        private static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends g {
        public b(Throwable th, int i) {
            super(th, i);
        }

        public b(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public o() {
        super(false);
    }

    public static RandomAccessFile u(Uri uri) {
        try {
            return new RandomAccessFile((String) P2.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e, (K.a < 21 || !a.a(e.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e, 1004);
        } catch (SecurityException e2) {
            throw new b(e2, 2006);
        } catch (RuntimeException e3) {
            throw new b(e3, 2000);
        }
    }

    public void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                r();
            }
        }
    }

    public long g(j jVar) {
        Uri uri = jVar.a;
        this.f = uri;
        s(jVar);
        RandomAccessFile u = u(uri);
        this.e = u;
        try {
            u.seek(jVar.g);
            long j = jVar.h;
            if (j == -1) {
                j = this.e.length() - jVar.g;
            }
            this.g = j;
            if (j < 0) {
                throw new b(null, null, 2008);
            }
            this.h = true;
            t(jVar);
            return this.g;
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }

    public Uri o() {
        return this.f;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) K.i(this.e)).read(bArr, i, (int) Math.min(this.g, i2));
            if (read > 0) {
                this.g -= read;
                q(read);
            }
            return read;
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }
}
