package com.air.ai_barcode;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import me.dm7.barcodescanner.core.DisplayUtils;
import me.dm7.barcodescanner.core.IViewFinder;
import me.dm7.barcodescanner.core.ViewFinderView;

/**
 * @author ShineYang
 * @date 2021/9/26
 * description:
 */

public class CustomViewFinderView extends View implements IViewFinder {
    private Rect mFramingRect;

    private static final float PORTRAIT_WIDTH_RATIO = 1f;
    private static final float PORTRAIT_WIDTH_HEIGHT_RATIO = 0.75f;

    private static final float LANDSCAPE_HEIGHT_RATIO = 5f/8;
    private static final float LANDSCAPE_WIDTH_HEIGHT_RATIO = 1.4f;
    private static final int MIN_DIMENSION_DIFF = 50;

    private static final float DEFAULT_SQUARE_DIMENSION_RATIO = 1f;

    protected int mBorderLineLength;
    protected boolean mSquareViewFinder;
    private int mViewFinderOffset = 0;

    public CustomViewFinderView(Context context) {
        super(context);
    }

    public CustomViewFinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public void setLaserColor(int laserColor) {
    }

    @Override
    public void setMaskColor(int maskColor) {
    }

    @Override
    public void setBorderColor(int borderColor) {
    }

    @Override
    public void setBorderStrokeWidth(int borderStrokeWidth) {
    }

    @Override
    public void setBorderLineLength(int borderLineLength) {
        mBorderLineLength = borderLineLength;
    }

    @Override
    public void setLaserEnabled(boolean isLaserEnabled) {}

    @Override
    public void setBorderCornerRounded(boolean isBorderCornersRounded) {
    }

    @Override
    public void setBorderAlpha(float alpha) {
    }

    @Override
    public void setBorderCornerRadius(int borderCornersRadius) {
    }

    @Override
    public void setViewFinderOffset(int offset) {
        mViewFinderOffset = offset;
    }

    @Override
    public void setSquareViewFinder(boolean set) {
        mSquareViewFinder = set;
    }

    public void setupViewFinder() {
        invalidate();
    }

    public Rect getFramingRect() {
        return mFramingRect;
    }

    @Override
    public void onDraw(Canvas canvas) {
    }

    @Override
    protected void onSizeChanged(int xNew, int yNew, int xOld, int yOld) {
    }

}