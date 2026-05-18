package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public Intent a = new Intent();
    public Bundle b;

    public static class a {
        public final Bundle a = new Bundle();

        public Bundle a() {
            return this.a;
        }

        public void b(int i) {
            this.a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i);
        }

        public void c(int i, I9.a... aVarArr) {
            if (i >= aVarArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] (0-based) cannot be higher or equal than aspect ratio options count [count = %d].", new Object[]{Integer.valueOf(i), Integer.valueOf(aVarArr.length)}));
            }
            this.a.putInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", i);
            this.a.putParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions", new ArrayList(Arrays.asList(aVarArr)));
        }

        public void d(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z);
        }

        public void e(Bitmap.CompressFormat compressFormat) {
            this.a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        public void f(int i) {
            this.a.putInt("com.yalantis.ucrop.CompressionQuality", i);
        }

        public void g(int i) {
            this.a.putInt("com.yalantis.ucrop.CropFrameColor", i);
        }

        public void h(int i) {
            this.a.putInt("com.yalantis.ucrop.CropFrameStrokeWidth", i);
        }

        public void i(int i) {
            this.a.putInt("com.yalantis.ucrop.CropGridColor", i);
        }

        public void j(int i) {
            this.a.putInt("com.yalantis.ucrop.CropGridColumnCount", i);
        }

        public void k(int i) {
            this.a.putInt("com.yalantis.ucrop.CropGridRowCount", i);
        }

        public void l(int i) {
            this.a.putInt("com.yalantis.ucrop.CropGridStrokeWidth", i);
        }

        public void m(int i) {
            this.a.putInt("com.yalantis.ucrop.DimmedLayerColor", i);
        }

        public void n(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z);
        }

        public void o(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.HideBottomControls", z);
        }

        public void p(int i) {
            this.a.putInt("com.yalantis.ucrop.MaxBitmapSize", i);
        }

        public void q(int i) {
            this.a.putInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", i);
        }

        public void r(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z);
        }

        public void s(int i) {
            this.a.putInt("com.yalantis.ucrop.StatusBarColor", i);
        }

        public void t(int i) {
            this.a.putInt("com.yalantis.ucrop.ToolbarColor", i);
        }

        public void u(String str) {
            this.a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        public void v(int i) {
            this.a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i);
        }
    }

    public a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static Throwable a(Intent intent) {
        return intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    public static Uri c(Intent intent) {
        return intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    public static a d(Uri uri, Uri uri2) {
        return new a(uri, uri2);
    }

    public Intent b(Context context) {
        this.a.setClass(context, UCropActivity.class);
        this.a.putExtras(this.b);
        return this.a;
    }

    public a e(float f, float f2) {
        this.b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    public a f(int i, int i2) {
        if (i < 10) {
            i = 10;
        }
        if (i2 < 10) {
            i2 = 10;
        }
        this.b.putInt("com.yalantis.ucrop.MaxSizeX", i);
        this.b.putInt("com.yalantis.ucrop.MaxSizeY", i2);
        return this;
    }

    public a g(a aVar) {
        this.b.putAll(aVar.a());
        return this;
    }
}
