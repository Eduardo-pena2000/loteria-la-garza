package androidx.preference;

import X3.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context O;
    public final ArrayAdapter P;
    public Spinner Q;
    public final AdapterView.OnItemSelectedListener R;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.J()[i].toString();
                if (charSequence.equals(DropDownPreference.this.K()) || !DropDownPreference.this.a(charSequence)) {
                    return;
                }
                DropDownPreference.this.M(charSequence);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.c);
    }

    public ArrayAdapter N() {
        return new ArrayAdapter(this.O, 17367049);
    }

    public final void O() {
        this.P.clear();
        if (H() != null) {
            for (CharSequence charSequence : H()) {
                this.P.add(charSequence.toString());
            }
        }
    }

    public void s() {
        super.s();
        ArrayAdapter arrayAdapter = this.P;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public void u() {
        this.Q.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.R = new a();
        this.O = context;
        this.P = N();
        O();
    }
}
