package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import e4.i;
import e4.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b {
    public final AssetManager a;
    public final Executor b;
    public final c.c c;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public e4.b[] j;
    public byte[] k;
    public boolean i = false;
    public final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, c.c cVar, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = cVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    public static /* synthetic */ void a(b bVar, int i, Object obj) {
        bVar.g(i, obj);
    }

    public static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return j.a;
        }
        switch (i) {
            case 24:
            case 25:
                return j.e;
            case 26:
                return j.d;
            case 27:
                return j.c;
            case 28:
            case 29:
            case 30:
                return j.b;
            default:
                return null;
        }
    }

    public static boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || i == 24 || i == 25;
    }

    public final b b(e4.b[] bVarArr, byte[] bArr) {
        InputStream h;
        try {
            h = h(this.a, this.h);
        } catch (IllegalStateException e) {
            this.j = null;
            this.c.a(8, e);
        } catch (FileNotFoundException e2) {
            this.c.a(9, e2);
        } catch (IOException e3) {
            this.c.a(7, e3);
        }
        if (h == null) {
            if (h != null) {
                h.close();
            }
            return null;
        }
        try {
            this.j = i.r(h, i.p(h, i.b), bArr, bVarArr);
            h.close();
            return this;
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.e.exists()) {
            try {
                if (!this.e.createNewFile()) {
                    l(4, null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.e.canWrite()) {
            l(4, null);
            return false;
        }
        this.i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.g);
        } catch (IOException e) {
            this.c.a(7, e);
            return null;
        } catch (FileNotFoundException e2) {
            this.c.a(6, e2);
            return null;
        }
    }

    public final /* synthetic */ void g(int i, Object obj) {
        this.c.a(i, obj);
    }

    public final InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.b(5, null);
            }
            return null;
        }
    }

    public b i() {
        b b;
        c();
        if (this.d == null) {
            return this;
        }
        InputStream f = f(this.a);
        if (f != null) {
            this.j = j(f);
        }
        e4.b[] bVarArr = this.j;
        return (bVarArr == null || !k() || (b = b(bVarArr, this.d)) == null) ? this : b;
    }

    public final e4.b[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        e4.b[] x = i.x(inputStream, i.p(inputStream, i.a), this.f);
                        try {
                            inputStream.close();
                            return x;
                        } catch (IOException e) {
                            this.c.a(7, e);
                            return x;
                        }
                    } catch (IOException e2) {
                        this.c.a(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.a(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.a(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.a(7, e5);
            }
            throw th;
        }
    }

    public final void l(int i, Object obj) {
        this.b.execute(new e4.a(this, i, obj));
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        e4.b[] bVarArr = this.j;
        byte[] bArr = this.d;
        if (bVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    i.F(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.c.a(7, e);
            } catch (IllegalStateException e2) {
                this.c.a(8, e2);
            }
            if (!i.C(byteArrayOutputStream, bArr, bVarArr)) {
                this.c.a(5, null);
                this.j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean n() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock tryLock = channel.tryLock();
                            try {
                                e4.c.l(byteArrayInputStream, fileOutputStream, tryLock);
                                l(1, null);
                                if (tryLock != null) {
                                    tryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                l(6, e);
                return false;
            } catch (IOException e2) {
                l(7, e2);
                return false;
            }
        } finally {
            this.k = null;
            this.j = null;
        }
    }
}
