package androidx.appcompat.view.menu;

import T1.Z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import q.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public g a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public Drawable j;
    public int k;
    public Context l;
    public boolean m;
    public Drawable n;
    public boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.A);
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = this.h.getLayoutParams();
        rect.top += this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i) {
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void c(g gVar, int i) {
        this.a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public boolean d() {
        return false;
    }

    public final void e() {
        CheckBox inflate = getInflater().inflate(i.g.h, this, false);
        this.e = inflate;
        a(inflate);
    }

    public final void f() {
        ImageView inflate = getInflater().inflate(i.g.i, this, false);
        this.b = inflate;
        b(inflate, 0);
    }

    public final void g() {
        RadioButton inflate = getInflater().inflate(i.g.k, this, false);
        this.c = inflate;
        a(inflate);
    }

    public g getItemData() {
        return this.a;
    }

    public void h(boolean z, char c) {
        int i = (z && this.a.A()) ? 0 : 8;
        if (i == 0) {
            this.f.setText(this.a.h());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        Z.X(this, this.j);
        TextView findViewById = findViewById(i.f.M);
        this.d = findViewById;
        int i = this.k;
        if (i != -1) {
            findViewById.setTextAppearance(this.l, i);
        }
        this.f = findViewById(i.f.F);
        ImageView findViewById2 = findViewById(i.f.I);
        this.g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setImageDrawable(this.n);
        }
        this.h = findViewById(i.f.r);
        this.i = findViewById(i.f.l);
    }

    public void onMeasure(int i, int i2) {
        if (this.b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        RadioButton radioButton;
        CheckBox checkBox;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if (this.a.m()) {
            if (this.c == null) {
                g();
            }
            radioButton = this.c;
            checkBox = this.e;
        } else {
            if (this.e == null) {
                e();
            }
            radioButton = this.e;
            checkBox = this.c;
        }
        if (z) {
            radioButton.setChecked(this.a.isChecked());
            if (radioButton.getVisibility() != 0) {
                radioButton.setVisibility(0);
            }
            if (checkBox == null || checkBox.getVisibility() == 8) {
                return;
            }
            checkBox.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        RadioButton radioButton;
        if (this.a.m()) {
            if (this.c == null) {
                g();
            }
            radioButton = this.c;
        } else {
            if (this.e == null) {
                e();
            }
            radioButton = this.e;
        }
        radioButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.a.z() || this.q;
        if (z || this.m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.m) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        c0 u = c0.u(getContext(), attributeSet, i.j.T1, i, 0);
        this.j = u.f(i.j.V1);
        this.k = u.m(i.j.U1, -1);
        this.m = u.a(i.j.W1, false);
        this.l = context;
        this.n = u.f(i.j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, i.a.x, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        u.v();
        obtainStyledAttributes.recycle();
    }
}
