package va;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class q {
    public final Context a;
    public final a b;

    public q(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public final S1.h b(double d, double d2, Double d3, Double d4) {
        double d5 = d / d2;
        boolean z = false;
        boolean z2 = d3 != null;
        boolean z3 = d4 != null;
        double min = z2 ? Math.min(d, Math.round(d3.doubleValue())) : d;
        double min2 = z3 ? Math.min(d2, Math.round(d4.doubleValue())) : d2;
        boolean z4 = z2 && d3.doubleValue() < d;
        if (z3 && d4.doubleValue() < d2) {
            z = true;
        }
        if (z4 || z) {
            double d6 = min2 * d5;
            double d7 = min / d5;
            if (d7 > min2) {
                min = Math.round(d6);
            } else {
                min2 = Math.round(d7);
            }
        }
        return new S1.h((float) min, (float) min2);
    }

    public final void c(String str, String str2) {
        try {
            this.b.a(new w2.a(str), new w2.a(str2));
        } catch (Exception e) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e);
        }
    }

    public final File d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    public final File e(String str, Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        File d = d(this.a.getCacheDir(), str);
        FileOutputStream f = f(d);
        f.write(byteArrayOutputStream.toByteArray());
        f.close();
        return d;
    }

    public final FileOutputStream f(File file) {
        return new FileOutputStream(file);
    }

    public final Bitmap g(Bitmap bitmap, int i, int i2, boolean z) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public final Bitmap h(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public S1.h i(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h(str, options);
        return new S1.h(options.outWidth, options.outHeight);
    }

    public String j(String str, Double d, Double d2, int i) {
        S1.h i2 = i(str);
        if (i2.b() == -1.0f || i2.a() == -1.0f) {
            return str;
        }
        if (d == null && d2 == null && i >= 100) {
            return str;
        }
        try {
            String str2 = str.split("/")[r2.length - 1];
            S1.h b = b(i2.b(), i2.a(), d, d2);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = a(options, (int) b.b(), (int) b.a());
            Bitmap h = h(str, options);
            if (h == null) {
                return str;
            }
            File k = k(h, Double.valueOf(b.b()), Double.valueOf(b.a()), i, str2);
            c(str, k.getPath());
            return k.getPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final File k(Bitmap bitmap, Double d, Double d2, int i, String str) {
        return e("/scaled_" + str, g(bitmap, d.intValue(), d2.intValue(), false), i);
    }
}
