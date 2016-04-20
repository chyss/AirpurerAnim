package com.chyss.airpureanim;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class MouthShapeView extends View
{
	int widthTop, widthBottom;

	public MouthShapeView(Context context)
	{
		super(context);
	}

	public MouthShapeView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	public void setProgress(int progress)
	{
		widthBottom = progress;
		int w = getWidth();
		widthTop = widthTop + widthBottom / 20;
		if (widthTop > widthBottom)
		{
			widthTop = 0;
		}
	}

	@Override
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		Paint mPaint = new Paint();
		Paint mPaint2 = new Paint();
		int w = getWidth();
		int h = getHeight();
		Rect clientRect = new Rect(0, 0, widthTop, h);
		Rect clientRect2 = new Rect(0, 0, widthBottom, h);

		if (true)
		{
			int colors[] = new int[3];
			float positions[] = new float[3];

			// 第1个点
			colors[0] = 0x33ffffff;
			positions[0] = 0;

			// 第2个点
			colors[1] = 0x55ffffff;
			positions[1] = 0.5f;

			// 第3个点
			colors[2] = 0x77ffffff;
			positions[2] = 1;

			LinearGradient shader = new LinearGradient(0, 0, widthTop, 0,
					colors, positions, LinearGradient.TileMode.CLAMP);
			mPaint.setShader(shader);

			LinearGradient shader2 = new LinearGradient(0, 0, widthBottom, 0,
					colors, positions, LinearGradient.TileMode.CLAMP);
			mPaint2.setShader(shader2);
		}
		canvas.drawRect(clientRect, mPaint);
		canvas.drawRect(clientRect2, mPaint2);
	}
}
