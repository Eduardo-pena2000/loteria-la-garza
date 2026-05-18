package ac;

import G9.h;
import T1.c1;
import T1.d1;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.WindowInsetsController;
import com.yalantis.ucrop.a;
import da.i;
import da.j;
import da.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b implements l {
    public final Activity a;
    public final SharedPreferences b;
    public final a c = new a();
    public j.d d;

    public b(Activity activity) {
        this.a = activity;
        this.b = X3.b.a(activity.getApplicationContext());
    }

    private void e(String str) {
        j.d dVar = this.d;
        if (dVar != null) {
            dVar.a(str);
            b();
        }
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("imagecropper.FILENAME_CACHE_KEY", str);
        edit.apply();
    }

    public final void b() {
        this.d = null;
    }

    public final int c(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    public final void d(String str, String str2, Throwable th) {
        j.d dVar = this.d;
        if (dVar != null) {
            dVar.b(str, str2, th);
            b();
        }
    }

    public final String f() {
        if (!this.b.contains("imagecropper.FILENAME_CACHE_KEY")) {
            return null;
        }
        String string = this.b.getString("imagecropper.FILENAME_CACHE_KEY", "");
        SharedPreferences.Editor edit = this.b.edit();
        edit.remove("imagecropper.FILENAME_CACHE_KEY");
        edit.apply();
        return string;
    }

    public final I9.a g(Map map) {
        String obj = map.containsKey("name") ? map.get("name").toString() : null;
        Object obj2 = map.containsKey("data") ? map.get("data") : null;
        boolean z = obj2 instanceof Map;
        return ("original".equals(obj) || (z ? Integer.valueOf(Integer.parseInt(((Map) obj2).get("ratio_x").toString())) : null) == null) ? new I9.a(this.a.getString(h.c), 0.0f, 1.0f) : new I9.a(obj, r3.intValue() * 1.0f, (z ? Integer.valueOf(Integer.parseInt(((Map) obj2).get("ratio_y").toString())) : null).intValue() * 1.0f);
    }

    public void h(i iVar, j.d dVar) {
        dVar.a(f());
    }

    public final a.a i(a.a aVar, i iVar) {
        String str = (String) iVar.a("android.toolbar_title");
        Integer num = (Integer) iVar.a("android.toolbar_color");
        Integer num2 = (Integer) iVar.a("android.statusbar_color");
        Integer num3 = (Integer) iVar.a("android.toolbar_widget_color");
        Integer num4 = (Integer) iVar.a("android.background_color");
        Integer num5 = (Integer) iVar.a("android.active_controls_widget_color");
        Integer num6 = (Integer) iVar.a("android.dimmed_layer_color");
        Integer num7 = (Integer) iVar.a("android.crop_frame_color");
        Integer num8 = (Integer) iVar.a("android.crop_grid_color");
        Integer num9 = (Integer) iVar.a("android.crop_frame_stroke_width");
        Integer num10 = (Integer) iVar.a("android.crop_grid_row_count");
        Integer num11 = (Integer) iVar.a("android.crop_grid_column_count");
        Integer num12 = (Integer) iVar.a("android.crop_grid_stroke_width");
        Boolean bool = (Boolean) iVar.a("android.show_crop_grid");
        Boolean bool2 = (Boolean) iVar.a("android.lock_aspect_ratio");
        Boolean bool3 = (Boolean) iVar.a("android.hide_bottom_controls");
        if (str != null) {
            aVar.u(str);
        }
        if (num != null) {
            aVar.t(num.intValue());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            WindowInsetsController a = c1.a(this.a.getWindow());
            if (a != null) {
                d1.a(a, 8, 8);
                this.a.getWindow().setStatusBarColor(num2 != null ? num2.intValue() : 0);
            }
        } else if (num2 != null) {
            aVar.s(num2.intValue());
        } else if (num != null) {
            aVar.s(c(num.intValue()));
        }
        if (num3 != null) {
            aVar.v(num3.intValue());
        }
        if (num4 != null) {
            aVar.q(num4.intValue());
        }
        if (num5 != null) {
            aVar.b(num5.intValue());
        }
        if (num6 != null) {
            aVar.m(num6.intValue());
        }
        if (num7 != null) {
            aVar.g(num7.intValue());
        }
        if (num8 != null) {
            aVar.i(num8.intValue());
        }
        if (num9 != null) {
            aVar.h(num9.intValue());
        }
        if (num10 != null) {
            aVar.k(num10.intValue());
        }
        if (num11 != null) {
            aVar.j(num11.intValue());
        }
        if (num12 != null) {
            aVar.l(num12.intValue());
        }
        if (bool != null) {
            aVar.r(bool.booleanValue());
        }
        if (bool2 != null) {
            aVar.n(!bool2.booleanValue());
        }
        if (bool3 != null) {
            aVar.o(bool3.booleanValue());
        }
        return aVar;
    }

    public void j(i iVar, j.d dVar) {
        Integer num;
        Double d;
        Double d2;
        File file;
        String str = (String) iVar.a("source_path");
        Integer num2 = (Integer) iVar.a("max_width");
        Integer num3 = (Integer) iVar.a("max_height");
        Double d3 = (Double) iVar.a("ratio_x");
        Double d4 = (Double) iVar.a("ratio_y");
        String str2 = (String) iVar.a("compress_format");
        Integer num4 = (Integer) iVar.a("compress_quality");
        ArrayList arrayList = (ArrayList) iVar.a("android.aspect_ratio_presets");
        String str3 = (String) iVar.a("android.crop_style");
        String str4 = (String) iVar.a("android.init_aspect_ratio");
        this.d = dVar;
        File cacheDir = this.a.getCacheDir();
        if ("png".equals(str2)) {
            d2 = d4;
            StringBuilder sb = new StringBuilder();
            sb.append("image_cropper_");
            num = num3;
            d = d3;
            sb.append(new Date().getTime());
            sb.append(".png");
            file = new File(cacheDir, sb.toString());
        } else {
            num = num3;
            d = d3;
            d2 = d4;
            file = new File(cacheDir, "image_cropper_" + new Date().getTime() + ".jpg");
        }
        Uri fromFile = Uri.fromFile(new File(str));
        Uri fromFile2 = Uri.fromFile(file);
        a.a aVar = new a.a();
        aVar.e("png".equals(str2) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
        aVar.f(num4 != null ? num4.intValue() : 90);
        aVar.p(10000);
        if ("circle".equals(str3)) {
            aVar.d(true);
        }
        i(aVar, iVar);
        if (arrayList != null && str4 != null) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Map map = (Map) arrayList.get(i2);
                if (map != null) {
                    I9.a g = g(map);
                    String b = g.b();
                    arrayList2.add(g);
                    if (str4.equals(b)) {
                        i = i2;
                    }
                }
            }
            aVar.c(i, (I9.a[]) arrayList2.toArray(new I9.a[0]));
        }
        com.yalantis.ucrop.a g2 = com.yalantis.ucrop.a.d(fromFile, fromFile2).g(aVar);
        if (num2 != null && num != null) {
            g2.f(num2.intValue(), num.intValue());
        }
        if (d != null && d2 != null) {
            g2.e(d.floatValue(), d2.floatValue());
        }
        Activity activity = this.a;
        activity.startActivityForResult(g2.b(activity), 69);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 69) {
            return false;
        }
        if (i2 == -1) {
            String e = this.c.e(this.a, com.yalantis.ucrop.a.c(intent));
            a(e);
            e(e);
            return true;
        }
        if (i2 == 96) {
            Throwable a = com.yalantis.ucrop.a.a(intent);
            d("crop_error", a.getLocalizedMessage(), a);
            return true;
        }
        j.d dVar = this.d;
        if (dVar == null) {
            return false;
        }
        dVar.a(null);
        b();
        return true;
    }
}
