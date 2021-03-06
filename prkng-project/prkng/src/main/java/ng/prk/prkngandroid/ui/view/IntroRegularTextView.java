package ng.prk.prkngandroid.ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import ng.prk.prkngandroid.Const;
import ng.prk.prkngandroid.util.TypefaceHelper;

public class IntroRegularTextView extends TextView {

    public IntroRegularTextView(Context context) {
        this(context, null);
    }

    public IntroRegularTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public IntroRegularTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initFontFace(context);
    }

    private void initFontFace(Context context) {
        final Typeface face = TypefaceHelper.getTypeface(context, Const.TypeFaces.REGULAR);

        setTypeface(face);
    }
}
