package androidx.preference;

import X3.c;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SeekBarPreference extends Preference {
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public SeekBar I;
    public TextView J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SeekBar.OnSeekBarChangeListener N;
    public final View.OnKeyListener O;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.M || !seekBarPreference.H) {
                    seekBarPreference.J(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.K(i + seekBarPreference2.E);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.H = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.H = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.E != seekBarPreference.D) {
                seekBarPreference.J(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.K && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.I;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.N = new a();
        this.O = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.C0, i, i2);
        this.E = obtainStyledAttributes.getInt(g.F0, 0);
        G(obtainStyledAttributes.getInt(g.D0, 100));
        H(obtainStyledAttributes.getInt(g.G0, 0));
        this.K = obtainStyledAttributes.getBoolean(g.E0, true);
        this.L = obtainStyledAttributes.getBoolean(g.H0, false);
        this.M = obtainStyledAttributes.getBoolean(g.I0, false);
        obtainStyledAttributes.recycle();
    }

    public final void G(int i) {
        int i2 = this.E;
        if (i < i2) {
            i = i2;
        }
        if (i != this.F) {
            this.F = i;
            s();
        }
    }

    public final void H(int i) {
        if (i != this.G) {
            this.G = Math.min(this.F - this.E, Math.abs(i));
            s();
        }
    }

    public final void I(int i, boolean z) {
        int i2 = this.E;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.F;
        if (i > i3) {
            i = i3;
        }
        if (i != this.D) {
            this.D = i;
            K(i);
            B(i);
            if (z) {
                s();
            }
        }
    }

    public void J(SeekBar seekBar) {
        int progress = this.E + seekBar.getProgress();
        if (progress != this.D) {
            if (a(Integer.valueOf(progress))) {
                I(progress, false);
            } else {
                seekBar.setProgress(this.D - this.E);
                K(this.D);
            }
        }
    }

    public void K(int i) {
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public Object w(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.h);
    }
}
