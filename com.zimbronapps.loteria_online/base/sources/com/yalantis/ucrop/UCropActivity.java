package com.yalantis.ucrop;

import K9.i;
import L9.b;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import q4.l;
import q4.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class UCropActivity extends j.b {
    public static final Bitmap.CompressFormat L = Bitmap.CompressFormat.JPEG;
    public ViewGroup A;
    public TextView C;
    public TextView D;
    public View E;
    public l F;
    public String h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public UCropView s;
    public GestureCropImageView t;
    public OverlayView u;
    public ViewGroup v;
    public ViewGroup w;
    public ViewGroup x;
    public ViewGroup y;
    public ViewGroup z;
    public boolean r = true;
    public List B = new ArrayList();
    public Bitmap.CompressFormat G = L;
    public int H = 90;
    public int[] I = {1, 2, 3};
    public b.b J = new a();
    public final View.OnClickListener K = new g();

    public class a implements b.b {
        public a() {
        }

        public void a() {
            UCropActivity.D0(UCropActivity.this).animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.E0(UCropActivity.this).setClickable(false);
            UCropActivity.F0(UCropActivity.this, false);
            UCropActivity.this.y0();
        }

        public void b(Exception exc) {
            UCropActivity.this.X0(exc);
            UCropActivity.this.finish();
        }

        public void c(float f) {
            UCropActivity.C0(UCropActivity.this, f);
        }

        public void d(float f) {
            UCropActivity.B0(UCropActivity.this, f);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            UCropActivity.G0(UCropActivity.this).setTargetAspectRatio(((ViewGroup) view).getChildAt(0).s(view.isSelected()));
            UCropActivity.G0(UCropActivity.this).B();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.H0(UCropActivity.this)) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        public void a() {
            UCropActivity.G0(UCropActivity.this).B();
        }

        public void b() {
            UCropActivity.G0(UCropActivity.this).v();
        }

        public void c(float f, float f2) {
            UCropActivity.G0(UCropActivity.this).z(f / 42.0f);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            UCropActivity.I0(UCropActivity.this);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            UCropActivity.J0(UCropActivity.this, 90);
        }
    }

    public class f implements HorizontalProgressWheelView.a {
        public f() {
        }

        public void a() {
            UCropActivity.G0(UCropActivity.this).B();
        }

        public void b() {
            UCropActivity.G0(UCropActivity.this).v();
        }

        public void c(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.G0(UCropActivity.this).E(UCropActivity.G0(UCropActivity.this).getCurrentScale() + (f * ((UCropActivity.G0(UCropActivity.this).getMaxScale() - UCropActivity.G0(UCropActivity.this).getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.G0(UCropActivity.this).G(UCropActivity.G0(UCropActivity.this).getCurrentScale() + (f * ((UCropActivity.G0(UCropActivity.this).getMaxScale() - UCropActivity.G0(UCropActivity.this).getMinScale()) / 15000.0f)));
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity.K0(UCropActivity.this, view.getId());
        }
    }

    public class h implements H9.a {
        public h() {
        }

        public void a(Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.Y0(uri, UCropActivity.G0(uCropActivity).getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        public void b(Throwable th) {
            UCropActivity.this.X0(th);
            UCropActivity.this.finish();
        }
    }

    static {
        j.e.H(true);
    }

    public static /* synthetic */ void B0(UCropActivity uCropActivity, float f2) {
        uCropActivity.T0(f2);
    }

    public static /* synthetic */ void C0(UCropActivity uCropActivity, float f2) {
        uCropActivity.Z0(f2);
    }

    public static /* synthetic */ UCropView D0(UCropActivity uCropActivity) {
        return uCropActivity.s;
    }

    public static /* synthetic */ View E0(UCropActivity uCropActivity) {
        return uCropActivity.E;
    }

    public static /* synthetic */ boolean F0(UCropActivity uCropActivity, boolean z) {
        uCropActivity.r = z;
        return z;
    }

    public static /* synthetic */ GestureCropImageView G0(UCropActivity uCropActivity) {
        return uCropActivity.t;
    }

    public static /* synthetic */ List H0(UCropActivity uCropActivity) {
        return uCropActivity.B;
    }

    public static /* synthetic */ void I0(UCropActivity uCropActivity) {
        uCropActivity.Q0();
    }

    public static /* synthetic */ void J0(UCropActivity uCropActivity, int i) {
        uCropActivity.R0(i);
    }

    public static /* synthetic */ void K0(UCropActivity uCropActivity, int i) {
        uCropActivity.c1(i);
    }

    public final void L0() {
        if (this.E == null) {
            this.E = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, G9.e.t);
            this.E.setLayoutParams(layoutParams);
            this.E.setClickable(true);
        }
        findViewById(G9.e.x).addView(this.E);
    }

    public final void M0(int i) {
        n.a(findViewById(G9.e.x), this.F);
        this.x.findViewById(G9.e.s).setVisibility(i == G9.e.p ? 0 : 8);
        this.v.findViewById(G9.e.q).setVisibility(i == G9.e.n ? 0 : 8);
        this.w.findViewById(G9.e.r).setVisibility(i == G9.e.o ? 0 : 8);
    }

    public void N0() {
        this.E.setClickable(true);
        this.r = true;
        y0();
        this.t.w(this.G, this.H, new h());
    }

    public final void O0() {
        UCropView findViewById = findViewById(G9.e.v);
        this.s = findViewById;
        this.t = findViewById.getCropImageView();
        this.u = this.s.getOverlayView();
        this.t.setTransformImageListener(this.J);
        findViewById(G9.e.c).setColorFilter(this.p, PorterDuff.Mode.SRC_ATOP);
        findViewById(G9.e.w).setBackgroundColor(this.m);
        if (this.q) {
            return;
        }
        findViewById(G9.e.w).getLayoutParams().bottomMargin = 0;
        findViewById(G9.e.w).requestLayout();
    }

    public final void P0(Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = L;
        }
        this.G = valueOf;
        this.H = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.I = intArrayExtra;
        }
        this.t.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.t.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.t.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.u.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.u.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(G9.b.e)));
        this.u.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.u.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.u.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(G9.b.c)));
        this.u.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(G9.c.a)));
        this.u.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.u.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.u.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.u.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(G9.b.d)));
        this.u.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(G9.c.b)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", -1.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", -1.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f2 = floatExtra / floatExtra2;
            this.t.setTargetAspectRatio(Float.isNaN(f2) ? 0.0f : f2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.t.setTargetAspectRatio(0.0f);
        } else {
            float c2 = ((I9.a) parcelableArrayListExtra.get(intExtra)).c() / ((I9.a) parcelableArrayListExtra.get(intExtra)).d();
            this.t.setTargetAspectRatio(Float.isNaN(c2) ? 0.0f : c2);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.t.setMaxResultImageSizeX(intExtra2);
        this.t.setMaxResultImageSizeY(intExtra3);
    }

    public final void Q0() {
        GestureCropImageView gestureCropImageView = this.t;
        gestureCropImageView.z(-gestureCropImageView.getCurrentAngle());
        this.t.B();
    }

    public final void R0(int i) {
        this.t.z(i);
        this.t.B();
    }

    public final void S0(int i) {
        GestureCropImageView gestureCropImageView = this.t;
        int i2 = this.I[i];
        gestureCropImageView.setScaleEnabled(i2 == 3 || i2 == 1);
        GestureCropImageView gestureCropImageView2 = this.t;
        int i3 = this.I[i];
        gestureCropImageView2.setRotateEnabled(i3 == 3 || i3 == 2);
    }

    public final void T0(float f2) {
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f2)}));
        }
    }

    public final void U0(int i) {
        TextView textView = this.C;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void V0(Intent intent) {
        Uri parcelableExtra = intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri parcelableExtra2 = intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        P0(intent);
        if (parcelableExtra == null || parcelableExtra2 == null) {
            X0(new NullPointerException(getString(G9.h.a)));
            finish();
            return;
        }
        try {
            this.t.p(parcelableExtra, parcelableExtra2);
        } catch (Exception e2) {
            X0(e2);
            finish();
        }
    }

    public final void W0() {
        if (!this.q) {
            S0(0);
        } else if (this.v.getVisibility() == 0) {
            c1(G9.e.n);
        } else {
            c1(G9.e.p);
        }
    }

    public void X0(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    public void Y0(Uri uri, float f2, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f2).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }

    public final void Z0(float f2) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f2 * 100.0f))}));
        }
    }

    public final void a1(int i) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void b1(int i) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    public final void c1(int i) {
        if (this.q) {
            this.v.setSelected(i == G9.e.n);
            this.w.setSelected(i == G9.e.o);
            this.x.setSelected(i == G9.e.p);
            this.y.setVisibility(i == G9.e.n ? 0 : 8);
            this.z.setVisibility(i == G9.e.o ? 0 : 8);
            this.A.setVisibility(i == G9.e.p ? 0 : 8);
            M0(i);
            if (i == G9.e.p) {
                S0(0);
            } else if (i == G9.e.o) {
                S0(1);
            } else {
                S0(2);
            }
        }
    }

    public final void d1() {
        b1(this.j);
        Toolbar findViewById = findViewById(G9.e.t);
        findViewById.setBackgroundColor(this.i);
        findViewById.setTitleTextColor(this.l);
        TextView findViewById2 = findViewById.findViewById(G9.e.u);
        findViewById2.setTextColor(this.l);
        findViewById2.setText(this.h);
        Drawable mutate = H1.a.getDrawable(this, this.n).mutate();
        mutate.setColorFilter(this.l, PorterDuff.Mode.SRC_ATOP);
        findViewById.setNavigationIcon(mutate);
        x0(findViewById);
        j.a n0 = n0();
        if (n0 != null) {
            n0.r(false);
        }
    }

    public final void e1(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new I9.a(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new I9.a(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new I9.a(getString(G9.h.c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new I9.a(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new I9.a(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout findViewById = findViewById(G9.e.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            I9.a aVar = (I9.a) it.next();
            FrameLayout inflate = getLayoutInflater().inflate(G9.f.b, (ViewGroup) null);
            inflate.setLayoutParams(layoutParams);
            AspectRatioTextView childAt = inflate.getChildAt(0);
            childAt.setActiveColor(this.k);
            childAt.setAspectRatio(aVar);
            findViewById.addView(inflate);
            this.B.add(inflate);
        }
        ((ViewGroup) this.B.get(intExtra)).setSelected(true);
        Iterator it2 = this.B.iterator();
        while (it2.hasNext()) {
            ((ViewGroup) it2.next()).setOnClickListener(new b());
        }
    }

    public final void f1() {
        this.C = findViewById(G9.e.r);
        ((HorizontalProgressWheelView) findViewById(G9.e.l)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(G9.e.l)).setMiddleLineColor(this.k);
        findViewById(G9.e.z).setOnClickListener(new d());
        findViewById(G9.e.A).setOnClickListener(new e());
        U0(this.k);
    }

    public final void g1() {
        this.D = findViewById(G9.e.s);
        ((HorizontalProgressWheelView) findViewById(G9.e.m)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(G9.e.m)).setMiddleLineColor(this.k);
        a1(this.k);
    }

    public final void h1() {
        ImageView findViewById = findViewById(G9.e.f);
        ImageView findViewById2 = findViewById(G9.e.e);
        ImageView findViewById3 = findViewById(G9.e.d);
        findViewById.setImageDrawable(new i(findViewById.getDrawable(), this.k));
        findViewById2.setImageDrawable(new i(findViewById2.getDrawable(), this.k));
        findViewById3.setImageDrawable(new i(findViewById3.getDrawable(), this.k));
    }

    public final void i1(Intent intent) {
        this.j = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", H1.a.getColor(this, G9.b.h));
        this.i = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", H1.a.getColor(this, G9.b.i));
        this.k = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", H1.a.getColor(this, G9.b.a));
        this.l = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", H1.a.getColor(this, G9.b.j));
        this.n = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", G9.d.a);
        this.o = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", G9.d.b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.h = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(G9.h.b);
        }
        this.h = stringExtra;
        this.p = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", H1.a.getColor(this, G9.b.f));
        this.q = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.m = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", H1.a.getColor(this, G9.b.b));
        d1();
        O0();
        if (this.q) {
            ViewGroup findViewById = findViewById(G9.e.x).findViewById(G9.e.a);
            findViewById.setVisibility(0);
            LayoutInflater.from(this).inflate(G9.f.c, findViewById, true);
            q4.b bVar = new q4.b();
            this.F = bVar;
            bVar.T(50L);
            ViewGroup findViewById2 = findViewById(G9.e.n);
            this.v = findViewById2;
            findViewById2.setOnClickListener(this.K);
            ViewGroup findViewById3 = findViewById(G9.e.o);
            this.w = findViewById3;
            findViewById3.setOnClickListener(this.K);
            ViewGroup findViewById4 = findViewById(G9.e.p);
            this.x = findViewById4;
            findViewById4.setOnClickListener(this.K);
            this.y = findViewById(G9.e.g);
            this.z = findViewById(G9.e.h);
            this.A = findViewById(G9.e.i);
            e1(intent);
            f1();
            g1();
            h1();
        }
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.u*/.onCreate(bundle);
        setContentView(G9.f.a);
        Intent intent = getIntent();
        i1(intent);
        V0(intent);
        W0();
        L0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(G9.g.a, menu);
        MenuItem findItem = menu.findItem(G9.e.k);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.l, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e2) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e2.getMessage(), getString(G9.h.d)}));
            }
            findItem.getIcon().start();
        }
        MenuItem findItem2 = menu.findItem(G9.e.j);
        Drawable drawable = H1.a.getDrawable(this, this.o);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(this.l, PorterDuff.Mode.SRC_ATOP);
        findItem2.setIcon(drawable);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == G9.e.j) {
            N0();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(G9.e.j).setVisible(!this.r);
        menu.findItem(G9.e.k).setVisible(this.r);
        return super/*android.app.Activity*/.onPrepareOptionsMenu(menu);
    }

    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.t;
        if (gestureCropImageView != null) {
            gestureCropImageView.v();
        }
    }
}
