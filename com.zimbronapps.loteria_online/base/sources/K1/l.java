package K1;

import J1.e;
import Q1.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class l extends m {
    public static FontFamily j(CancellationSignal cancellationSignal, l.b[] bVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (l.b bVar : bVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(i(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i) {
        try {
            FontFamily j = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (j == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(j).setStyle(i(j, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily j = j(cancellationSignal, (l.b[]) list.get(0), contentResolver);
            if (j == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(j);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily j2 = j(cancellationSignal, (l.b[]) list.get(i2), contentResolver);
                if (j2 != null) {
                    customFallbackBuilder.addCustomFallback(j2);
                }
            }
            return customFallbackBuilder.setStyle(i(j, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public l.b h(l.b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font i(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int k = k(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int k2 = k(fontStyle, font2.getStyle());
            if (k2 < k) {
                font = font2;
                k = k2;
            }
        }
        return font;
    }
}
