package K9;

import android.content.Context;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e {
    public static void a(Context context, Uri uri, Uri uri2) {
        OutputStream outputStream;
        if (uri.equals(uri2)) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                if (!(openInputStream instanceof FileInputStream) || !(openOutputStream instanceof FileOutputStream)) {
                    throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
                }
                FileChannel channel = openInputStream.getChannel();
                channel.transferTo(0L, channel.size(), openOutputStream.getChannel());
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = openInputStream;
                outputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }
}
