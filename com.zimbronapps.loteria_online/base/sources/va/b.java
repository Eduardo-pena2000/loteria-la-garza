package va;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b {
    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(0, lastIndexOf);
    }

    public static String c(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + h(extensionFromMimeType);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String d(Context context, Uri uri) {
        Cursor f = f(context, uri);
        if (f != null) {
            try {
                if (f.moveToFirst() && f.getColumnCount() >= 1) {
                    String h = h(f.getString(0));
                    f.close();
                    return h;
                }
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (f == null) {
            return null;
        }
        f.close();
        return null;
    }

    public static Cursor f(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
    }

    public static File g(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        CharSequence[] charSequenceArr = {"..", "/"};
        String str2 = str.split("/")[r4.length - 1];
        for (int i = 0; i < 2; i++) {
            str2 = str2.replace(charSequenceArr[i], "_");
        }
        return str2;
    }

    public String e(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                String d = d(context, uri);
                String c = c(context, uri);
                if (d == null) {
                    Q9.b.g("FileUtils", "Cannot get file name for " + uri);
                    if (c == null) {
                        c = ".jpg";
                    }
                    d = "image_picker" + c;
                } else if (c != null) {
                    d = b(d) + c;
                }
                File g = g(new File(file, d).getPath(), file.getCanonicalPath());
                FileOutputStream fileOutputStream = new FileOutputStream(g);
                try {
                    a(openInputStream, fileOutputStream);
                    String path = g.getPath();
                    fileOutputStream.close();
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return path;
                } finally {
                }
            } catch (Throwable th) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | SecurityException | IllegalArgumentException unused) {
            return null;
        }
    }
}
